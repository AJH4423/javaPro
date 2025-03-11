package tennisProject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Show {

	public static void main(String[] args) {

		//      int single, doubles, mix;
		int game;
		Scanner scanner = new Scanner(System.in);
		String [] male = {"양재원", "안준호", "이진욱", "이창익"};
		String [] female = {"아이유", "수지", "카리나", "윈터"};
		String name1 = null, name2 = null, name3 = null, name4= null;



		while(true) {
			System.out.print("단식(1)/ 복식(2)/ 혼합 복식(3) 선택 : ");
			game = scanner.nextInt();

			if(game == 1) {
				System.out.print("남자 단식(4) / 여자 단식(5)");
				int single = scanner.nextInt();
				if(single == 4) {
					System.out.print(Arrays.toString(male));
					name1 = scanner.next();
					name2 = scanner.next();
				}else if (single == 5) {
					System.out.println(Arrays.toString(female));
					name1 = scanner.next();
					name2 = scanner.next();
				}else System.out.println("다시입력 : 남자 단식(4) / 여자 단식(5) : ");

			}else if(game == 2) {

				System.out.print("남자 복식(6) / 여자 단식(7)");
				int doubles = scanner.nextInt();
				if(doubles == 6) {
					System.out.print(Arrays.toString(male));
					name1 = scanner.next();
					name2 = scanner.next();
					name3 = scanner.next();
					name4 = scanner.next();
				}else if (doubles == 7) {
					System.out.println(Arrays.toString(female));
					name1 = scanner.next();
					name2 = scanner.next();
					name3 = scanner.next();
					name4 = scanner.next();
				}else System.out.println("다시입력 : 남자 단식(4) / 여자 단식(5) : ");

			}else if(game == 3) {

				System.out.print("남자 복식(8) / 여자 단식(9)");
				int doubles = scanner.nextInt();
				if(doubles == 6) {
					System.out.print(Arrays.toString(male));
					name1 = scanner.next();
					name2 = scanner.next();
					name3 = scanner.next();
					name4 = scanner.next();
				}else if (doubles == 7) {
					System.out.println(Arrays.toString(female));
					name1 = scanner.next();
					name2 = scanner.next();
					name3 = scanner.next();
					name4 = scanner.next();
				}else System.out.println("다시입력 : 남자 단식(4) / 여자 단식(5) : ");
				//ArrayList


				Random rnd = new Random();
				int p = rnd.nextInt(2) + 1;
				int a = pointWinner(p);
				dispScoreBoard(a);
				//if(pointWinner(p) <= 60)
				//            break;

			}
		}


	} // main

	private static void dispScoreBoard(int a) {
		int team1_score = 0;
		int team2_score = 0;

		while(team1_score == 60 || team2_score == 60) {
			if(a == 1) {
				team1_score += 15;
				System.out.println(team1_score);

			}else if (a == 0){
				team2_score += 15;
				System.out.println(team2_score);

			}else
				break;

		}
	}

	private static int pointWinner(int p) {

		if(p == 1) return 1;//1팀이 이기면 1반환?
		else return 0;


	}


} // class
