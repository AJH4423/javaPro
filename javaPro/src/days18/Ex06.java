package days18;

public class Ex06 {

	public static void main(String[] args) {

		// [try-catch문 실행과정 이해]
		System.out.println("1");
		try {
			System.out.println("2");
			System.out.println(100/10);
			System.out.println("3");
		} catch (ArithmeticException e) {
			System.out.println("4");
		} catch (Exception e) {
			System.out.println("5");
		} finally { // 이 블럭은 try{} 블럭에서 예외가 발생 유무에 상관없이
					// 실행할 코딩을 하는 블럭이다.
					// 필수는 아니고 생략시켜도 된다
			System.out.println("6");
		}
		System.out.println("7");
		System.out.println("end");

	} // main

} // class
