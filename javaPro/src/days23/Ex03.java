package days23;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03 {
	
	public static void main(String[] args) {
		
		// [Student클래스 -> HashSet 컬렉션 클래스에 저장]
		HashSet<Student> hs = new HashSet<>();
		
		hs.add(new Student("2020001","홍길동",25));
		hs.add(new Student("2020002","서영희",25));
		hs.add(new Student("2020003","최승우",25));
		hs.add(new Student("2020001","권태정",25)); // 학번으로 중복체크함
		// 문제점) HashSet은 hashcode를 기준으로 중복을 구분하기에 값이 같더라도 다른 인스턴스로 인식해서 잘 돌아간다
		// 해결방안 -> hashCode() 오버라이딩 - 학번을 해쉬코드로 오버라이딩함
		//			equals() 오버라이딩 - 학번
		
		Iterator<Student> ir = hs.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);
		}
		
	} // main

} // class

class Student {
	String no; // 학번 - 학생을 구별할 수 있는 고유한 필드
	String name; 
	int age;
	
	public Student() {// 디폴트생성자
		super();
	}
	
	public Student(String no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() { //학번으로 중복체크
		return this.no.hashCode();
	}

	@Override
	public boolean equals(Object obj) { // 학번으로 중복체크
		if (obj instanceof Student && obj != null) {
			Student s = (Student) obj;
			return this.no.equals(s.no);
		} // if
		return false;
	}
		
}
