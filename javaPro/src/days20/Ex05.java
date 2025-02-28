package days20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05 {

	public static void main(String[] args) {

		// [정규표현식(Regular Expression, regex)]
		/* ㄴ 문자열 속에 원하는 패턴과 일치하는 문자열을 찾기 위해서 사용하는 식
		 * ㄴ 미리 정의된 기호와 문자
		 * ㄴ java.util.regex 패키지
		 * 		ㄴ Pattern 클래스 - 정규식을 저으이
		 * 		ㄴ Matcher 클래스 - 데이터와 정규식(pattern객체)을 비교
		 * 
		 * 		boolean String.matches(String regex)
		 * 			ㄴ 지금까지는 이렇게 사용했었음
		 * */

		String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date",
				"disc", "fx" };
		// String regex = "c[a-z]*"; // c문자 시작해서 소문자 0~여러개 패턴
		// String regex = "c[a-z]";  // c문자 + 소문자 1개
		// String regex = "c[a-zA-Z]"; // c문자 + 알파벳 1개
		// String regex = "c[a-zA-Z0-9]";
		 String regex = "c\\w";
		// String regex = ".*";
		// String regex = "c.";
		// String regex = "c\\.";
		// String regex = "c[0-9]";
		// String regex = "c.*t";
		// String regex = "[b|c]";
		// String regex = "[bc]";
		// String regex = "[b-c].*";
		// String regex = "[^bc].*";
		// String regex = ".*a.*";
		// String regex = "[^bcd].*";
		// String regex = "[a-zA-Z].*";
		// String regex = "[ae-zA-Z].*";
		// String regex = "[a-zA-Z&&[^b-d]].*";
		 
		// String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*_])[A-Za-z\\d!@#$%^&*_]{8,15}";
		 // -> 비밀번호 조건에 대한 정규표현식

		/*[1]
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%s-%s패턴: %b\n", data[i], regex,data[i].matches(regex));

		} // for i
		 */

		//[2]
		Pattern pattern = Pattern.compile(regex);

		for (int i = 0; i < data.length; i++) {
			Matcher matcher = pattern.matcher(data[i]);  //Matcher matcher = pattern.matcher(비교데이터)
			if (matcher.matches()) {
				System.out.println(data[i]);
			} // if
		} // for i


	} // main

} // class
