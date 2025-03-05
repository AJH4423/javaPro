package days22;

import java.util.HashSet;

public class Ex10 {
	
	public static void main(String[] args) {
		
		// Collection -> Set -> Hashset클래스
		/* 				 ㄴ 증복허용 x
		 * 				 ㄴ 순서유지 x
		 * */
		
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(15); // 예외발생 x
		hs.add(15); // 예외발생 x
		hs.add(null);
		hs.add(null); // 예외발생 x
		
		// [1, 9, 15]
		// 15는 1번만 추가됨. -> 중복허용 x
		// 순서: 순서유지 x
		System.out.println(hs);
		
	} // main

} // class
