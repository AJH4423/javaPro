package days04;

import java.util.Scanner;

public class Ex06_02 {
	public static void main(String[] args) {
		
		// [문제]
		// 정수를 입력받아서 "홀수"/"짝수" 라고 출력
		
		int n;
		
		Scanner sc = new Scanner(System.in);	
		System.out.printf("정수입력: ");
		n=sc.nextInt();
		
		/*
		if (n % 2 == 0) {
			System.out.println("짝수(even)");
		} // if
		if (n % 2 != 0) {
			System.out.println("홀수(odd)");
		} // if
		*/
		
		if (n % 2 == 0) {
			System.out.println("짝수(even)");
		} else {
			System.out.println("홀수(odd)");
		} // 이 if문이 위의 if문보다 더 좋은코딩임
							
		System.out.println("end");
		// sc.close(); -> 객체를 사용한뒤 닫아주는 작업, 메모리손실 방지
		
	} // main
	
}// class
