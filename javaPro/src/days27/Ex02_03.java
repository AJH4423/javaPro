package days27;

public class Ex02_03 {
	
	// 1. 함수형인터페이스를 매개변수로 사용한 경우
	static void execute(MyFunction f) {
		f.run();
	}
	
	// 2. 함수형인터페이스를 리턴값으로 사용한 경우
	static MyFunction getMyFunction() {
//		MyFunction f = () -> System.out.println("f1.run()...");
//		return f;
		
		return () -> System.out.println("f.run()...");
	}
	
	public static void main(String[] args) {
		// 1. 
		MyFunction f1 = () -> System.out.println("f1.run()...");
		execute(f1);
		// 람다식을 매개변수로 사용
		execute( () -> System.out.println("f.run()...") );
		
		// 2.
		MyFunction f = getMyFunction();
		f.run();
		
	} // main

} // class

@FunctionalInterface
interface MyFunction {
	void run();
}
