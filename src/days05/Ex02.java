package days05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// Arrays 클래스
		//Arrays.toString();
		
		String n1 = "admin";
		String n2 = "Admin";
		
		// 대소문자를 구분하지 않고 문자열 비교
//		n1 = n1.toUpperCase(); // 대문자변형
//		n2 = n2.toUpperCase();
//		
//		n1 = n1.toLowerCase(); // 소문자변형
//		n2 = n2.toLowerCase();
		
		System.out.println(n1.equalsIgnoreCase(n2));
		
		
		// [1]번 풀이
//		System.out.println(n1.equals(n2)?"같다":"다르다");
//		
//		if (n1.equals(n2)) {
//			System.out.println("같다");
//		} else {
//			System.out.println("다르다");
//		}
		
	} // main

}
