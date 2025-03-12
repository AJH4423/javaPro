package days27;

public class Ex02 {
	
	public static void main(String[] args) {
		
		/*
		 * [함수형 인터페이스(Functional InterFace)]
		 * 	ㄴ 자바에서 모든 메서드는 클래스 내에 선언된다.
		 * 	ㄴ 람다식 == 메서드 -> 어떤 클래스에 선언.
		 * 	  람다식	  ==	 익명 클래스 객체
		 * 	ㄴ 객체명.메서드명() 호출
		 * 	ㄴ 	(타입)변수 = 람다식	호출 -> 변수의 자료형은 무엇으로 해야하는가?
		 * 	  	참조타입 : 배열[x], 클래스[o], 인터페이스[o]
		 * 		예)
		 * 		interface MyFunction {
		 * 			// public abstract
		 * 			int max(int a, int b);
		 * 		}
		 * 
		 * 		// 익명클래스       익명객체(클래스)
		 * 		MyFunction f = new MyFunction() {
		 * 			@Override
		 * 			int max(int a, int b){
		 * 				return a > b ? a : b;
		 * 			} 
		 * 		}
		 * 
		 * 		MyFunction f = (a, b) -> a > b ? a : b // 위와 완전히 같은코딩
		 * 		int c = f.max(1,2); // 익명객체.메서드() 호출
		 * 
		 * 	ㄴ 하나의 메서드만 선언된 인터페이스들을 정의해서 
		 * 	  람다식을 다룰 수 있도록 규칙을 정함.
		 * 	  람다식을 다루는 1개만의 메서드를 가진 인터페이스를
		 * 	  "함수형 인터페이스"라고 부른다.
		 * 
		 * 	ㄴ 예)
		 * 		@FunctionalInterface 어노테이션을 붙인다.(람다식에 사용되는 함수형 인터페이스)
		 * 		interface Myfunction {
		 * 			int max(int a, int b);  1개의 메서드 == 1개의 람다식
		 * 		}
		 * 
		 * 	ㄴ static, default 메서드는 개수에 상관없이 정의 가능하다
		 * 
		 * 		예) Ex02_02.java
		 * 
		 * 	ㄴ 함수형 인터페이스 타입을 매개변수, 리턴타입
		 * 		예) Ex02_03.java
		 * 
		 * 	ㄴ 람다식의 타입과 형 변환
		 * 		1) 람다식을 함수형 인터페이스에 참조할 수 있다.
		 * 		MyFunction f = () -> syso("f.run()...");
		 * 		2) 람다식의 타입(자료형)이 함수형 인터페이스의 타입과 일치하지는 않음
		 * 		   익명타입(객체)
		 * 		3) 람다식의 타입(자료형)이 함수형 인터페이스의 타입으로 형변환
		 * 			ㄴ Object obj = (Object)(() -> syso("f.run()...")) [x]
		 * 			ㄴ 반드시 함수형 인터페이스로만 형변환을 할 수 있다.
		 * 		예) Ex02_04.java
		 * 
		 * 	ㄴ 외부 변수를 참조하는 람다식
		 * 		1) 람다식 == 익명 객체 ( 익명클래스의 인스턴스 )
		 * 		2) 외부에 선언된 변수에 접근하는 규칙 알아보자
		 * 			class Outer{
		 * 			// 외부 변수
		 * 
		 * 			// 내부(Inner) 클래스 - 4가지
		 * 			// 람다식도 익명객체(내부클래스)
		 * 				class Inner {
		 * 				}
		 * 			}
		 * 
		 * 		예) Ex02_05.java
		 * */
		
	} // main

} // class
