package days13;

import java.util.Arrays;

public class Ex08 {
	
	public static void main(String[] args) {
		
		// 1차원 배열 m
		int [] m = {1,2,3,4,5,6,7,8};
		
		// 2차원 배열 n
		int [][] n = new int[2][4];
		
		// 1차원 배열 -> 2차원 배열 변환(이동)
		//[1][2][3][4]
		//[5][6][7][8]
		
		/*
		 * 0/ 00
		 * 1/ 01
		 * 2/ 02
		 * 3/ 03
		 * 4/ 10
		 * 5/ 11
		 * 6/ 12
		 * 7/ 13
		 * */
		
		int comLength = n[0].length;
		for (int i = 0; i < m.length; i++) {
			n[i/comLength][i%comLength]=m[i];
		} // for i
		
		for (int j = 0; j < n.length; j++) {
			System.out.println(Arrays.toString(n[j]));
		} // for j
		
	} // main

} // class
