package days07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	
		// 1번 문제
//		double result=0;
//		boolean sw = false;
//		
//		for (double i = 1; i <= 8; i++) {
//			
//			if(sw) {
//				System.out.printf("[+%.0f/%.0f]", i, i+1);
//				result += i/(i+1);
//				sw = false;
//			}
//			else {
//				System.out.printf("[-%.0f/%.0f]", i, i+1);
//				result -= i/(i+1);
//				sw = true;
//			} // if
//			
//		}
//		System.out.printf("= %.2f", result);
		
		//2번문제
		String msg = "hello world";
		char ch;
		
		System.out.print("문자열 char형 변환\n");
		for(int i=0;i<msg.length();i++) {
			ch = msg.charAt(i);
			System.out.printf("%c", ch);
		}
		
		char [] msgArr = msg.toCharArray();
		
		
	} // main

}
