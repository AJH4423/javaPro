package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Ex04_02 {

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
		String className;            
		String url;                  
		String user;                                                                  
		String password; 

		// 파일에 내용저장
		String fileName = "oracle.config";

		try(FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader)) {

			className = br.readLine().split("=")[1];
			url = br.readLine().split("=")[1];
			user = br.readLine().split("=")[1];
			password = br.readLine().split("=")[1];
			
			System.out.println(className);
			System.out.println(url);
			System.out.println(user);
			System.out.println(password);
			
			System.out.println("end");
			// 실행시키면 javaPro파일에 파일이 하나생김

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	} // main

}
