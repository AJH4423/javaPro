package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex09_03 {

	// 읽어온 파일 내용 각 라인에 번호 붙이기
	public static void main(String[] args) {

		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days17\\16일차복습_홍길동.txt";
		int one;
		int lineNumber = 1;
		
		try(FileReader reader = new FileReader(fileName) ) {
			System.out.printf("%d :", lineNumber++);
			while ((one = reader.read()) != -1) { // 파일 내용 읽어오는 코드
				System.out.printf("%c", (char)one);
				// 13('\r'), 10('\n') 개행
				if (one == 10) {
					System.out.printf("%d : ", lineNumber++);
				} // if
			}
		} catch (FileNotFoundException e) { // main문에선 throws보다는 try-catch로 해결
			e.printStackTrace();
		} catch (Exception e) { // Exception은 모든 예외를 나타내줌
			System.out.println(e.toString());
		}
		
		System.out.println("end");

	} // main

} // class
