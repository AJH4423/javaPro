package days28;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04_02 {
	
	public static void main(String[] args) {
		
		int [] iArr = {34, 64, 22, 54, 11, 9 , 89, 13, 22, 34, 100};
		// 배열 -> 스트림
		// 1) Stream.of(T...args), Stream.of(T[] args)
		// 2) Arrays.stream(T [] args), Arrays.stream(T [] args, int sindex, int eindex)
		
		// [기본형 스트림]
		// IntStream is = Arrays.stream(iArr);
		// boxed()  int,int -> Integer, Integer 스트림
		// Stream<Integer> is = Arrays.stream(iArr).boxed();
		IntStream is = IntStream.of(iArr);
		// int sum = is.sum();
		// System.out.println(sum);
		
		// 3) int [] -> List 변환
		/*
		List<Integer> list = Arrays.stream(iArr).boxed().collect(Collectors.toList());
		*/
		
		/* 
		// 4) 위의 is 스트림을 사용해서... 50이상인 것만 필터링하자.
		IntStream filterIs = is.filter(t -> t>=50);
		filterIs.forEach(System.out::println); // 메서드 참조
		*/
		
		// 5) is 중복제거 -> 정렬 -> 3개가져오기
		/*
		IntStream is2 = is.distinct().sorted().limit(3);
		is2.forEach(System.out::println);
		*/
		
		// 6) is -> max,min 가져오기
		// OptionalInt<Integer>
		OptionalInt omax = is.max();
		System.out.println(omax.getAsInt());
		
		// 7) String [] -> String변환
		String [] strArr = {"aa", "bb", "cc"};
		Stream<String> ss = Stream.of(strArr);
		
	} // main

} // class
