package days21;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex04_04 {
	
	public static void main(String[] args) {
		
		// plus(), plusXXX()
		// minus(), minusXXX()
		
		// 이번달의 마지막 날짜가 몇일?
		
		/*[1]
		LocalDate d  = LocalDate.now();
		d = d.withDayOfMonth(1);
		System.out.println(d);
		d = d.plusMonths(1);
		System.out.println(d);
		d = d.minusDays(1);
		System.out.println(d);
		int date = d.getDayOfMonth();
		System.out.println(date);
		*/
		
		//[2] 절삭하기
		LocalTime t = LocalTime.now();
		System.out.println(t);
		// 초 밑으로는 절삭
		t = t.truncatedTo(ChronoUnit.SECONDS);
		// 시간 밑으로 절삭
		t = t.truncatedTo(ChronoUnit.HOURS);
		System.out.println(t);
		
		t = t.plus(2, ChronoUnit.HOURS);
		System.out.println(t);
	} // main

}
