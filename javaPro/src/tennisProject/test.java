package tennisProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		/* [Arraylist이용한 입출력 예시]
		ArrayList<String> male = new ArrayList<String>();
		male.add("양재원");
		male.add("안준호");
		male.add("이진욱");
		int index = 0;
		System.out.println(male.get(index));
		 */
		int game; // 단식(1)/복식(2)/혼합(3)
		int genderSingle, genderDoubles; // 성별 단식,복식
		int malePlayer1, malePlayer2,malePlayer3,malePlayer4; // 뽑히는 남자 
		int femalePlayer1, femalePlayer2,femalePlayer3,femalePlayer4; // 뽑히는 여자 

		ArrayList<String> male = new ArrayList<String>(); // 남자선수 4명 저장될 list
		ArrayList<String> female = new ArrayList<String>(); // 여자선수 4명 저장될 list
		String [] malePlayer = {"양재원", "안준호", "이진욱", "이창익"}; // 입력값으로 받을 남자 선수4명  
		String [] femalePlayer = {"아이유", "수지", "카리나", "윈터"}; // 입력값으로 받을 여자 선수 4명

		// 배열의 선수들을 Arraylist에 대입
		for (int i = 0; i < 4; i++) {
			male.add(malePlayer[i]);
			female.add(femalePlayer[i]);
		}		

		
			// 단/복/혼 선택
			Scanner scanner = new Scanner(System.in);
			System.out.print("단식(1)/ 복식(2)/ 혼합 복식(3) 선택 : ");
			game = scanner.nextInt();

			// 단식(1) 선택
			if (game == 1) {
				while (true) {
					System.out.print("남자 단식(4) / 여자 단식(5) 선택 : ");
					genderSingle = scanner.nextInt();
					switch (genderSingle) {
					case 4:
						for (int i = 0; i < 4; i++) {
							System.out.printf("%d. %s\n", i+1, male.get(i));
						}
						System.out.printf("팀1의 선수를 고르세요: ");
						malePlayer1 = scanner.nextInt();
						System.out.println("팀2의 선수를 고르세요: ");
						malePlayer2 = scanner.nextInt();
						System.out.printf("팀1: %s\n", male.get(malePlayer1-1));
						System.out.printf("팀2: %s\n", male.get(malePlayer2-1));
						break;
					case 5: 
						for (int i = 0; i < 4; i++) {
							System.out.printf("%d. %s\n", i+1, female.get(i));
						}
						System.out.printf("팀1의 선수를 고르세요: ");
						femalePlayer1 = scanner.nextInt();
						System.out.println("팀2의 선수를 고르세요: ");
						femalePlayer2 = scanner.nextInt();
						System.out.printf("팀1: %s\n", female.get(femalePlayer1-1));
						System.out.printf("팀2: %s\n", female.get(femalePlayer2-1));
						break;
					default:
						System.out.println("잘못된 입력입니다. 다시 시도하세요.");
						break;
					} // switch
					break; // 잘못 입력했을때 다시 입력을 못받음
				} // while
			} // if - game1

			// 복식(2) 선택 
			else if(game==2) {
				while (true) {
					System.out.print("남자 복식(6) / 여자 복식(7) 선택 : ");
					genderDoubles = scanner.nextInt();
					switch (genderDoubles) {
					case 6:
						for (int i = 0; i < 4; i++) {
							System.out.printf("%d. %s\n", i+1, male.get(i));
						}
						System.out.printf("팀1의 선수를 고르세요: ");
						malePlayer1 = scanner.nextInt();
						malePlayer2 = scanner.nextInt();
						System.out.println("팀2의 선수를 고르세요: ");
						malePlayer3 = scanner.nextInt();
						malePlayer4 = scanner.nextInt();
						System.out.printf("팀1: %s, %s\n", male.get(malePlayer1-1), male.get(malePlayer2-1));
						System.out.printf("팀2: %s, %s\n", male.get(malePlayer3-1), male.get(malePlayer4-1));
						break;
					case 7: 
						for (int i = 0; i < 4; i++) {
							System.out.printf("%d. %s\n", i+1, female.get(i));
						}
						System.out.printf("팀1의 선수를 고르세요: ");
						femalePlayer1 = scanner.nextInt();
						femalePlayer2 = scanner.nextInt();
						System.out.println("팀2의 선수를 고르세요: ");
						femalePlayer3 = scanner.nextInt();
						femalePlayer4 = scanner.nextInt();
						System.out.printf("팀1: %s, %s\n", female.get(femalePlayer1-1), female.get(femalePlayer2-1));
						System.out.printf("팀2: %s, %s\n", female.get(femalePlayer3-1), female.get(femalePlayer4-1));
						break;
					default:
						System.out.println("잘못된 입력입니다. 다시 시도하세요.");
						break;
					} // switch
					break; // 잘못 입력했을때 다시 입력을 못받음
				} // while 
			} // if - game2

			// 혼합(3) 선택
			else if(game==3) {
				while (true) {
					for (int i = 0; i < 4; i++) {
						System.out.printf("%d. %s\n", i+1, male.get(i));
					}
					System.out.printf("팀1의 남자선수를 고르세요: ");
					malePlayer1 = scanner.nextInt();
					System.out.println("팀2의 남자선수를 고르세요: ");
					malePlayer2 = scanner.nextInt();
					for (int i = 0; i < 4; i++) {
						System.out.printf("%d. %s\n", i+1, female.get(i));
					}
					System.out.printf("팀1의 여자선수를 고르세요: ");				
					femalePlayer1 = scanner.nextInt();			
					System.out.println("팀2의 여자선수를 고르세요: ");
					femalePlayer2 = scanner.nextInt();
					System.out.printf("팀1: %s, %s\n", male.get(malePlayer1-1), female.get(femalePlayer1-1));
					System.out.printf("팀2: %s, %s\n", male.get(malePlayer2-1), female.get(femalePlayer2-1));
					break;
					
					// 잘못입력했을때 처리하는 코드 추가
					
				} // while 
			} // if - game3

			// 잘못 입력시
			else {
				System.out.print("다시입력하세요");
			} // if - game

		// 메서드 이용해서 게임 진행하기

	} // main

} // class
