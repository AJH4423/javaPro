package days03;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//[시험] 두 기억공간의 값을 바꾸기

		int x=10, y=20;
		System.out.printf("> x=%d, y=%d\n", x,y);
		
		{
		int temp =x;
		x=y;
		y=temp;
		}    // --> {}을 설정해주면 임시공간외의 기능으로 사용되지 않는 temp는 
		     //     {}안에서만 사용되고 사라진다.
		
		System.out.printf("> x=%d, y=%d\n", x,y);
		
	}// main

}// class
