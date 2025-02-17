package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// [연산자 : instanceof 연산자]
		// >> >>> << 쉬프트 연산자
		//           ㄴ 방향을 바꾸다, 이동시키다, 옮기다.
		// >>=  <<=  복합대입연산자
		
//		System.out.println(15 >> 2); //00001111 >> 2  : 00000011(3)(두칸씩 옮기고 최상위비트의 수가 0이면 0으로 채움)
//		System.out.println(15 >>> 2); // 00000011(3) : (두칸 오른쪽으로 옮기고 무조건 0으로채움) 
//		System.out.println(15 << 2); // 00111100(60) : (두칸 왼쪽으로 옮김)
//		
//		String b = Integer.toBinaryString(15);
//
//		System.out.printf("%08d",Integer.parseInt(b));
		
		System.out.println(Integer.toOctalString(15)); // 8진수 문자열
		System.out.println(Integer.toHexString(15)); // 16진수 문자열

	}

}
