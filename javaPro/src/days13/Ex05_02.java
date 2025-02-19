package days13;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05_02 {

	public static void main(String[] args) {

		// 검색: 항목의 집합 중에 특정 항목을 찾아내는것
		// 1. 순차 검색( Sequence Search )
		// 2. 이진 검색( Binary Search)

		// 문제) 찾고자하는 숫자9에 대한 index위치를 모두 출력
		// 검색 결과물을 가져와서 수정가능한 코드로 만들것

		int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
				, 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };

		Scanner sc = new Scanner(System.in);
		System.out.print("배열에서 찾을 정수 입력: ");  
		int n = sc.nextInt();

	      // 만약에 찾는 값이 배열 속에 없다면   -1 반환
	      // int index = sequenceSearch(m, n);
	      int [] indexArr = sequenceSearch(m, n);
	      
	      System.out.println( Arrays.toString(indexArr) );
	      
	      if (indexArr.length != 0 ) {
	         for (int i = 0; i < indexArr.length; i++) {
	            System.out.printf("찾는 정수 %d는 %d 위치에 있다.\n", n, indexArr[i]);
	         }
	      } else {  // X
	          System.out.println("찾는 정수는 없다.");
	      } // if

//	        [1]
//	      while(true) {
//	         int index = indexArr[i++];
//	         if(  index == -1 ) break;
//	         System.out.printf("찾는 정수 %d는 %d 위치에 있다.\n", n, index);
//	      } // while


	} // main

	private static int[] sequenceSearch(int[] m, int n) {
	      int [] temp = new int[m.length]; // 30   
	      Arrays.fill(temp, -1);
	      
	      int index = 0;
	      // 검색 작업 -> index = 찾은위치값
	      for (int i = 0; i < m.length; i++) {
	         if( m[i] == n ) {
	            temp[index++] = i;
	         }
	      } // for i 
	      
	      return  Arrays.copyOf(temp, index);

	}

}
