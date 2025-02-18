package days12;

import java.util.Arrays;

import days08.Ex07;

public class Ex03 {

	public static void main(String[] args) {

		// 배열값 섞기 작업(카드,화투 섞기)
		int [] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i] = i+1;
		}
		System.out.println(Arrays.toString(m));

		shuffle(m); // 배열 무작위로 섞기

		System.out.println(Arrays.toString(m));

	} // main


	private static void shuffle(int[] m) {
		// TODO Auto-generated method stub

		int temp = 0;

		for (int i = 0; i < 4; i++) {
			int n = Ex07.getRandomInteger(0, 9);
			int l = Ex07.getRandomInteger(0, 9);
			if(n==l) i--;
			else {
				temp=m[n];
				m[n]=m[l];
				m[l]=temp;
			}

		} // for
	}

} // class
