package days16;


public class Point3DCopy {

	//필드
	private int x;
	private int y;
	private int z;


	public Point3DCopy() {
		System.out.println("Point3D 디폴트 생성자 호출됨....");
	}

	public Point3DCopy(int a) {
		this.x = a;
		this.y = a;
		System.out.println("> Point3D 1 생성자 호출됨....");
	}

	public Point3DCopy(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("> Point3D 2 생성자 호출됨....");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}



	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void disPoint3D() {
		System.out.printf("x=%d, y=%d, z=%d\n",this.x,this.y,this.z);
	}

	public Point3DCopy offsetPoint(int i) {
		x += i;
		y += i;
		z += i;
		return this;
	}

	public void offsetPoint(Point3DCopy p) {
		x += p.x;
		y += p.y;
		z += p.z;

	}

	public Point3DCopy Plus(Point3DCopy p) {
		int xValue = x + p.x;
		int yValue = y + p.y;
		int zValue = z + p.z;

		Point3DCopy newp = new Point3DCopy();
		newp.x = xValue;
		newp.y = yValue;
		newp.z = zValue;

		return newp;
	}

} // class
