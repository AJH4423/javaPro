package days28;

import java.util.function.Function;
import java.util.function.Predicate;

public class Ex01 {
	
	public static void main(String[] args) {
		
		// [1]
		/*
		// f : 16진수 형태의 문자열을 입력받아서 int 변환해서 반환하는 것
		Function<String, Integer> f = s -> Integer.parseInt(s, 16);
		// g : int 입력받아서 2진수 문자열로 반환하는것
		Function<Integer, String> g = i -> Integer.toBinaryString(i);
		
		// 1)f 2)g  Function결합 : 1 andThen(2)
		// f.andThen(g) : f람다식이 실행된뒤에 g람다식이 실행된다
		Function<String, String> h = f.andThen(g); // 순서 f -> g
		Function<String, String> h2 = f.compose(g); // 순서 g-> f
		System.out.println(h.apply("FF"));
		System.out.println(h2.apply(2));
		*/
		
		//[2] Predicate 조건 결합 
		/*
		// and() : &&,  or() : ||,  negate() : !
		Predicate<Integer> p = i -> i<100;
		Predicate<Integer> q = i -> i<200;
		Predicate<Integer> r = i -> i%2==0;
		Predicate<Integer> notP = p.negate(); // 부정
		
		//                        t   &&  t || t
		Predicate<Integer> all = notP.and(q.or(r)); 
		System.out.println(all.test(150));
		*/
		
		// [3]
		String s1 = "abc";
		String s2 = "abc";
		
		Predicate<String> p2 = Predicate.isEqual(s1);
		boolean result = p2.test(s2); // s1.equals(s2);
		System.out.println(result);
		
	
	} // main

} // class
