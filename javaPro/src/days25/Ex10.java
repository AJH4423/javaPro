package days25;

import java.io.File;
import java.io.IOException;

import com.util.FileUtil;

public class Ex10 {
	
	public static void main(String[] args) throws IOException {
		
		// File 클래스
		String pathname = ".\\src\\days25\\Ex01.java";
		File f = new File(pathname);
		
		//절대경로
		// String pathname = "C:\Class\JavaClass\javaPro\src\days25\\Ex01.java";
		
		if (f.exists()) { // 파일 존재 유무 체크
			System.out.println(f.isDirectory()); // false
			System.out.println(f.isFile()); // true
			System.out.println(f.length() + "(bytes)"); // 1561(bytes)
		} // if
		
		System.out.println(File.separator); // \(역슬래쉬) : 경로 구분자
		System.out.println(File.pathSeparator); // ;
		
		// 
		String fileName = f.getName();
		System.out.println(fileName); // Ex01.java
		
		// 확장자 .java
		// 순수 확장자를 제외한 파일명 Ex01
		int pos = fileName.indexOf(".");
		String ext = fileName.substring(pos);
		System.out.println(ext);
		String basefileName = fileName.substring(0, pos);
		System.out.println(basefileName);
		// FileUtil
		System.out.println("=".repeat(60));
		
		System.out.println(fileName = FileUtil.getFileName(f));
		System.out.println(FileUtil.getBaseName(fileName));
		System.out.println(FileUtil.getExtension(fileName));
		
		System.out.println("=".repeat(60));
		// 파일의 경로를 반환하는 메서드
		System.out.println(f.getPath()); // 경로
		System.out.println(f.getAbsolutePath()); // 절대경로 
		System.out.println(f.getCanonicalPath()); // 표준경로
		
		System.out.println("=".repeat(60));
		File pf = f.getParentFile();
		System.out.println(pf); // .\src\days25
		System.out.println(f.getParent()); // .\src\days25
		
	} // main

} // class
