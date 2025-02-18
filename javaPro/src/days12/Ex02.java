package days12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex02 {
	
	public static void main(String[] args) {
		
		int [] m = {3,5,2,4,1};
		System.out.println(m.length);
		System.out.println(Arrays.toString(m));
		
		//1. 6을 배열의 제일 뒤에 추가(append) 
		
		m = Arrays.copyOf(m, m.length +1);
		m[5] = 6;
		System.out.println(Arrays.toString(m));
		
		//2. 2가 있는 위치를 찾아서 100을 삽입 
		// -> 2가있는 위치에 값을 넣고 원래값들은 뒤로 하나씩 미룸
		/*
		// [1]
		int index = -1;
		for (int i = 0; i < m.length; i++) {
			if (m[i]==2) {
				index=i;
			} // if
			if (index==-1) {
				System.out.println("2는 없다");
			} // if
		}
		System.out.println("index: "+ index);
		*/
		
		//[2] 배열의 단점 보안 -> 컬렉션 클래스 사용(List) + indexOf() 메서드
		/*
		List<Integer> list = List.of(3, 5, 2, 4, 1, 6);
		int index = list.indexOf(2);
		System.out.println("index: "+ index);
		*/
		
		// [3] 암기
		// 배열 -> List변환.indexOf()메서드
//		int index = Arrays.stream(m)     //배열 -> Stream변환
//				.boxed()    //기본형 int [] -> 레퍼클래스 Integer [] 변환
//				.collect(Collectors.toList())  //List로 변환
//				.indexOf(2);
//		
//		System.out.println("index: "+ index);
//		m = Arrays.copyOf(m, m.length +1);
//		System.out.println(Arrays.toString(m));
//		// [3, 5, 2, 4, 1, 6, 0]
//		
//		for (int i = m.length-2; i >= index; i--) {
//			m[i+1] = m[i];
//		}
//		m[index]=100;
//		System.out.println(Arrays.toString(m));
		// [3, 5, 2, 2, 4, 1, 6] -> 앞에서부터 하나씩 미루는게 아닌 뒤에서부터 앞으로 땡긴다
		
		//[4]
		int index = Arrays.stream(m)     //배열 -> Stream변환
		.boxed()    //기본형 int [] -> 레퍼클래스 Integer [] 변환
		.collect(Collectors.toList())  //List로 변환
		.indexOf(2);
		int [] temp = new int [m.length+1];
		System.arraycopy(m, 0, temp, 0, index);
		System.arraycopy(m, index, temp, index+1, m.length-index);
		m=temp;
		m[index]=100;
		System.out.println(Arrays.toString(m));
		
		// [문제] 다시 100삭제		
		temp = new int[m.length-1];
		System.arraycopy(m, 0, temp, 0, index);
		System.arraycopy(m, index+1, temp, index, m.length-1-index);
		m=temp;
		System.out.println(Arrays.toString(m));
	} // main

}
