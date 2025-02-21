package days15;

public class Person {
	
	// private: 해당 클래스 내에서만 참조가능
	// 필드
	String name; // 이름
	private int age; // 나이
	private boolean gender; // 성별
	
	// 생성자
	public Person(boolean g) {
		//super();
		gender = g;
	}
	
	public Person() {
		// 생성자에서 또 다른 생성자를 호출 할 때의 this
		this("익명사용자",1,true); // 내가 설정하고자 하는 기본값으로 초기화 시키고 싶다
		System.out.println("Person 0 디폴트 생성자 호출됨.");
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;		
		System.out.println("Person 2 생성자 호출됨.");
	}
	
	public Person(String name, int age, boolean gender) {
		//super();
		// this의 첫번째 용도: 멤버를 가리킬 때의 this
		// this.name = name;
		this(name,age);
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("Person 3 생성자 호출됨.");
	}
	
	//메소드 역할 : private 필드의 값을 설정, 얻어올때 사용하는 메서드
	// [getter]
	public int getAge() {
		return age;
	}

	// [setter]
	// p1.setAge(20)
	public void setAge(int a) {	
			age = a;
	}
	
	// getGender -> boolean isGender() 
	// 읽기 전용의 필드
	public boolean isGender() {
		return gender;
	}

	/*
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	*/
	
	
}
