package days10;

public class Ex03_04 {

	public static void main(String[] args) {

		//[ 별찍기 - 4 ]
		// ****   i=1 , k=0, j=4
		//  ***   i=2 , k=1, j=3
		//   **   i=3 , k=2, j=2
		//    *   i=4 , k=3, j=1
		
	      
	      for (int i = 1 ; i <= 4; i++ ) {       // 행
	         // 공백 찍는 for
	         for (int j = 1; j <= i-1; j++) {   // 열
	            System.out.print(" ");             
	         } // for j
	         // 별 찍는 for
	         for (int j = 1; j <= 5-i; j++) {   // 열
	            System.out.print("*");             
	         } // for j
	         System.out.println(); // 개행
	      } // for i
	      
	      /*
	      // [2]
	      for (int i = 1 ; i <= 4; i++ ) {       // 행
	         // 공백 찍기
	         System.out.print(" ".repeat(i-1));
	         // 별 찍는 for
	         for (int j = 1; j <= 5-i; j++) {   // 열
	            System.out.print("*");             
	         } // for j
	         System.out.println(); // 개행
	      } // for i
	      */

	      //[3]
			for (int i = 1; i <=4; i++) {
				for (int j = 1; j <=4; j++) {
					System.out.print(i<=j?"*":" ");
				}
				System.out.println();
			}


	} // main

}
