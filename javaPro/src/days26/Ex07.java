package days26;

import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex07 {
	
	public static void main(String[] args) {
		// 1. Parent 부모클래스는 직렬화가 가능한 클래스로 선언
		// 자식 클래스는 자동으로 직렬화가 가능한 클래스가 된다
		
		// 2. Parent 부모클래스는 직렬화x
		// 자식 클래스는 직렬화 가능o
		// -> 직렬화 대상에 부모의 필드도 포함
		// 해결) 직접 직렬화 대상에 포함시키도록 코딩
		
		String name = ".\\src\\days26\\Child.ser";
		try(FileOutputStream fos = new FileOutputStream(name);
			ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			Child c = new Child();
			c.name = "홍길동";
			c.age = 20;
			
			oos.writeObject(c);
			
			oos.flush(); // 저장
			System.out.println("u1,u2 객체를 직렬화해서 파일로 저장.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class

// [2] 자식이 직렬화가 가능한 경우
class Parent {
	String name; // 부모의 필드는 직렬화 대상에서 제외...
}

class Child extends Parent implements Serializable{//(직렬화)
	int age;
	
	// 개발자가 직접 직렬화 대상에추가(쓰기)
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);
		out.defaultWriteObject();
	}
	
	// 직접 직렬화 대상에 추가(읽기)
	private void readObject(ObjectInputStream in) throws IOException
	, ClassNotFoundException {
		name = in.readUTF();
		in.defaultReadObject();
	}
}

/*[1] 부모가 직렬화 가능한 경우
class Parent implements Serializable{//(직렬화)
	String name;
}

class Child extends Parent{
	int age;
}
*/
