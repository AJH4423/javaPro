package days01;

//import java.lang.System;  // (패키지를 import해주었기 때문에 syso를 쓸때 java.lang을 안써도됨)
                           // 원래는 클래스를 사용하려면 패키지.class명의 형식으로 이용하여야한다
                          // (import java.lang.*)syso은 컴파일러가 이미 먼저 내장해두기때문에 import안해주어도 사용가능하다. 

/**
 * @author ajh
 * @date 2025. 2. 3.
 * @subject [자바 프로그램의 기본 구조 설명]
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 자바는 "객체 지향적 프로그램 언어"이다.
		 *          Object Oriented Programming
		 *          ( OOP )
		 *    예) 완성된 프로그램 = 부품+부품+부품+... (부품으로 하나하나씩 나눠서 관리하기 때문에 유지보수가 좋음)
		 *    				  시작개체	
		 *      Sample.java 소스파일
		 *      javac Sample.java -> Sample 컴파일
		 *      java Sample 실행
		 *           -> JRE(JVM) -> Sample클래스 -> 전원ON/OFF기능
		 *           							  메서드(method)
		 *            							  main 메서드 기능
		 *            							   ㄴ 프로그램 시작점(진입점)			
		 *    						
		 *        ㄴ 완성된 조립컴퓨터 = 전원부품+부품+부품+...
		 *                         ㄴ 부품 = 객체, object, 개체 
		 *                         
		 * 2. 클래스 = 부품의 설계도  
		 * 
		 * 3. 자바 클래스 선언 형식
		 *   접근지정자
		 *         modifieres = [접근지정자] + [기타제어자]
		 *   [public] [기타제어자] class(=예약어) Ex02(=클래스명) { -> []는 생략가능하다는 의미, {} = 클래스몸체
		 *   }
		 *   - 클래스명은 반드시 첫 문자 = 대문자 시작 
		 *   - 개발자가 지어주는 이름 = 식별자 (클래스명, 패키지명....)
		 *   - 자바에서 식별자를 명명하는 규칙 
		 *   
		 * 4. 자바에서 메서드를 선언 형식 (메서드 == 어떤물건(부품, 객체, 개체, Object, 클래스)이 가지는 기능(일))
		 *                        void    파라미터, 인자, 인수
		 *    [접근지정자] [기타제어자] 리턴자료형 메서드명([매게변수...])  { 메서드 몸체
		 *    
		 *    
		 *       [return 리턴값;] 생략가능(생략가능하면 리턴자료형 = void)
		 *    } 
		 *    
		 *     ## main메서드 3가지 파악 ##
		 *     1. 기능 : 프로그램의 시작, 종료(main 함수 = 시작개체)
		 *     2. 매개변수(파라미터) : String[] args(main 함수의 경우)
		 *     3. 리턴값( 리턴자료형 ) : 없음 = void(main 함수의 경우)
		 *    
		 *    예) 홍길동 -> 담배 심부름(일/기능)
		 *               파라미터, 매개변수 : 담배값, 담배명 
		 *               반환(리턴)값     : 담배                      
		 * */
		// 본인 이름 출력
		// 화면에 출력할수 있는 물건이 필요 -> 표준출력장치(모니터)에 출력 물건(클래스) : System 클래스
		System.out.println("안준호"); // -> java.lang 패키지안에있는 System 클래스를 쓰겠다
		System.out.println("양재원");
		System.out.println("안준호");
		
		System.out.println("이름"); // -> ~println까지 = 망치질하다
		
		// 예) 집에 벽에 못을 칠것임
		//    망치(물건) == System 이 필요
		//    1. A-> 못을 치는 부분  + 망치질(일)하다( "못"  )
		//    2. B-> 못을 뺴는 부분
		// 창고.망치.A부분.망치질하다("못");
		
		//         

	} // main

} // class 
