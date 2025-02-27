package days19;

import java.io.FileReader;

public class Ex10 {
	
	public static void main(String[] args) {
		
		String fileName = ".\\src\\days18\\Ex10.java";
	      // 알파벳 대소문자를 구분하지 않고 A(20), B(11)~ Z(3)
	      // 갯수를 파악해서 #으로 막대그래프를 그리기.
	      // A(20) : ####################
	      // B(11) : ###########
	      // :
	      // Z(3)  : ###
		
		char one = '\u0000';
		int code = -1;
		int [] counts = new int[26];
		//counts[0] = 'A' 65의 갯수 
		//counts[1] = 'B' 66의 갯수
		
		try(FileReader reader = new FileReader(fileName);) {
			
			while ((code = reader.read())!= -1) {
				code = Character.toUpperCase(code);
				if (Character.isUpperCase(code)) {
					int index = code - 'A'; // index값 = code - 'A' = code - 65
					counts[index]++;
				} // if
			}
			
			//막대그래프 그리기
			for (int i = 0, count; i < counts.length; i++) {
				count = counts[i];
				System.out.printf("%c(%d) %s\n"
						, i+'A',count,"#".repeat(count));
			} // for i
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	} // main

} // class
