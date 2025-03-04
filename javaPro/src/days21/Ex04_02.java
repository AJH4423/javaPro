package days21;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex04_02 {

	public static void main(String[] args) {

		// 1. LocalTime 클래스
		LocalTime t = LocalTime.now();
		System.out.println(t);

		// 시
		//int hour = t.get(ChronoField.HOUR_OF_DAY);
		int hour = t.getHour();
		System.out.println(hour);

		// 분
		//int minute = t.get(ChronoField.MINUTE_OF_DAY);
		int minute = t.getMinute();
		System.out.println(minute);

		// 초
		// int sec = t.get(ChronoField.SECOND_OF_DAY);
		int sec = t.getSecond();
		System.out.println(sec);


		// 밀리초
		int millSec = t.get(ChronoField.MILLI_OF_SECOND);		
		System.out.println(millSec);

		// 나노초
		// int nanoSec = t.get(ChronoField.NANO_OF_SECOND);
		int nanoSec = t.getNano();
		System.out.println(nanoSec);
	} // main

} // class
