package days07;

import java.util.Scanner;

public class Ex07_03 {

	public static void main(String[] args) {
		
		// 정규표현식 이용해서 유효성 검사하기
		int user;
		Scanner scanner = new Scanner(System.in);

		System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
		user = scanner.nextInt();

		System.out.printf("> user=%d\n", user);

	} // main

}
