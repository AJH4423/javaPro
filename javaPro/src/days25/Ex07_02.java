package days25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex07_02 {

	public static void main(String[] args) {
		
		// DataInputStream -> 읽어들이는 작업
		
		String name = "안준호";
		// 기본형 8가지 중에 3가지(int, double, boolean)
		int kor = 90, eng = 80, mat = 90;
		int tot = kor+eng+mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		// 이 학생정보를 파일로 저장
		String fileName = "student02.dat"; // data
		
		try(FileInputStream in = new FileInputStream(fileName);
			DataInputStream dis = new DataInputStream(in);) {
			
			//while (true) {  [1] 
			while( dis.available() > 0 ) { //[2]
			
			name = dis.readUTF();
			kor = dis.readInt();
			eng = dis.readInt();
			mat = dis.readInt();
			tot = dis.readInt();
			avg = dis.readDouble();
			gender = dis.readBoolean();
						
			System.out.printf("%s,%d,%d,%d,%d,%.2f,%b\n"
					,name, kor, eng, mat, tot, avg, gender);
			
			} //while 
			
		}catch(EOFException e) { //[1]
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
		
	} // main

} // class
