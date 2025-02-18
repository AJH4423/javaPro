package days10;

public class Ex03_05 {

	public static void main(String[] args) {

		//[ 별찍기 - 5 ]
		//    *
		//   **
		//  ***
		// ****

		/*
		  // [1] 
	      for (int i = 1 ; i <= 4; i++ ) {       // 행
	         // 공백 찍는 for
	         for (int j = 1; j <= 4-i; j++) {   // 열
	            System.out.print(" ");             
	         } // for j
	         // 별 찍는 for 
	         for (int j = 1; j <= i; j++) {   // 열
	            System.out.print("*");             
	         } // for j

	         System.out.println(); // 개행
	      } // for i 
		 */

		// [2] 
		/*
	      for(int i=4; i>=1; i--) {
	          System.out.println(" ".repeat(i-1)+"*".repeat(5-i));
	      }
		 */

		//[3]
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				System.out.print(i+j>=5?"*":" ");
			}
			System.out.println();
		}

	} // main

}
