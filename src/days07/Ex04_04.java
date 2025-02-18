package days07;

public class Ex04_04 {

	public static void main(String[] args) {

		for (int k = 1; k <= 3; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int d = 3 * k - 1; d <= 3 * k + 1 && d<10; d++) { // 단
					System.out.printf("%d*%d=%2d ", d, i, d * i);
					if (d == 9) {
						break;
					}
				} // for d
				System.out.println();
			} // for i
			System.out.println();
		} // for k

	} // main

}

// k=1 : 2,3,4 / k=2 : 5,6,7 / k=3 : 8,9
