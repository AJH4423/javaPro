package days25;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex02 {

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

		// 처리시간: 258739499 ns
		fileCopy_byteStream(fileName, copyFileName);

	} // main

	private static void fileCopy_byteStream(String source, String target) {

		long start = System.nanoTime();

		int code;
		try(FileInputStream reader = new FileInputStream(source);
				FileOutputStream writer = new FileOutputStream(target);) {

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
