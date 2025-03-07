package days24;

import java.io.FileWriter;
import java.util.Properties;

public class Ex04 {

	public static void main(String[] args) {

		/*
		 * Map - Hashtable(구) - 동기화처리 되어있음
		 * 	     HashMap(신) 권장 - 동디화처리 안되어있음 ***(많이쓰임)
		 * 		 LinkedHashMap
		 * 		 TreeMap
		 * 		 Properties 컬렉션 클래스  ***(많이쓰임)	
		 * 			ㄴ entry(key+value)로 데이터 저장하는 Map계열의 컬렉션 클래스
		 * 			ㄴ 주로 설정 파일(???.properties)을 읽고 쓰는데 사용되는 컬렉션 클래스 
		 * 					ㄴ 파일을 읽고 쓰는 메서드가 제공된다
		 * 			ㄴ Hashtable의 자식 클래스이다
		 * 			ㄴ String key, String value -> key,value의 자료형은 무조건 Stringd이다
		 * 
		 * */ 

		Properties p = new Properties();

		// Oracle DBMS
		// DB 연결 문자열(설정값) - 오라클에 연결하기위해 필요한 연결정보
		String className = "oracle.jdbc.driver.OracleDriver"; // JDBC드라이버           
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";  

		// 파일에 내용저장
		String fileName = "oracle.config";

		try(FileWriter writer = new FileWriter(fileName)) {

			// writer.append(CharSequence csq);
			// writer.write(String str);
			writer.write(String.format("%s=%s\r\n", "className", className));
			writer.write(String.format("%s=%s\r\n", "url", url));
			writer.write(String.format("%s=%s\r\n", "user", user));
			writer.write(String.format("%s=%s\r\n", "password", password));


			writer.close(); //저장
			System.out.println("end");
			// 실행시키면 javaPro파일에 파일이 하나생김

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	} // main

}
