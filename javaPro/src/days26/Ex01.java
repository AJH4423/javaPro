package days26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		/*
		 * 몇개의 막대기를 받을건지에 대한 배열 또는 arraylist를 선언한뒤 
		 * 막대기의 길이에 대해 입력. 배열 및 arraylist를 한바퀴 돌아서 가장 작은 수를 찾고
		 * 이 수를 이용해서 한바퀴 돌면서 빼준다 뺴주면서 숫자가 0이 아닌 수들을 카운트해줌
		 * 마지막까지 카운트한뒤에 카운트한 값을 출력
		 * 카운트 값이 1이 될때까지 반복
		 * 
		 * 선언 : 배열 or Arraylist, 막대기의 길이변수, 0이아닌 값을 셀 변수, 가장 작은수 변수
		 * 
		 * */
		
		int [] arrStick;
		int stickCount; 
		int zeroCount;
		int min;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("막대기의 수를 입력하세요: ");
		stickCount = scanner.nextInt();
		
		arrStick = new int[stickCount];
		
		for (int i = 0; i < arrStick.length; i++) {
			Random rnd = new Random(); 
			arrStick[i] = rnd.nextInt(1000);
			System.out.printf("%d ", arrStick[i]);
		} // for i
		System.out.println();
		
		// 최소의 막대길이 
		min = arrStick[0];
		
		for (int i = 0; i < arrStick.length; i++) {
			min = Math.min(min, arrStick[i]);
		} // for i
		
		System.out.println("출력값");
		System.out.println(stickCount);
		
		// cut operation 실행
		while (true) {	
		zeroCount = 0;
		for (int i = 0; i < arrStick.length; i++) {
			
			arrStick[i] = arrStick[i] - min;
			if (arrStick[i]==0) {
				continue;
			} else {							
				zeroCount++;				
			}
		} // for i
		}// while
		//System.out.println(zeroCount);
		//System.out.println(Arrays.toString(arrStick));
		
	} // main

} // class
