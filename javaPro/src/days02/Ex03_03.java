package days02;

public class Ex03_03 {
	public static void main(String[] args) {
		//[문제]
		// 이름을 저장할 변수를 선언하고
		// 나이를 저장할 변수를 선언하고
		// 키를 저장할 변수를 선언하고
		// 원하는 값으로 각 변수를 초기화 한후 
		//(출력방식)
		// 이름은 "홍길동"이고, 나이는 25살이고, 키는 180.78cm이다.
		
		String name = "안준호";
		int age = 27;
		double tall = 180.87;
		
		System.out.println("이름은 " + name + "이고, 나이는 "+ age + "살이고, 키는 " + tall +"cm이다.");
		System.out.println("이름은 \""+name+"\"이고, 나이는 "+age+"살이고, 키는 "+tall+"cm이다.");
	}

}
