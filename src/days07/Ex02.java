package days07;

import java.io.IOException;

public class Ex02 {
	
	public static void main(String[] args) throws IOException {
		
		char one;
		System.out.print("> 한 문자 입력 ? ");
		one = (char) System.in.read();
		System.out.printf("%c\n", one);
		
//		System.in.read(); // '\r'
//		System.in.read(); // '\n'
		
		System.in.skip(System.in.available());

		System.out.print("> 한 문자 입력 ? ");
		one = (char) System.in.read();
		System.out.printf("%c\n", one);

		
	} // main

}
