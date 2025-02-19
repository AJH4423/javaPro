package days13;

import java.util.Arrays;

public class Ex08_02 {

	public static void main(String[] args) {

		int [][] m = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};

		// 1차원 배열 n
		int [] n = new int[m.length * m[0].length];
		/*
		 * 0/ 00
		 * 1/ 01
		 * 2/ 02
		 * 3/ 10
		 * 4/ 11
		 * 5/ 12
		 * 6/ 20
		 * 7/ 21
		 * 8/ 22
		 * 9/ 30
		 * 10/ 31
		 * 11/ 32
		 * */
		int colLength=m[0].length;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[i*colLength+j]=m[i][j];
			} // for j
		} // for i
		System.out.println(Arrays.toString(n));
	} // main

}
