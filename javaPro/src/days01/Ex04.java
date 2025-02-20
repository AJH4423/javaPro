package days01;

// The type days14.Person [is not visible] -> 접근지정자의 범위때문에 생기는 오류
import days14.Person;

public class Ex04 {

	public static void main(String[] args) {
		// [패키지 외부에서 테스트]
		// days14.Person
		// days01.Ex04 클래스 안에서 사용(참조,상속) 가능 테스트
		
		Person p1 = new Person();

	} // main

} // class
