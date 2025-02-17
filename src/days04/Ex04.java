package days04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// BufferedReader br : 키보드로부터 입력
		// [Scanner 클래스]
		
		/*
		Scanner sc = new Scanner(System.in); // 키보드로 입력받은 값을 scan해내는 객체
		
		System.out.print("> 정수(n) 입력: ");
		
		int n = sc.nextInt(); // 1. 기능, 2. 매개변수, 3. 리턴값 확인
		
		System.out.println(n);
		*/
		
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		// 토큰의 기본 구분점은 (공백)스페이스로 구분한다
		System.out.print("이름 국어 영어 수학 입력하세요: "); //홍길동 90 87 65
		name = sc.next(); 
		kor = sc.nextByte(); //따로 파싱해줄 필요없이 그냥 next메서드만 써주면됨
		eng = sc.nextByte();
		mat = sc.nextByte();
		
		tot = (short)(kor+eng+mat); 	
		avg = (double)tot/3;
			
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f", name, kor, eng, mat, tot, avg);

	}

}
