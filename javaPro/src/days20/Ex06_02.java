package days20;

import java.util.Date;

public class Ex06_02 {
	
	public static void main(String[] args) {
		
		// 달력그리기 - Date 클래스
		int year = 2025;
		int month = 3;
		
		// 1) 2025.03.01 무슨요일인지?
		// 2) 2025.03 마지막 날짜?
		
		/*[1]
		Date d = new Date();
		d.setYear(year-1900);
		d.setMonth(3-1);
		d.setDate(1);
		*/
		
		//[2]
		Date d = new Date(year-1900, month-1,1);
		
		//[3] year, month, 마지막 날짜?
		// System.out.println(d.getDate()); // 년 월 [일]
		// int date = d.getDate(); // 현재날짜를 가져옴
		// d.setDate(date + 1);
		
		// 1달 더하기
		d.setMonth(d.getMonth()+1);
		// 1일빼기
		d.setDate(d.getDate()-1);
		System.out.println(d.getDate()-1);
				
		System.out.println(d.toLocaleString());
		System.out.println(d.getDay()); // 일(0)~토(6)
		
				
	} // main

} // class
