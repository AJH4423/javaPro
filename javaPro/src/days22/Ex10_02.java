package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex10_02 {
	
	public static void main(String[] args) {
		
		// 로또번호
		// days14.Ex04 - 2차원배열
		// days6.Ex01 - 1차원배열
		
		HashSet lotto = new HashSet();
		
		fillLotto(lotto);			
		dispLotto(lotto);
		
		
		
	} // main

	
	private static void dispLotto(HashSet lotto) {
		/*[1] 정렬 x, 순서 x
		Iterator ir = lotto.iterator();
		while (ir.hasNext()) {
			int n = (int) ir.next();
			System.out.printf("[%2d]", n);
		}
		System.out.println();
		*/
		
		//[2] 
		/*
		Object [] arr = lotto.toArray();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		*/
		
		//[3]
		ArrayList list = new ArrayList(lotto);
		Collections.sort(list); // Collections -> Arrays와 같이 ArrayList를 더 편하게 쓸수 있게끔해군 클래스
		System.out.println(list);
		
	}
	

	private static void fillLotto(HashSet lotto) {
		
		Random rnd = new Random();
		int n = 0;
		while (lotto.size()<6) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		}
		
	}

} // class
