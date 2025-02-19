package days13;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {

		// 로또 출력 예제
		/*
		 *      > 게임 횟수 입력 ? 3
		 *    [1 게임]      [42][36][21][38][6][26]
			  [2 게임]      [11][7][19][2][25][15]
			  [3 게임]      [36][33][44][42][18][10]
		 */

		int gameNumber;
		Scanner sc = new Scanner(System.in);

		System.out.printf("게임 횟수 입력: ");
		gameNumber = sc.nextInt();
		int [][] lotto = new int[gameNumber][6];

		fillLottos(lotto,gameNumber);
		dispLottos(lotto,gameNumber);

		/* 내가 한 코딩
		int [][] lotto = new int[3][6];
		int gameCnt;
		Scanner sc = new Scanner(System.in);

		System.out.printf("게임 횟수 입력: ");
		gameCnt = sc.nextInt();

		for (int i = 0; i < gameCnt; i++) {
			System.out.printf("[%d게임]  ",i+1);
			for (int j = 0; j < lotto[i].length; j++) {
				lotto[i][j]= Ex07.getRandomInteger(1, 45);
				System.out.printf("[%d]",lotto[i][j]);
			} // for j
			System.out.println();
		} // for i
		 */


	} // main

	private static void dispLottos(int[][] lotto, int gameNumber) {
		for (int i = 0; i < lotto.length; i++) {
			dispLotto(lotto[i],i);
		} // for i
	}

	private static void fillLottos(int[][] lotto, int gameNumber) {		
		for (int i = 0; i < lotto.length; i++) {
			fillLotto(lotto[i]);
		} // for i

	}

	// days8 - Ex07
	private static void fillLotto(int[] lotto) {
		int index = 0, n;
		lotto[index++] = getRandomInteger(1,45);// 두 정수사이 랜덤값 찾아주는 함수

		while ( index <= 5 ) {
			n = getRandomInteger(1,45); 

			if( !isDuplicateLotto(lotto,n,index) ) 
				lotto[index++] = n;
		} // while

	}

	private static void dispLotto(int[] lotto, int no) {
		System.out.printf("%d[게임]: ",no+1);
		for (int i = 0; i < lotto.length; i++) {	
			System.out.printf("[%d]",lotto[i]);
		}
		System.out.println();
	}

	// 로또번호 값 중복체크해주는 함수
	public static boolean isDuplicateLotto(int[] lotto, int n, int index) {

		boolean flag = false;
		for (int i = 0; i < index; i++) {
			if( lotto[i] == n ) {
				System.out.println("*");
				flag = true;
				break;
			}
		} // for i   
		return flag;
	}

	// 범위안에 수들 중 랜덤한 값으로 뽑아내는 함수
	public static int getRandomInteger(int min, int max) {
		return (int)( Math.random()*(max-min+1))+min; // 범위안에 수들 중 랜덤한 값 뽑아내는 메소드
	}

}
