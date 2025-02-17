package days08;

public class Ex11 {
	
	public static void main(String[] args) {
		
		// 재귀함수: 함수안에서 자기 자신을 다시 호출하는 함수
		
		disp();
		
	} // main

	private static void disp() {
		System.out.println("disp 호출함..");
		disp();
	}

} // class
