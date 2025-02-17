package days07;

import java.io.IOException;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) throws IOException {

		// do-while문
		// 가위바위보 게임 계속할지 여부 물어보기, 승률 기능 추가
		int com, user;
		Scanner scanner = new Scanner(System.in);
		char con = 'y';
		int count = 0;
		int same = 0;
		int comCt = 0;
		int userCt = 0;

		do {
			com = (int) (Math.random() * 3) + 1;

			System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
			user = scanner.nextInt();

			System.out.printf("> com=%s, user=%s\n", com==1?"가위":(com==2?"바위":"보"), user==1?"가위":(user==2?"바위":"보"));
			// -> 강사님이 알려주신 배열을 이용한 코딩으로 숙달해둘것 (가위바위보를 숫자가 아닌 문자열로 출력되는 코드)
			

			// 승자 판단해서 출력...
			switch (user - com) {
			case 0:
				System.out.println("무승부");
				count++;
				same++;
				break;
			case 1:
			case -2:
				System.out.println("사용자 승리");
				count++;
				userCt++;
				break;
			case -1:
			case 2:
				System.out.println("컴퓨터 승리");
				count++;
				comCt++;
				break;
			} // switch
			if (comCt==3||userCt==3) {
				System.out.printf("최종 승리자: %s 승리\n", comCt==3?"컴퓨터":"사용자");
				break;
			} // if
			
			System.out.print("\n 게임 계속합니까? ");
			con = (char) System.in.read();
		} while (con == 'y' || con == 'Y');

		System.out.println("end");
		System.out.printf("판수: %d, 비긴수: %d\n", count, same);
		System.out.printf("컴퓨터 승률: %f\n", (double) comCt / count);
		System.out.printf("사용자 승률: %f\n", (double) userCt / count);
		
		
		
		

//		com = (int) (Math.random() * 3) + 1;
//
//		System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
//		user = scanner.nextInt();
//
//		System.out.printf("> com=%d, user=%d\n", com, user);
//
//		// 승자 판단해서 출력...
//		switch (user - com) {
//		case 0:
//			System.out.println("무승부");
//			break;
//		case 1:
//		case -2:
//			System.out.println("사용자 승리");
//			break;
//		case -1:
//		case 2:
//			System.out.println("컴퓨터 승리");
//			break;
//		} // switch


	} // main

}// class
