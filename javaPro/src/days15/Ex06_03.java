package days15;

public class Ex06_03 {
	
	public static void main(String[] args) {
		
		// this 3번째 용도 - 리턴값
		MyPoint p1 = new MyPoint(1,2);
		MyPoint p2 = new MyPoint(100,200);
		
		// 클래스 복사
		MyPoint p3 = p1.plusPoint(p2); // p3=p1
		p3.dispMyPoint(); // x=101, y=202 -> p1값과 같다
		p1.dispMyPoint(); // x=101, y=202
	} // main

} // class
