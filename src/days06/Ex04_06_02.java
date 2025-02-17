package days06;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Ex04_06_02 {

	public static void main(String[] args) {
		// 람다식과 스트림(stream)
	      int [] m = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29};
	      
	      // int[] -> int스트림 변환
	      OptionalInt max = IntStream.of(m).max();
	      
	      // getAsInt() : OptionalInt -> int
	      if(max.isPresent()) {
	    	  System.out.println(max.getAsInt());
	      }
	      
	      //[2]
	      // max = new Random().ints(0,101).limit(10).max(); -> 0~101 사이 수중 10개를 골라 가장 큰수 출력


	} // main

}
