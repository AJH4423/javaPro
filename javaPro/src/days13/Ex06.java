package days13;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		// 이진검색
		//   ㄴ 필수조건: 오름차순/내림차순 정렬

		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
				86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
				169, 172, 181, 184, 185, 191, 198 }; //배열크기 = 50, 오름차순 정렬되어있음
		//System.out.println(m.length); 50
		//필수조건: 오름차순 정렬
		// bot                                           top      
		// 반복~                 bot > top X
		//                      mid= (bot+top)/2
		// 1) m[mid] == n             return mid;
		// 2) m[mid] > n       새로운 top = mid - 1
		// 3) m[mid] < n       새로운 bot = mid + 1

		Scanner scanner = new Scanner(System.in);
		System.out.print("> 배열에서 찾을 정수 입력 ? ");
		int n = scanner.nextInt(); // 12
		int index = binarySearch(m,n);

		if (index != -1) {
			System.out.printf("찾는 정수 %d는 %d 위치에 있다", n, index);
		}else {
			System.out.println("찾는 정수는 없다.");
		}


	} // main

	private static int binarySearch(int[] m, int n) {

		int bot=0;
		int top=m.length-1;
		int mid;
		int count =0;

		while (bot<=top) {
			count++;
			mid = (bot+top)/2;
			if (m[mid]==n) {
				return mid;
			} // if
			else if (m[mid] > n) {
				top = mid-1;				
			} 
			else if (m[mid] < n) {
				bot = mid + 1;				
			} 				
		}
		System.out.println(count);
		return -1;
	}

} // class
