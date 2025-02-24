package days16;

public class Ex05 {
	
	public static void main(String[] args) {
		
		/*
		 * [변수의 초기화 설명]
		 * 1. 변수
		 * 2. 변수종류
		 * 3. 변수의 초기화 - 변수를 선언하고 처음으로 값을 할당하는 것
		 * 4. 지역변수는 반드시 초기화를 해야 사용할 수 있다
		 * 	  인스턴스변수, 클래스 변수는 초기화하지 않으면 각 자료형의 
		 *    기본값으로 초기화 되어져 있다.
		 * [ 5. 필드의 초기화 방법 ] -> 변수가 아닌 필드 = 멤버변수이다
		 * 		1) 명시적 초기화
		 * 		2) 생성자 초기화
		 * 		3) 초기화 블럭 사용	
		 * 
		 * */
		Member m1 = new Member(); // 객체 첫 번째 생성
		System.out.println(m1.name);
		System.out.println(m1.age);
		
		Member m2 = new Member(); // 객체 두 번째 생성
		System.out.println(m2.name);
		System.out.println(m2.age);
		
		System.out.println(m2.rate);
		/*
		String name;
		// The local variable name may not have been initialized -> 초기화문제
		System.out.println(name);
		*/
		
		
	} // main

} // class

class Member {
	//필드
	// ㄱ. 인스턴스 변수
	String name = "홍길돟"; 	//명시적 초기화
	int age = 20; 			//명시적 초기화
	int count;
	int serialNumber;
	// ㄴ. 스태틱 변수
	static double rate=0.04;//명시적 초기화
	
	//초기화가 일어나는 순서 : 명시적초기화 -> 인스턴스 초기화 블럭 -> 생성자 초기화
	
	//생성자
	Member() {
//		count++;
//		serialNumber = count;
		name = "무명";
		System.out.println("> Member 디폴트 생성자 호출됨.");
	}
	
	// 생성자가 오버로딩되어 있을때 중복 코딩이 있다면 초기화 블럭 사용
	// [인스턴스 초기화 블럭]
	// 객체가 생성될때 매번 생성되어 호출된다
	{
		count++;
		serialNumber = count;
		System.out.println("> 인스턴스 초기화 블럭");
	}
	
	// [클래스 초기화 블럭]
	// 일괄적으로 클래스 변수를 초기화하기 위한 목적으로 사용
	// 클래스 초기화 블럭은 가장먼저 한번만 호출이됨
	static {
		rate=0.07;
		System.out.println("> 클래스 초기화 블럭");
	}
	
	Member(String name) {
//		count++;
//		serialNumber = count;
		this.name = name;
		System.out.println("> Member 1 생성자 호출됨.");
	}
	
	//메서드
}
