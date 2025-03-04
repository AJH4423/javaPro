package days21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex10_02 {
	
	public static void main(String[] args) {
		

		ArrayList list = new ArrayList();

		list.add("권태정");
		list.add("김도훈");
		list.add("김민선");
		list.add("서재웅");
		list.add("김승효");
		list.add("김도훈"); 
		
		// [문제1] 모든 요소를 출력
		// get(index)
		/*
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		
		// [문제2] 모든 요소를 출력
		// Iterator(반복자) 객체
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
	} // main

} // class
