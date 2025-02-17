package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Type Convert(형 변환)
		// 1) 자동 형 변환
		// 2) 강제 형 변환
		
		// 시험문제) 이름, 국어, 영어, 수학 점수를 입력받아서
		// 총점
		// 평균
		// 출력
		// 이름="홍길동", 국어=90, 영어=89, 수학=77, 총점=256, 평균=85.33
		
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름을 입력하세요: ");
		name = br.readLine();
		
		System.out.print("국어점수를 입력하세요: ");
		kor = Byte.parseByte(br.readLine());
		
		System.out.print("영어점수를 입력하세요: ");
		eng = Byte.parseByte(br.readLine());
		
		System.out.print("수학점수를 입력하세요: ");
		mat = Byte.parseByte(br.readLine());
		
		//Type mismatch: cannot convert from int to short
		// short나 byte계산이더라도 cpu자체적으로 int로 계산이된다.
		tot = (short)(kor+eng+mat); // -> short형 = (short)(int값)
		// (kor+eng+mat)에서의 ()는 최우선 연산자이기에 int형으로 먼저 계산이되고 (short)의 캐스트연산자가 이루어진다.
		
		avg = (double)tot/3;
			
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f", name, kor, eng, mat, tot, avg);

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.println("이름을 입력하세요: ");
//		name = br.readLine();
//		
//		System.out.println("국어점수를 입력하세요: ");
//		kor = Byte.parseByte(br.readLine());
//		
//		System.out.println("영어점수를 입력하세요: ");
//		eng = Byte.parseByte(br.readLine());
//		
//		System.out.println("수학점수를 입력하세요: ");
//		mat = Byte.parseByte(br.readLine());
//		
//		tot = (short) (kor+eng+mat);
//		avg = (double) (tot/3.0);
//		
//		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f", name, kor, eng, mat, tot, avg);
		
		
		

	}

}
