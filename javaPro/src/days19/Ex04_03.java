package days19;

public class Ex04_03 {

	public static void main(String[] args) {

		//		System.out.println("abC".compareTo("abc"));
		//		System.out.println("abC".compareToIgnoreCase("abc"));

		String url = "http://www.naver.com";
		// String url = "ftp://www.naver.com"; -> X, http://로 시작해야함

		// url.substring(0, 7).equals("http://");

		// 메서드 사용
		/*
		String prefix = "http://";
		System.out.println(url.startsWith(prefix));

		String fileName = "Sample.java";
		String suffix = ".java";
		System.out.println(fileName.endsWith(suffix));
		*/
				
		String [] urls = {			
				"http://www.naver.com"
				,"www.naver.com"
				,"ftp://www.naver.com"
				,"https://www.naver.com"						
		};
		
		// 정규표현식으로 맞는 url찾기
		// String regex = "^http:////";
		String regex = "http://.*";
		for (String u : urls) {
			if(url.matches(regex)) System.out.println(u);
		}
		System.out.println("end");
	} // main

} // class
