package days16;

public class Ex09 {

	public static void main(String[] args) {

		// 자식 객체를 생성하면 먼저 부모 객체가 생성된 후에
		// 자식 객체가 생성된다
		// ( 부모의 생성자함수가 먼저 호출되고 자식의 생성자함수가 호출된다)

		// this 키워드
		// super 키워드
		// 		ㄴ 정의: 자식 클래스에서 부모클래스의 멤버를 창조하는데 사용되는 참조변수
		//		ㄴ 용도: 1) 부모의 멤버를 가리킬 때의 super
		// 			   2) 생성자에서 또 다른 부모의 생성자를 호출 할 때의 super()
		// 			   3) 단독으로 사용되는 super X

		//자식 객체 c를 생성...
		Child c = new Child();

		c.dispChild();
		System.out.println("end");

	} // main

} // class

// 모든 클래스의 최상위 부모클래스는 Object이다.
class Parent {

	// 필드
	int x = 10;

	// 생성자
	Parent() {
		System.out.println("> Parent 디폴트 생성자 호출됨.");
	}

	//메소드
	void dispParent() {

	}
	// final + 메소드 선언 -> 오버라이딩 할 수 없는 함수
	// 자식클래스엥서 오버라이딩(재정의) 할 수 없는 메소드이다
	public final void test() {
		System.out.println("> parent.test()...");
	}
}

class Child extends Parent {

	// int x = 10; 필드 상속
	// dispParent(){} 상속
	// test(){} 상속
	// 부모의 생성자 상속 x

	// 가능하다
	// 부모에세 물려받은 x 필드가 존재하는데 똑같은 이름으로 x 선언
	int x = 20; 
	int y;

	public Child() {
		super(); // 컴파일러가 추가, 부모의 디폴트 생성자가 호출...
		System.out.println("> Child 디폴트 생성자 호출됨.");
	}

	void dispChild() {
		System.out.println(x); // Child의 x값
		System.out.println(this.x); // Child의 x값
		System.out.println(super.x); // 부모의 x값
	}

	@Override
	void dispParent() {
		// TODO Auto-generated method stub
		System.out.println("새로구현했다(재정의)");
	}

	/*
	@Override
	public final void test() {
		System.out.println("> parent.test()...");
	}
	 */

	//	public Child() {
	//		System.out.println("> Child 디폴트 생성자 호출됨.");
	//	}

}