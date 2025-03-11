package days26;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex07_02 {
	
	public static void main(String[] args) {
		
		String name = ".\\src\\days26\\Child.ser";
		
		try(FileInputStream fos = new FileInputStream(name);
			ObjectInputStream ois = new ObjectInputStream(fos);) {
			
			Child c = (Child) ois.readObject();
			
			System.out.println(c.name);
			System.out.println(c.age);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class
