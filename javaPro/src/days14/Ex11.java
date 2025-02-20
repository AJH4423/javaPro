package days14;

public class Ex11 {
	
	// 필드
	// 1) 인스턴스 변수
	public String color;
	
	// 2) 클래스 변수
	public static int number; 
	
	
	public static void main(String[] args) { // args : 지역변수
		
		/*
		 * [자바 변수의 선언되는 위치에 따른 종류]
		 *                 									<생성시기> 
		 * 1. 인스턴스 변수	: 클래스 안에 선언					인스턴스가 생성될 때
		 * 2. 클래스(static) 변수 : 클래스 안에 선언 			클래스가 메모리에 올라갈 때
		 * 3. 지역변수 : 메서드 안, 초기화블럭, 생성자 안에 선언   	변수 선언문 실행될때
		 * 
		 * */ 
		int age; // main문의 지역변수
		
		
	} // main

} // class
