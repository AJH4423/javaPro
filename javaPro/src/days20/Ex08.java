package days20;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.util.Graphic2D;

public class Ex08 {

	public static void main(String[] args) {

		// [달려그리기] - Date, Calendar 클래스 이용

		Scanner sc = new Scanner(System.in);
		int year,month;

		System.out.printf("year, month input: ");
		year = sc.nextInt();
		month = sc.nextInt();

		printCalendar(year,month);

	} // main

	private static void printCalendar(int year, int month) {

		Calendar startDate = getStartDate(year,month);
		// System.out.println(Ex07.getCalendar(startDate));

		System.out.printf("\t\t\t[%d년 %d월]\n", year, month );
		Graphic2D.drawLine(60, "-");
		String week = "일월화수목금토";
		for (int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c", week.charAt(i));
		} // for i
		System.out.println();
		Graphic2D.drawLine(60, "-");

		//startDate ~ 42일의 날짜를 출력
		for (int i = 0; i < 42; i++) {
			// System.out.println(Ex07.getCalendar(startDate));  
			int date = startDate.get(Calendar.DATE);
			// System.out.printf( "\t%d", date);
			System.out.printf( isToday(startDate) ? "\t[%d]": "\t%d", date);
			if(i % 7==6) {
				System.out.println();
			}
			startDate.add(Calendar.DATE, 1);
		} // for i

		System.out.println(); // 개행
		Graphic2D.drawLine(60, "-");

	}

	private static Calendar getStartDate(int year, int month) {

		Calendar c = new GregorianCalendar(year, month-1, 1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK); // 일(1) ~ 토(7)
		c.add(Calendar.DATE, -dayOfWeek+1);

		return c;
	}	

	public static boolean isToday(Calendar c) {
		Calendar today = Calendar.getInstance(); // 절삭   
		today = new GregorianCalendar(today.get(1),today.get(2),today.get(5));
		return today.equals(c);
	}

} // class
