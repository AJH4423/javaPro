package days10;

public class Ex03_07 {
	
	public static void main(String[] args) {
		
		//[ 별찍기 - 7 ] 마름모
		  // __*    1행	1개  4
	      // _***   2행	3개	2
	      // *****	3행	5개  0
	      // _***	1행	3개  2
	      // __*	2행	1개  4
		
		/* [1]
		for (int i = 1; i <= 5; i++) {
	         // 공백 for
	         for (int j = 1; j <= (i<=3?3-i:i-3); j++) {
	            System.out.print("_");
	         } // for j         
	         // 별  for
	         for (int j = 1; j <= (i<=3?2*i-1:5-2*(i-3)); j++) {
	            System.out.print("*");
	         } // for j
	         System.out.println(); // 개행
	      } // for i
	      */
		
		//[2]
		for (int i = 1; i <= 5; i++) {
	         for (int j = 1; j <= 5; j++) {
	            //System.out.print( i+j==4 || i==3|| j-i==2?"*":" ");
	            //System.out.print( i+j>=4   ?"*":" ");
	            //System.out.print( j-i<=2 ?"*":" ");
	            System.out.print( i+j>=4 && j-i<=2 || i+j>=5&&j-i<=2?"*":" ");  
	            // 42/43/44 | 53
	            // 41/45 | 51/52/54/55
	         } // for j
	         System.out.println();
	      } // for i 
		
	} // main

}
