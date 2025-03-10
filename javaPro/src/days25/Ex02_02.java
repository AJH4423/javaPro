package days25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex02_02 {

	public static void main(String[] args) {

		/*
		 * [exe파일 복사]
		 * 문자 스트림 x
		 * 바이트 스트림 o (파일)
		 * FileInputStream/ FileOutputStream
		 * BufferedINputStream/ BufferedOutputStream
		 * 
		 * */

		String fileName = "C:\\Users\\user\\Pictures\\Screenshots\\스크린샷 2025-02-03 144156.png";
		String copyFileName = ".\\스크린샷 2025-02-03 144156.png";

		// 처리시간: 962200 ns
		fileCopy_byteStream(fileName, copyFileName);

	} // main

	private static void fileCopy_byteStream(String source, String target) {

		long start = System.nanoTime();
		final int BUFFER_SIZE = 1024;

		int code;
		try(FileInputStream reader = new FileInputStream(source);
				FileOutputStream writer = new FileOutputStream(target);
				BufferedInputStream bis = new BufferedInputStream(reader, BUFFER_SIZE);
				BufferedOutputStream bos = new BufferedOutputStream(writer, BUFFER_SIZE)) {

			byte [] b = new byte[BUFFER_SIZE];
			
			int n = -1; // 읽어온 바이트 수를 저장할 변수
			while ((n = bis.read(b)) != -1) {
				bos.write(b,0,n);
			}
			bos.flush();


		} catch (Exception e) {
			System.out.println(e.toString());
		}

		long end = System.nanoTime();

		System.out.printf("처리시간: %d ns\n", (end-start));

	}

} // class
