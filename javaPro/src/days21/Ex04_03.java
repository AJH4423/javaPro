package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex04_03 {

	public static void main(String[] args) {

		// 개강일 날짜 객체 25.2.3
		// Date d = new Date(2025-1900, 2, 3);
		// Calendar d = new GregorianCalendar(2025, 2-1, 3);

		/* [1]
		LocalDate d = LocalDate.now(); // -> 변하지 않음
		// 년, 월, 일 수정 - with(), withXXX()
		// d = d.withYear(2024);
		d = d.with(ChronoField.YEAR, 2024); // -> 바꾼뒤에 무조건 저장(d=)을 시켜줘야함
		System.out.println(d);

		// d = d.withMonth(2);
		d = d.with(ChronoField.MONTH_OF_YEAR, 2);
		System.out.println(d);

		d = d.withDayOfMonth(3);
		System.out.println(d);
		 */

		// [2]
		/*
		LocalDate d = LocalDate.of(2025, 2, 3);
		System.out.println(d);
		 */

		// A라는 사람의 생일 = 1990.02.5
		// B라는 사람의 생일 = 1992.03.4
		// C라는 사람의 생일 = 2000.04.5
		// 생일 지났는지 여부 출력하는 코딩
		// 결과: 	오늘이 생일이다.
		// 		생일이 지났다
		// 		생일이 지나지 않았다
		
		
		
		
		LocalDate a_birth = LocalDate.of(1990, 2, 5);
		LocalDate b_birth = LocalDate.of(1992, 3, 4);
		LocalDate c_birth = LocalDate.of(2000, 4, 5);
		LocalDate today = LocalDate.now();
		
		//[1]
		System.out.println(today.compareTo(a_birth));
		System.out.println(today.compareTo(b_birth));
		System.out.println(today.compareTo(c_birth));
		
		/*[2]
		a_birth = a_birth.withYear(today.getYear());
		b_birth = b_birth.withYear(today.getYear());
		c_birth = c_birth.withYear(today.getYear());

		System.out.println(today.isBefore(a_birth));
		System.out.println(today.isEqual(a_birth));
		System.out.println(today.isAfter(a_birth));

		System.out.println(today.isBefore(b_birth));
		System.out.println(today.isEqual(b_birth));
		System.out.println(today.isAfter(b_birth));

		System.out.println(today.isBefore(c_birth));
		System.out.println(today.isEqual(c_birth));
		System.out.println(today.isAfter(c_birth));
		*/

		/*[3]
		LocalDate[] localDateList = {
				LocalDate.of(1990, 2, 5)
				,LocalDate.of(1992, 3, 4)
				, LocalDate.of(2000, 4, 5)};
		LocalDate now = LocalDate.of(1992, 3, 4);

		for(LocalDate localDate : localDateList) {
			if (now.isEqual(localDate)) {
				System.out.println("오늘이 생일이다");
			} else if(now.isBefore(localDate) ) {
				System.out.println("생일이 지나지 않았다");
			} else {
				System.out.println("생일이 지났다");
			}
		}
		*/
		
	} // main

} // class
