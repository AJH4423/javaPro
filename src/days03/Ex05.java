package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 문제) 키보드로 부터 이름을 입력받아서 출력
		String name = null;
		
		/*
		 * 표준입력장치
		 * [키보드] -> [System.in] -> InputStreamReader -> BufferReader
		 * "이름" 엔터
		 * 
		 * String name = br.readLine();
		 * 
		 * */
		
		// 키보드로 입력값 입력받는 코드 --> 외울것
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner 클래스도 있지만 나중에 IO교육과정에서 이해하기 쉽도록 현재는 IO로 쓰는것
		
		System.out.print("이름 입력: ");
		// Unhandled exception type IOException -> 예외발생에 대한 자동적으로 오류를 체크하고있음
		name = br.readLine(); //readLine에 빨간줄이 생기면 오류문구 밑에 해결안 클릭
		
		System.out.printf("이름 = %s\n", name);

	}

}
