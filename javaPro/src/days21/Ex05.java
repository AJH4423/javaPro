package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex05 {
	
	public static void main(String[] args) {
		
		// LocalDateTime
		//LocalDateTime dt = LocalDateTime.now();
		//System.out.println(dt);
		
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.of(d,t);
		System.out.println(dt);
		
		d = dt.toLocalDate();
		System.out.println(d);
		
		t = dt.toLocalTime();
		System.out.println(t);
		
		dt = d.atTime(t);
		System.out.println(dt);
		
		dt = dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt);
		
	} // main

} // class
