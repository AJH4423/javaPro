package days04;

import java.util.Scanner;

public class Ex04_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 이름(String), 나이(byte), 키(double), 성별(boolean) 입력받아서 출력.
	      // (출력형식)
	      // > 이름:홍길동, 나이:20살, 키:178.89, 성별:남자/여자
		
//		String name;
//		byte age;
//		double tall;
//		String sex = "남자";
//		boolean gender;
//		
//		System.out.print("정보를 입력하세요(이름 나이 키 성별) :");
//		
//		Scanner sc = new Scanner(System.in);
//		name = sc.next();
//		age = sc.nextByte();
//		tall = sc.nextDouble();		
//		gender = sc.hasNext(sex);
//		
//		System.out.printf("> 이름:%s, 나이:%d살, 키:%.2f, 성별:%b", name, age, tall, gender);
		
		String name;
		byte age;
		double height;
		boolean gender;
		
		Scanner scanner = new Scanner(System.in);  // Scanner = 클래스 scanner = 식별자
		System.out.print("> 이름 나이 키 성별 입력 : ");
		
		name = scanner.next();
		age = scanner.nextByte();
		height = scanner.nextDouble();		
		gender = scanner.nextBoolean();
		
		System.out.printf("> 이름:%s, 나이:%d살, 키:%.2f, 성별:%s\n", name, age, height, gender?"남자":"여자");
		
		// 체크) 홍길동, 20, 178.89, true Scanner의 구분자를 콤마(,)설정
		

	}

}
