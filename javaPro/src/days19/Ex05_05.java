package days19;

import java.util.StringJoiner;

public class Ex05_05 {
	
	public static void main(String[] args) {
		
		/* [1]String.join()
		String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
		String [] teamArr = team1.split("\\s*,\\s*");
		String content = "<ol>\n  <li>";
		
		content += String.join("<li>\n  <li>", teamArr);
		content += "<li>\n<ol>";
		System.out.println(content);
		*/
		
		// [2]StringJoiner 클래스
		String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
		String [] teamArr = team1.split("\\s*,\\s*");
		
		StringJoiner sj = new StringJoiner(
				"<li>\n  <li>" // 중간내용
				, "<ol>\n  <li>" // 접두사
				, "<li>\n<ol>"); // 접미사
		
		for (int i = 0; i < teamArr.length; i++) {
			sj.add(teamArr[i]);
		} // for i
		
		System.out.println(sj.toString());
		
	} // main

} // class


/*
<ol>
<li>박정현<li>
<li>김하은<li>
<li>김민곤<li>
<li>박예진<li>
<li>양희동<li>
<ol>
*/