package days08;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		// [정처기 실기] 
		// 어떤 정수를 입력받아서 양의 약수를 구해서 출력...
		// 양의정수 하나를 입력받아서 양의 약수를 출력
		
		int num;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		num = sc.nextInt();

		System.out.printf("%d의 약수 - ", num);
		while (i <= num) {
			if (num % i == 0) {
				System.out.printf("%d ", i);
			}
			i++;
		}
		
		
		// 최대공약수, 최소공배수, 소수 구하는 코드 짜보기
			
	} // main

}
