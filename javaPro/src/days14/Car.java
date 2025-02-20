package days14;


// 신형 자동차 클래스 선언
public class Car {

	//필드(field) == 멤버변수(속성) 
	String name; 	// 자동차 이름
	int speed; 		// 속도
	int wheelCount; // 바퀴수


	//메서드(method) == 멤버함수(기능)
	
	public void dispCarInfo() {
		System.out.printf("> 차명:%s 속도:%d 바퀴수:%d", name, speed, wheelCount);
	}

}
