package tennisProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Show {

	public static void main(String[] args) {

		int game; // 단식(1)/복식(2)/혼합(3)
		int genderSingle, genderDoubles; // 성별 단식,복식
		int malePlayer1, malePlayer2, malePlayer3, malePlayer4; // 뽑히는 남자 
		int femalePlayer1, femalePlayer2, femalePlayer3, femalePlayer4; // 뽑히는 여자 

		ArrayList<String> male = new ArrayList<String>(); // 남자선수 4명 저장될 list
		ArrayList<String> female = new ArrayList<String>(); // 여자선수 4명 저장될 list
		String[] malePlayer = {"양재원", "안준호", "이진욱", "이창익"}; // 입력값으로 받을 남자 선수4명  
		String[] femalePlayer = {"아이유", "수지", "카리나", "윈터"}; // 입력값으로 받을 여자 선수 4명

		// 배열의 선수들을 ArrayList에 대입
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
					// 남자 선수 리스트 출력
					for (int i = 0; i < 4; i++) {
						System.out.printf("%d. %s\n", i + 1, male.get(i));
					}
					System.out.printf("팀1의 선수를 고르세요: ");
					malePlayer1 = scanner.nextInt();
					System.out.println("팀2의 선수를 고르세요: ");
					malePlayer2 = scanner.nextInt();

					// 중복선수 선택 시 오류 메시지 출력
					if (malePlayer1 == malePlayer2) {
						System.out.println("팀1과 팀2의 선수가 동일합니다. 다시 선택하세요.");
						continue;  // 중복선수 선택 시 다시 선택을 요구
					}

					System.out.printf("팀1: %s\n", male.get(malePlayer1 - 1));
					System.out.printf("팀2: %s\n", male.get(malePlayer2 - 1));
					break;
				case 5:
					// 여자 선수 리스트 출력
					for (int i = 0; i < 4; i++) {
						System.out.printf("%d. %s\n", i + 1, female.get(i));
					}
					System.out.printf("팀1의 선수를 고르세요: ");
					femalePlayer1 = scanner.nextInt();
					System.out.println("팀2의 선수를 고르세요: ");
					femalePlayer2 = scanner.nextInt();

					// 중복선수 선택 시 오류 메시지 출력
					if (femalePlayer1 == femalePlayer2) {
						System.out.println("팀1과 팀2의 선수가 동일합니다. 다시 선택하세요.");
						continue;  // 중복선수 선택 시 다시 선택을 요구
					}

					System.out.printf("팀1: %s\n", female.get(femalePlayer1 - 1));
					System.out.printf("팀2: %s\n", female.get(femalePlayer2 - 1));
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 시도하세요.");
					continue;
				} // switch
				break; // while문 종료
			} // while
		} // if - game1

		// 복식(2) 선택
		else if (game == 2) {
			while (true) {
				System.out.print("남자 복식(6) / 여자 복식(7) 선택 : ");
				genderDoubles = scanner.nextInt();
				switch (genderDoubles) {
				case 6:
					Set<Integer> selectedMalePlayers = new LinkedHashSet<>();
					// 남자 선수 리스트 출력
					for (int i = 0; i < 4; i++) {
						System.out.printf("%d. %s\n", i + 1, male.get(i));
					}

					// 팀1 선수 선택
					System.out.printf("팀1의 선수를 고르세요: ");
					malePlayer1 = scanner.nextInt();
					selectedMalePlayers.add(malePlayer1);

					System.out.printf("팀1의 두 번째 선수를 고르세요: ");
					malePlayer2 = scanner.nextInt();
					selectedMalePlayers.add(malePlayer2);

					// 중복선수 선택 시 오류 메시지 출력
					if (selectedMalePlayers.size() < 2) {
						System.out.println("같은 선수가 중복으로 선택되었습니다. 다시 선택하세요.");
						continue; // 중복선수 선택 시 다시 선택을 요구
					}

					// 팀2 선수 선택
					Set<Integer> selectedMalePlayers2 = new LinkedHashSet<>();
					System.out.println("팀2의 선수를 고르세요: ");
					malePlayer3 = scanner.nextInt();
					selectedMalePlayers2.add(malePlayer3);

					System.out.printf("팀2의 두 번째 선수를 고르세요: ");
					malePlayer4 = scanner.nextInt();
					selectedMalePlayers2.add(malePlayer4);

					// 중복선수 선택 시 오류 메시지 출력
					if (selectedMalePlayers2.size() < 2) {
						System.out.println("같은 선수가 중복으로 선택되었습니다. 다시 선택하세요.");
						continue; // 중복선수 선택 시 다시 선택을 요구
					}

					System.out.printf("팀1: %s, %s\n", male.get(malePlayer1 - 1), male.get(malePlayer2 - 1));
					System.out.printf("팀2: %s, %s\n", male.get(malePlayer3 - 1), male.get(malePlayer4 - 1));
					break;
				case 7:
					Set<Integer> selectedFemalePlayers = new LinkedHashSet<>();
					// 여자 선수 리스트 출력
					for (int i = 0; i < 4; i++) {
						System.out.printf("%d. %s\n", i + 1, female.get(i));
					}

					// 팀1 선수 선택
					System.out.printf("팀1의 선수를 고르세요: ");
					femalePlayer1 = scanner.nextInt();
					selectedFemalePlayers.add(femalePlayer1);

					System.out.printf("팀1의 두 번째 선수를 고르세요: ");
					femalePlayer2 = scanner.nextInt();
					selectedFemalePlayers.add(femalePlayer2);

					// 중복선수 선택 시 오류 메시지 출력
					if (selectedFemalePlayers.size() < 2) {
						System.out.println("같은 선수가 중복으로 선택되었습니다. 다시 선택하세요.");
						continue; // 중복선수 선택 시 다시 선택을 요구
					}

					// 팀2 선수 선택
					Set<Integer> selectedFemalePlayers2 = new LinkedHashSet<>();
					System.out.println("팀2의 선수를 고르세요: ");
					femalePlayer3 = scanner.nextInt();
					selectedFemalePlayers2.add(femalePlayer3);

					System.out.printf("팀2의 두 번째 선수를 고르세요: ");
					femalePlayer4 = scanner.nextInt();
					selectedFemalePlayers2.add(femalePlayer4);

					// 중복선수 선택 시 오류 메시지 출력
					if (selectedFemalePlayers2.size() < 2) {
						System.out.println("같은 선수가 중복으로 선택되었습니다. 다시 선택하세요.");
						continue; // 중복선수 선택 시 다시 선택을 요구
					}

					System.out.printf("팀1: %s, %s\n", female.get(femalePlayer1 - 1), female.get(femalePlayer2 - 1));
					System.out.printf("팀2: %s, %s\n", female.get(femalePlayer3 - 1), female.get(femalePlayer4 - 1));
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 시도하세요.");
					continue; // 잘못된 입력 시 다시 시도
				}
				break; // while문 종료
			}
		}

		// 혼합(3) 선택
		else if (game == 3) {
			while (true) {
				Set<Integer> selectedMalePlayers = new LinkedHashSet<>();
				Set<Integer> selectedFemalePlayers = new LinkedHashSet<>();

				// 남자 선수 리스트 출력
				for (int i = 0; i < 4; i++) {
					System.out.printf("%d. %s\n", i + 1, male.get(i));
				}
				System.out.printf("팀1의 남자선수를 고르세요: ");
				malePlayer1 = scanner.nextInt();
				selectedMalePlayers.add(malePlayer1);

				System.out.println("팀2의 남자선수를 고르세요: ");
				malePlayer2 = scanner.nextInt();
				selectedMalePlayers.add(malePlayer2);

				// 중복선수 선택 시 오류 메시지 출력
				if (selectedMalePlayers.size() < 2) {
					System.out.println("같은 선수가 중복으로 선택되었습니다. 다시 선택하세요.");
					continue; // 중복선수 선택 시 다시 선택을 요구
				}

				// 여자 선수 리스트 출력
				for (int i = 0; i < 4; i++) {
					System.out.printf("%d. %s\n", i + 1, female.get(i));
				}

				System.out.printf("팀1의 여자선수를 고르세요: ");
				femalePlayer1 = scanner.nextInt();
				selectedFemalePlayers.add(femalePlayer1);

				System.out.println("팀2의 여자선수를 고르세요: ");
				femalePlayer2 = scanner.nextInt();
				selectedFemalePlayers.add(femalePlayer2);

				// 중복선수 선택 시 오류 메시지 출력
				if (selectedFemalePlayers.size() < 2) {
					System.out.println("같은 선수가 중복으로 선택되었습니다. 다시 선택하세요.");
					continue; // 중복선수 선택 시 다시 선택을 요구
				}

				System.out.printf("팀1: %s, %s\n", male.get(malePlayer1 - 1), female.get(femalePlayer1 - 1));
				System.out.printf("팀2: %s, %s\n", male.get(malePlayer2 - 1), female.get(femalePlayer2 - 1));
				break;
			}
		} else {
			System.out.println("잘못된 입력입니다.");
		}

		// 중복선수 없으면 게임 시작
		playGame();



	} // main

	private static void playGame() {
		Random rnd = new Random();
		int team1_score = 0;
		int team2_score = 0;

		while (team1_score < 60 && team2_score < 60) {

			int pointWinner = rnd.nextInt(2) + 1;

			if (pointWinner == 1) {
				team1_score += 15;
			} else {
				team2_score += 15;
			}

			dispScoreBoard(team1_score, team2_score);

			if (team1_score >= 60) {
				System.out.println("팀1 승리!");
				break;
			} else if (team2_score >= 60) {
				System.out.println("팀2 승리!");
				break;
			}
		}
	}

	private static void dispScoreBoard(int team1_score, int team2_score) {
		System.out.println("현재 점수:");
		System.out.println("팀1: " + team1_score + " | 팀2: " + team2_score);
	}



} // class
