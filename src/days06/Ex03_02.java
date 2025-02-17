package days06;

public class Ex03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int i = 0;

		while (i++ <= 10) {

			if (i % 2 == 0) {
				continue; // while문의 조건으로 감
			}
			System.out.printf("%d+", i);
			sum += i;

		}

		System.out.printf("\b=%d", sum);

	}// main

}// class
