package days22;

import java.util.Deque;
import java.util.LinkedList;

public class Ex07_03 {
	
	public static void main(String[] args) {
		
		// [Deque 인터페이스]
		/*		ㄴ == Double Enabled Queue
		 * 			  양쪽으로 가능한 큐
		 * 
		 * */
		Deque q = new LinkedList();
		q.offerFirst("A");
		q.offerLast("B");
		
		System.out.println(q); // [A, B]
		
		System.out.println(q.pollFirst()); // A
		System.out.println(q.pollLast()); // B
		
		
	} // main

} // class
