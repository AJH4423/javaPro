package days05;

import java.util.Random;
import java.util.Scanner;

public class Ex07_02 {

	public static void main(String[] args) {

//		int user;
//		int com = (int)(Math.random()*3)+1;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while (true) {
//			System.out.printf("user 가위(1) 바위(2) 보(3): ");
//			user = sc.nextInt();
//			
//			if (user==com){
//				System.out.printf("user: %d, com: %d\n", user, com);
//				System.out.println("비겼습니다 다시입력하세요");
//				continue;
//			} 
//			else if((user==1 && com==3) || (user==2 && com==1) || (user==3 && com==2)){
//				System.out.printf("user: %d, com: %d\n", user, com);
//				System.out.println("당신이 이겼습니다.");
//				break;
//			}
//			else if((com==1 && user==3) || (com==2 && user==1) || (com==3 && user==2)){
//				System.out.printf("user: %d, com: %d\n", user, com);
//				System.out.println("컴퓨터가 이겼습니다.");
//				break;
//			}
//			}
		
		//-----------------------------------------------------------------------------------

		int user;
		double userran = Math.random();
		int com;
		double comran = Math.random();
		int i;
		int count = 0;
		String winner = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("베스킨라빈스31 게임시작!");

		if (userran > comran) {
			while (true) {

				System.out.printf("플레이어는 숫자 개수를 입력하세요 (1~3): ");
				user = sc.nextInt();

				if (user < 0 || user > 3) {
					System.out.println("범위에 맞게 다시 입력하세요(1,2,3 중 하나를 입력하세요)");
					continue;
				}

				System.out.print("플레이어: ");

				for (i = 0; i < user; i++) {
					count++;
					System.out.printf("%d ", count);
					if (count == 31) {
						winner = "컴퓨터";
					}
				} // for
				System.out.println();

				if (count == 31) {
					break;
				}

				System.out.print("컴퓨터: ");
				com = (int) (Math.random() * 3 + 1);

				for (i = 0; i < com; i++) {
					count++;
					System.out.printf("%d ", count);
					if (count == 31) {
						winner = "유저";
						break;
					}
				} // for
				System.out.println();

				if (count == 31) {
					break;
				}

			}

			System.out.printf("%s 승리!!", winner);
		}

		if (comran > userran) {
			while (true) {

				System.out.print("컴퓨터: ");
				com = (int) (Math.random() * 3 + 1);

				for (i = 0; i < com; i++) {
					count++;
					System.out.printf("%d ", count);
					if (count == 31) {
						winner = "유저";
						break;
					}
				} // for
				System.out.println();

				if (count == 31) {
					break;
				}

				System.out.printf("플레이어는 숫자 개수를 입력하세요 (1~3): ");
				user = sc.nextInt();

				if (user < 0 || user > 3) {
					System.out.println("범위에 맞게 다시 입력하세요(1,2,3 중 하나를 입력하세요)");
					continue;
				}

				System.out.print("플레이어: ");

				for (i = 0; i < user; i++) {
					count++;
					System.out.printf("%d ", count);
					if (count == 31) {
						winner = "컴퓨터";
					}
				} // for
				System.out.println();

				if (count == 31) {
					break;
				}

			}

			System.out.printf("%s 승리!!", winner);
		}
		
		// ----------------------------------------------------------

		
//		 System.out.println("베스킨라빈스 31 게임시작");
//
//	      Random rnd = new Random();
//	      Scanner scanner = new Scanner(System.in);
//
//	      String winner = null;  // 승자 저장
//	      int numberCount = 1;   // 연달아 부를 수  1~3
//	      int displayNumber = 1;      
//
//	      // 선플레이어 랜덤하게 정하기  true 나오면 플레이어, false 나오면 컴퓨터
//	      boolean 선공 = rnd.nextBoolean();
//
//	      if (!선공) {   // 만약  컴퓨터가 선공이라면 
//	         System.out.print("컴퓨터 : ");
//	         numberCount  = rnd.nextInt(3)+1;
//	         for (int i = 1; i <= numberCount  ; i++,  displayNumber++) {
//	            System.out.printf("%3d", displayNumber); 
//	         }
//	         System.out.println();
//	      } 
//
//	      GAMVEOVER:
//	         while( displayNumber <= 31) {
//	            // 선 : 플레이어
//	            System.out.print("플레이어는 숫자 개수를 입력하세요 (1~3) : ");
//	            numberCount = scanner.nextInt();
//	            System.out.print("플레이어 : ");
//	            for (int i = 1; i <= numberCount  ; i++,  displayNumber++) {
//	               System.out.printf("%3d", displayNumber);
//	               if( displayNumber == 31 ) {
//	                  winner  = "컴퓨터";
//	                  break GAMVEOVER;
//	               } 
//	            }
//	            System.out.println();
//	            // 후 : 컴퓨터
//	            System.out.print("컴퓨터 : ");
//	            numberCount  = rnd.nextInt(3)+1;
//	            for (int i = 1; i <= numberCount  ; i++,  displayNumber++) {
//	               System.out.printf("%3d", displayNumber);
//	               if( displayNumber == 31 ) {
//	                  winner  = "플레이어";
//	                  break GAMVEOVER;
//	               } 
//	            }
//	            System.out.println();
//	         } // while
//
//	      System.out.printf("\n31 도달, %s의 승리\n", winner);

		
	}// main

}
