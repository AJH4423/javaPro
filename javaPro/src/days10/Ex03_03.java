package days10;

public class Ex03_03 {

	public static void main(String[] args) {

		//[ 별찍기 - 3 ]
		// ****
		// ***
		// **
		// *

		/* [1]
		for (int i = 4; i >=1; i--) {			
			for (int j = 1; j <=i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		*/
		// [2]
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				System.out.print(i+j<=5?"*":" ");
			}
			System.out.println();
		}


	} // main

}
