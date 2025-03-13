package days28;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex03 {
	
	public static void main(String[] args) {
		
		/*
		 * [람다식과 스트림(Stream)]
		 * 1. 자바의 IO(입출력) - 스트림(Stream) 이때의 스트림과는 다른 개념임 
		 * 2. (람다)스트림?
		 * 		ㄴ 많은 데이터 -> 배열, 컬렉션 사용 -> 처리
		 * 									  for
		 * 									  iterator 반복자
		 * 									  enumeration 열거자
		 * 		-> 표준화가 되어있지 않은(중복적인 처리 방법)걸 표준화 시키자
		 * 
		 * 3. 데이터 소스(배열, 컬렉션, 파일)가 무엇이든지 간에
		 * 	  스트림을 사용하게 되면 같은 방식으로 처리할 수 있다.
		 * 4. 스트림은 데이터 소스를 변경하지는 않는다.
		 * 5. 스트림은 일회용이다.
		 * 6. 스트림은 작업을 내부적으로 반복 처리 한다. 
		 * 7. 스트림은 미리 데이터를 다루는 메서드를 정의해 놓았다.
		 * 		s2
		 * 			.sorted()
		 * 			.forEach(System.out::println);
		 * 
		 * */
		
		String [] strArr = {"aaa", "bbb", "ccc"};
		// for문 사용처리
		
		List<String> strList = Arrays.asList("aaa", "bbb", "ccc");
		// iterator 반복자로 처리
		
		// 두개의 다른것을 스트림으로 동일하게 변환시켜서 일괄적으로 똑같이 처리한다
		// 배열 -> 스트림변환
		Stream<String> s1 = Arrays.stream(strArr);
		// 컬렉션 -> 스트림 변환
		Stream<String> s2 = strList.stream();
		
		// 많은 데이터가 어떤형태이든간에 스트림으로 변환하면 처리방식을 동일하게 처리할 수 있다.
		s1.sorted().forEach(System.out::println);
		// s1.forEach(System.out::println); // 스트림은 일회성이기 때문에 한번 더 사용 x
		
		s2.sorted().forEach(System.out::println);
		
	} // main

} // class
