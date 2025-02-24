package days16;

public class Ex07 {
	
	public static void main(String[] args) {
		
		// is-a 관계(상속관계)
		/*
		 * 1. 상속(inheritance)
		 * 2. 상속
		 * 		부모->자식(재산)
		 * 		부모->자식(코드)
		 * 			ㄴ 기존 클래스를 재사용하여 새로운 클래스를 작성(선언)하는것.
		 * 3. 상속 장점
		 * 	ㄴ 코드 재사용 + 코딩양이 적다
		 * 	ㄴ 행산성 향상, 유지 보수 용이
		 * 4. 자바에서 상속 구현 방법
		 * 		class 새로운클래스명 extends 기존클래스{
		 *
		 * }
		 * 5. 기존클래스 == 부모클래스, 기초(base)클래스, [super]클래스, 상위클래스
		 * 	  새로운클래스 == 자식클래스, 파생(derived)클래스, sub클래스, 하위클래스
		 * 
		 * 		(부모클래스)
		 * 		   ↑
		 * 		(자식클래스)
		 * 6. 예)
		 * 		좌표 관리하는 클래스: Point2D.java
		 * 						Point3D.java
		 * 
		 * */
		
		Point2D p = new Point2D(10, 20);
		p.dispPoint2D();
		
	} // main

}
