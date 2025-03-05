package days22;

public class Ex06 {

	public static void main(String[] args) {

		// [LinkedList 컬렉션 클래스]
		/*
		 배열의 단점
		 1. 배열 크기가 자동으로 증가되지 않음
		 2. [][][][3][->][->][->][][][]
		 			<-<-<-
		          값을 삽입 및 삭제할때 다른 값들을 이동시켰기에
		 			성능이 떨어진다.
		 배열의 장점
		 1. 읽기 성능이 가장 빠르다.

		 배열의 단점을 보안한 클래스 -> LinkedList컬렉션 클래스
		 						(특징)비연속적이다
		 			하나의 요소들을 노드(node)라고 부른다
		 			(다음요소주소저장)
		 			0번째요소		2번째요소		3번째요소
		 			[0x500]		[0x300]		[null]
		 			[3]			[10]		[5]
		 			0x100		0x200		0x300

		 				 1번째요소
		 				 [0x300]
		 				 [100]
		 				 [0x500]
		 */

		Node node1 = new Node();
		node1.value = 10;

		Node node2 = new Node();
		node2.value = 15;

		Node node3 = new Node();
		node3.value = 17;

		Node node4 = new Node();
		node4.value = 34;

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;

		// [문제] 노드2번쨰와 노드3번째 사이에 노드5번째를 추가해라
		// 노드5의 value값은 100이다

		Node node5 = new Node();
		node5.value = 100;
		node5.next = node2.next;
		node2.next = node5;
		
		// [문제] 노드3(17)을 삭제
		node5.next = node4;

		Node node = node1;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		} 



	} // main

} // class

// 단방향 링크드 리스트
class Node {
	// Node prev = null;
	int value = 0;
	Node next = null; // 뒤의 노드의 주소를 저장할 참조변수
}
