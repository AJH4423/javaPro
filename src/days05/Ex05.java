package days05;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for 문 1~10합
		
		int sum = 0;
		int i=10;
		for (;;) {
			System.out.printf("%d+", i);
			sum += i;
			if(i==1) break;
			i--;
		} // for i
		
		System.out.printf("\b=%d",sum); 
		
//		for (int i = 1; i <= 10; i++) {
//
//			System.out.printf("%d+", i);
//			sum += i;
//		} // for i
//		System.out.printf("\b=%d",sum); 
//		
		
	}// main

}// class
