package days20;

import java.util.Calendar;

public class Ex07 {
	
	public static void main(String[] args) {
		
		// 추상클래스 -> new 객체 생성 못함
		// Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		// System.out.println(c);
		System.out.println(c.get(1)); // year값 가져옴
		System.out.println(c.get(Calendar.YEAR)); // year
		System.out.println(c.get(Calendar.MONTH + 1)); // month
		System.out.println(c.get(Calendar.DATE)); // date
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); // date
		
		System.out.println(c.get(Calendar.DAY_OF_YEAR)); // date
		
		// 시간,분,초,밀리초
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.MILLISECOND));
		//요일
		// Date  	일(0) 월(1) ~ 토(6)
		// Calendar   1    2      7
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
	} // main
	
	public static String getCalendar(Calendar c) {
		return String.format("%d.%02d.%02d"
				, c.get(Calendar.YEAR)
				, c.get(Calendar.MONTH)+1
				, c.get(Calendar.DATE));
	}

} // class
