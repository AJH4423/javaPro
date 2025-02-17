package days04;

public class Ex03 {

	public static void main(String[] args) {
		//                        ㄴ String 배열 args
		
		//[문제]: []연산자
		// 한 학생의 국어점수를 저장할 변수를 선언.
		int kor = 0;
		// 1000000명 학생의 국어점수를 저장할 변수를 선언
		
		// 1. 배열(array) : 동일한 자료형을 메모리상에 연속적으로 놓이게 한것
		//  ㄴ 참조형(Reference Type)
		
		// 2. 배열 선언 및 생성 형식
		//      ㄴ 자료형 [] 배열(변수)명;
		// new : heap(힙)이라는 동적영역에 메모리를 할당해라
		// new 자료형[배열크기];
		// 자료형 [] 배열명 = new 자료형[배열크기]
		
		int [] kors; // int 배열 kors
		kors = new int[100];
		kors[0] = 90;
		kors[1] = 67;
		System.out.println( kors[0] ); // kors[0]는 해당 배열의 이름
		/*
		 *     heap 영역
		 *     	  0      1      2   ....   99     첨자값(index)
		 *     아랫첨자값                    윗첨자값
		 *     LowerBound                 UpperBound(배열크기-1) 
		 *     0번째요소(element)....
		 *     [4바이트][4바이트][4바이트].... [4바이트]
		 *     0X100번지  --> 배열의 시작주소가 들어가는 곳이지 실제값이 들어가지는 않음
		 *     시작주소   
		 * */ 	 
				
		/*
		 * stack 이라는 공간에 메모리가 할당됨
		 * [  주소값  ]
		 *     ㄴ kors 변수, 참조변수: 기억공간에 주소값이 있는 변수, 배열명
		 * */
		
		// 배열크기 : 배열명.length
		// UpperBound = 배열크기 -1 = 배열명.length -1 
		int size = kors.length;
		System.out.println(size);

	}// main

}//class
