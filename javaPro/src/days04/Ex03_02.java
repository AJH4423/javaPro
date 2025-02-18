package days04;

public class Ex03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생의 이름을 여러명 저장 -> 배열선언
		String [] names = null; // 지역변수, 참조변수, 배열명, 스택영역에 생성
		names = new String[10]; // 힙영역에 생성
		
		// The local variable names may not have been initialized
		// java.lang.NullPointerException : 스탯공간에만 생성되어있고 힙영역에는 생성이 안되어있음
		names[0] = "홍길동";
		names[1] = "이창익";
		
		System.out.println(names[0]);
		//  java.lang.ArrayIndexOutOfBoundsException : 배열의 크기를 벗어남
		

	}// main

}// class
