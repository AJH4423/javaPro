package days26;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Ex04_02 {
	
	public static void main(String[] args) throws IOException {
		
		// days25.Ex08 + days25.Ex02_02 참고
		// 분할된 파일을 합쳐서 시간표.pdf 생성
		Vector<FileInputStream> v = new Vector<>();
		
		for (int i = 1; i <= 10; i++) {
			v.add(new FileInputStream(".\\src\\days25\\시간표-" + i +".pdf"));
		} // for i
		
		Enumeration<FileInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		
		String name = ".\\src\\days26\\시간표.pdf";
		FileOutputStream fos = new FileOutputStream(name);
		
		int b;
		while ((b = sis.read()) != -1) {
			fos.write(b);
		}
		
		fos.close();
		
		System.out.println("end");
		
	} // main

} // class
