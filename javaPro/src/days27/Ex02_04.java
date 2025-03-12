package days27;

public class Ex02_04 {
	
	public static void main(String[] args) {
		
		// 람다식의 타입을 함수형 인터페이스 타입으로 형변환하는 예제
		
		// 						람다식도 내부적으로는 익명객체이다
		MyFunction f = (MyFunction)(() -> {}); // 1차적 함수형인터페이스 변환
		
		Object obj = (Object)((MyFunction)(() -> {}));
		
		String str = ((Object)((MyFunction)(() -> {}))).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
	} // main

} // class

/*
@FunctionalInterface
interface MyFunction {
	void run();
}
*/
