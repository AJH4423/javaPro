package days06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int lucknb;
//		int lucknb2;
//		int[] arrNb = new int[6];
//
//		System.out.println("6개 로또번호 출력");
//		for (int i = 0; i < 6; i++) {
//			lucknb = (int) (Math.random() * 45) + 1;
//			arrNb[i] = lucknb;
//			
//			if (i >= 0 && i <= 4) {
//				if (arrNb[i] == arrNb[i + 1]) {
//					lucknb2 = (int) (Math.random() * 45) + 1;
//					arrNb[i + 1] = lucknb2;
//				}
//				else {
//					arrNb[i+1] = lucknb;
//				}
//				System.out.printf("%d ", lucknb);
//			} 
//		} // for i

		// [풀이] 중복제거 후 로또 번호 6개 출력

		int[] lotto = new int[6]; // 배열선언, 중복되는 수 비교하기 위함
		int index = 0, n; // 배열의 첨자값을 나타내는 변수
		lotto[index++] = (int) (Math.random() * 45) + 1; // 첫번째 값이기 때문에 미리 값을 저장해두고 index값 증가
		// 중복값을 고려해야하기 때문에 반복 횟수를 정확히 알 수 없음 = while문 이용
		while (index <= 5) {
			n = (int) (Math.random() * 45) + 1;
			// 중복되는지 확인
			// 중복되지않을때 값을 넣고 index를 증가시키고 값이 중복되면 전자를 실행시키지 말고 다시 while문 처음으로 돌아감
			// 그 이전에 발생한 로또 번호와 n값과 모두 체크해서 중복이 되지 않으면 다음배열에 값 대입
			int flag = 0; // boolean형으로도 코딩해도 된다.
			for (int i = 0; i < index; i++) {
				if (lotto[i] == n) {
					System.out.println("*");
					flag = 1;
					break;
				} // if
			} // for
			if (flag == 0) { // boolean형으로 하게되면 !flag라고 하면 간단해짐
				lotto[index++] = n;
			} // if
		}

		System.out.println(Arrays.toString(lotto)); // 배열값 나타내는 코드

	}// main

}// class
