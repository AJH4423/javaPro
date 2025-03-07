package days24;

import java.util.ArrayList;

public class Ex08_04 {
	
	public static void main(String[] args) {
		
		/*[제네릭 클래스의 객체 생성과 사용]
		 * */
		/*
		Box03<Fruit> fruitBox = new Box03<Fruit>();
		Box03<Apple> appleBox = new Box03<Apple>();
		Box03<Grape> grapeBox = new Box03<Grape>();
		Box03<Toy> toyBox = new Box03<Toy>();
		
		// 예외 발생
		// Type mismatch: cannot convert from Box03<Grape> to Box03<Apple>
		// Box03<Apple> appleBox2 = new Box03<Grape>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // 자식 클래스는 업캐스팅이 가능
		fruitBox.add(new Grape()); // 자식 클래스는 업캐스팅이 가능
		
		// The method add(Fruit) in the type Box03<Fruit> is not applicable for the arguments (Toy)
		// fruitBox.add(new Toy());
		// toyBox.add(new Grape());
		*/
		
	} // main

} // class

/*
class Fruit{
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}
}

class Toy{
	public String toString() {
		return "Toy";
	}
}

// 제네릭 클래스 선언
class Box03<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { this.list.add(item); }
	T get(int i) { return this.list.get(i); }
	int size() { return this.list.size(); }
	public String toString() { return this.list.toString(); }
}
*/