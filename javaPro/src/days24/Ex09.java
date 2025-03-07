package days24;

import java.util.Arrays;

public class Ex09 {

	/* 중첩클래스의 의미
	enum Card{
		CLOVER,HEART,DIAMOND,SPADE
	}
	 */

	public static void main(String[] args) {

		// [열겨형]
		// 	ㄴ 서로 관련된 상수들의 집합을 나타내는 특별한 클래스 타입
		/*	ㄴ jdk1.5 새로 추가
		 * 	ㄴ 정의 : enum 열거형이름 {상수명,상수명...   }
		 * 	ㄴ 사용방법 : 열거형이름.상수명
		 * 
		 * */

		System.out.println(Card.CLOVER); // CLOVER
		System.out.println(Card.CLOVER.name()); // "CLOVER"
		System.out.println(Card.CLOVER.ordinal()); // 0 : 순서

		Card cardType = Card.valueOf("CLOVER");
		System.out.println(cardType); // CLOVER

		// Card 열거형의 모든 상수값을 얻어올 때...
		Card [] cardArr = Card.values();
		System.out.println(Arrays.toString(cardArr)); // [CLOVER, HEART, DIAMOND, SPADE]

	} // main

} // class

// days24 패키지 안에서만 사용
/*
enum Card{
	CLOVER,HEART,DIAMOND,SPADE
}
 */

/*
class Card{
	public static final int CLOVER = 0;
	public static final int HEART = 1;
	public static final int DIAMOND = 2;
	public static final int SPADE = 3;
}
 */