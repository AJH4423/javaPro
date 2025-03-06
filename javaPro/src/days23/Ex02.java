package days23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Stack;

public class Ex02 {
	// 빙고게임
	
	public static void main(String[] args) {
		
		int[][] bingo = new int[5][5];
		
		// hashset에 1~25숫자 집어넣음
		// HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			al.add(i);
		} // for i
		
		// 순서대로 들어있는 al에서 숫자를 랜덤으로 가져와서 bingo 배열에 넣는다
		int i = 0;
		Random rnd = new Random();
		while (!al.isEmpty()) {
			int index = rnd.nextInt(al.size()); // 0<=  <al.size()
			int n = al.remove(index); 
			bingo[i/5][i%5] = n;
			i++;  
		}
		
		// 출력
		for (i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				System.out.printf("[%02d]", bingo[i][j]);
			} // for j
			System.out.println();
		} // for i
		
		
	} // main

	/*[2]
	public static void main(String[] args) {

		int[][] bingo = new int[5][5];

		LinkedHashSet<Integer> num = new LinkedHashSet<>();
		
		while (num.size()<25) {
			Random rnd = new Random();
			int n = rnd.nextInt(25)+1;
			num.add(n);
		} //  while

		// 2. HashSet -> bingo 옮기는 작업
		// 1) 반복자로도 코드 짜도 괜찮음
		// 2) Set -> List로 변환후 .get()이용
		Object[] numArr = num.toArray();
		for (int i = 0; i < numArr.length; i++) {
			bingo[i/5][i%5] = (int) numArr[i] ;
		} // for i

		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				System.out.printf("[%02d]", bingo[i][j]);
			} // for j
			System.out.println();
		} // for i


	} // main
	*/


	/*[1]
	public static void main(String[] args) {
		int[][] bingo = new int[5][5];

//		Stack<Integer> stack = new Stack<>();

		int[] numbers = new Random().ints(1,26).distinct().limit(25).toArray();

//		for(int k : numbers) {
//			stack.push(k);
//		}

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
//				bingo[i][j] = stack.pop();
				bingo[i][j] = numbers[5+i+j];
			}
		}

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%[2d]", bingo[i][j]);
			}
			System.out.println();
		}
	}
	 */

	/*내 코드
	public static void main(String[] args) {



		int [][] bingo = new int[5][5];
		// 1~25 중복되지 않는 숫자

		// 1. 중복허용x, 순서 유지o/x 컬렉션 클래스 사용 : HashSet or LinkedhashSet
		// 1~25 정수를 채워넣기...
		int n = 0;
		Random rnd = new Random();		
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < 25; i++) {
			n = rnd.nextInt(25)+1;
			hs.add(n);
		} // for i
		System.out.println(hs);

		Iterator<Integer> ir = hs.iterator();
		// 2. HashSet -> bingo 옮기는 작업
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[0].length; j++) {				
				while (ir.hasNext()) {
					Integer integer = (Integer) ir.next();
					bingo[i][j] = integer;
				}
			} // for j	
		} // for i

	} // main
	 */

} // class
