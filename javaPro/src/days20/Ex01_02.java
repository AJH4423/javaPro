package days20;

import java.io.FileReader;
import java.util.stream.IntStream;

public class Ex01_02 {

	public static void main(String[] args) {

		String fileName = ".\\src\\days18\\Ex10.java";

		char one = '\u0000';
		int code = -1;

		// 가변배열
		int [][] counts = new int[3][];

		counts[0] = new int[26]; // 대문자
		counts[1] = new int[26]; // 소문자
		counts[2] = new int[10]; // 숫자


		try(FileReader reader = new FileReader(fileName);) {

			while ((code = reader.read())!= -1) {
				if (Character.isUpperCase(code)) {
					int index = code - 'A'; // index값 = code - 'A' = code - 65
					counts[0][index]++;
				} else if(Character.isLowerCase(code)) {
					int index = code - 'a'; // index값 = code - 'A' = code - 65
					counts[1][index]++;
				}else if(Character.isDigit(code)) {
					int index = code - '0'; // index값 = code - 'A' = code - 65
					counts[2][index]++;
				}
			}

			//막대그래프 그리기
			int count = 0;
			for (int i = 0; i < counts.length; i++) {      
				// int[] -> IntStream
				int totalCount = IntStream.of(counts[i]).sum();
				System.out.printf("==%s:%d==\n"
						,i==0?"대문자":(i==1?"소문자":"숫자")
								,  totalCount );

				for (int j = 0; j < counts[i].length; j++) {
					count  = counts[i][j];
					System.out.printf("%c(%d) %s\n", 
							j+(i==0?'A':(i==1?'a':'0')), count, "#".repeat(count));
				} // for j

			} // for i


		} catch (Exception e) {
			System.out.println(e.toString());
		}


	} // main



}
