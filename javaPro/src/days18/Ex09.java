package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {

		// [자동 자원 반환 : try-with-resource문]

		// "days17.16일차복습_홍길동.txt" 텍스트파일을 읽어와서 출력
		// ** FileReader 파일 읽기 클래스
		// FileWriter 파일 쓰기 클래스

		FileReader reader = null; // finally에서 객체, 즉 파일을 닫으려면 변수가 {}안에 있는
		// 지역변수가 아닌 전역으로 선언해야 사용가능하다
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days17\\16일차복습_홍길동.txt";
		int one;
		try {
			reader = new FileReader(fileName); //파일이 열려있음
			//one = reader.read();
			//System.out.println(one);
			while ((one = reader.read()) != -1) { // 파일 내용 읽어오는 코드
				System.out.printf("%c", (char)one);
			}
		} catch (FileNotFoundException e) { // main문에선 throws보다는 try-catch로 해결
			e.printStackTrace();
		} catch (Exception e) { // Exception은 모든 예외를 나타내줌
			System.out.println(e.toString());
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");

	} // main

} // class
