package days20;

// 같은 패키지 내부에 있는 클래스들 - days20 Parent, Child
public class Child extends Parent {
	
	void modifierAccessTest() {
		this.pub = 100; // 패키지 내/외부 어디서든지 접근 가능
		this.pro = 90; // default + 상속 접근 가능
		this.def = 80; // 패키지 내부 접근 가능
		
		// this.pri -> Parent 클래스 내부에서만 접근 가능
	}

}
