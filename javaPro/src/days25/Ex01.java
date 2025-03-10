package days25;

import java.io.File;
import java.io.FileReader;
import java.util.Date;


public class Ex01 {
	
	public static void main(String[] args) {
		
		/*
		 * [스트림]
		 * 	ㄴ 문자 스트림, 바이트 스트림
		 * 	ㄴ 보조스트림
		 * 
		 * [문자(텍스트)를 다루는 스트림]
		 * FileReader/ FileWriter 
		 * + 
		 * File 클래스: 파일, 디럭트로(폴더)를 다루는(생성,삭제,수정,정보 엍어오기 등등) 클래스
		 * */
		
		/*[1]
		String pathname = ".\\src\\days24\\Ex01.java"; // 폴더가아닌 파일이다.
		File f = new File(pathname);
		
		System.out.println(f.isDirectory()); // false -> pathname이 폴더이냐?
		System.out.println(f.isFile()); // true -> pathname이 파일이냐?
		
		System.out.println(f.length()); // long 2945bytes -> 파일의 크기를 나타냄
		*/
		
		//[2]
		String parent = ".\\src\\days24"; //디렉토리(폴더)
		String child = "Ex01.java"; // 파일명
		File f = new File(parent, child);
		
		/*
		// 마지막 수정된 날짜. long형값
		System.out.println(f.lastModified()); // 1741313019983
		Date d = new Date(f.lastModified());
		System.out.println(d.toLocaleString()); // 2025. 3. 7. 오전 11:03:39
		// 날짜 -> 형식화 클래스 사용.
		*/
		int code;
		try(FileReader reader = new FileReader(f)) {
			
			while ((code = reader.read()) != -1) {
				System.out.print((char)code);
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		
	} // main

} // class
