package com.util;

public class Graphic2D {
	
	public static void drawLine() {
		System.out.println("--------------------"); // 50줄 코딩이라 가정
	}
	
	// 메소드 오버로드[method Overload] : 동일한 메소드 명으로 중복 선언
	public static void drawLine(int length) {
		for (int i = 0; i <= length; i++) {
			System.out.print("=");
		}
		System.out.println();
	}

	public static void drawLine(int length,String style) {
		for (int i = 0; i <= length; i++) {
			System.out.print(style);			
		}
		System.out.println();
	}

}
