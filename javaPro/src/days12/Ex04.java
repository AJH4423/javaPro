package days12;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {

		/*
		 * 정렬[sort]
		 * - 특정 기준에 맞게 데이터를 열거하는 알고리즘
		 * - 오름차순 정렬([Asc]ending sort)
		 * 예) 작은 값 -----> 큰값 순으로 정렬
		 * 
		 * - 내림차순 정렬([Desc]ending sort)
		 * 	  큰 값 -----> 작은값 순으로 정렬
		 * 
		 * -> 버블, 선택, 삽입, 퀵, 병합 정렬 등등
		 * */

		// ASC {a,b} 자리바꿈
		int [] m = {3,5,2,4,1};

		//		bubbleSort(m);
		//		selectionSort(m);
		//		selectionSort2(m);
		//		insertionSort(m);


		System.out.println(Arrays.toString(m));

	} // main

	private static void insertionSort(int[] m) {

		/*
		 * 0 1 2 3 4 index
		 * 3 5 2 4 1 value 
		 * 
		 * 삽입정렬: 두 번째 위치부터 시작해서 왼쪽의 값들과 비교해서
		 *        삽입될 위치를 지정한 후, 뒤로 값을 밀고 삽입될 위치에 값을 
		 *        삽입해서 정렬하는 방법
		 *        ㄴ 작은값을 찾는 과정이 필요없다
		 * */

		int key; // 삽입할 값
		for (int i = 1, j; i < m.length; i++) {
			System.out.printf("%d - ", i);
			key = m[i];
			for (j = i-1; j >= 0 ; j--) {
				if(m[j] <= key) break;
				m[j+1] = m[j];
			} // for j
			m[++j] = key;
			System.out.println(Arrays.toString(m));
		} // for i

	}

	private static void selectionSort2(int[] m) {
		// TODO Auto-generated method stub

		/*
		 * 0 1 2 3 4 index
		 * 3 5 2 4 1 value 
		 * 
		 * min=m[0]=3
		 * minIndex=0, 가장작은 값의 인덱스 저장할것: m[minIndex] 
		 * 비교하면서 가장작은값의 인덱스를 저장해서 바꾸려는 곳과 한번만 바꾼다
		 * 
		 * */

		for (int i = 0, minIndex; i < m.length-1; i++) {
			minIndex=i;
			for (int j = i+1; j < m.length; j++) {
				if (m[minIndex]>m[j]) {
					minIndex=j;
				} // if

			}
			if (i != minIndex) {
				int temp = m[i];
				m[i] = m[minIndex];
				m[minIndex] = temp;
			}
		}

	}

	private static void selectionSort(int[] m) {

		/*
		 * 0 1 2 3 4 index
		 * 3 5 2 4 1 value 
		 * 
		 * [0]
		 * 0-1 0-2 0-3 0-4 1회전
		 * 1-2 1-3 1-4 2회전
		 * 2-3 2-4 3회전
		 * 3-4 4회전
		 * 
		 * */

		for (int i = 0; i < m.length; i++) {
			for (int j = i+1; j <=m.length-1; j++) {
				System.out.printf("(%d,%d) ", i,  j );
				if (m[i]>m[j]) {
					System.out.print("***");
					int temp = m[i];
					m[i]=m[j];
					m[j]=temp;
				} // if				
			}
			System.out.println();
		}

	}

	private static void bubbleSort(int [] m) {

		/*
		 * 0 1 2 3 4 index
		 * 3 5 2 4 1 value  
		 * 
		 * 
		 * */
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.printf("(%d,%d)",j,j+1);
				if (m[j]>m[j+1]) {
					System.out.println("***");
					int temp = m[j];
					m[j]=m[j+1];
					m[j+1]=temp;
				} // if
				System.out.println(Arrays.toString(m));
			}
			System.out.println();
		}

	}

} // class
