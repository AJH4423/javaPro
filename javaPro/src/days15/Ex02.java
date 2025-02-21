package days15;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// [JVM의 메모리 구조]
		// 응용 프로그램을 실행하면 JVM이 OS로부터 프로그램을 실행하는데
		// 필요한 메모리를 할당받는다.
		// JVM은 용도에 따라서 여러 영역으로 나누어서 관리한다.
		// 1) Method Area
		// 		ㄴ 프로그램 실행 시 클래스 파일(.class) -> 읽어서 클래스에 대한 
		// 		  정보를 Method Area에 저장
		//		ㄴ 클래스 변수
		// 2) Call Stack(호출 스택)
		// 		ㄴ 메서드가 호출 할 때 메서드에서 사용할 저장 공간
		// 		ㄴ 지역변수
		// 3) Heap
		// 		ㄴ new연산자에 의해서 저장 공간이 잡힘
		//		ㄴ ex) new int[3], new Person() 객체생성
		// 		ㄴ 인스턴스(인스턴스 변수)
		
	} // main

} // class
