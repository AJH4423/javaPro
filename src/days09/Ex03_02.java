package days09;

public class Ex03_02 {
	
	public static void main(String[] args) {
		
		// 주민등록번호
		String rrn = "980410-1122111";
		String [] rrnArr = rrn.split("-");
		
		System.out.println(rrnArr[0]+"-"+"*******");
		// String.concat() 문자열 연결 메소드
		System.out.println(rrnArr[0].concat("-*******"));
		
		// 980410-1******로 출력방법
		System.out.println(rrnArr[0]+"-"+rrnArr[1].charAt(0)+"******");
		//String.concat() 문자열 연결 메소드
		System.out.println(rrnArr[0].concat("-").concat(rrnArr[1].charAt(0)+"").concat("******"));
	} // main

}
