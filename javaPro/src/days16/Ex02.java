package days16;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {

		//		아래 두 문자열의 대소문자 구분 없이, 순서 상관 없이 같은 문자여부를 체크하는 코딩을 하세요. 
		String n = "keNik";   
		String m = "kKnie";

		// (암기) 두 문자열을 비교할 떄는 == 연산자 이용안함, equals(), equalsIgnoreCase()
		// System.out.println(n.equalsIgnoreCase(m)); -> 대소문자 관계없이 비교 
		
		// 1. 대문자로 변환 + 문자열 오름차순 정렬하기
		char [] nArr = n.toUpperCase().toCharArray();
		Arrays.sort(nArr);
		char [] mArr = m.toUpperCase().toCharArray();
		Arrays.sort(mArr);
		
		System.out.println(nArr);
		System.out.println(mArr);
		
		// char [] -> String 변환
		n = String.valueOf(nArr); 
		m = String.valueOf(mArr); 
		
		// 3. 같은 문자열인지 비교
		System.out.println(n.equals(m));

	} // main



}
