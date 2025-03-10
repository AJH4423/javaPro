package com.util;

import java.io.File;

public class FileUtil {

	// Ex01.java 파일명 반환하는 메서드
	public static String getFileName( File f) {
		String fileName = f.getName();
		return fileName;
	}
	
	// Ex01.java 파일명 반환하는 메서드
	public static String getFileName( String pathname ) {
		int idx =  pathname.lastIndexOf("\\");
		String fileName =     pathname.substring(idx+1);      
		return fileName;
	}

	// .java 확장자를 반환하는 메서드
	public static String getExtension(String fileName) {
		int idx = fileName.lastIndexOf(".");
		String ext =  fileName.substring(idx);
		return ext;
	}

	// 확장자를 제외한 순수파일명을 반환하는 메서드
	public static String getBaseName(String fileName) {
		int idx = fileName.lastIndexOf(".");
		String baseName =  fileName.substring(0, idx);
		return baseName;
	}

}
