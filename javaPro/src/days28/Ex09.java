package days28;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex09 {

	public static void main(String[] args) {

		// [flatMap()]
		// 평평한, 평탄한
		// 	ㄴ 스트림의 요소가 배열인 경우 스트림의 타입이 
		// 	  Stream<T[]> -> flatMap() -> Stream<T>
		// 	  Stream<Stream> -> flatMap() -> Stream<T>

		String [] lineArr = {
				"Belive or not It is true", 
				"Do or do not There is no try"
		};

		// String [] -> Stream 변환
		Stream<String> lineSt = Arrays.stream(lineArr);
		
		// 1. map()
		// line -> Stream.of(line.split(" +" )) 코딩의 의미 : 
		// Stream<Stream<String>> ss1 = lineSt.map(line -> Stream.of(line.split(" +" )));
		
		Stream<String> ss2 = lineSt.flatMap(line -> Stream.of(line.split(" +" )));
		ss2.forEach(System.out::println);
		
	} // main

} // class
