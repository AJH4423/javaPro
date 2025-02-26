package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex09_04 {

	// 읽어온 파일 내용 각 라인에 번호 붙이기
	public static void main(String[] args) {

		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days17\\16일차복습_홍길동.txt";
		String line = null;
		int lineNumber = 1;
		
		try(FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);	) {
			//BufferdReader는 파일의 마지막에 가면 -1이아닌 null을 되돌려줌			
			while((line = br.readLine()) != null) {
			System.out.printf("%d : %s\n",lineNumber++,line);
			}
		} catch (FileNotFoundException e) { // main문에선 throws보다는 try-catch로 해결
			e.printStackTrace();
		} catch (Exception e) { // Exception은 모든 예외를 나타내줌
			System.out.println(e.toString());
		}
		
		System.out.println("end");

	} // main

} // class
