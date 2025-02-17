package days07;

import java.util.Scanner;

public class Ex07_02 {

	public static void main(String[] args) {

		// 사용자의 가위바위보 입력값에 대한 유효성 검사...
		// 알림코딩 추가 + 3번 입력 잘못하면 프로그램 종료
		int user;
		Scanner scanner = new Scanner(System.in);
		boolean isFirst = false;
		int count = 0;

		do {
			if (count == 3) {
				System.out.printf("[알림] 실패횟수:%d\n", count);
				System.out.println("3번틀렸기 때문에 게임을 종료합니다.");
				// break;
				return;
			}

			if (isFirst) {
				System.out.printf("[알림]1~3에서의 정수를 다시 입력(실패횟수:%d)\n", count);
			} // if
			isFirst = true;

			System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
			user = scanner.nextInt();

			count++;
//			if(!(user == 1 && user == 2 && user == 3)) {
//				
//				System.out.printf("1~3에서의 정수를 다시 입력하세요(%d번째 틀림)\n", ++count);
//			}
//			if(count==3) {
//				System.out.println("3번틀렸기 때문에 게임을 종료합니다.");
//				return;
//			}

		} while (!(user == 1 && user == 2 && user == 3));

		System.out.printf("> user=%d\n", user);

	} // main

}
