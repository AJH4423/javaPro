package days24;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Ex05_02 {

	public static void main(String[] args) {
		
		// Oracle DBMS
		// DB 연결 문자열(설정값) - 오라클에 연결하기위해 필요한 연결정보
		String className;            
		String url;                  
		String user;                                                                  
		String password; 

		// 파일에 내용저장
		//String fileName = "oracle.properties";
		String fileName = "oracle.xml";

		Properties p = new Properties();
		System.out.println(p);
		
		//[2]
		try(FileInputStream in = new FileInputStream(fileName)){
			p.loadFromXML(in);			
			
			System.out.println(p.getProperty("className"));
			System.out.println(p.getProperty("url"));
			System.out.println(p.getProperty("user"));
			System.out.println(p.getProperty("password"));

			System.out.println("end");

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		/*[1]
		try(FileReader reader = new FileReader(fileName);) {
			
			p.load(reader);
			
			System.out.println(p.getProperty("className"));
			System.out.println(p.getProperty("url"));
			System.out.println(p.getProperty("user"));
			System.out.println(p.getProperty("password"));

			System.out.println("end");

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		*/

	} // main

}
