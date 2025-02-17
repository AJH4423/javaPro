package days06;

import java.util.Scanner;

public class Ex04_04 {

	public static void main(String[] args) {
		// [for/while] 두 정수(n,m)을 입력받아서 두 정수 사이의 홀수의 합을 출력

		int n, m, i;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요(n): ");
		n = sc.nextInt();
		System.out.print("정수를 입력하세요(m): ");
		m = sc.nextInt();

		int min = n > m ? m : n; // Math.min(n,m)
		int max = Math.max(n, m);
		
		if (min % 2 == 0) {
			min++;
		} // if, min값이 짝수일땐 홀수의 합을 구해야하기때문에 1을 더해줌

		i = min; // i 변수를 하나더 정해줘야 가독성이 더 좋아진다
		while (i <= max) {			
			System.out.printf("%d+", i);
			sum += i;			
			i+=2;
		}
		System.out.printf("\b=%d", sum);

	} // main

}
