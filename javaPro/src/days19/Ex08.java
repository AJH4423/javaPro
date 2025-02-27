package days19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Ex08 {

	public static void main(String[] args) {

		//java.util 패키지 -> 자주 사용되는 유용한 유틸리티(클래스)
		// [1] java.util.Arrays 클래스
		int [] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));

		//		Arrays.fill(m, -1);
		//		System.out.println(Arrays.toString(m));

		// 오름차순 정렬
		Arrays.sort(m); 
		System.out.println(Arrays.toString(m));

		// 내림차순 정렬
		//int [] -> Integer[] 변환 
		/*
		Integer [] n = new Integer[m.length];
		for (int i = 0; i < m.length; i++) {
			n[i] = m[i];
		} // for i
		 */

		//int [] -> Integer[] 변환 
		IntStream is = Arrays.stream(m);
		Integer [] n = is.boxed().toArray(Integer[]::new);

		// Arrays.sort(n, Collections.reverseOrder());
		/*
		Arrays.sort(n, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		*/
		
		Arrays.sort(n, (o1,o2) -> o2.compareTo(o1));
		System.out.println(Arrays.toString(n));
		
		// Arrays.copyOf(m, m.length+3);
		
		// Arrays.binarySearch(m, 100);
		
		// 두 배열이 같은지 여부 체크
		// Arrays.compare(int [] m, int [] n);
		
		// int[] -> List변환
		// List<int[]>,  Arrays.asList()

	} // main

} // class
