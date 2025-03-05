package days22;

import java.util.LinkedList;
import java.util.Queue;

public class Ex07_02 {
	
	public static void main(String[] args) {
		
		/*
		 * [큐(Queue) 구조]
		 * 1. FIFO 자료구조
		 * 2. Queue 인터페이스
		 * 3. Queue 인터페이스를 구현한 클래스: LinkedList 등
		 * 4. Stack -  push()   pop()/peek()   isEmpty()  search()
		 * 	  Queue - offer()  poll()/peek()   isEmpty()     x
		 * 
		 * */
		
		Queue q = new LinkedList(); // 큐라는 FIFO구조를 이용하기위해 부모기능인 LinkedList는 사용x 
		q.offer("김예지");
		q.offer("남현수");
		q.offer("서재웅");
		System.out.println(q.offer("이정인")); // boolean offer() : true/false
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	} // main

} // class
