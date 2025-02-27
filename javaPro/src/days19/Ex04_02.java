package days19;

import java.util.Arrays;
import java.util.Collections;

public class Ex04_02 {
	
	public static void main(String[] args) {
		
		String s = "public static void 메인(String[] args) {";
		
		// 1. 문자열 길이를 변환하는 메서드
		// System.out.println(s.length()); // 40
		
		// 2. 문자열 속에서 특정 위치의 한 문자를 반환하는 메서드
		// System.out.println(s.charAt(0));
		/*
		for (int i = 0; i < s.length(); i++) {
			System.out.printf("%c", s.charAt(i));
		} // for i
		*/
		
		// 3. 대문자 변환, 소문자 변환
		// 대문자 변환하는 새로운 문자열을 반환만하지 문자열이 바뀌는건 아님
		// 문자열은 불변임
		/*
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);
		*/
		
		// 4. String [] s.split(regex);
		
		// 5. String -> char[]
		/*
		char [] sArr = s.toCharArray();
		System.out.println(Arrays.toString(sArr));
		*/
		
		// 6. char[] -> String
		/*
		String s2 = new String(sArr);
		String.valueOf(sArr);
		System.out.println(s2);
		*/
		
		// 7. trim() : 문자열 앞 뒤의 공백을 제거해서 문자열 반환하는 메서드
		// System.out.printf("[%s]", " 홍길동 ".trim());
		
		// [문제] s문자열 속에 main 문자열 찾아서 MAIN으로 변경해서 출력
		String searchWord = "in";
		
		/*[1]
		if (s.contains(searchWord)) {
			int index = s.indexOf(searchWord);
			System.out.println(s.substring(0, index) 
					+ searchWord.toUpperCase() 
					+ s.substring(index+searchWord.length()));
		} // if
		*/
		
		/*
		//[2]
		String [] sArr = s.split(searchWord);
		System.out.println(String.join(searchWord.toUpperCase(), sArr));
		*/
		
		//[3]
		/*
		System.out.println(s.replace(searchWord, searchWord.toUpperCase()));
		System.out.println(s.replaceAll(searchWord, searchWord.toUpperCase()));
		System.out.println(s.replaceFirst(searchWord, searchWord.toUpperCase()));
		*/
		
		// -> indexof(), contains(), substring(), join(), split(), replace()
		
//		System.out.println(s.indexOf("in")); // 앞에서부터 찾아나간다 -> 21
//		System.out.println(s.lastIndexOf("in")); // 뒤에서부터 찾아나간다 -> 27
		
		/*
		// 문자열 연결
		String s2 = "aaa" + "bbb" + "ccc"; // 문자열 연결 연산자 '+'
		String s3 = "aaa".concat("bbb").concat("ccc");
		
		// 문자열 비교
		s2.equals(s3);
		s2.equalsIgnoreCase(s3);
		*/
		
		// 문자열 거꾸로 출력
		//String s2 = reverse(s);
		//System.out.println(s2);
		
		// s 문자열 속에 한글을 제외한 모든 문자는 제거
		System.out.println(s.replaceAll("[a-zA-Z() {}\\[\\]]", ""));
		System.out.println(s.replaceAll("^[가-힣]", ""));
		
		//[과제] 비밀번호 정규표현식
		// 		알파벳 대문자 1개, 소문자 1개, 숫자 1개, 특수문자 1개
		// 		문자열 길이 8~15 사이
		// 		String regex = "~~";
		
		
	} // main

	private static String reverse(String s) {
		
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			result = s.charAt(i) + result;
		} // for i
		
		return result;
		
	}

}
