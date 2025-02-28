package days20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05_03 {
	
	public static void main(String[] args) {
		
		String source = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		String pattern = "홍길동";
		
		StringBuilder sb = new StringBuilder();
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		
		System.out.println(source);
		
		int cnt = 0;
		while (m.find()) {
			cnt++;
			System.out.printf("start:%d ~ end:%d\n", m.start(), m.end());
			if (cnt==2) {
				m.appendReplacement(sb, "안준호");
			} // if
		}
		m.appendTail(sb);
		System.out.println(sb.toString());
		
	} // main

}
