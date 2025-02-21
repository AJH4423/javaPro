package days15;

import java.util.Date;

public class Ex04 {
	
	// 생성자(constructor)
	public Ex04(){
		
	}
	
	public static void main(String[] args) {
		
		/*
		 * [생성자(constructor)]
		 * 1. 일종의 메서드이다
		 * 2. 리턴자료형 x -> void도 안붙인다.
		 * 3. 반드시 메서드명은 클래스명하고 동일하게 설정.
		 * 4. 매개변수가 하나도 없는 생성자를 "디폴트 생성자(default donstructor)"라고 부른다
		 * 5. 생성자의 역할: 필드 초기화
		 * 6. 생성자의 호출시점: 인위적으로 생성자를 호출할 수 없다.
		 *                  객체를 생성할 때만 자동으로 호출된다.
		 * 7. 제한자(modifier)를 사용할 수 있다.
		 * 8. 생성자도 오버로딩이 가능하다. (중복선언가능)
		 * 9. 생성자는 상속되지 않는다.
		 * 10. 생성자가 하나도 없는 경우에는 컴파일러가 자동으로 디폴트 생성자를 추가한다.
		 * 
		 * */ 
		
		/*
		MyPoint p1 = new MyPoint(); // 1
		// x,y필드 초기화				// 2
		p1.x=10;
		p1.y=20;
				
		*/
		
		//new MyPoint();
		
		//The constructor MyPoint(int, int) is undefined
		MyPoint p1 = new MyPoint(10, 20);
		p1.dispMyPoint();
		
	} // main

} // class
