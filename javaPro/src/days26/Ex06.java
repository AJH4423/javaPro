package days26;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex06 {
	
	public static void main(String[] args) {
		
		// [직렬화(Serialization)/ 역직렬화(Deserialization)]
		/*
		 * 	객체 -> 읽기 -> 파일(메모리)
		 * 		  쓰기
		 * 
		 * 	네트워크 객체 전송(쓰기)/수신(읽기)
		 * 	1. 위와 같은 상황이 필요할때 직렬화/역직렬화가 필요
		 * 
		 *  2. 직렬화: 객체(Object)를 입출력하기 위해서 스트림으로 만드는 것
		 *     역직렬화: 스트림 -> 객체로 만드는 것 
		 * 	3. 자바에서는 객체를 입/출력하는 바이트 스트림을 제공
		 * 		ㄴ ObjectInputStream
		 * 		ㄴ ObjectOutputStream
		 * 	
		 * */
		
		UserInfo u1 = new UserInfo("홍길동", "1234", 25);
		UserInfo u2 = new UserInfo("권태정", "3412", 28);
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		list.add(u1);
		list.add(u2);
		
		String name = ".\\src\\days26\\UserInfo.ser";
		try(FileOutputStream fos = new FileOutputStream(name);
			ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			// java.io.NotSerializableException
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			
			oos.flush();
			System.out.println("u1,u2 객체를 직렬화해서 파일로 저장.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class
