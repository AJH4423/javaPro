package days21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex06 {
	
	public static void main(String[] args) {
		
		// [TemporalAdjusters 클래스]
		// Temporal(시간상의) + Adjuster(조정자)
		
		// 날짜와 시간 수정 : plus(), plusXXX(), minus(), minusXXX()
		// TemporalAdjuster 클래스 
		// : 자주 사용되는 날짜/시간을 수정(조정)을 하는 기능이 구현된 클래스
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		/*
		// 이번 달의 첫 번째 월요일은?
		d = d.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(d);
		
		// 이번달의 마지막 토요일 몇일인지?
		d = d.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY));
		System.out.println(d);
		
		// 다음주 수요일 몇일인지? , 오늘 날짜 : 2025-03-04(화)		
		// 1(월) ~ 7(일)
		 int dayOfWeek = d.getDayOfWeek().getValue();
		
	      if (dayOfWeek < DayOfWeek.WEDNESDAY.getValue()) {  // 수요일 보다 작을 경우..
	          d = d.plusWeeks(1);         
	       } // if

		
		d = d.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println(d);
		*/
		
		//[문제] 이번 달 3번째 목요일?
		d = d.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.THURSDAY));
		System.out.println(d);
		
	} // main

} // class
