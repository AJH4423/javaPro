package days14;

public class Ex03 {
	
	public static void main(String[] args) {
		
		int [] m = new int[3]; // m: 지역변수, 참조변수, 배열명
		
		// 대입연산자는 스택에 있는 선언된 주소를 힙영역에 선언한 값이 참조하게끔 해준다
		// 변수 선언 형식
		// 자료형 변수명[=초기값];
		// myCar : 지역변수, 참조변수, 객체명
		
		
		// 클래스 : 객체의 설계도   -> Car
		// 객체 : 클래스를 자료형으로 선언된 참조변수   -> myCar
		// 인스턴스 : new연산자 클래스의 객체가 실제 힙 영역에 생성된 것
		Car myCar; // 클래스 타입으로 객체화하는 코딩 -> 객체가 만들어짐
		myCar = new Car(); // -> 인스턴스화 됨, 
		// 인스턴스화를 안하면 해당 클래스의 멤버변수(필드)및 메서드를 쓸 수 없음
		// NullPointerException : 인스턴스화 되지 않으면 나타나는 오류
		
		myCar.name = "k9";
		myCar.dispCarInfo();
		
		// 인스턴스화하는 코딩 : new Car();
		
		
		/*
		 *  myCar : 객체, 스택영역에 저장됨, 멤버변수3개의 시작주소를 참조함
		 *  Car클래스에서 선언한 3개의 (필드)멤버변수 : 힙영역 배열로 저장
		 *  메소드 : 힙영역에 저장, 메소드주소가 있음
		 *  멤버변수3개와 메소드주소를 받고있는 인스턴스 : 스택영역에 저장, 메소드주소는 힙영역의 메소드주소를 참조함 
		 * 
		 * */
						
	} // main
		
}
