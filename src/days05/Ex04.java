package days05;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 조건반복문: while문
		// while문 1~10까지 합
		//  ㄴ 조건반복문: condition이 참일 동안 {}블럭을 실행하는 반복문
		
		int i =1;
		int sum =0;
		
//		while (i++ <= 3) { // 2+3+4 = 9 비교후에 값증가가 이루어짐
		while (++i <= 3) { // 2+3 = 5 , 비교보다 값증가가 먼저 이루어짐
			System.out.printf("%d+", i);
			sum += i;
			//i++;
		} // while 
		
		System.out.printf("=%d", sum);
		
//		do {
//			
//		} while (condition); // 조건에 관계없이 최소한 do의 {}를 한번 실행하고 while문 실행
		
		
		// 1~10=55(for문  
		/*
		int sum =0;		
		for (int i = 0; i <= 10; i++) {	
			System.out.printf("%d+", i);
			sum += i;
		} // for i
		System.out.printf("= %d", sum);
		*/

	}

}
