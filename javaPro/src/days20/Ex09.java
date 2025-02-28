package days20;

import java.util.Calendar;
import java.util.Date;

public class Ex09 {
	
	public static void main(String[] args) {
		
		// 1. Calendar -> Date 변환
		Calendar c = Calendar.getInstance();
		//[2] 제일 간단한 방법
		Date d = c.getTime();
		
		//[1] Date d = new Date(0, 0, 0, 0, 0, 0) -> 하나하나 넣어도 가능 
		
		// 2. Date -> Calendar 변환
		c.setTime(d);
		
	} // main

} // class
