package days16;

public class Ex10 {
	
	public static void main(String[] args) {
		
		/*
		 * [자바는 다중상속을 지원하지 않는다]
		 * 		= 단일상속만을 지원한다
		 * 왜 다중상속을 지원하지 않는가?
		 * - 서로 다른 클래스로부터 상속 받은 멤버 들간의 
		 * 이름이 같은 경우 어떻게 구별할 수 있는 방법이 없다
		 * 	-> 인터페이스를 사용해서 다중 상속을 대신할 수 있다.
		 * 
		 * */
		
		/*
		 * [패키지(package)]
		 * 1. 서로 연관된 클래스, 인터페이스를 효율적으로 관리하기 위해서 묶어놓은것
		 * 2. full Name = 패키지 + 클래스명
		 * 3. class A{} -> 물리적으로 A.class 파일 생성
		 * 	  days01 패키지 선언 -> 물리적으로 days01 디렉토리가 생성
		 * 4. java파일의 첫 번째 라인에 package 구문을 선언
		 * 5. 모든 클래스는 반드시 하나의 패키지에 속해야 한다.
		 * 6. 패키지는 점(.)을 구분자로 계층 구조를 구성할 수 있다.
		 * 		-> 하위 패키지까지는 import하지 못한다
		 * 		-> 하위 패키지까지 import하려면 '.하위패키지명'까지 명명해 주어야한다.
		 * 7. 패키지명은 소문자 권장.(원칙), 대문자 패키지명 허용은 함
		 * 
		 *  [import 문]
		 *  1. 다른 패키지의 클래스를 사용하려면 패키지명이 포함된 클래스 이름을 
		 *  사용해야 한다. 매번 패키지명을 붙여서 작성하면 불편하다.
		 *  그래서 클래스를 사용하기 전에 import구문을 사용해서 클래스의 패키지명을 
		 *  미리 명시해 주는 구문이 import문이다.
		 *  2. Ctrl + Shift + O : 자동으로 import문 추가
		 *  3. import 구문 형식
		 *  	ㄴ import 패키지명.클래스명;
		 *  	ㄴ import 패키지명.*;
		 *  	예) import java.util.Calendar;
		 *  4. import java.lang.*; -> 캄파일러가 자동으로 추가해줌
		 *  5. import static 키워드를 붙이면 특정 클래스의 static멤버를 
		 *     호출할때 클래스명을 생략할 수 있다
		 * */
		
	} // main

} // class

class Tv {
	
}

class VCR {
	
}

/*
// Syntax error on token ",", . expected -> 다중상속 불가
class TVCR extends Tv,VCR {
	
}
*/
