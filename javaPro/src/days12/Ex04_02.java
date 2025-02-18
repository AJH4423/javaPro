package days12;

import java.util.Arrays;

public class Ex04_02 {

	public static void main(String[] args) {

		/*
		 * 병합정렬(merge sort)
		 * - 이미 정렬되어져 있는 두 개의 배열을 합쳐서 하나의 배열로 만드는 정렬 방식
		 * 
		 * */

		int [] m = {1,3,6,10,14};
		int [] n = {2,4,7};
		//-> {1,2,3,4,6,7,14}: 병합된 결과

		//		int [] mn = new int[m.length + n.length];

		int [] mn = mergeSort(m,n); // 병합된 배열을 리턴해주는 메소드
	} // main

	private static int[] mergeSort(int[] m, int[] n) {
		int [] mn = new int[m.length + n.length];

		int i,j,k; // m,n,mn의 위치를 나타내는 변수
		i=j=k=0;

		//		if (m[i]>n[j]) {
		//			mn[k] = n[j];
		//		} else {
		//			mn[k] = m[i];
		//		}
		while (i<m.length && j<n.length) {
			mn[k++] = m[i] > n[j] ?n[j++] :m[i++];
		}
		if (i==m.length) { //남은배열 n
			System.arraycopy(n, j, mn, k, n.length-j);
		} else { // 남은배열 m
			System.arraycopy(m, i, mn, k, m.length-i);

		}
		System.out.println(Arrays.toString(mn));

		return mn ;
	}

} // class
