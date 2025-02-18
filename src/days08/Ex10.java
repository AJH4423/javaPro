package days08;

public class Ex10 {

	public static void main(String[] args) {
		// 두 기억공간에 있는 값을 바꾸는 메소드 선언 및 호출
		// 매개변수를 가지고 매서드를 호출하는 방법
		// 1) Call by Name  ex) drawLine()-> 매개변수 없이 넘겨줌
		// 2) Call by Value ex) sum(10)
		// 3) Call by Reference ex) 변수를 참조형으로 넘겨줘야한다 -> 배열, 클래스, 인터페이스
		
		/*
		 * heap                       stack
		 * 
		 * 
		 * 
		 * */

		int x=10, y=20;
		
		System.out.printf("> x=%d, y=%d\n", x,y);
		
		swap(x,y); // 안바뀌는 이유: x,y의 기억공간이 넘어가는것이 아닌 기억공간에 담긴 값만 넘어감
		           // main과 swap의 지역이 다르기에 x,y의 지역변수에 대한 기억공간은 서로 다르다
		           // 기억공간을 넘기는것이 아닌 값만 넘기는것 -> Call by Value
		           // 즉 값만 넘기는것이 아닌 기억공간에 직접 관여할 수 있게 넘겨줘야한다
		           // 즉 Call by Reference로 넘겨줘야 한다 -> 주소값을 줌으로써 다른 지역의 기억공간들이 같은 주소를 참조하고있음
		
		System.out.printf("> x=%d, y=%d\n", x,y);

	} // main

	private static void swap(int x, int y) {
		// TODO Auto-generated method stub
		int temp =x;
		x=y;
		y=temp;
	}

} // class
