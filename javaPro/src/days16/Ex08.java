package days16;

import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) throws IOException {

		Shape s = new Shape();
		//s.draw(); // 예외처리

		Point2D center = new Point2D(50,100);
		int radius = 30;
		Circle c = new Circle(center, radius);
		//c.drawColorCenter();
		c.draw(); // 재정의 함수(오버라이딩) 호출

		System.out.println("=".repeat(50));

		Point2D [] p = {
				new Point2D(1,1),
				new Point2D(20,40),
				new Point2D(10,5),
		};

		Triangle t = new Triangle(p);
		t.draw();

	} // main

} // class

class Shape extends Object{

	// 필드
	String color = "black"; // 명시적 초기화
	//생성자

	//메서드
	public void draw() throws IOException{
		System.out.printf("color=%s\n", color);
	}

}

/*
// 도형 중 원 클래스 상속x
class Circle {
	// 필드
	int x;
	int y; // 원점 좌표
	int r; // 반지름 radius

	// 생성자
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public Circle() {
		this(0,0,0);
	}
	// 메서드

}
 */

//원은 도형이다
// ~은 ~이다 : is a (상속)관계
class Circle extends Shape{
	// 필드
	Point2D center; //원점
	int r; // 반지름 radius

	// 생성자
	public Circle(Point2D center, int r) {
		this.center = center;
		this.r = r;
	}

	public Circle() {
		this(new Point2D(0,0),0);
	}


	// 메서드
	// 원점 출력 + 원의색깔(color) 출력
	// Point2D.dispPoint2D()  Shape.draw()

	/* [1] 
	public void drawColorCenter() {
		System.out.printf("[color=%s], center=", color);
		center.dispPoint2D();
	}
	 */

	// [2] Shape 부모클래스의 color만 출력하는 draw() 메소드를 
	// 	   물려받은 Circle 자식클래스에서 color + 원점을 출력하는
	//     새로운 draw() 메소드를 다시 정의(재정의)
	//   -> 오버라이딩 or 오버라이드(override) == 부모한테 상속받은거 다시 정의하는 것을 말함
	//      오버로딩 == 중복함수
	/*
	 * [오버라이딩 규칙]
	 * 1. 메서드명은 동일하게
	 * 2. 리턴자료형도 동일하게
	 * 3. 매개변수도 동일하게
	 * 4. 접근지정자는 같거나 범위가 넓은 접근지정자를 지정해야 된다
	 * 		public > protected > default > private
	 * 5. 예외는 부모의 예외보다 많을 수 없다.
	 * 6. 인스턴스 메서드 <-> 정적(static) 메서드로 변경 할 수 없다
	 * 
	 * */

	/*
	@Override // 컴파일러가 컴파일 시 오버라이딩을 제대로 했는지를 체크하는 어노테이션
	public void draw() throws IOException {
		System.out.printf("[color=%s] center (%d,%d)\n", color
				, this.center.getX()
				,this.center.getY());
	}
	 */

	// Alt + Shift + S 오버라이딩
	@Override
	public void draw() throws IOException {
		System.out.printf("[color=%s] center (%d,%d)\n", color
				, this.center.getX()
				,this.center.getY());

	}

}

// 삼각형 클래스 선언
// 삼각형도 도형 - Shape 클래스 상속
// 삼각형의 정의 : 한 평면에 있고, 일직선상에 없는 3개의 점 a,b,c를 
// 			   2개씩 쌍으로 선분을 연결하여 이루어지는 도형
class Triangle extends Shape {

	// 꼭지점 3개
	Point2D [] p = new Point2D[3];

	// 생성자
	public Triangle(Point2D [] p) {
		this.p = p;
	}

	@Override
	public void draw() throws IOException {
		System.out.printf("[p1=%s, p2=%s, p3=%s]\n"
				, p[0].getXY()
				, p[1].getXY()
				, p[2].getXY());

	}

}









