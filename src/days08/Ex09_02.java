package days08;

import java.util.Iterator;

import com.util.MyCalender;

public class Ex09_02 {
	
	public static void main(String[] args) {
		
		//[문제] 1년~2025년까지 총 몇번의 윤년이 있는지?

		int leapYearCount = 0;
		
		//[1]
//		for (int i = 1; i <= 2025; i++) {
//			if (MyCalender.isLeapYear(i)) {
//				leapYearCount++;
//			} // if
//			System.out.println(leapYearCount);
//		}
		
		// 꼭 기억하기[2]
		leapYearCount = 2025/4 - 2025/100 + 2025/400;
		System.out.println(leapYearCount);

		
		
	} // main



} // class
