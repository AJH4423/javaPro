package days02;

public class Ex05_02 {

	public static void main(String[] args) {
		
		// 기본형 = 논리형(boolean)
		boolean gender ; 
		// [      ] 1바이트 크기의 기억공간: true/false/ 저장
		//gender
		gender = true;
		
		
		//The local variable gender may not have been initialized
		System.out.println(gender);
		
		System.out.println("성별은 " + gender + "이다.");
		System.out.printf("성별은 %1$b(%1$B)(%1$s)이다.", gender);
		
	}// main
	
}// class
