package days07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex06 {
	
	public static void main(String[] args) {
		
		
		// 1~100 임의의 정수를 중복되지 않게 배열에 채워넣기
		/*
		int [] m = new int[10];
		int index = 0, n; 
		m[index++] = (int) (Math.random() * 100) + 1; 
		
		while (index < m.length) {
			n = (int) (Math.random() * 100) + 1;
			
			int flag = 0; 
			for (int i = 0; i < index; i++) {
				if (m[i] == n) {
					System.out.println("*");
					flag = 1;
					break;
				} // if
			} // for
			if (flag == 0) { 
				m[index++] = n;
			} // if
		}

		System.out.println(Arrays.toString(m)); // 배열값 나타내는 코드
		 */
		
		int [] m = new Random().ints(1,100).distinct().limit(10).toArray(); // 위 주석과 같은 코딩
		System.out.println(Arrays.toString(m));
		
		System.out.print("정수 입력:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 배열에 저장되어 있는 값중에서 입력받은 n값에 근사치한 값을 구해서 출력 (for문 한번에 찾을 수 있게끔 찾기)
		
		int [] m2 = new int[m.length];
		for (int i = 0; i < m.length; i++) {
			int diff = m[i]-n;
			Math.abs(diff);
//			m2[i] = diff<0?-diff:diff;
			
		}
		
		System.out.println(Arrays.toString(m2));
		
		int minDiff = IntStream.of(m2).min().getAsInt();
		System.out.println(minDiff);
		
		for (int i = 0; i < m2.length; i++) {
			if (m2[i] == minDiff) {
				System.out.printf("%d 위치값: %d \n", i, m[i]);
			} // if
			
		}
		
	} // main

}
