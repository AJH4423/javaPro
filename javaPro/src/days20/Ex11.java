package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex11 {
	
	public static void main(String[] args) {
		
		// [SimpleDataFormat 클래스]
		// Date,Calendar 객체를 원하는 날짜 형식으로 출력할 때 사용하는 형식화 클래스이다.
		
		/*[1] Date 클래스를 
		Date d = new Date();
//		2025. 2. 28. 오후 4:48:37
//		System.out.println(d.toLocaleString());
//		System.out.println(d.toGMTString());
		
		// 출력하고싶은 형식: 2025/02/28 04:48:00 금요일
		String pattern = "yyyy/MM/dd hh:mm:ss E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(d));
		*/
		
		/*
		//[2] Calendar -> Date 변환 시킨 후 형식화 클래스를 사용하면된다. 
		Calendar c = Calendar.getInstance();
		// 출력 형식: 2025/02/28 04:48:00 금요일
		String pattern = "yyyy/MM/dd hh:mm:ss E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(c.getTime()));
		*/
		
		//[3] SimpleDateFormat 아래와 같은 형식으로 출력하는 코딩
		Calendar c = Calendar.getInstance();
		// 출력 형식: 2025년 2월 28일 오전/오후 05:04:35 금요일
		String pattern = "yyyy년 M월 d일 a h:mm:ss E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(c.getTime()));
		
	} // main

} // class
