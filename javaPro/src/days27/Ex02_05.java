package days27;

public class Ex02_05 {

	public static void main(String[] args) {

		Outer outer = new Outer();

	} // main

} // class

class Outer {

	int a = 10; // 외부변수 1

	class Inner {
		int b = 20; // 외부변수 2
		void method(int i) { // 외부변수 4 : 람다식에서 사용하는 순간 자동으로 final로 된다.
			int c = 30; // 외부변수 3		: fianal int c	
			// c = 100;
			// i = 200; // (체크)
			
			//MyFunction2 f = (i) -> { // 에러발생: method(int i)와 (i)이름 중복
			MyFunction2 f = () -> { // 에러발생: method(int i)와 (i)이름 중복
				// 외부 변수를 참조하는 람다식
				// (기억) 람다식에서 i/c변수를 참조하면 final 붙이지 
				//		 않아도 상수로 간주한다.
				// Local variable i defined in an enclosing scope must be final or effectively final
				System.out.println("i: " + i);
				System.out.println("c: " + c);
				
				// 상수로 간주하지 않는다. 값을 변경해도 된다.
				this.b = 1000;
				Outer.this.a = 20000;
				System.out.println("b: " + this.b);
				System.out.println("a: " + Outer.this.a);
			};
			f.myMethod();
		}
	}

}


@FunctionalInterface
interface MyFunction2 {
	void myMethod();
}



