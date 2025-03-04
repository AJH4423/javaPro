package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex08_02 {
	
	public static void main(String[] args) {
		
		// 문자열 -> 날짜 변환
		String s = "2025년 02월 17일(월)";
		// DateTimeFormatter 클래스 이용해서 날짜 객체로 변환
		String pattern = "yyyy년 MM월 dd일(E)";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDate d = LocalDate.parse(s, dtf);
		
		System.out.println(d);
		
	} // main

} // class
