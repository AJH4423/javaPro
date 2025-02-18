package days01;


/**
 * @author ajh
 * @date 2025. 2. 3.
 * @subject   [ 변수와 상수 ]
 * @content
 */
public class Ex03 {
	
	public static void main(String [] srgs) {
		// [ 변수와 상수 ]
		// 변수: 변하는 수 : 값을 변경할 수 있는 기억공간
		// 상수: 변하지 않는 수 == 고정된 수 : 값을 변경할 수 없는 기억공간
		
		// 본인의 이름을 저장할 기억공간 선언 후 "안준호"값을 할당 -> 출력
		// [자바 변수 선언 형식]
		// 자료형, 변수명[=초기값];    
		// '이' '창' '익' 문자의 나열 == 문자열( 한글자는 '', 문자열은 "")
		String userName = "안준호";
		// '=' 표시는 좌측의 저장공간에 우측의 값을 할당하겠다는 의미
		
		
		System.out.println(userName); // userName의 기억공간의 값을 읽어오겠다
		
		
		//리터럴(상수와 같은개념) : 100, 'A', 3.14
	}

}
