package days23;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.IntStream;

public class Ex08_02 {

	public static void main(String[] args) {

		//[파일 읽어서 대,소문자 몇개인지 확인]
		String fileName = ".\\src\\days18\\Ex10.java";
		char one = '\u0000';
		int code = -1;

		//     'A'        10
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		
		for (int i = '0'; i <= 'z'; i++) {
			if (Character.isAlphabetic(i)||Character.isDigit(i)) {
				hm.put((char)i,0);
			} // if
		} // for i

		try(FileReader reader = new FileReader(fileName);) {

			while ((code = reader.read())!= -1) {
				// 'a'  ->  key  존재하면 ++1
				// if ([A-Za-z0-9]) {
				if(Character.isUpperCase(code)||Character.isLowerCase(code)||Character.isDigit(code)) {	
					one = (char)code; // key존재 유무 확인
					if (hm.containsKey(one)) {				
						int oldValue = hm.get(one);
						hm.put(one, ++oldValue);
					} else {
						// entry추가
						hm.put(one, 1);
					}					
				}
			}

			//막대그래프 그리기
			Set<Entry<Character, Integer>> es = hm.entrySet();
			Iterator<Entry<Character, Integer>> ir = es.iterator();
			while (ir.hasNext()) {
				Entry<Character, Integer> entry =  ir.next();
				char key = entry.getKey();
				int value = entry.getValue();
				System.out.printf("%c(%d) %s\n", key, value, "#".repeat(value));
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	} // main

} // class
