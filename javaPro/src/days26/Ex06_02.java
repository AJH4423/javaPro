package days26;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex06_02 {
	
	public static void main(String[] args) {
		
		String name = ".\\src\\days26\\UserInfo.ser";
		try(FileInputStream fos = new FileInputStream(name);
			ObjectInputStream ois = new ObjectInputStream(fos);) {
			
			UserInfo u1 = (UserInfo)ois.readObject();
			UserInfo u2 = (UserInfo)ois.readObject();
			ArrayList<UserInfo> list = (ArrayList<UserInfo>)ois.readObject();
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class
