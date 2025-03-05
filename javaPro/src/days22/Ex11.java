package days22;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Ex11 {
	
	public static void main(String[] args) {
		
		// Set 인터페이스의 특징 
		// 중복 허용x, 순서 유지x
		// [HashSet 컬렉션 클래스]
		
		// <> 제네릭 : 기본형 사용불가, 참조형만 사용가능
		// HashSet<int> hs = new HashSet<int>();
		// HashSet<Integer> hs = new HashSet<Integer>();
		// 가끔씩 중복은 허용 안하되 순서는 유지해야할 경우가 있음 -> LinkedHashSet이용
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		hs.add(new Integer(100));
		hs.add(20); // Auto Boxing이 되기때문에 참조형으로 넣을 필료없음
		hs.add(15);
		hs.add(30);
		hs.add(15);
		hs.add(15);
		hs.add(15);
		hs.add(30);
		// [100, 20, 30, 15] -> 순서유지 안됨
		System.out.println(hs);
			
	} // main

}
