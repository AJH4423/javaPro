package days29;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02 {

	public static void main(String[] args) {

		/*
		 * [스트림의 최종연산]
		 *     1) forEach() - peek() 메서드와 달리 스트림의 요소를 소모하면서 처리되는 최종 연산. 
		 *     2) 조건 검사 - allMatch(), anyMatch(), noneMatch(), findFirst(), findAny()
		 *     3) 통계 - count(), sum(), average(), max(), min()
		 *     4) 리듀싱 - reduce()
		 *       (1) 스트림의 요소를 줄여나가면서 연산을 수행하고 최종결과를 반환한다.
		 *       (2) 매개변수의 타입 - BinaryOperator<T> 
		 * */

		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};
		// String [] -> Stream변환 
		Stream.of(strArr).forEach(System.out::println);
		// 조건 검사 최종 연산 : allMatch(), anyMatch(), noneMatch() -> true/false
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length() > 5);
		System.out.println(noEmptyStr);
		Optional<String> sword = Stream.of(strArr).filter(s->s.charAt(0)=='s').findFirst();
		System.out.println(sword.get());

		// String<String> -> IntStream으로 변환
		IntStream is1 = Stream.of(strArr).mapToInt(String::length); 
		IntStream is2 = Stream.of(strArr).mapToInt(String::length); 
		IntStream is3 = Stream.of(strArr).mapToInt(String::length);
		IntStream is4 = Stream.of(strArr).mapToInt(String::length);
		// 스트림의 요소 개수
		// is1.count();
		int count = is1.reduce(0, (a,b)->a+1); // 0은 배열의 첫번째값과 비교하기위함
		// 배열안의 값을 제거해나가면서 0부터 1씩 증가시킨다.
		// 즉, 값을 제거할때마다 1씩 증가시키기 때문에 배열의 길이를 알수있음.
		System.out.println(count);

		// 문자열 총길이
		// is2.sum();
		int sum = is2.reduce(0, (a,b)->a+b);
		System.out.println(sum);

		// max값
		// is3.max();
		//int max = is3.reduce(0, (a,b)->a>b?a:b);
		OptionalInt max = is3.reduce(Integer::max);
		System.out.println(max.getAsInt());

		// min값
		int min = is4.reduce(Integer.MAX_VALUE, (a,b)->a>b?b:a);
		System.out.println(min);

	} // main

} // class
