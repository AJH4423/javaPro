package days06;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// for 1부터 n까지의 합 구하기
		/*
		int sum = 0, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 입력: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("\b=%d", sum);
		*/
		
		int sum = 0, n;
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 입력: ");
		n = sc.nextInt();
		
		if (n<1) {
			System.out.println("[알림] 양의 정수만 입력!");
			return;
		} // if
		
		while (i<=n) {
			System.out.printf("%d+", i);
			sum += i;
			i++;
		}
		System.out.printf("\b=%d", sum);

	} // main

}
