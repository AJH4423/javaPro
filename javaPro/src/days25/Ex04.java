package days25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04 {
	
	public static void main(String[] args) throws IOException {
		
		// 키보드로부터 한 문자 입력..
		// System.in.read();
		// 표준입력장치(키보드) -> 입력 바이트스트림
		
		/*[1]
		InputStream is = System.in;
		System.out.print("한 문자 입력: ");
		int b = is.read();
		System.out.printf("%d-%c",b,b);
		*/
		
		/*
		//[2]	
		// InputStream System.in : 바이트스트림
		// InputStrean[Reader] 클래스 : 문자스트림
		// Buffered[Reader] 클래스 : 문자스트림
		
		// 키보드 -> System.in 표준스트림 : 바이트스트림
		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("이름을 입력: ");
		name = br.readLine();
		System.out.println(name);
		*/
		
		//[3]
		InputStream is = System.in;
		System.out.print("한 문자 입력: ");
//		int b = is.read();
//		System.out.printf("%d-%c",b,b);
		
		byte [] b = new byte[3];
		int n = is.read(b);
		
		for (byte c : b) {
			System.out.println(c);
		}
		
		char one  = new String(b).charAt(0);
		System.out.println(one);
		
	} // main

} // class
