package days14;

// 접근지정자: default -> 같은 패키지 내부에서만 사용 가능
// class Person {
// 접근지정자: public -> 어디서든지 사용가능
public class Person {

	// 필드
	public String name;
	public int age;
	
	
	// 메서드
	
	public void work() {
		System.out.println(name+"이 일한다");
	}
	
	public void run() {
		System.out.println(name+"이/가 달린다");
	}
	
}
