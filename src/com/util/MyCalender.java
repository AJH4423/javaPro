package com.util;

public class MyCalender {
	
	public static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

}
