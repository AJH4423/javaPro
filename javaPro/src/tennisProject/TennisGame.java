package tennisProject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Player 클래스 정의
class Player {
	private String name;
	private String gender;

	public Player(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}
}

// Team 클래스 정의
class Team {
	private ArrayList<Player> players;

	public Team() {
		this.players = new ArrayList<>();
	}

	public void addPlayer(Player player) {
		players.add(player);
	}

	public String getPlayerName(int index) {
		return players.get(index).getName();
	}

	public int size() {
		return players.size();
	}
}

// Game 클래스 정의
class Game {
	private Team team1; // 게임에서 선택하는 선수를 담을 팀1
	private Team team2; // 게임에서 선택하는 선수를 담을 팀2
	private int team1PointScore; // 팀1의 포인트 점수
	private int team2PointScore; // 팀2의 포인트 점수
	private int team1GameScore; // 팀1의 게임 점수
	private int team2GameScore; // 팀2의 게임 점수
	private int team1SetScore; // 팀1의 세트 점수
	private int team2SetScore; // 팀2의 세트 점수

	public Game() {
		this.team1 = new Team();
		this.team2 = new Team();
		this.team1PointScore = 0;
		this.team2PointScore = 0;
		this.team1GameScore = 0;
		this.team2GameScore = 0;
		this.team1SetScore = 0;
		this.team2SetScore = 0;
	}

	public void addPlayerToTeam(Team team, Player player) {
		team.addPlayer(player);
	}

	// 게임을 실행하는 메서드
	public void playGame() {
		Random rnd = new Random();

		// 세트 점수를 3점 먼저 얻은 팀이 최종 승리
		while (team1SetScore < 3 && team2SetScore < 3) {
			// 게임 점수를 얻을 때까지 반복
			while (team1GameScore < 6 && team2GameScore < 6) {
				// 포인트 점수
				while (team1PointScore < 4 && team2PointScore < 4) { // 포인트 듀스는 아직 구현 안함
					int pointWinner = rnd.nextInt(2) + 1;  // 1 또는 2가 랜덤으로 나옴

					if (pointWinner == 1) {
						team1PointScore++;  // 팀1이 포인트 획득
					} else {
						team2PointScore++;  // 팀2가 포인트 획득
					}

					displayScoreBoard();
				} // while - PointScore

				// 게임 점수 처리
				if (team1PointScore == 4) {
					team1GameScore++;  // 팀1이 게임 점수 획득
					System.out.println("팀1 게임 승리! 게임 점수: " + team1GameScore + " - " + team2GameScore);
				} else if (team2PointScore == 4) {
					team2GameScore++;  // 팀2가 게임 점수 획득
					System.out.println("팀2 게임 승리! 게임 점수: " + team1GameScore + " - " + team2GameScore);
				}

				// 포인트 점수 초기화
				team1PointScore = 0;
				team2PointScore = 0;
			} // while - GameScore
			// 듀스 처리
			if (team1GameScore == 5 && team2GameScore == 5) {
				System.out.println("듀스 상태입니다.");
			} // -> GameScore while문 밖에 있음. GameScore는 6에서 나오기에 5:5 과정에서는 이 코드를 실행하지 않음

			// 듀스 상태에서 어드밴티지 처리 -> GameScore while문 밖에 있기때문에 GameScore가 6인 경우에만 결과를 띄움, 7은 띄우지 않음
			// 							 GameScore에 대한 while문 조건식을 바꿔서 진행해야할듯
			if (team1GameScore == 6 && team2GameScore == 5) {
				System.out.println("팀1이 어드밴티지!");
			} else if (team2GameScore == 6 && team1GameScore == 5) {
				System.out.println("팀2가 어드밴티지!");
			} else if(team1GameScore == 7 && team2GameScore == 5) {
				team1SetScore++;  // 팀1이 세트 점수 1점 획득
				System.out.println("팀1이 세트 승리! 세트 점수: " + team1SetScore + " - " + team2SetScore);
			} else if(team2GameScore == 7 && team1GameScore == 5) {
				team2SetScore++;  // 팀2이 세트 점수 1점 획득
				System.out.println("팀2이 세트 승리! 세트 점수: " + team1SetScore + " - " + team2SetScore);
			} 

			// 게임 점수 처리 (각 팀은 게임 점수 6점 먼저 달성해야 함)
			if (team1GameScore == 6 && team2GameScore == 6) {
				// 타이브레이크 시작
				System.out.println("게임 점수가 6-6이므로 타이브레이크를 시작합니다.");
				playTieBreak();
				return; // 타이브레이크 후 게임 종료
			} else if (team1GameScore == 6) {
				team1SetScore++;  // 팀1이 세트 점수 1점 획득
				System.out.println("팀1이 세트 승리! 세트 점수: " + team1SetScore + " - " + team2SetScore);
			} else if (team2GameScore == 6) {
				team2SetScore++;  // 팀2가 세트 점수 1점 획득
				System.out.println("팀2가 세트 승리! 세트 점수: " + team1SetScore + " - " + team2SetScore);
			}

			// 게임 점수 초기화
			team1GameScore = 0;
			team2GameScore = 0;
		} // while - SetScore

		// 최종 승리팀 출력
		if (team1SetScore == 3) {
			System.out.println("팀1이 최종 승리!");
		} else {
			System.out.println("팀2가 최종 승리!");
		}
	} // playGame()

