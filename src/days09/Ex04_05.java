package days09;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex04_05 {
	
	public static void main(String[] args) {
		
	      Scanner scanner = new Scanner(System.in); 
	      String rrn = getRrn(scanner);
	      System.out.println( rrn );
	      
	      // 1) 출생지역(전공자) 해보기
	      /*
	      ‘ㅍ’은 주민등록번호에 오류가 없는지 확인하는 검증번호로, 아래와 같은 특수한 규칙으로 만든다.
	      ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) % 11}
	                                             ㅍ
	      830412-270000                          1
	      xx
	      234567 892345
	      11 - [(16+ 9+?+?+?+) % 11] 
	        ??  10-> 0, 11->1
	      즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. (단, 10은 0, 11은 1로 표기한다.)
	      */
	      
	      int ㅍ = Integer.parseInt( rrn.substring(13, 14) );
	      
	      int ㄱ = Integer.parseInt( rrn.substring(0, 1) );
	      int ㄴ = Integer.parseInt( rrn.substring(1, 2) );
	      int ㄷ = Integer.parseInt( rrn.substring(2, 3) );
	      int ㄹ = Integer.parseInt( rrn.substring(3, 4) );
	      int ㅁ = Integer.parseInt( rrn.substring(4, 5) );
	      int ㅂ = Integer.parseInt( rrn.substring(5, 6) );
	      // - 6,7
	      int ㅅ = Integer.parseInt( rrn.substring(7, 8) );
	      int ㅇ = Integer.parseInt( rrn.substring(8, 9) );
	      int ㅈ = Integer.parseInt( rrn.substring(9, 10) );
	      int ㅊ = Integer.parseInt( rrn.substring(10, 11) );
	      int ㅋ = Integer.parseInt( rrn.substring(11, 12) );
	      int ㅌ = Integer.parseInt( rrn.substring(12, 13) );
	      
	      int checkSum = 11-((2*ㄱ+3*ㄴ+4*ㄷ+5*ㄹ+6*ㅁ+7*ㅂ+8*ㅅ+9*ㅇ+2*ㅈ+3*ㅊ+4*ㅋ+5*ㅌ) % 11);
	      
	      if (checkSum == 10) {
	         checkSum = 0;
	      }else if ( checkSum == 11) {
	         checkSum = 1;
	      } // if // if
	      
	      if (ㅍ == checkSum) {
	         System.out.println("검증 주민번호 O");
	      } else {
	         System.out.println("검증 실패된 주민번호 X");
	      } // if

		
	} // main

private static int getAmericanAge(String rrn) {
		
		LocalDate d = LocalDate.now();
		
		int currentYear = d.getYear(); // 올해년도
		int currentMonth = d.getMonthValue();
		int currentDay = d.getDayOfMonth();
		
		int myYear = getCentury(rrn) + Integer.parseInt( rrn.substring(0, 2) );
		int myMonth = Integer.parseInt( rrn.substring(2, 4) );
		int myDay = Integer.parseInt( rrn.substring(4, 6) );
		
		int americanAge = currentYear - myYear;
		
		
		if (!(currentMonth-myMonth>=0&&currentDay-myDay>=0)) {
			americanAge--;
		} // if
		// 1. 태어난월일과 현재월일을 4자리숫자로 받아 비교하는 조건으로 만들면 더 좋음
		//      ㄴ 월(month)*100 + 일(day)
		// 2. 날짜객체로도 비교 해볼것. 알아보기
		
		return americanAge;
	}

	private static int getCountingAge(String rrn) {
		// 자바에서 날짜/시간을 다루는 기능이 구현된 클래스
		//          ㄴ Date, Calendar, LocalDate, LocalTime, LocalDateTime
		/* [1]
	      Date d = new Date();
	      System.out.println( d.getYear() + 1900 );
		 */

		/* [2]
	      Calendar c = Calendar.getInstance();
	      System.out.println(  c.get(Calendar.YEAR) );
		 */

		LocalDate d = LocalDate.now();
		int currentYear = d.getYear(); // 올해년도

		// int birthYear = Integer.parseInt(getBirthday(rrn).substring(0, 4));
		int birthYear = getYear(rrn);

		return currentYear - birthYear + 1;

	}

	private static int getYear(String rrn) {
		int year = getCentury(rrn) + Integer.parseInt( rrn.substring(0, 2) );
		return year;
	}

	// "1998년 4월 10일"
	private static String getBirthday(String rrn) {
		
		int year = getCentury(rrn) + Integer.parseInt( rrn.substring(0, 2) );
		int month = Integer.parseInt( rrn.substring(2, 4) );
		int day = Integer.parseInt( rrn.substring(4, 6) ); 
		String birthday = String.format("%d년 %d월 %d일", year, month, day);
		return birthday;
	}


	private static boolean getNationality(String rrn) {
		
		char gender = rrn.charAt(7);
		switch (gender) {
		case '9': case '0': case '1': case '2': case '3': case '4':
			return true; // 내국인
			default:
				return false; // 외국인
		}
	}


	private static int getCentury(String rrn) {
		
		String strCentury = rrn.substring(7, 8);
		int Century = Integer.parseInt(strCentury);
		
		switch (Century) {
		case 1: case 2: case 5: case 6: 
			return 1900;
		case 3: case 4: case 7: case 8:
			return 2000;
			default:
				return 1800; 
		}// switch
		
	}


	// 남자: true, 여자: false
	private static boolean getGender(String rrn) {
//		rrn.charAt(index); 
//		rrn.substring(0, 0);
//		int gender = rrn.charAt(7) - '0'; // char형으로 받으면 스위치문에서 숫자로 받는것이 아닌 문자형ASCII에 대한 수로받음
		
		//[2]: rrn.substring(0, 0);
		String strGender = rrn.substring(7, 8);
		int gender = Integer.parseInt(strGender);
		return gender%2==1?true:false;
		
		/*
		 * [1]: rrn.charAt(index);
		char gender = rrn.charAt(7);
		switch (gender) {
		case '9': case '1': case '3': case '5': case '7':
			return true; // 남자
			default:
				return false; // 여자
		}// switch
		*/
	}

	private static String getRrn(Scanner sc) {
		
		//유효성검사
//		String regex = "[0-9]{6}-[0-9]{7}";
		String regex = "\\d{6}-\\d{7}";
		String rrn;
		
		do {
			System.out.print("주민번호 14자리 입력(예: 000000-0000000): ");
			rrn=sc.next();
		} while (!rrn.matches(regex));
		
		return rrn;
	}

	
}// class
