package days10;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int n = 10;
		System.out.println(binaryConvert(n));

	} // main

	public static String binaryConvert(int n) {

		int share, rest; // 몫, 나머지 변수
		String binary = "";
		while ( n != 0 ) {
			rest = n % 2;
			share = n / 2;
			System.out.println( rest );
			binary = rest + binary;
			n = share;
		} // while

			// System.out.println( binary );
		//                  1010
		return String.format("%s%s"
				, "0".repeat( 8- binary.length()), binary);
	}

} // class
