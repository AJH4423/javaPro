package days06;

import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {

		int n, m, i;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요(n): ");
		n = sc.nextInt();
		System.out.print("정수를 입력하세요(m): ");
		m = sc.nextInt();

		int min = n > m ? m : n; // Math.min(n,m)
		int max = Math.max(n, m);

		i = min; // i 변수를 하나더 정해줘야 가독성이 더 좋아진다
		while (i <= max) {
			System.out.printf("%d+", i);
			sum += i;
			i++;
		}
		System.out.printf("\b=%d", sum);

	} // main

}
