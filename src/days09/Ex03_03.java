package days09;

public class Ex03_03 {
	
	public static void main(String[] args) {
		
		// 주민등록번호
		String rrn = "980410-1122111";
		
		//[문제] 주민등록번호 뒷자리 7개 출력
//		System.out.println(rrn.split(",")[1]);		
//		System.out.println(rrn.indexOf("-")); --> 6
		
		int beginIndex = rrn.indexOf("-")+1;
		int endIndex = rrn.length();
		String s = rrn.substring(beginIndex, endIndex);
		System.out.println(s);
		System.out.println(rrn.substring(beginIndex));
		
		/*
		 * 내가 적은 코드
		int beginIndex = 7;
		int endIndex = 14;
		String s = rrn.substring(beginIndex, endIndex);
		System.out.println(s);
		*/
		
//		//1) 980410-*******
//		int beginIndex = 0;
//		int endIndex = 7;
//		String s = rrn.substring(beginIndex, endIndex); // 문자열 시작index~bound-1까지 받음
//		int count = rrn.length() - s.length();
//		System.out.println(s+"*".repeat(count));
//		
//		//2) 980410-1******
//		beginIndex = 0;
//		endIndex = 8;
//		s = rrn.substring(beginIndex, endIndex);
//		count = rrn.length() - s.length();
//		System.out.println(s+"*".repeat(count));
		
	} // main

}
