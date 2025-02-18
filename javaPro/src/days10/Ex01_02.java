package days10;

public class Ex01_02 {
	
	public static void main(String[] args) {
		
		// 16진수로 변환 출력
	      int n = 31;      
	      // System.out.println( Integer.toHexString(n) ); // 1f
	      
	      int share = n, rest; // 몫, 나머지 변수
	      // Ctrl + F	     	      
	      String hex = "";
	      
	      final char[] hexArr = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	      while ( share != 0 ) {
	         rest = share % 16; 
	         share = share / 16;
	         hex = hexArr[rest]+hex;	                  
	      } // while 
	        System.out.printf("%s", hex);
		
	} // main

} // class
