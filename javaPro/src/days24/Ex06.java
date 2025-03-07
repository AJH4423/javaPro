package days24;

import java.util.Enumeration;
import java.util.Properties;

public class Ex06 {
	
	public static void main(String[] args) {
		
		/*
		// C:\Class\JavaClass\javaPro
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		*/
		
		Properties p = System.getProperties();
		// 모든 키값 -> 열거자로 반환 메서드
		Enumeration<String> en = (Enumeration<String>) p.propertyNames();
		while (en.hasMoreElements()) {
			String key = en.nextElement();
			String value = p.getProperty(key);
			System.out.printf("%s=%s\n",key, value);
		}
		
	} // main

} // class
