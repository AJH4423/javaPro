package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex02 {

	public static void main(String[] args) {

		// String pathname = "."; // javaPro 폴더를 나타냄	
		String pathname = System.getProperty("user.dir"); // javaPro 폴더
		//String pathname = ".\\src\\days24";	
		// [재귀함수를 이용해서 파일검색]
		File parent = new File(pathname);
		String word = "HashMap";

		quickSearch(parent, word);

		System.out.println("end");


	} // main

	private static void quickSearch(File parent, String word) {

		File [] list = parent.listFiles(); // parent의 하위목록 가져옴
		File f = null;
		String line = null;
		int lineNumber = 1;

		for (int i = 0; i < list.length; i++) {
			f = list[i];

			if (f.isDirectory()) { // 하위폴더
				quickSearch(f, word); // 재귀 이용
			} else { // 파일

				lineNumber = 1;
				String fileName = f.getName();


				try(FileReader reader = new FileReader(f);
						BufferedReader br = new BufferedReader(reader);
						) {

					while ((line = br.readLine())!=null) {
						if( line.contains(word)) {
							System.out.printf("%s", f);
							line = line.replaceAll(word, "["+word+"]");
							System.out.printf("[ %d ] : %s\n", lineNumber++, line);      
						} // if
					} // while


				} catch (Exception e) {
					e.printStackTrace();
				}				
			}

		} // for i

	} // quickSearch

} // class
