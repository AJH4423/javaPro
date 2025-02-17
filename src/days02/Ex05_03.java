package days02;

public class Ex05_03 {

	public static void main(String[] args) {
		
		String name = "admin";
		int age = 20;
		
		double avg = 78.96844;
		System.out.printf("평균=%f\n", avg);
		
		System.out.printf("평균=[%.2f]\n", avg); // 소수점2자리까지 반올림해서 출력
		
		System.out.printf("평균=[%+010.2f]\n", avg);
		
		System.out.printf("평균=%e\n", avg);
		
		/*
		 * 
		 * 
		 * */
		
		System.out.println("-".repeat(50)); // 구분선
		// %[argument_index$][flags][width][.precision]conversion 
		
		System.out.printf("[%s]\n", name);
		System.out.printf("[%10s]\n", name);
		System.out.printf("[%-10s]\n", name);
		
		System.out.printf("[%d]\n", age);
		System.out.printf("[%10d]\n", age); // 우측에서 10칸띄우고 출력
		System.out.printf("[%-10d]\n", age);
		
		// 나이(age)를 4자리로 출력  : 0020
		// 100                  : 0100
		// 5 				    : 0005
		System.out.printf("[%4d]\n", age); // 4 : width를 뜻함
		System.out.printf("[%04d]\n", age);// 0 : flags를 뜻함(앞을 0으로 채움)
		
		int money = 12573000;
		// 12,573,000으로 출력
		System.out.printf("[%d]\n", money);
		System.out.printf("[%,d]\n", money); // flags: 숫자를 ','으로 나눔 
		
		System.out.printf("[%(d]\n", 30);
		System.out.printf("[%(d]\n", -30); // flags: 음수일땐 괄호로 묶임
		
		System.out.println("-".repeat(50)); // 구분선
		System.out.printf("[%d]\n", 10);
		// d: 정수를 10진수로 출력
		System.out.printf("[%o]\n", 10);
		// o: 정수를 8진수로 출력 
		System.out.printf("[%1$#x][%1$#X]\n", 10);
		// x: 정수를 16진수로 출력
		
		
	}// main
	
}// class
