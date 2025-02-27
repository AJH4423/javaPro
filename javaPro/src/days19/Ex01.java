package days19;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex01 {

	public static void main(String[] args) {

		String fileName = "C:\\Users\\user\\Documents\\카카오톡 받은 파일\\복습문제\\학생명단.txt";
		int one;
		int lineNumber = 1;

		try(FileReader reader = new FileReader(fileName) ) {
			System.out.printf("%d :", lineNumber++);
			while ((one = reader.read()) != -1) { 
				System.out.printf("%c", (char)one); 
				if (one == 10) {
					System.out.printf("%d : ", lineNumber++);
				} // if
			}
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (Exception e) { 
			System.out.println(e.toString());
		}
		System.out.println();
		System.out.println("end");


	} // main

} // class