	private void playTieBreak() {
		Random rnd = new Random();
		int team1TieBreakScore = 0;
		int team2TieBreakScore = 0;

		// 타이브레이크는 7점을 먼저 얻고 2점 차이로 이겨야 한다. -> 7점을 얻으면 종료 1점차이로 이겨야함, 6:6에서 먼저 이기는팀이 세트점수 따냄
		//												  조건문 수정해야함
		while (team1TieBreakScore < 7 && team2TieBreakScore < 7) {
			int pointWinner = rnd.nextInt(2) + 1;  // 1 또는 2가 랜덤으로 나옴

			if (pointWinner == 1) {
				team1TieBreakScore++;  // 팀1이 타이브레이크 점수 획득
			} else {
				team2TieBreakScore++;  // 팀2가 타이브레이크 점수 획득
			}

			displayTieBreakScore(team1TieBreakScore, team2TieBreakScore);
		}

		// 타이브레이크 승자 결정
		if (team1TieBreakScore >= 7 && (team1TieBreakScore - team2TieBreakScore) >= 2) {
			team1SetScore++;  // 팀1이 세트 승리
			System.out.println("팀1이 타이브레이크 승리! 세트 점수: " + team1SetScore + " - " + team2SetScore);
		} else {
			team2SetScore++;  // 팀2가 세트 승리
			System.out.println("팀2가 타이브레이크 승리! 세트 점수: " + team1SetScore + " - " + team2SetScore);
		}
	}

	private void displayScoreBoard() {
		System.out.println("현재 포인트 점수:");
		System.out.println("팀1: " + team1PointScore + " | 팀2: " + team2PointScore);
	}

	private void displayTieBreakScore(int team1Score, int team2Score) {
		System.out.println("타이브레이크 점수:");
		System.out.println("팀1: " + team1Score + " | 팀2: " + team2Score);
	}

	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
}

