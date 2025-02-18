package days05;

public class Ex03 {

	public static void main(String[] args) {
		// 
		
		// 1+2+3+....+10=55 (for문)
		
		int sum =0;

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d+", i);
			sum += i;
		} // for i
		System.out.printf("= %d", sum);

	}

}
