package days06;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		// 입력받은 방법: bufferedreader, scanner
		
		// char형 입력받기
		Scanner sc = new Scanner(System.in);
		char one = '\u0000';
		System.out.println("한 문자 입력: ");
		one = sc.next().charAt(0);
		
		/*
		 * [2]
		 * String input = sc.next();
		 * one = input.charAt(0);
		 * 
		 * */
		
		// scanner.next(); String -> 첫번째 문자부터 읽어간다....
		// scanner.nextLine();
		// scanner.nextInt();
		// scanner.nextBoolean();
		// scanner.nextChar(); -> 존재하지 않음
		
		System.out.printf("[%c]\n", one);
		
	} // main

} // class
