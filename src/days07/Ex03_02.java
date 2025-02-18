package days07;

public class Ex03_02 {
	
	public static void main(String[] args) {
		
		String data = "홍길동  , 이창익,  서영학, 정창기";
//		String regax = ","; // 정규표현식
		String regax = "\\s*,\\s*"; // 정규표현식
		String [] names = data.split(regax);
		
		for (String name : names) {
//			System.out.printf("[%s]\n", name.trim()); // trim(): 문자열의 앞뒤 공백을 제거하는 메서드
			System.out.println(name);
		}
		
	} // main

}
