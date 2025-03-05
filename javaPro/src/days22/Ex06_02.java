package days22;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex06_02 {

	public static void main(String[] args) {
		
		//내부적으로 연결되어있기에 성능이 뛰어나다
		LinkedList list = new LinkedList();
		
		list.add("양재원");
		list.add("서주원");
		list.add("안우혁");
		list.add("이정인");
		
		// [양재원, 서주원, 안우혁, 이정인]
		System.out.println(list);
		
		list.addFirst("김현수");
		list.addLast("박지웅");
		
		System.out.println(list);
		
		// 양재원, 서주원 사이에 홍길동 삽입
		int index = list.indexOf("서주원");
		list.add(index, "홍길동");
		System.out.println(list);
		
		// 안우혁 삭제
		index = list.indexOf("안우혁");
		list.remove(index);
		System.out.println(list);
		
		System.out.println("-".repeat(50));
		
		// list.iterator
		
		//내림차순으로 반복자
		Iterator ir = list.descendingIterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		System.out.println("-".repeat(50));
		
		// 첫번째로 일치하는 객체를 제거
		list.removeFirstOccurrence("홍길동"); 
		
		System.out.println(list);

	}// main

}// class
