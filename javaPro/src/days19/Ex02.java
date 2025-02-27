package days19;

public class Ex02 {

	public static void main(String[] args) {

		// [Object 클래스]
		// 1. hachCode()
		// 2. getClass()
		// 3. toString() 오버라이딩
		// 4. equals() 	 오버라이딩
		// [5. clone() 복제하는 작업]

		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);

		System.out.println(p1==p2); // false
		System.out.println(p1.equals(p2)); // true

		//[clone()]

		// Type mismatch: cannot convert from Object to Point
		try {
			// Point p3 = (Point) p1.clone(); // 다운캐스팅
			Point p3 = p1.clone(); // 다운캐스팅 안하는 코드
			System.out.println(p3);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} // main

} // class

class Point extends Object implements Cloneable{// 복제를 하려면 호출을 하는 객체에 
	// implements Cloneable 코드를 추가해야함
	int x;
	int y;

	public Point() {}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// p1.equals(p2)
	@Override
	public boolean equals(Object obj) {

		if (obj != null && obj instanceof Point) {
			Point p = (Point)obj;
			return this.x == p.x && this.y == p.y;
		} // if
		return false;
	}

	/*
	// CloneNotSupportedException : checked예외
	@Override
	protected Object clone() throws CloneNotSupportedException{

		Object obj = null;		
		obj = super.clone();

		return obj;
	}
	 */

	// JDK1.5부터 공변 반환 타입 추가
	// 오버라이딩 주의할점 : 부모의 리턴자료형, 매개변수, 예외 등등
	// 부모의 리턴자료형을 오버라이딩할때  자식 리턴자료형으로 바꿔도 되는것 : 공변 반환 타입
	@Override
	protected Point clone() throws CloneNotSupportedException{

		Point obj = null;		
		obj = (Point)super.clone();

		return obj;
	}

	@Override
	public String toString() {

		return String.format("(x=%d, y=%d)", this.x, this.y);
	}



}
