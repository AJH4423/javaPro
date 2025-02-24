package days16;

// 상속개념
// Point2D 기존 존재하는 클래스를 재사용해서 새로운 Point3D 클래스를 선언
public class Point3D extends Point2D{

	//필드
	//	private int x;
	//	private int y;
	private int z;


	public Point3D() {
		System.out.println("Point3D 디폴트 생성자 호출됨....");
	}

	public Point3D(int a) {
		super(a);// 부모 호출은 super를 이용, super는 문법적으로 맨 윗줄에 와야한다
		//super(a,a); 
		// The field Point2D.x is not visible -> 접근 지정자 X
		//this.x = a;
		//this.y = a;
		//this.setX(a);		
		//this.setY(a);
		this.z = a;
		System.out.println("> Point3D 1 생성자 호출됨....");
	}

	public Point3D(int x, int y, int z) {
		super(x,y); // 부모의 매개변수 두개짜리 메서드 호출
		//this.x = x;
		//this.y = y;
		this.z = z;
		System.out.println("> Point3D 2 생성자 호출됨....");
	}

	public Point3D(Point2D p, int z) {
		this.setX(p.getX());
		this.setY(p.getY());
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	// 메서드
	public void disPoint3D() {
		System.out.printf("x=%d, y=%d, z=%d\n",this.getX(),this.getY(),this.z);
	}

	public Point3D offsetPoint(int i) {
		this.setX(this.getX()+i);
		this.setY(this.getY()+i);
		z += i;
		return this;
	}

	public void offsetPoint(Point3D p) {
		// 부모생성자인 super는 인위적으로 호출이 안된다
		// 일반 메서드에서는 super는 호출이 안됨 -> 생성자에서는 호출 가능
		this.setX(this.getX()+p.getX());
		this.setY(this.getY()+p.getY());
		z += p.z;

	}

	public Point3D Plus(Point3D p) {
		int xValue = this.getX() + p.getX();
		int yValue = this.getY() + p.getY();
		int zValue = z + p.z;

		Point3D newp = new Point3D(xValue, yValue, zValue);
		//		newp.x = xValue;
		//		newp.y = yValue;
		//		newp.z = zValue;

		return newp;
	}

} // class
