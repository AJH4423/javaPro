package days21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Ex10 {
	
	public static void main(String[] args) {
		
		// [List] - ArrayList 컬렉션 클래스
		// 			ㄴ 가장 많이 사용되는 컬렉션 클래스
		// 			ㄴ 순서가 유지됨, 중복 허용이됨
//		String [] names = new String[5];
//		names[0] = "홍길동"; // 0번째 요소
//		names[1] = "김길동"; // 1번쨰 요소
		
		// <E : Element(요소)> - 제네릭
		// ArrayList list = new ArrayList<E>(10);
		ArrayList list = new ArrayList();
//		System.out.println(list.isEmpty()); // true, 비어있음
		System.out.println(list.size()); // 요소(Element)의 크기(갯수)
		list.add("권태정");
		list.add("김도훈");
		list.add("김민선");
		list.add("서재웅");
		list.add("김승효");
		list.add("김도훈"); // 중복을 허용한다
		System.out.println(list.size()); // 6
		System.out.println(list.isEmpty()); // false, 비어있지 않음
		
		// 입력한대로 순서가 유지됨
		// [권태정, 김도훈, 김민선, 서재웅, 김승효]
		System.out.println(list);
		
		list.add(2, "양재원"); // 해당 자리에 추가하고 나머지 값들 오른쪽으로 이동
		// list.set(2, "양재원"); // 원래 값이있는 자리에 추가
		
		list.trimToSize(); // 남은 공간을 제거하겠다
		System.out.println(list);
		
		// int index = list.indexOf("홍길동"); // 앞에서부터 찾음
		int index = list.lastIndexOf("홍길동"); // 뒤에서부터 찾음
		System.out.println(index); // -1
		
		// [문제] "김도훈" 요소를 찾아서 있으면 삭제
		list.remove(list.indexOf("김도훈"));
		System.out.println(list);
		// boolean list.contains("김도훈");
		/*
		if (list.contains("김도훈")) {
			System.out.println(list.remove("김도훈"));
		} // if
		*/
		
		// [문제] 모든 "김도훈" 요소를 삭제하기
		/* [1]
		while ((index = list.indexOf("김도훈")) != -1) {
			System.out.println(index);
			list.remove(index);
		}
		*/
		
		/* [2]
		while (list.contains("김도훈")) {
			list.remove("김도훈");
		}
		*/
		
		// [3]
		/*
		ArrayList removeList =  new ArrayList();
		removeList.add("김도훈");
		list.removeAll(removeList);
		*/
		
		// [4]
		/*
		while (list.remove("김도훈")) {
			;
		}
		
		// while (list.remove("김도훈")); -> 위와 동일한 코드
		 */
		
		// [5] 람다식과 스트림
		/*
		Predicate<String> isNameCheck = (n) -> n.equals("김도훈");
		list.removeIf(isNameCheck);
		*/
		
		// [6] 익명클래스
		/*
		list.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.equals("김도훈");
			}
		});
		*/
		
		// [7] 
		// list.removeIf((t)-> t.equals("김도훈"));	
		
		// [문제] 김씨 모두 삭제			
		// list.removeIf((t)-> ((String)t).matches("김.+"));
		// list.removeIf((t)-> ((String)t).startsWith("김"));
		// list.removeIf((t)-> ((String)t).charAt(0)=='김');
		
		// 이름 오름차순 정렬
		// Arrays.sort(배열명);
		// list.sort(null); // 기본이 오름차순 정렬
		
		// 이름을 내림차순 정렬
		// list.sort(Collections.reverseOrder());
		
		// 람다식과 스트림 이용해서 내림차순 정렬
		/*
		list.sort((o1, o2) -> ((String) o2).compareTo(((String)o1)) ); 
		*/
		
		// [문제] index = 5 이름 요소를 얻어오기
		// 배열명 [5]
		index = 5;		
		System.out.println(list.get(index));
					
		// [문제]  1 ~ 4 요소를 얻어오기
		int fromIndex =1, toIndex = 4;
		List slist = list.subList(fromIndex, toIndex+1);
		System.out.println(slist);
		
		// [문제] 모든 요소를 제거
		/*
		while (!list.isEmpty()) {
			list.remove(0);
		}
		*/
		list.clear();
		
		System.out.println(list); // []
		System.out.println(list.size()); // 0
		
	} // main

} // class
