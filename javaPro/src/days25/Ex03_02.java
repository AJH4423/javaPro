package days25;

import java.io.BufferedReader;
import java.io.StringReader;

public class Ex03_02 {
	
	public static void main(String[] args) {
		
		// [String String[R]/ String[W]]
		String source = "package days25;\r\n"
				+ "\r\n"
				+ "import java.io.BufferedReader;\r\n"
				+ "import java.io.File;\r\n"
				+ "import java.io.FileReader;\r\n"
				+ "import java.io.FileWriter;\r\n"
				+ "import java.util.Date;\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "public class Ex01_02 {\r\n"
				+ "	\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		\r\n"
				+ "		String fileName = \".\\\\src\\\\days24\\\\Ex01.java\"; //복사항 원본 파일\r\n"
				+ "		String copyFileName = \".\\\\src\\\\days24\\\\CopyEx01.java\"; // 파일명\r\n"
				+ "		\r\n"
				+ "		// 처리시간: 7744500 ns\r\n"
				+ "		fileCopy_textStream(fileName, copyFileName); // 파일 복사 메서드\r\n"
				+ "		\r\n"
				+ "		// 클래스명변경() 메서드 만들어보기 - days20 Ex05_03참고\r\n"
				+ "		\r\n"
				+ "		System.out.println(\"end\");\r\n"
				+ "		\r\n"
				+ "	} // main\r\n"
				+ "\r\n"
				+ "	private static void fileCopy_textStream(String source, String target) {\r\n"
				+ "		\r\n"
				+ "		long start = System.nanoTime();\r\n"
				+ "		\r\n"
				+ "		int code;\r\n"
				+ "		try(FileReader reader = new FileReader(source);\r\n"
				+ "				BufferedReader br = new BufferedReader(reader);\r\n"
				+ "				FileWriter writer = new FileWriter(target);) {\r\n"
				+ "			\r\n"
				+ "			while ((code = reader.read()) != -1) {\r\n"
				+ "				System.out.print((char)code);\r\n"
				+ "				writer.write(code);\r\n"
				+ "			}\r\n"
				+ "			\r\n"
				+ "			writer.flush(); \r\n"
				+ "			// flush() : 스트림에 남아있는 빈 공간까지 모두 쓰기작업을 마치고 스트림을 비우는 메서드\r\n"
				+ "			\r\n"
				+ "			\r\n"
				+ "		} catch (Exception e) {\r\n"
				+ "			System.out.println(e.toString());\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		long end = System.nanoTime();\r\n"
				+ "		\r\n"
				+ "		System.out.printf(\"처리시간: %d ns\\n\", (end-start));\r\n"
				+ "		\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "} // class\r\n"
				+ "";
		
		// System.out.println(source);
		
		//[문제] source문자열에서 20번째 라인의 문자열을 찾아서 출력
		
		/*[1]
		String [] sArr = source.split("\r\n");
		System.out.println(sArr[19]);
		*/
		
		//[2] 메모리 스트림 - StringReader/StringWriter
		// 문자열 -> 문자스트림 => BufferedReader 보조스트림
		try(
			StringReader sr = new StringReader(source);
			BufferedReader br = new BufferedReader(sr);
				) {
			int i =1;
			while (i++ <= 19) {
				//br.readLine();
				String line20 = br.readLine();
				System.out.println(line20);
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
			
	} // main

}
