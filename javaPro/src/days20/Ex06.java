package days20;

import java.util.Date;

public class Ex06 {
	
	public static void main(String[] args) {
		
		// *남은 수업과정*
		// 날짜(date)와 시간(time) 다루는 클래스
		// 형식화 클래스
		// JCF - 자바 컬렉션 프레임워크
		// 제네릭과 어노테이션
		// 자바의 IO
		// 람다식과 스트림
		// (스레드와 네트워크)
		// 팀프로젝트
		
		/*
		 * [날짜(date)와 시간(time) 다루는 클래스]
		 * [java.util.Date 클래스]
		 * 
		 * */
		
		Date d = new Date();
		// Fri Feb 28 12:37:33 GMT+09:00 2025
		// System.out.println(d);
		// 28 Feb 2025 03:39:36 GMT: 그리니치 표준시
		// System.out.println(d.toGMTString()); 
		// System.out.println(d.toLocaleString());
		System.out.println(d.getYear()+1900); // 125 + 1900
		System.out.println(d.getMonth() + 1); // 1 + 1
		System.out.println(d.getDate());
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		System.out.println(d.getTime()+"ms"); //long 1970.1.1 00:00:00 ms
		// 일(0) 월(1) 화(2)~토(6)
		System.out.println("일월화수목금토".charAt(d.getDay()));
			
		
	} // main

} // class
