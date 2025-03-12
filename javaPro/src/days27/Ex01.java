package days27;

public class Ex01 {
	
	public static void main(String[] args) {
		
		// [람다식(Lamda Expression)]
		/*
		 * 1. 람다식(Lamda Expression)
		 * 		1) 자바 두 번의 큰 변화
		 * 			JDK1.5 : 제네릭
		 * 			JDK1.8 : 람다식
		 * 		2) 자바 = 객체지향적 프로그래밍언어인 동시에 [함수형 언어]
		 * 			ㄱ. 객체지향적 프로그래밍 = 객체 + 객체 + 객체 + ...
		 * 								클래스  클래스
		 * 								 ㄴ 클래스안에서 여러 기능들 = 메서드
		 * 			ㄴ. 함수형 언어 - 독립적인 함수
		 * 
		 * 2. 람다식 == 메서드를 하나의 '식'으로 표현한 것. 
		 * 	  예) () -> System.out::println
		 * 		  ㄴ 람다식을 '익명함수(Anonmous Function)'라고도 한다.
		 * 
		 * 3. 메서드보다 "코딩이 간결"하고 이해가 쉽다.
		 * 	  객체지향언어 불편한 점) 메서드를 사용하려면 항상 클래스의 객체를 생성한 후에
		 * 						객체명.메서드명() 호출을 해야함
		 * 						-> 하지만 람다식을 쓰면 위의 과정을 진행하지 안해도됨
		 * 
		 * 4. 람다식을 사용해서 메서드를 변수처럼 다룰 수 있다.
		 * 
		 * 5. 람다식 작성방법, 선언형식
		 * 		ㄴ 메서드의 이름과 반환타입을 제거하고 
		 * 		   매개변수 선언부와 몸체{} 사이에 '->'연산자를 추가.
		 * 		
		 * 		반환타입 메서드이름(매개변수...){
		 * 		명령코딩;
		 * 		}
		 * 
		 * 		int max(int a, int b) {
		 * 			return a > b ? a : b;
		 * 		}
		 * 
		 * 		예) 람다식
		 * 			(매개변수...) -> {
		 * 							  명령코딩;
		 * 							}
		 * 		ㄱ. 첫번째
		 * 		(int a, int b) -> {return a > b ? a : b;}
		 * 		ㄴ. 두번째
		 * 			ㄴ 반환값이 있는 메서드인 경우 return문 대신 '수식'으로 대신할 수 있다.
		 * 			  이 수식의 결과가 자동적으로 반환값이 된다.
		 * 			  세미콜론은 붙이지 않는다.
		 * 			  {} 생력한다.
		 * 		(int a, int b) -> a > b ? a : b
		 * 		ㄷ. 세번째
		 * 			ㄴ 매개변수의 타입을 추측할 수 있는 경우에는 생략 가능하다.
		 * 		(a, b) -> a > b ? a : b
		 * 
		 * 			매개변수 어느 하나의 타입만 생략하는것은 허용하지 않는다.
		 * 		(a, int b) -> a > b ? a : b [x]
		 * 
		 * 			만약에 매개변수가 1개일 경우에는 () 괄호를 생략할 수 있다.
		 * 		(int a) -> a*a
		 * 		(a) -> a*a
		 * 		a -> a*a
		 * 		int a -> a*a [x] : 허용되지 않음
		 * 
		 * 		ㄹ. 네번째
		 * 		(String name, int age) -> {
		 * 		  System.out.println(name);
		 * 		  System.out.println(age);
		 * 		}
		 * 
		 * 		// 몸체{}에 명령라인이 1줄일 경우에는 {}생략가능
		 * 		(String name, int age) -> {
		 * 		  System.out.println(name + "/" + age);
		 * 		}
		 * 
		 * 		(주의할점) 뒤에 세미콜론을 붙이지 않는다
		 * 		(String name, int age) -> System.out.println(name + "/" + age);
		 * 
		 * 		[문제] 틀린점은 무엇인가?
		 * 		(int a, int b) -> return a > b ? a : b 
		 * 			ㄴ> retrun표현을 없애야함
		 * 			ㄴ> return문을 살릴려면 세미콜론이 있어야함
		 * */
		
	} // main

} // class
