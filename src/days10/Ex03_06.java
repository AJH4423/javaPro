package days10;

import java.util.Scanner;

public class Ex03_06 {

	public static void main(String[] args) {

		//[ 별찍기 - 6 ] 이등변삼각형
		//    * 4  (3)
		//   *** 345 (2)
		//  ***** 23456 (1)
		// ******* (0)

		//		for (int i = 1; i <=4; i++) {
		//			System.out.println(" ".repeat(4-i)+"*".repeat(2*i-1)+" ".repeat(4-i));			
		//		}

		//		int n;
		//		Scanner sc = new Scanner(System.in);
		//		System.out.print("정수입력:");
		//		n=sc.nextInt();
		//		
		//		for (int i = 1; i <=n; i++) {
		//			System.out.println(" ".repeat(n-i)+"*".repeat(2*i-1)+" ".repeat(n-i));			
		//		}

		//[2]
		//		int row = 11;
		//
		//		for(int i = 1; i <= row; i++) {
		//			// 공백
		//			for(int j = 1; j <= row - i; j++) {
		//				System.out.print(" ");
		//			}
		//			//2*i-1 홀수 
		//			for(int j = 1; j <= 2*i-1; j++) { 
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}

		//[3]

		for (int i = 1; i <= 3; i++) {
	         for (int j = 1; j <= 5; j++) {
	            //System.out.print( i+j==4 || i==3|| j-i==2?"*":" ");
	            //System.out.print( i+j>=4   ?"*":" ");
	            //System.out.print( j-i<=2 ?"*":" ");
	            System.out.print( i+j>=4 && j-i<=2  ?"*":" ");
	         } // for j
	         System.out.println();
	      } // for i 
		
	} // main

}
