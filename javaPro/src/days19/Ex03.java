package days19;

public class Ex03 {

	public static void main(String[] args) {

		// [어떤 객체로부터 클래스 정보를 얻어오는 3가지방법]
		// [C]lass 객체를 얻어오기 


		Card c1 = new Card();
		System.out.println(c1);

		/*
		// Class 객체를 얻어오는 첫번째 방법
		Class cls = c1.getClass();
		String fullname = cls.getName();
		System.out.println(fullname); //days19.Card
		 */

		/*
		// 두 번째 방법 : 모든 클래스마다 static필드 -> class
		Class cls = Card.class;
		// cls을 이용해서 Card 객체(인스턴스)를 생성
		// new Card();
		try {
			Card c2 = (Card) cls.newInstance();
			System.out.println(c2);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		 */

		// 세 번째 방법 : forName()이용
		String className = "days19.Card";
		try {
			Class c3 = Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	} // main

} // class

// final 클래스 	: 최종 클래스
// final 메서드 	: 재정의 할 수 없다
// final 필드   	: 상수
// final 지역변수 	: 상수
final class Card{

	String kind; // 카드종류
	int num; 	 // 카드번호

	//디폴트 생성자
	Card() {
		this("SPADE",1);
	}

	// 생성자
	public Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s : %d", this.kind, this.num);
	}

}