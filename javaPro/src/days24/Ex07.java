package days24;

import java.util.ArrayList;
import java.util.Collections;

public class Ex07 {

	public static void main(String[] args) {

		//[Collections - 컬렉션 클래스를 사용하기 쉽게만든 클래스]
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list); // []

		/*[1] 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list); // [1, 2, 3, 4, 5]
		 */

		//[2]
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list); // [1, 2, 3, 4, 5]

		// 오른쪽 2칸씩 이동(회전)
		/*
		Collections.rotate(list, 2);
		System.out.println(list);
		 */

		// 0번째요소와 2번째요소 값 교환
		/*
		Collections.swap(list, 0, 2);
		System.out.println(list); // [3, 2, 1, 4, 5]
		 */

		// 임의적으로 섞는 작업
		Collections.shuffle(list);
		System.out.println(list); // [3, 2, 1, 4, 5]


		// 오름차순 정렬
		Collections.sort(list);
		System.out.println(list); // [1, 2, 3, 4, 5]

		// 내림차순 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list); // [5, 4, 3, 2, 1]
		
		// 특정 요소 찾기
		int index = Collections.binarySearch(list, 30);
		System.out.println(index); //list에 없는 값은 음수값을 반환해줌
		
		// 순서 거꾸로 정렬
		Collections.reverse(list);
		System.out.println(list); 
		
		
		Collections.fill(list, 0);
		System.out.println(list); // [0, 0, 0, 0, 0]
		
		Collections.replaceAll(list, 0, 100);
		System.out.println(list); // [100, 100, 100, 100, 100]

	} // main

}
