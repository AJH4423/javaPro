package days12;

import java.util.Arrays;
import java.util.Random;

import days08.Ex07;

public class Ex05 {

	public static void main(String[] args) {

		//배열 100짜리 선언, 임의의정수 0~9 채워넣고 0~9의 숫자가 각각 몇개씩 있는지 확인하는 작업
		int [] arr = new int [100];

		Random rnd = new Random();
		for (int i = 0; i < arr.length; i++) {
			//arr[i] = Ex07.getRandomInteger(0, 9);
			arr[i] = rnd.nextInt(10);
		}
		System.out.println(Arrays.toString(arr));

		/* 1000번 도는 로직
		int [] numberCnt = new int[10];
		System.out.println(Arrays.toString(numberCnt));

		for (int i = 0; i < numberCnt.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j]==i) {
					numberCnt[i]++;
				} // if
			}
			System.out.printf("%d: %d개\n",i,numberCnt[i]);
		}
        */
		
		//100만 도는 로직
		int [] numberCnt = new int[10];
		for (int i = 0; i < arr.length; i++) {
			numberCnt[arr[i]]++;
		}
		System.out.println(Arrays.toString(numberCnt));

	} // main

} // class
