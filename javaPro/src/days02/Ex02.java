package days02;

/**
 * @author ajh
 * @date 2025. 2. 4.
 * @subject 변수
 * @content 지역변수 및 값 할당방법  
 */
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ctrl + Shift + L : 이클립스 모든 단축키 보여줌
		String name = null;
		
		name = "안준호";
		System.out.println( name );
		name = "이창익";
		System.out.println( name );
		
		//The [local variable] name may not have been initialized
		//         =지역 변수
		// 지역변수는 초기화를 시켜야한다라는 의미
		// 지역변수는 반드시 초기화를 해야지만 사용가능
		System.out.println( name );

	} // main

} // class
