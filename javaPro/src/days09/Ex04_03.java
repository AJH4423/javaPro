package days09;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex04_03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String rrn = getRrn(sc);
		System.out.println(rrn);
		
		//5. 주민등록번호를 가지고 한국나이, 만나이...
		
		// 세는 나이 = 올해년도 - 생일년도 +1;
		int age = getCountingAge(rrn);
		System.out.println(age);
		
		// 만 나이 = [올해년도 - 생일년도 (생일지나지않은 경우에만 -1)]
		int age2 = getAmericanAge(rrn);
		System.out.println(age2);
		
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

}
