package days06;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {

		// 두 정수 (n,m)을 입력받아서 두 정수 사이의 홀수합 출력(for문)

		int n, m, i;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요(n): ");
		n = sc.nextInt();
		System.out.print("정수를 입력하세요(m): ");
		m = sc.nextInt();
//		int min = n>m?m:n; // Math.min(n,m)
//		int max = Math.max(n, m);
//		
//		for (i = n; i <= m; i++) {
//			if (i % 2 != 0) {
//				System.out.printf("%d+", i);
//				sum += i;
//			}
//		}
		// ------------------------------------------
		System.out.printf("\b=%d", sum);
		
	     if ( n > m ) {
	         int temp = n;
	         n = m;
	         m = temp;
	      } // if 
			for (i = n; i <= m; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d+", i);
				sum += i;
			}
		}
			System.out.printf("\b=%d", sum);
			//-------------------------------------------
		
		
//		if(n<0||m<0) {
//			System.out.println("[알림] 양의 정수만 입력하세요!!");
//			return;
//		}
//
//		if (n < m) {
//			for (i = n; i <= m; i++) {
//				if (i % 2 != 0) {
//					System.out.printf("%d+", i);
//					sum += i;
//				}
//
//			}
//			System.out.printf("\b=%d", sum);
//		} else {
//			for (i = m; i <= n; i++) {
//				if (i % 2 != 0) {
//					System.out.printf("%d+", i);
//					sum += i;
//				}
//			}
//			System.out.printf("\b=%d", sum);
//		}
		

	} // main

}
