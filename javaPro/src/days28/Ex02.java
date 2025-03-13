package days28;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// [메서드 참조]
		/*
		 * 메서드 -> 간결하게 람다식
		 * 			()->{하나의 메서드만을 호출하는 경우}
		 * 				  -> "메서드 참조"라는 방법으로 람다식을 간략화할 수 있음. 
		 * 
		 * [메서드 참조하는 3가지 방식]
		 * 1) static 메서드 참조		- 클래스명::메서드명
		 * 2) 인스턴스 메서드 참조		- 클래스명::메서드명
		 * 3) 특정 객체 인스턴스 메서드 참조	- 특정객체::메서드명
		 * 
		 * */
		
		// 							문자열 s 매개변수로 int 반환하는 람다식
		// Function<String, Integer> f = s-> Integer.parseInt(s);
		Function<String, Integer> f = Integer::parseInt; // 메서드 참조(위 코드와 동일한 코드)
		
		// BiFunction<String, String, Boolean> f2 = (s1,s2) -> s1.equals(s2);
		BiFunction<String, String, Boolean> f2 = String::equals; // 위 코드와 동일코드
		
		// 특정객체 인스턴스 메서드참조 방법예제
		MyClass obj = new MyClass();
		// Function<String, Boolean> f3 = (x) -> obj.equals(x);
		Function<String, Boolean> f3 = obj::equals;
		
		// [생성자의 메서드 참조]
		//Supplier<MyClass> s = () -> new MyClass();
		Supplier<MyClass> s = MyClass::new; // 메서드 참조
		
		// Lambda expression's parameter s cannot redeclare another 
		// local variable defined in an enclosing scope. 
		// BiFunction<Integer, String, MyClass> s2 = (i,str) -> new MyClass(i,str);
		BiFunction<Integer, String, MyClass> s2 = MyClass::new; // 2짜리 생성자를 호출한다
		
		// [배열의 메서드 참조]
		// Function<Integer, int []> f4 = x -> new int[x];
		Function<Integer, int []> f4 = int[]::new; // 메서드 참조
		
	} // main

} // class

class MyClass{

	public MyClass(Integer i, String s) {
		
	}

	public MyClass() {
		
	}
	
}
