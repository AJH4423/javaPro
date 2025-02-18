package days10;

public class Ex03_02 {
	
	public static void main(String[] args) {
		
		//[ 별찍기 - 2 ]
		// *
		// **
		// ***
		// ****
		
		/*[1]
		for (int i = 1; i <=4; i++) {			
			for (int j = 1; j <=i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		*/
		
		//[2]
		//4행 4열짜리 for문
		
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				System.out.print(i>=j?"*":" ");
			}
			System.out.println();
		}
		
	} // main

}
