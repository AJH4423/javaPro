package days02;

public class Ex03_04 {
	public static void main(String[] args) {
		
		String name = "안준호";
		int age = 27;
		double tall = 180.87;
		
		//System.out.println("이름은 " + name + "이고, 나이는 "+ age + "살이고, 키는 " + tall +"cm이다.");
		//System.out.println("이름은 \""+name+"\"이고, 나이는 "+age+"살이고, 키는 "+tall+"cm이다.");
		// printf() 메서드
		// 메서드 3가지 파악: 기능, 매개변수, 리턴값
		// %? = %conversion
		// String s
		// int    d
		// double f
		System.out.printf("이름은 \"%s\"이고,\n 나이는 %d살이고,\n 키는 %.2fcm이다.",name, age, tall);
		// \n = 줄바꿈 제어문자
	}

}
