package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 문제) 국어점수를 키보드로 부터 입력받아서
		// 변수에 저장하고
		// "국어=90" 이라고 출력하는 코딩을 하자.		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		String kor;
//		
//		System.out.print("점수를 입력하세요: ");
//		kor = br.readLine();
//		System.out.printf("국어 = %s", kor);
		
		//kor 자료형을 byte로 해결
		byte kor;
		
		System.out.print("점수를 입력하세요: ");
//		String strkor = br.readLine();
//		kor = Byte.parseByte(strkor); // String -> byte 형(자료형)변환
		
		kor = Byte.parseByte(br.readLine());
		System.out.printf("국어 = %d", kor);
		

	}

}
