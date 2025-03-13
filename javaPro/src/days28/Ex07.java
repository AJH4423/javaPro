package days28;

import java.io.File;
import java.util.stream.Stream;

public class Ex07 {

	public static void main(String[] args) {

		// [map() 스트림 변환]
		// 스트림의 요소에 저장된 값 중에서 원하는 요소(필드)만
		// 뽑아내거나 특정 형태로 변환해야 할 때 사용하는 메서드
		Stream<File> sf = Stream.of(				
				new File("Ex01"),
				new File("Ex01.bak"),
				new File("Ex02.java"),
				new File("Ex01.txt")
				);

		Stream<String> fnameSt = 
				sf.map(File::getName)
				.filter(s->s.indexOf('.') != -1) // '.'이 있는것만 가져오겠다
				.peek( s -> System.out.printf("filename=%s\n", s )) // '.'이 있는것만 출력
				
				.map(s->s.substring(s.indexOf('.')+1)) // 확장자만
				.peek( s -> System.out.printf("extension=%s\n", s ))
				.map(String::toUpperCase)  // 대문자 변환
				.distinct();
		;
		fnameSt.forEach(System.out::println);
		
		// peek() 조회
		// 연산 + 연산 사이에 올바르게 처리되었는지 확인하는 메서드

	} // main

} // class
