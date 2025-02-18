package days06;

import java.util.Random;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// [암기] 람다식과 스트림
		// Random클래스 이용하여 로또번호 6개 출력하기
		new Random().ints(1,46).distinct().limit(6).forEach(System.out::println);
			
	} // main

}
