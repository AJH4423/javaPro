package days22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.of(2023, 2, 28, 12, 17, 57, 356);

		String pattern = "yyyy/MM/dd E요일 hh:mm:ss.SSS";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		String s = dtf.format(dt);
		System.out.println(s);

	} // main

} // class

class Person {
	String name;
	int age;
}