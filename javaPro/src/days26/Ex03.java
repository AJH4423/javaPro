package days26;

import java.io.File;

public class Ex03 {

	public static void main(String[] args) {

		// days25.Ex10_05 참고
		// [문제1]
		/* javaPro 폴더
		 * 	ㄴ temp폴더 생성
		 * 		ㄴ 1조 폴더 생성
		 * 		ㄴ 2조 폴더 생성
		 * 		ㄴ 3조 폴더 생성
		 * 
		 * [문제2]
		 * javaPro\\temp 폴더 삭제
		 * 
		 * */

		// 내가짠 코드
		/*
		String pathname = ".";
		File parent = new File(pathname);
		File upload = new File(parent, "temp");

		File upload2 = new File(upload, "2조");

		if (!upload.exists()) {
			// upload 폴더 생성
			// upload.mkdir();
			// upload.mkdirs();
			System.out.println(upload.mkdirs());
			System.out.println(upload2.mkdirs());
		} else {
			deleteDirectory(upload);
			System.out.println(upload.delete());
			// System.out.println(upload2.delete());
		}
		 */

		//[2]
		String pathname = ".";  // javaPro 폴더
		File parent = new File(pathname);      

		for (int i = 1; i <= 3; i++) {
			File f = new File(parent, String.format("temp\\%d조", i) );
			f.mkdirs();
		} // for i


		// [문제2]
		//    javaPro\\temp 폴더 삭제. 

		File temp = new File(".\\temp"); 
		directoryDelete(temp);

		System.out.println(" end ");


		System.out.println("end");


	} // main

	/* 내가짠 메서드
	public static boolean deleteDirectory(File directory) {
        // 디렉토리 안에 파일이나 폴더가 있다면 먼저 삭제
        if (directory.isDirectory()) {
            String[] files = directory.list();
            for (String file : files) {
                File subFile = new File(directory, file);
                deleteDirectory(subFile); // 재귀적으로 삭제
            }
        }
        // 파일이나 비어있는 디렉토리를 삭제
        return directory.delete();
    }
	 */
	
	//[2]
	private static void directoryDelete(File f) {
		while(  !f.delete() ) {
			// 하위 목록 
			File[] list =    f.listFiles();
			for (int i = 0; i < list.length; i++) {            
				if(  list[i].delete() ) {
					System.out.printf( "%s 삭제 완료!!!\n", list[i] );
				}else {
					// 하위 폴더 존재
					directoryDelete(list[i]);
				} 
			}
		}  
	}


} // class
