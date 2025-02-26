package days18;

import java.util.Arrays;
import java.util.Random;

public class Ex05_03 {

	// try-catch문 사용한 예외처리
	// 예외가 생길만한 블럭을 묶음
	public static void main(String[] args) {

		int number = 100;
		int result = 0;		
		Random rnd = new Random();
		int n = -1;

		int [] m = new int[5];

		for (int i = 0; i < 10; i++) {
			try {
				n = rnd.nextInt(5); // 0<=정수<5
				// java.lang.ArithmeticException: / by zero			
				result = number / n;

				/*
				try {
					m[i] = result;
					System.out.println(result);
				} catch (ArrayIndexOutOfBoundsException e) {
					// 배열크기를 늘리던지의 예외처리작업 진행
					System.out.println("배열크기 부족으로 출력 및 저장 X");
				}
				 */

				// 다중 catch 블럭을 사용할 때는 자식 Exception catch블럭을
				// 먼저 코딩한다. -> 부모가 밑에 와야한다

			} catch (ArithmeticException e) {
				i--;
				// System.out.println(e.toString());
			} catch (ArrayIndexOutOfBoundsException e) { // 다중 catch 블럭
				i--;
				m = Arrays.copyOf(m, m.length + 5);
				System.out.println("배열크기 부족으로 출력 및 저장 X");
			} catch (Exception e) {
				// 예외처리 코딩
			}			
		} // for i

	} // main

} // class
