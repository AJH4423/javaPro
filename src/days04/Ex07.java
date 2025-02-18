package days04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// switch문 사용
		// 정수를 입력받아서 "홀수"/"짝수" 라고 출력
		
		// key : 수식, 변수
		// value: 값(byte, short, int, char, String 또는 열거형)
		int n; 
		
		Scanner sc = new Scanner(System.in);	
		System.out.printf("정수입력: ");
		n=sc.nextInt();
		
		String result;
		switch (n%2) {
		case 0:
//			System.out.println("짝수(even)");
			result = "짝수(even)";
			break;
		case 1:
//			System.out.println("홀수(odd)");
			result = "홀수(odd)";
			break;
//		default:
//			
//			break;
		}// switch
		
	}// main

}// class

/*
switch (key) {
case value:
	
	break;
case value:
	
	break;
case value:
	
	break;

[default:
	break;]
}// switch
*/