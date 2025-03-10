package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;


public class Ex01_03 {
	
	public static void main(String[] args) {
		
		// BufferedReader/ BufferedWriter 보조 스트림을 사용해서 복사
		
		String fileName = ".\\src\\days24\\Ex01.java"; //복사항 원본 파일
		String copyFileName = ".\\src\\days24\\CopyEx01.java"; // 파일명
		
		// 처리시간: 1018900 ns
		fileCopy_textStream(fileName, copyFileName); // 파일 복사 메서드
		
		
		System.out.println("end");
		
	} // main

	private static void fileCopy_textStream(String source, String target) {
		
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		
		int code;
		try(FileReader reader = new FileReader(source);
				FileWriter writer = new FileWriter(target);
				BufferedReader br = new BufferedReader(reader, BUFFER_SIZE);
				// 1024인 buffer사이즈만큼 읽겠다
				BufferedWriter bw = new BufferedWriter(writer, BUFFER_SIZE);
				// 1024인 buffer사이즈만큼 쓰겠다
				) {
			// [1]	
			/*
			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line + "\r\n");
			}
			*/
			
			// [2] 1024 버퍼크기만큼 읽고 쓰기(이해하기)
			char [] cbuf = new char[BUFFER_SIZE];//읽어와서 저장되는 기억공간
			int n = -1; // 실제 읽어온 문자수 : 1030의 크기는 1024 + 6의 갯수로 읽어온다
			while ( (n=br.read(cbuf)) != -1 ) {
				bw.write(cbuf, 0, n); // 0번째에서 n번째까지 쓰겠다
			}
			bw.flush();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		
		System.out.printf("처리시간: %d ns\n", (end-start));
		
	}

} // class
