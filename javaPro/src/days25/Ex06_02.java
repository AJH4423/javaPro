package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex06_02 {

	public static void main(String[] args) {

		String name = "홍길동";
		// 기본형 8가지 중에 3가지(int, double, boolean)
		int kor, eng, mat;
		int tot;
		double avg;
		boolean gender;

		// 이 학생정보를 파일로 저장
		String fileName = "student.txt"; // javaPro 폴더에 저장

		try(FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);
				) {


			String line = null;
			/*[1]
			while ((line = br.readLine()) != null) {
				String [] datas = line.split(",");

				name = datas[0];
				kor = Integer.parseInt(datas[1]);
				eng = Integer.parseInt(datas[2]);
				mat = Integer.parseInt(datas[3]);
				tot = Integer.parseInt(datas[4]);
				avg = Double.parseDouble(datas[5]);
				gender = Boolean.parseBoolean(datas[6]);

			}
			*/

//			String data = String.format("%s,%d,%d,%d,%d,%.2f,%b\n"
//					,name, kor, eng, mat, tot, avg, gender);

			//[2]
			String pattern = "([가-힣]{2,}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3}),([0-9.]{4,7}),(true|false)";

			while ( (line = br.readLine()) != null  ) {

				Pattern p = Pattern.compile(pattern);
				Matcher m = p.matcher(line);

				// m.matches()
				// m.find() 
				while ( m.find() ) {
					name = m.group(1);
					kor = Integer.parseInt( m.group(2) );
					eng = Integer.parseInt( m.group(3) );
					mat = Integer.parseInt( m.group(4) );
					tot = Integer.parseInt( m.group(5) ); 
					avg = Double.parseDouble( m.group(6) );
					gender = Boolean.parseBoolean(m.group(7));
					System.out.printf("%s,%d,%d,%d,%d,%f,%b\n"
							, name, kor, eng, mat, tot, avg, gender);
				} // while
			}// while

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("end");

	} // main

} // class
