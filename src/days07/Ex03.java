package days07;

import java.util.Arrays;

public class Ex03 {
	
	public static void main(String[] args) {
		
		// 문자열(String)메서드
		// 1. charAt()
		// 2. equals() / equalsIgnoreCase()
		// 3. length()
		// 4. valueOf()
		// 5. toUpperCase(), toLowerCase()
		// 6. format()
		// 7. toCharArray()
		// 8. repeat(): "-".repeat(50)
		// 9. trim(): 문자열의 앞뒤 공백을 제거하는 메서드
		
		String data = "홍길동,이창익,서영학,정창기";
		String regax = ","; // 정규표현식
		String [] names = data.split(regax); // data.split(정규표현식);, String 배열로 리턴값이 된다
		
//		System.out.println(Arrays.toString(names));
//		
//		int size = names.length;
//		for (int i = 0; i < size; i++) {
//			System.out.printf("names[%d]=\"%s\"\n", i, names[i]);		
//		}
		
		
		// [foreach문] == 확장 for문
		/*
		 * for(  : 배열 또는 컬렉션클래스) {		
		 * 
		 * }
		 * 
		 * */
		
		for (String name : names) {
			System.out.println(name);
		}

		
	} // main

}
