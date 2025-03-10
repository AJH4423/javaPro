package days25;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Ex07 {

	public static void main(String[] args) {
		
		// DataOutputStream 
		
		String name = "양재원";
		// 기본형 8가지 중에 3가지(int, double, boolean)
		int kor = 90, eng = 80, mat = 90;
		int tot = kor+eng+mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		// 이 학생정보를 파일로 저장
		String fileName = "student02.dat"; // data
		
		try(FileOutputStream out = new FileOutputStream(fileName, true);
			DataOutputStream dos = new DataOutputStream(out);) {
			
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
						
			dos.flush();		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
		
	} // main

} // class
