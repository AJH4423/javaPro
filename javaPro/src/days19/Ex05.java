package days19;

public class Ex05 {
	
	public static void main(String[] args) {
		
		// 문자열 수정/삭제/삽입 변경
		// StringBuffer 클래스
		// StringBuilder 클래스
		
	String s = "TODO Auto-generated method stub";
	
	int index = s.indexOf("Auto");
	int len = "Auto".length();
	
	// 1. 삽입
	// Auto문자열을 찾아서 [hi] 삽입
	System.out.println(s.substring(0, index+len) + "[hi]" + s.substring(index+len));
	
	// 2. 삭제
	// String s에서 "method" 문자열을 찾아서 삭제
	index = s.indexOf("method");
	index = s.indexOf("method");
	len = "method".length();
	System.out.println(s.substring(0, index) + s.substring(index+len));
	
	// 3. 수정: method -> 메소드 영어를 한글로 수정
	System.out.println(s.replace("method", "메소드"));
	
	// StringBuffer sb = new StringBuffer(s); // -> 멀티스레드에 안전하다 (== 동기화처리가 되어있음)
	StringBuilder sb = new StringBuilder(s); // -> 멀티스레드에 안전하지 않음
	System.out.println(sb);
	
	// 1. 삽입
	sb.insert(index + len, "[hi]");
	// 2. 삭제
	// sb.delete(index, index + len);
	System.out.println(sb);
	// 3. 수정
	int start = sb.indexOf("method");
	int end = start + "method".length();
	sb.replace(start, end, "메소드");
	
	sb.reverse();
	
	System.out.println(sb);
	
		
	} // main

} // class
