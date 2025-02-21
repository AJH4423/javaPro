package days15;

public class Ex03 {
	
	public static void main(String[] args) {
		
		// 1. 기본형 매개변수와 참조형 매개변수
		// 2. 기본형 리턴자료형과 참조형 리턴자료형
		
		// MyPoint 클래스 선언 : 좌표를 관리하기 위한 필드, 메서드를 가진 클래스
		
		/*
		 * 
		 * [0][0][0x300]<-----------[0x100]
		 *  x  y                      p1
		 *  
		 * [10][20][0x300]<---------[0x200]
		 *   x   y                    p2
		 *   
		 *   
		 *   		[dispMyPoint()]
		 *   			0x300
		 * 
		 * */
		
		MyPoint p1 = new MyPoint();
		p1.x = 10;
		p1.y = 20;
		
		p1.offsetPoint(100).dispMyPoint(); // 체이닝 -> 메소드를 연달아서 부르는것
		// == p.dispMyPoint()
		
		// p1.plusPointX(100).dispMyPoint(); 
		// plusPointX()의 리턴자료형은 int기때문에 int형은 그 다음 메서드를 부를 수 없다. 
		
		/*
		MyPoint p2 = new MyPoint();
		p2.x = 10;
		p2.y = 20;
		p2.dispMyPoint(); // x=10, y=20
		
		// x,y 좌표값 모두 내가 준 값(100)만큼 이동 
		p1.offsetPoint(100); //기본형 매개변수
		p1.dispMyPoint(); 
		
		p1.offsetPoint(p2); // 참조형 매개변수
		p1.dispMyPoint();
		
		//x좌표만 이동
		int x = p1.plusPointX(10); // 기본형 리턴
		System.out.println(x);
		
		MyPoint p3 = p1.offsetPoint(5); // p1.x+5, p1.y+5
		p3.dispMyPoint();
		*/
		
		
	} // main

} // class
