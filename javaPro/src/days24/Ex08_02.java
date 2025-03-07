package days24;

import java.util.ArrayList;

public class Ex08_02 {

	public static void main(String[] args) {

		/*
		Box box = new Box();
		box.setItem(100);
		int item = box.getItem();
		System.out.println(item);

		Box2 box2 = new Box2();
		box2.setItem(3.14);
		double item2 = box2.getItem();
		System.out.println(item2);

		Box3 box3 = new Box3();
		box3.setItem("문자열");
		String item3 = box3.getItem();
		System.out.println(item3);
		 */

		/* Object로 모든 자료형을 받을때 
		Box box = new Box();
		box.setItem(100);
		int item = (int)box.getItem(); // 다운캐스팅
		System.out.println(item);

		Box box3 = new Box();
		box3.setItem("문자열");
		String item3 = (String)box3.getItem(); // 다운캐스팅
		System.out.println(item3);
		 */

		Box<Integer> box1 = new Box<>();
		box1.setItem(100);
		int item = box1.getItem(); // 다운캐스팅이 필요없음
		System.out.println(item);

		Box<String> box2 = new Box<>();
		box2.setItem("문자열");
		String item2 = box2.getItem(); // 다운캐스팅이 필요없음
		System.out.println(item2);

		/* 제네릭 없이선언 -> 기본 자료형은 Object로 된다
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("문자열");
		list.add(3.14);
		list.add('A');
		list.add(true);

		int a = (int)list.get(0);
		String b = (String)list.get(1);
		double c = (double)list.get(2);
		char d = (char)list.get(3);
		 */

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		// list.add("1"); -> 제네릭이 Integer이기때문에 String형은 대입할 수 없음
	} // main

} // class

// 제네릭 클래스 선언
// 	ㄴ 클래스 명 뒤에 <T>을 붙이면 된다.
// 	ㄴ T를 타입변수 또는 타입 매개변수라고 부른다
// 		T = Type == 자료형
// 		Key
// 		Value
// 		Element
// 		등등
//	ㄴ Box		원시타입
//	ㄴ Box<T>	제네릭 클래스, T의 Box, T Box라고 읽으면된다
class Box<T> { 

	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}

/*
class Box { // Object는 모든 자료형을 담을 수 있다

	private Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}

}
 */

/*
class Box {

	private int item;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

}

class Box2 {

	private double item;

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}

}

class Box3 {

	private String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}
 */