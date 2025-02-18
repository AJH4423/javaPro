package days07;

public class Ex04_03 {
	
	public static void main(String[] args) {
		
	      // k=1   d = 2;    4*k-2
	      // k=2   d = 6;  
	      
	      for (int k = 1; k <=2 ; k++) {
	         for (int i = 1; i <= 9; i++) {
	            for (int d = 4*k-2; d <= 4*k-2+3; d++) {  // 단
	               System.out.printf("%d*%d=%2d ", d, i, d*i);
	            } // for d
	            System.out.println();
	         } // for i   
	         System.out.println();
	      } // for k
	      
	      /* [1]
	      for (int i = 1; i <= 9; i++) {
	         for (int d = 2; d <= 5; d++) {  // 단
	            System.out.printf("%d*%d=%2d ", d, i, d*i);
	         } // for d
	         System.out.println();
	      } // for i   
	      System.out.println();
	      for (int i = 1; i <= 9; i++) {
	         for (int d = 6; d <= 9; d++) {  // 단
	            System.out.printf("%d*%d=%2d ", d, i, d*i);
	         } // for d
	         System.out.println();
	      } // for i   
	      */

		
	} // main

}
