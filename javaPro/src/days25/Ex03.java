package days25;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex03 {
	
	public static void main(String[] args) {
		
		/*
		 * [메모리 스트림]
		 * 	ㄴ 주로 다른곳에 입,출력 하기전에 메모리 상에 데이터를 임시로 저장해서 사용할 목적의 스트림. 
		 * 
		 * 1. byte	ByteArray[IS]/ ByteArray[OS] 바이트스트림
		 * 2. char	CharArray[R]/ CharArray[W] 문자스트림
		 * 3. String String[R]/ String[W]  문자스트림 ***
		 * 
		 */
		
		byte [] buf = {0,1,2,3,4,5,6,7,8,9};
		
		try(ByteArrayInputStream bais = new ByteArrayInputStream(buf);
				ByteArrayOutputStream baos =  new ByteArrayOutputStream();) {
			
			int b;
			while ((b = bais.read()) != -1) { // b는 읽는 파일의 마지막을 읽으면 -1을 반환한다
				System.out.println(b);
				baos.write(b);
			}
			
			byte [] outbuf = baos.toByteArray();
			System.out.println(Arrays.toString(outbuf));
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		 
		
	} // main

} // class
