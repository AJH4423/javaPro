package days18;

import java.util.Random;

public class Ex05_04 {

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
				m[i]=result;
				System.out.println(result);
				
				// 멀티 catch 블럭
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				i--;
				// System.out.println(e.toString());
			} catch (Exception e) {
				// 예외처리 코딩
				e.printStackTrace();
				// syso(e.getMessage);
			}			
		} // for i

	} // main

} // class
