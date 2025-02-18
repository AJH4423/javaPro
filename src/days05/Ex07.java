package days05;

public class Ex07 {
	
	public static void main(String[] args) {
		
		// 자바에서 임의의 수를 발생시키는 코딩.
		// 1) Math.random()
		// 2) Random 클래스
		
		// Math 클래스: 수학과 관련된 기능이 구현된 클래스
		System.out.println(Math.abs(10)); 
		System.out.println(Math.abs(-10)); // 절대값 구하는 메서드
		
		//Math.random(); : 0.0<= double실수값 <=1.0 인 랜덤한값 발생
		
		
		// 로또번호 1~45 임의의 수 6개...
		// 1 <= (int)(Math.random()*45)+1 < 46
		
			
		// 국어 0~100점사이값 발생
		
//		int kor = (int)(Math.random()*101);
//				
//			System.out.printf("국어점수: %d", kor);
		
		// 3~19 사이 정수값
		
		// -> 3 <= (int)(Math.random()*17)+3 <= 19
		
//		int nb = (int)(Math.random()*20);
//		
//		while(true) {
//		if (nb>=3 && nb<=19) {
//			System.out.println(nb);
//			break;
//		} else {	
//			continue;
//		}
//		}
									
	} // main

}
