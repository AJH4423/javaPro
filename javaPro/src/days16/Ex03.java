package days16;

public class Ex03 {

	public static void main(String[] args) {

		// [가변인자]
		// JDK1.5 메서드의 매개변수의 갯수가 고정 -> 동적 지정할 수 있다.

		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));

		int [] m = {1,2,3,4,5,6,7};
		System.out.println(sum(m));

	} // main

	// 오버로딩
	// 3정수의 합을 구해서 반환하는 메서드
	private static int sum(int a, int b, int c) {

		return a+b+c;
	}

	// 2정수의 합을 구해서 반환하는 메서드
	public static int sum(int a, int b) {
		return a+b;
	}

	// 매개변수 정수 갯수에 상관없이 실행해주는 메서드 
	private static int sum(int [] args) {

		int result = 0;
		for (int i : args) {
			result += i;
		}

		return result;
	}

} // class
