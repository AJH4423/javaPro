package days24;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class Ex05 {

	public static void main(String[] args) {
		
		// Oracle DBMS
		// DB 연결 문자열(설정값) - 오라클에 연결하기위해 필요한 연결정보
		//       key             value
		String className 		= "oracle.jdbc.driver.OracleDriver"; // JDBC드라이버           
		String url 				= "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user 			= "scott";                                                                   
		String password 		= "tiger";  

		// 파일에 내용저장	
		
		Properties p = new Properties();
		// p.put(Object key, Object value); -> 사용안함
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
		
		/**
		// {password=oracle.properties, className=oracle.properties, user=oracle.properties, url=oracle.properties}
		System.out.println(p);
		String fileName = "oracle.properties";
		// 위의 정보들을 fileName에 저장할것이다
		try(FileWriter writer = new FileWriter(fileName)) {
			String comments = "Oracle ConnectionString"; // 주석처리
			p.store(writer, comments);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		*/
		
		// XML 파일로 저장
		String fileName = "oracle.xml";

		try(FileOutputStream outputStream = new FileOutputStream(fileName)) {
			String comments = "Oracle ConnectionString"; // 주석처리
			p.storeToXML(outputStream, comments);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("end");

	} // main

}
