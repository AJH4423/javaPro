package days14;

public class Ex06 {
	
	public static void main(String[] args) {
		
		// [지역변수 선언 형식]
		// 자료형 변수명[=초기화];
		// final 자료형 상수명[=초기값]
		// -> 지역변수에는 접근지정자를 붙이지 않음
		
		Tv t1 = new Tv(); // 객체 선언 및 객체 생성
		t1.power();
		t1.channelUp();
		System.out.println(t1.channel);
		t1.power();
		System.out.println("end");
	} // main

} // class

//The public type Tv must be defined in its own file
// Ex06.java 자바 파일을 생성하면 자바 파일 안에는 반드시 1개의 
// public으로 선언된 클래스(class 자바파일명)가 있어야 한다.
//public class Tv{

class Tv{
	
	// 필드 선언
	// [접근지정자] [기타제어자] 자료형 필드명[=초기값];
	public String color;
	       boolean power = false; // 접근지정자를 안붙인건 default(package)이다
	public int channel=11;       
	 
	// 메서드
	public void power() {
		power = !power;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	
} // Tv class