package days26;

import java.io.Serializable;

public class UserInfo  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7710452478087872805L;
	String name;
	//transient 키워드
	// 	ㄴ 일시적인
	// 	ㄴ 직렬화 대상에서 제외하겠다
	transient String passWord;
	int age;
	
	
	
	public UserInfo() {
		this("unknown", "1111", 0);
	}



	public UserInfo(String name, String passWord, int age) {
		super();
		this.name = name;
		this.passWord = passWord;
		this.age = age;
	}



	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", passWord=" + passWord + ", age=" + age + "]";
	}	

}
