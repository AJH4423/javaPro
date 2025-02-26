package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex09_05 {
	
	public static void main(String[] args) {
		
		// 외우기
		// C:\Class\JavaClass\javaPro
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		
		
		//   . 상대경로 - 현재 디렉토리 -> javaPro
		//   .. 상대경로 - 상위 디렉토리
		//String fileName = ".\\src\\days01\\Ex01.java";
		String fileName = dir + "\\.classPath";
		//String fileName = ".classPath"; // 위 경로와 이 코드는 같은 의미이다
										  // 파일명만 주면 현재 디렉토리에서 찾게된다
		//String fileName = ".\\..\\Sample.java";
		String line = null;
		int lineNumber = 1;
		
		try(FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);	) {
			//BufferdReader는 파일의 마지막에 가면 -1이아닌 null을 되돌려줌			
			while((line = br.readLine()) != null) {
			System.out.printf("%d : %s\n",lineNumber++,line);
			}
		} catch (FileNotFoundException e) { // main문에선 throws보다는 try-catch로 해결
			e.printStackTrace();
		} catch (Exception e) { // Exception은 모든 예외를 나타내줌
			System.out.println(e.toString());
		}
		
		System.out.println("end");
		
	} // main

} // class
