package days09;

import java.util.Scanner;

public class Ex04_02 {
	
	public static void main(String[] args) {
		
		/*
		 * [주민등록번호]
		 * 1.Resident Registration Number, RRN
		 * 2. ㄱㄴㄷㄹㅁㅂ - ㅅㅇㅈㅊㅋㅌㅍ
		 *  1) ㄱㄴㄷㄹㅁㅂ : 생년월일
		 *  2) ㅅ : 18,19,20 세기 구분 + 성별
		 *  3) ㅇㅈ : 출생등록지
		 *     ㅊㅋ : 등록기준지
		 *  4) ㅌ : 주민센터 등록순번
		 *  5) ㅍ : 주민등록번호 오류 검증번호
		 *     >> 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
                  즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. (단, 10은 0, 11은 1로 표기한다.)
		 * */
		
		Scanner sc = new Scanner(System.in);
		String rrn = getRrn(sc);
		System.out.println(rrn);
		
		//4.rrn -> 생년월일  "1998년 4월 10일" 변환 메소드 선언
		String birthday = getBirthday(rrn);
		System.out.println(birthday);
		
		
	} // main

	// "1998년 4월 10일"
	private static String getBirthday(String rrn) {
		// TODO Auto-generated method stub
		
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