// Main 클래스 정의
public class TennisGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 선수 리스트 준비
		ArrayList<Player> malePlayers = new ArrayList<>();
		ArrayList<Player> femalePlayers = new ArrayList<>();

		// 남자 선수 추가
		malePlayers.add(new Player("양재원", "남"));
		malePlayers.add(new Player("안준호", "남"));
		malePlayers.add(new Player("이진욱", "남"));
		malePlayers.add(new Player("이창익", "남"));

		// 여자 선수 추가
		femalePlayers.add(new Player("아이유", "여"));
		femalePlayers.add(new Player("수지", "여"));
		femalePlayers.add(new Player("카리나", "여"));
		femalePlayers.add(new Player("윈터", "여"));

		while (true) {
			// 게임 선택
			System.out.print("단식(1)/ 복식(2)/ 혼합(3) 선택 : ");
			int gameChoice = scanner.nextInt();

			// 게임 진행
			Game game = new Game();

			if (gameChoice == 1) { // 단식
				handleSingleGame(scanner, malePlayers, femalePlayers, game);
			} else if (gameChoice == 2) { // 복식
				handleDoublesGame(scanner, malePlayers, femalePlayers, game);
			} else if (gameChoice == 3) { // 혼합
				handleMixedGame(scanner, malePlayers, femalePlayers, game);
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
				continue;
			}

			// 게임 실행
			game.playGame();
		} // while
	} // main

	// 단식 게임 처리
	private static void handleSingleGame(Scanner scanner, ArrayList<Player> malePlayers, ArrayList<Player> femalePlayers, Game game) {
		while(true) {
			System.out.print("남자 단식(4) / 여자 단식(5) 선택 : ");
			int genderChoice = scanner.nextInt();

			if (genderChoice == 4) { // 남자 단식
				selectPlayers(scanner, malePlayers, game);
				break;
			} else if (genderChoice == 5) { // 여자 단식
				selectPlayers(scanner, femalePlayers, game);
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		}
	}

	// 복식 게임 처리
	private static void handleDoublesGame(Scanner scanner, ArrayList<Player> malePlayers, ArrayList<Player> femalePlayers, Game game) {
		while (true) {
			System.out.print("남자 복식(6) / 여자 복식(7) 선택 : ");
			int genderChoice = scanner.nextInt();

			if (genderChoice == 6) { // 남자 복식
				selectDoublesPlayers(scanner, malePlayers, game);
				break;
			} else if (genderChoice == 7) { // 여자 복식
				selectDoublesPlayers(scanner, femalePlayers, game);
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		}
	}

	// 혼합 게임 처리
	private static void handleMixedGame(Scanner scanner, ArrayList<Player> malePlayers, ArrayList<Player> femalePlayers, Game game) {
		System.out.print("혼합 게임을 선택하셨습니다.\n");

		selectMixedPlayers(scanner, malePlayers, femalePlayers, game);
	}

	// 단식/복식 선수를 선택하는 메서드
	private static void selectPlayers(Scanner scanner, ArrayList<Player> players, Game game) {
		displayPlayers(players);

		System.out.print("팀1의 선수를 고르세요: ");
		int player1Index = scanner.nextInt() - 1;
		Player player1 = players.get(player1Index);

		System.out.print("팀2의 선수를 고르세요: ");
		int player2Index = scanner.nextInt() - 1;
		Player player2 = players.get(player2Index);

		// 선수를 팀에 추가
		game.addPlayerToTeam(game.getTeam1(), player1);
		game.addPlayerToTeam(game.getTeam2(), player2);

		System.out.printf("팀1: %s, 팀2: %s 게임 시작\n", player1.getName(), player2.getName());
	}

	// 복식 선수를 선택하는 메서드
	private static void selectDoublesPlayers(Scanner scanner, ArrayList<Player> players, Game game) {
		displayPlayers(players);

		System.out.print("팀1의 선수를 고르세요 (첫 번째 선수): ");
		int player1Index = scanner.nextInt() - 1;
		Player player1 = players.get(player1Index);

		System.out.print("팀1의 선수를 고르세요 (두 번째 선수): ");
		int player2Index = scanner.nextInt() - 1;
		Player player2 = players.get(player2Index);

		System.out.print("팀2의 선수를 고르세요 (첫 번째 선수): ");
		int player3Index = scanner.nextInt() - 1;
		Player player3 = players.get(player3Index);

		System.out.print("팀2의 선수를 고르세요 (두 번째 선수): ");
		int player4Index = scanner.nextInt() - 1;
		Player player4 = players.get(player4Index);

		// 선수를 팀에 추가
		game.addPlayerToTeam(game.getTeam1(), player1);
		game.addPlayerToTeam(game.getTeam1(), player2);
		game.addPlayerToTeam(game.getTeam2(), player3);
		game.addPlayerToTeam(game.getTeam2(), player4);

		System.out.printf("팀1: %s, %s, 팀2: %s, %s 게임 시작\n", player1.getName(), player2.getName(), player3.getName(), player4.getName());
	}

	// 혼합 선수를 선택하는 메서드
	private static void selectMixedPlayers(Scanner scanner, ArrayList<Player> malePlayers, ArrayList<Player> femalePlayers, Game game) {
		displayPlayers(malePlayers);
		displayPlayers(femalePlayers);

		System.out.print("팀1의 남자 선수를 고르세요: ");
		int player1Index = scanner.nextInt() - 1;
		Player malePlayer1 = malePlayers.get(player1Index);

		System.out.print("팀1의 여자 선수를 고르세요: ");
		int player2Index = scanner.nextInt() - 1;
		Player femalePlayer1 = femalePlayers.get(player2Index);

		System.out.print("팀2의 남자 선수를 고르세요: ");
		int player3Index = scanner.nextInt() - 1;
		Player malePlayer2 = malePlayers.get(player3Index);

		System.out.print("팀2의 여자 선수를 고르세요: ");
		int player4Index = scanner.nextInt() - 1;
		Player femalePlayer2 = femalePlayers.get(player4Index);

		// 선수를 팀에 추가
		game.addPlayerToTeam(game.getTeam1(), malePlayer1);
		game.addPlayerToTeam(game.getTeam1(), femalePlayer1);
		game.addPlayerToTeam(game.getTeam2(), malePlayer2);
		game.addPlayerToTeam(game.getTeam2(), femalePlayer2);

		System.out.printf("팀1: %s, %s, 팀2: %s, %s 게임 시작\n", malePlayer1.getName(), femalePlayer1.getName(), malePlayer2.getName(), femalePlayer2.getName());
	}

	// 선수 목록 출력 메서드
	private static void displayPlayers(ArrayList<Player> players) {
		System.out.println("선수 목록:");
		for (int i = 0; i < players.size(); i++) {
			System.out.printf("%d. %s\n", i + 1, players.get(i).getName());
		}
	}
}