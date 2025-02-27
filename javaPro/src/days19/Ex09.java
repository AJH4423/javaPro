package days19;

import java.util.Objects;
import java.util.Random;

public class Ex09 {
	
	public static void main(String[] args) {
		
		// java.util.Arrays 클래스
		// java.util.Random 클래스
		/*
		Random rnd = new Random();
		System.out.println(rnd.nextBoolean());
		System.out.println(rnd.nextInt()); // -21억~21억
		System.out.println(rnd.nextInt(10)); // 0<= int <10
		System.out.println(rnd.nextDouble());
		*/
		
		// java.util.Object 클래스
		// 		ㄴ Object의 보조 클래스
		// 		ㄴ static 멤버
		// if문 모두 동일한 코딩 -> 편한걸로 써도 무방
		Point p = null;
		if (p != null) {
			//
		}
		
		if (!Objects.isNull(p)) {
			
		} // if
		
		if (Objects.nonNull(p)) {
			
		} // if
		
		
		Point p2 = null;
		if (p != null && p.equals(p2) ) {
			
		} // if
		
		if (Objects.equals(p, p2)) {
			
		} // if
		
		System.out.println(Objects.toString(p2, "NULL"));
		
	} // main

} // class
