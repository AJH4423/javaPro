package days22;

import java.util.Stack;

public class Ex07 {
	
	public static void main(String[] args) {
		
		/*
		 * LinkedList
		 * ArrayList - 읽기가 빠르다
		 * 1. 순차적으로 추가/삭제 : ArrayList가 빠르다
		 * 2. 중간 	 추가/삭제 : LinkedList가 빠르다
		 * Vector - 멀티스레드에 안전하다
		 * 
		 * */ 
		
		// [스택(Stack)과 큐(Queue)]
		/*
		 * [Stack]
		 * 1. java.util 패키지
		 * 2. LIFO 자료구조 (선입선출)
		 * 3. push() 요소 추가
		 * 	  pop() 요소 얻어오기, 제거 o
		 * 	  peek() 요소 얻어오기, 제거	x
		 * 	  isEmpty()
		 * 	  index search() 검색
		 * 4. Vector 클래스의 자식클래스
		 * 
		 * */
		
		Stack s = new Stack(); // stack구조기 때문에 부모인vector 메소드는 사용x
		s.push("박지웅"); // 1
		s.push("서지원"); // 2
		s.push("안우혁"); // 3
		s.push("최인식"); // 4
		
		
		// System.out.println(s.search("서지원")); 
		// 3 -> 두번째로 넣었어도 읽어오는건 마지막에 들어간 값부터 일어오기때문에 3이 출력된다.
		
		/*
		s.clear();
		// java.util.EmptyStackException
		System.out.println(s.peek());
		*/
		
		/*
		System.out.println(s.peek()); // 제거하지 않고 읽어오기때문에 한번더 읽어도 마지막값이 반환됨
		System.out.println(s.peek());
		*/
		
		/*
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
		*/
		
		/*
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop()); // Last In First Out
		System.out.println(s.pop()); // java.util.EmptyStackException
		*/
	} // main

} // class
