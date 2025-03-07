package days24;

import java.util.ArrayList;

public class Ex08_06 {
	
	public static void main(String[] args) {
		
		// [?(와일드카드)의 의미]
		// <? extends T> T의 자손만 가능하다
		// <? super T> T의 조상만 가능하다
		// <?> == <? extends Object> 제한없음
		
		//[1]
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		Juice juice = Juicer.makeJuice(fruitBox);
		System.out.println(juice); // days24.Juice@3b6eb2ec
		
		//[2]
		FruitBox<Apple> appleBox = new FruitBox<>();
		// The method makeJuice(FruitBox<Fruit>) in the type Juicer 
		// is not applicable for the arguments (FruitBox<Apple>)
		// 밑에 Juicer클래스의 제네릭을 '? extends'를 이용해서 수정하면 해결된다
		juice = Juicer.makeJuice(appleBox);
		System.out.println(juice); // days24.Juice@3b6eb2ec
		
	} // main

} // class

class Fruit{ public String toString() {return "Fruit";}}

class Apple extends Fruit{public String toString() {return "Apple";}}

class Grape extends Fruit{public String toString() {return "Grape";}}

// 제한된 제네릭 클래스 선언
class FruitBox<T extends Fruit> extends Box05<T> { }

class Box05<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { this.list.add(item); }
	T get(int i) { return this.list.get(i); }
	int size() { return this.list.size(); }
	public String toString() { return this.list.toString(); }
}

// 과일을 가지고 만든 주스 클래스
class Juice{
	// 구현되어있다고 가정
}

// 과일상자 -> 쥬스를 생산하는 기기
class Juicer{
	
	/*[1]
	static Juice makeJuice(FruitBox<Fruit> box) {
		//
		// 주스를 만드는 과정을 가정
		return new Juice();
	}
	
	static Juice makeJuice(FruitBox<Apple> box) {
		//
		// 주스를 만드는 과정을 가정
		return new Juice();
	}
	*/
	
	//[2]
	/*
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		//
		// 주스를 만드는 과정을 가정
		return new Juice();
	}
	*/
	
	//[3] 제네릭 메서드
	//	ㄴ 메서드의 선언부에 제네릭 타입이 선언된 메서드
	// 	ㄴ Collections.sort() 제네릭 메서드
	// 	ㄴ 선언부에 제네릭 타입이 선언되는 위치 : 리턴자료형 바로 앞
	// 	ㄴ 제네릭 클래스의 <T>와는 별개임
	
	// 예) 위의 [2] 메서드 -> 제네릭 메서드로 변환
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
		//
		// 
		return new Juice();
	}
	
	//[4] 제네릭 메서드 변환 예제)
	/*
	static void prinAll(ArrayList<? extends Fruit> list,
			ArrayList<? extends Fruit> list2 ) {
		// 구현 코딩
		// 구현 코딩
		// 구현 코딩
	}
	*/
	//-> 제네릭 메서드로 변환
	static <T extends Fruit> void prinAll(ArrayList<T> list,
			ArrayList<T> list2 ) {
		// 구현 코딩
		// 구현 코딩
		// 구현 코딩
	}
	
}


