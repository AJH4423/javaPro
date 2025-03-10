package days25;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;


public class Ex01_02 {
	
	public static void main(String[] args) {
		
		String fileName = ".\\src\\days24\\Ex01.java"; //복사항 원본 파일
		String copyFileName = ".\\src\\days24\\CopyEx01.java"; // 파일명
		
		// 처리시간: 7744500 ns
		fileCopy_textStream(fileName, copyFileName); // 파일 복사 메서드
		
		// 클래스명변경() 메서드 만들어보기 - days20 Ex05_03참고
		
		System.out.println("end");
		
	} // main

	private static void fileCopy_textStream(String source, String target) {
		
		long start = System.nanoTime();
		
		int code;
		try(FileReader reader = new FileReader(source);
				BufferedReader br = new BufferedReader(reader);
				FileWriter writer = new FileWriter(target);) {
			
			while ((code = reader.read()) != -1) {
				System.out.print((char)code);
				writer.write(code);
			}
			
			writer.flush(); 
			// flush() : 스트림에 남아있는 빈 공간까지 모두 쓰기작업을 마치고 스트림을 비우는 메서드
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		
		System.out.printf("처리시간: %d ns\n", (end-start));
		
	}

} // class
