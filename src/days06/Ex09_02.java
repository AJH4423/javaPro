package days06;

import java.util.Arrays;

public class Ex09_02 {
	
	public static void main(String[] args) {
		
		//char형 읽기
		String name = "admin";
		 
		// string 문자열을 배열로해서 한글자씩 읽겠다.
//		char ch = name.charAt(0);		
//		System.out.printf("%s -> '%c'\n", name, ch);
		
		char ch;
		// String 문자열을 char형으로 하나씩 읽겠다.
		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			System.out.printf("%s -> %d ->'%c'\n", name,i, ch);
		}
		
		// String -> char[] 변환 [1]
//		   char [] nameArr = new char[name.length()];
//		      
//		      for (int i = 0; i < name.length(); i++) {
//		         ch = name.charAt(i);
//		         nameArr[i] = ch;
//		         System.out.printf("%s -> %d -> '%c'\n", name, i,  ch);
//		      } // for i
//		      
//		      System.out.println( Arrays.toString(nameArr ));
//		[2]
		char [] nameArr = name.toCharArray();
		System.out.println( Arrays.toString(nameArr));

		
		// char[] -> String 변환 (외우기) 
		
		// [1] name = String.valueOf(nameArr);
		
		// [2] name = new String(nameArr);
		      System.out.println(name);
		
	} // main

}
