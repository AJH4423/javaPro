package days08;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		// [문제] 년도를 입력받아서 윤년/평년 출력
		/*
		 * 태음력/태양력 -> 오차를 보정하기 위해 추가되는 일/주/월 -> 윤년
		 * 그레고리력: 1년은 365.2425일
		 * [치윤법]
		 * 400년: 0.2425+400 = 97일
		 * 4의배수년  1일추가      100일(-3일)
		 * 100배수년 -1일빼기       -1
		 * 400배수년 1일추가        +1      --> 97일
		 * ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고,
		 * -> year % 4 == 0  
		 * ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며, 
		 * -> year % 100 != 0
		 * 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다 
		 * -> year % 400 == 0 
		 * */
		
		int year;
		Scanner sc = new Scanner(System.in);		
		year = getYear(sc);
		
		if (isLeapYear(year)) {
			System.out.println("윤년(leap year)");
		} else {
			System.out.println("평년(common year");
		}
		
		
	} // main

	private static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	private static int getYear(Scanner sc) {
		//년도 유효성검사 후 리턴값 받기, 1년부터 계속 유효성 검사 진행
		String regex = "\\d*"; 
		String strYear;
		do {
			System.out.print("년도 입력: ");
			strYear = sc.next();
		} while (!strYear.matches(regex));
		
		return 0;
	}

}// class
