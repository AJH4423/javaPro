package days15;

public class MyPoint {
	
	// 필드
	// 필드를 초기화하지 않으면 자료형의 기본값으로 초기화되어져 있다
	public int x;
	public int y;
	
	// 디폴트 생성자 선언
	public MyPoint() {
		System.out.println("MyPoint 디폴트 생성자 호출됨.");
	}
	
	public MyPoint(int x, int y) {
		// 필드 초기화 코딩 -> 생성자에는 무조건 필드를 초기화시키는 코드가 있다.
		this.x = x;
		this.y = y;
	}

	// 메서드
	// p1.plusPoint(p2);
	public MyPoint plusPoint(MyPoint p) { // 클래스 복사
		this.x += p.x; // p1.x += p2.x
		this.y += p.y; // p1.y += p2.y
		
		// **리턴값으로 홀로사용되는 this의 3번째 용도**
		return this; //this == p1 
	}
	
	
	// p1.dispMyPoint();
	// p2.dispMyPoint();
	public void dispMyPoint() {
		System.out.printf("> x=%d, y=%d\n", this.x, this.y); // 호출객체.x, 호출객체.y
	}

	/*
	// p2.offserPoint(100)
	public void offsetPoint(int d) { // 기본형 매개변수
		x += d;
		y += d;
	}
	*/
	
	// p1.offsetPoint(p2);
	// p1.x = p1.x + p2.x
	// p1.y = p1.y + p2.y
	public void offsetPoint(MyPoint p) { // 참조형 매개변수, 클래스 복사
		x += p.x;
		y += p.y;
	}

	public int plusPointX(int d) { // 기본형 리턴자료형
		
		return x+d;
	}
	
	public MyPoint offsetPoint(int d) { // 참조형 리턴자료형
		//x += d;
		//y += d;
		
		MyPoint p = new MyPoint();
		p.x = x+d;
		p.y = y+d;
		
		return p;
	}

} // class
