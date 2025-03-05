package days22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex10_03 {

	public static void main(String[] args) {

		// 로또 출력 예제
		/*
		 *      > 게임 횟수 입력 ? 3
		 *    [1 게임]      [42][36][21][38][6][26]
			  [2 게임]      [11][7][19][2][25][15]
			  [3 게임]      [36][33][44][42][18][10]
		 */
		// -> 컬렉션 클래스로 구현하기

		int gameNumber;
		Scanner sc = new Scanner(System.in);

		System.out.printf("게임 횟수 입력: ");
		gameNumber = sc.nextInt();
		
		ArrayList list = new ArrayList(gameNumber);
		
		for (int i = 0; i < gameNumber; i++) {
			HashSet lotto = new HashSet();
			fillLotto(lotto);
			list.add(lotto);
		} // for i

		for (int i = 0; i < gameNumber; i++) {
			System.out.printf("%d게임 : ", i+1);
			dispLotto((HashSet)list.get(i));
		}

	} // main
	
	private static void dispLotto(HashSet lotto) {
		/*[1] 정렬 x, 순서 x
		Iterator ir = lotto.iterator();
		while (ir.hasNext()) {
			int n = (int) ir.next();
			System.out.printf("[%2d]", n);
		}
		System.out.println();
		*/
		
		//[2] 
		/*
		Object [] arr = lotto.toArray();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		*/
		
		//[3]
		ArrayList list = new ArrayList(lotto);
		Collections.sort(list); // Collections -> Arrays와 같이 ArrayList를 더 편하게 쓸수 있게끔해군 클래스
		System.out.println(list);
		
	}
	

	private static void fillLotto(HashSet lotto) {
		
		Random rnd = new Random();
		int n = 0;
		while (lotto.size()<6) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		}
		
	}

	/*
	private static void dispLotto(HashSet lotto, int gameNumber) {
		
		for (int i = 0; i < gameNumber; i++) {
			System.out.printf("[%d게임]  ", i+1);
			ArrayList list = new ArrayList(lotto);
			System.out.println(list);
			
		} // for i		
	}

	private static void fillLotto(HashSet lotto, int gameNumber) {
		
		Random rnd = new Random();
		int n = 0;
		while (lotto.size()<6) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		}
		
	}

	private static void dispLotto(HashSet[] lotto, int gameNumber) {
	// -> 배열로 만드는것보다는 ArrayList쓰는게 좋음
		for (int i = 0; i < lotto.length; i++) {
			Iterator ir = lotto[i].iterator();
			System.out.printf("[%d게임]  ", i+1);
			while (ir.hasNext()) {
				int n = (int) ir.next();
				System.out.printf("[%2d]", n);
			}
			System.out.println();
		} // for i		
	}

	private static void fillLotto(HashSet[] lotto, int gameNumber) {

		Random rnd = new Random();

		int n = 0;
		for (int i = 0; i < lotto.length; i++) { 
			lotto[i] = new HashSet();
			while (lotto[i].size()<6) {
				n = rnd.nextInt(45)+1;
				lotto[i].add(n);
			}
		} // for i		
	}
	*/
	
} // class
