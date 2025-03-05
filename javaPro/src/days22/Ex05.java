package days22;

import java.util.Enumeration;
import java.util.Vector;

public class Ex05 {
	
	public static void main(String[] args) {
		
		// [Vector 컬렉션 클래스] - 순서유지 o, 중복허용
		/*
		 * ArrayList와 Vector 차이점은
		 *          ==
		 *          	멀리스레드에 안전함
		 *          	동기화 처리 가능
		 * 
		 * 
		 * StringBuilder와 Stringbuffer 차이점과 동일하다
		 * 
		 * */
		Vector v = new Vector();
		System.out.println(v.capacity()); // 초기용량 : 10
		System.out.println(v.size()); // 요소갯수(크기) : 0 
		
		v.addElement("최승호");
		v.add("최인석");
		v.add("김민선");
		
		System.out.println(v.size()); // 요소갯수(크기) : 3
		
		v.trimToSize();
		System.out.println(v.capacity()); // 용량 : 3
		
		v.add("홍길동");
		System.out.println(v.capacity()); // 용량 : 6
		System.out.println(v.size()); // 요소갯수(크기) : 4
		
		v.ensureCapacity(10);
		System.out.println(v.capacity()); // 용량 : 12
		
		// 첫번쨰 요소 얻어오기
		System.out.println(v.get(0));
		System.out.println(v.elementAt(0)); // 위와 동일한 코드이지만 동기화처리가 되어있는 코드임
		
		// 열거자
		Enumeration en = v.elements();
		while (en.hasMoreElements()) { // true/false 요소를 더 가지고 있냐?
			String name = (String) en.nextElement(); // 다음 요소를 얻어와라
			System.out.println(name);
		}
		
		// 열거자와 반복자의 차이점
		// 반복자 : 반복적으로 요소를 처리 중에 요소가 수정,삭제,추가가 일어나면 
		//		  예외를 발생시킴
		
		v.remove(0);
		
		// 첫번째요소
		v.firstElement();
		v.get(0);
		v.elementAt(0);
		
		// 마지막요소
		v.lastElement();
		v.get(v.size()-1);
		
		v.trimToSize();
		
	} // main

} // class
