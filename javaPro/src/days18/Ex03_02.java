package days18;

public class Ex03_02 {
	
	// 1. 인스턴스 클래스
	class InstanceClass{
		int iv = 100; // 인스턴스 변수 선언 가능
		// The field cv cannot be declared static in a non-static inner type, 
		// unless initialized with a constant expression
		// static int cv = 100; 클래스 변수 선언 불가
		final static int COUNT = 100; // 상수 선언 가능
	}
	
	// 2. 정적 클래스
	static class StaticInner{
		int iv = 100; // 인스턴스 변수 선언 가능
		static int cv = 100; // 클래스 변수 선언 가능
		final static int COUNT = 100; // 상수 선언 가능
	}
	
	void method() {
		
		// 3. 로컬 클래스
		class LocalInner{
			int iv = 100; // 인스턴스 변수 선언 가능
			// static int cv = 100; // 클래스 변수 선언 불가
			final static int COUNT = 100; // 상수 선언 가능
		}
		
	}

	public static void main(String[] args) {
		
		//InstanceClass.COUNT;
		//StaticInner.COUNT;
		//StaticInner.cv;

	}

}
