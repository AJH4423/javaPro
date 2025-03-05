package days22;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex07_06 {
	
	public static void main(String[] args) {
		
		// [PriorityQueue]
		/*
		 * 우선순위 :  FIFO 구조아님
		 * 				ㄴ 저장된 순서에 상관없이 우선순위가 높은 것부터 꺼내는 구조
		 * 				ㄴ null은 저장할 수 없다.(null집어넣을시엔 NullPointerException 발생)
		 * 
		 * */
		
		Queue pq = new PriorityQueue();
		pq.offer(3);
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		
		// System.out.println(pq);
		
		// 숫자는 우선순위가 높은것 - 작은 숫자
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	} // main

} // class
