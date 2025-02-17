package days06;

public class Ex03_03 {
	
	public static void main(String[] args) {
		
//		int sum = 0;
//		for (int i = 1; i <= 10; i+=2) { // -> 홀수 합 구하는 또다른 방법
//			if(i % 2 == 0) continue;
//			
//			System.out.printf("%d+", i);
//			sum += i;
//		}
//		System.out.printf("\b=%d\n", sum);
		
		int sum = 0;
		int i = 1;

		while (i <= 10) {

			System.out.printf("%d+", i);
			sum += i;
			i+=2;
		}

		System.out.printf("\b=%d", sum);

		
	} // main

}
