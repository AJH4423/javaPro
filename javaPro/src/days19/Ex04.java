package days19;

public class Ex04 {
	
	public static void main(String[] args) {
		
		// [문자열 다루는 클래스]
		/*
		 * 1. String 클래스
		 * 2. StringBuffer 클래스
		 * 3. StringBuilder 클래스
		 * 4. StringTokenizer 클래스
		 * 
		 * */
		
		// 1. String 클래스
		//  	ㄴ 문자열 자료형
		// 			ㄴ 문자열 나열 : char[]
		// 		ㄴ (암기) "String 클래스는 변경 불가능한(immutable) 클래스이다"
		 String name = "안준호"; // "안준호"를 주소로 생각하기
		//String name = new String("안준호");
		System.out.println(name);
		
		String name2 = "안준호";
		
		System.out.println(name == name2); // new로 인스턴스화 시키지 않았기 때문에 
										   // 둘다 같은 주소를 참조하고있다 -> true
		
	} // main

} // class
