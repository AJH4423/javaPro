package days06;

import java.util.Scanner;

public class Ex04_05 {
	
	public static void main(String[] args) {
		// 세 정수를 입력받아서 세 정수 중에 가장 큰 값, 가장 작은 값을 구해서 출력
		
		int n,m,l;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하세요: ");
		n=sc.nextInt();
		m=sc.nextInt();
		l=sc.nextInt();
		
		// 삼항연산자 사용시, int max = n>m?(n>o?n:o):(m>o?m:o);
		
		int min,Min,max,Max;
		
		min = Math.min(n, m); 
		Min = Math.min(min, l);
		max = Math.max(n,m);
		Max = Math.max(max, l);
		
		System.out.printf("Max: %d, Min: %d", Max, Min);
		
		
	} // main

}
