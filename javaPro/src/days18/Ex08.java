package days18;

import java.io.IOException;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		// [예외처리 2번째 방법: throws문]
		// + 예외를 강제로 발생시키는 문 : throw문
		// System.in.read(); 이해

		// 국어점수를 입력받아서 수~가 출력
		int kor = 0;
		try {
			kor = getScore();
			System.out.println("kor = " + kor);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("end");

	} // main

	private static int getScore() throws IOException {
		Scanner sc = new Scanner(System.in);
		int score = 0;

		System.out.print("점수 입력: ");
		String input = sc.next();

		// 0~100 유효성 검사
		String regex = "^([0-9]|[1-9][0-9]|100)$";

		if (input.matches(regex)) {
			score = Integer.parseInt(input);
		} else {
			// 강제 예외 발생 시키겠다 : throw문 사용
			throw new IOException("점수 범위: 0~100..."); 
			// -> 컴파일러가 예외처리를 확인하기 때문에 오류가 발생
			// throw new ArithmeticException("점수 범위: 0~100...");
			// -> 컴파일러가 예외처리를 확인하지 않기 때문에 오류 발생x
		}

		return score;
	}

}
