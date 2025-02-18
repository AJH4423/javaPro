package days02;

public class Ex05_04 {
	
	public static void main(String[] args) {
	    // b(1),s(2),i(4),l(8)
		// [문제] 나이를 저장할 변수를 선언하세요.
		//      자료형 : 숫자/정수 
		// 사람의 가장많이 산 사람의 나이는 120살로 나이를 int로 잡는건 비효율적이다. 즉, 나이는 byte로 잡는게 효율적
		// int age = 20;
		// [] : 1bit : 2가지
		// byte(1): [][][][][][][][] : 8bit : 1byte : -128 ~ 0 ~ 127까지의 정수
		// 맨처음 비트는 부호비트로 빠짐
		// short(2): [][][][][][][][] [][][][][][][][]: 16bit : -27678 ~ 27677 정수
		// int(4): [][][][][][][][] *4 : 4byte
		// long(8) : [][][][][][][][] *8 : 8byte
		
		byte age; // 자료형의 용량에따라 공간낭비없게 선언하기
		age = 20;
		System.out.printf("age = %d\n", age);
		
		//[문제] 국어 점수를 저장할 변수 선언 95 할당.
	    byte koreascore;
	    koreascore = 95;
	    System.out.printf("국어점수 = %d\n", koreascore);
		
	}//main
	
}//class
