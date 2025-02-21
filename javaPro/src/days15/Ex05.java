package days15;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		// [private로 필드 선언 후 필드에 접근하는 방법]
		// -> getter, setter
		
		Person p1 = new Person(true);
		// The field Person.name is not visible -> 접근지정자 private
		// 해결책: private -> package : 같은 패키지 내부에서만 참조가능
		p1.name = "홍길동";
		// p1.age = 20; X
		p1.setAge(20);
		System.out.println(p1.getAge()); //20
		
		// 나이를 키보드로부터 얻어와서 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		// 0~120 나이 입력후 오류출력
		p1.setAge(age);
		
	} // main

} // class
