package days23;

import java.util.TreeSet;

public class Ex05_03 {
	
	public static void main(String[] args) {
		
		int [] score = {80, 95, 50, 85, 45, 65, 10, 100};
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < score.length; i++) {
			ts.add(score[i]);
		} // for i
		
		// [10, 45, 50, 65, 80, 85, 95, 100]
		System.out.println(ts);
		
		//범위검색
		// 50<=  <80
		// [50, 65]
		System.out.println(ts.subSet(50, 80));
		
		// 범위검색 80이상
		// [80, 85, 95, 100]
		System.out.println(ts.tailSet(80));
		
		// 범위검색 80미만
		// [10, 45, 50, 65]
		System.out.println(ts.headSet(80));
		
		// 내림차순 정렬
		System.out.println(ts.descendingSet()); 
		
		System.out.println(ts.descendingIterator());
	} // main

} // class
