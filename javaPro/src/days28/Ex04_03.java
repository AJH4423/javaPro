package days28;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex04_03 {
	
	public static void main(String[] args) {
		

		// [특정 범위의 정수 -> 스트림]

		/*
		// 1,2,3,4
		IntStream is1 = IntStream.range(1, 5);
		// 1,2,3,4,5
		IntStream is2 = IntStream.rangeClosed(1, 5);
		*/
		
		//[임의의 수(난수) 생성] - Random 클래스
		IntStream is3 = new Random().ints();
		LongStream is4 = new Random().longs();
		DoubleStream is5 = new Random().doubles();
		
		IntStream lotto = new Random().ints(1, 46).distinct().limit(6); // 중복되지않는 로또번호 6개
		// lotto.forEach(System.out::println);
		
		// IntStream(기본형 스트림) -> 스트림
		Stream<String> slotto = lotto.sorted().mapToObj(i -> i + " / ");
		slotto.forEach(System.out::print);
		
	} // main

} // class
