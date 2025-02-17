package days08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) throws IOException {
		
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		name = getName(sc);// 이름을 얻어오는 메소드, 스캐너 변수를 매개변수로 넘겨줌
		kor = getScore(sc,"국어");
		eng = getScore(sc,"영어");
		mat = getScore(sc,"수학");
		
		tot = getTotal(kor,eng,mat);
		avg = getAvg(tot);
		
		printScore(name, kor, eng, mat, tot, avg);
			
	} // main

	private static void printScore(String name, byte kor, byte eng, byte mat, short tot, double avg) {
		
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f", 
				name, kor, eng, mat, tot, avg);
	}

	private static double getAvg(short tot) {		
		return (double)tot/3;
	}

	private static short getTotal(byte kor, byte eng, byte mat) {		
		return (short)(kor+eng+mat);
	}

	private static byte getScore(Scanner sc, String subject) {		
		// 0~100사이의 점수를 입력하면 점수값 반환 그 외의 값은 다시 입력받음 
		// -> 입력값에 대한 유효성 검사
		// -> String.matches() 메서드 사용해서 유효성 검사
		byte score;
		String strScore;
//		String regex = "[0-9]{1,3}"; 
		String regex = "^(100[1-9]?\\d)$"; // 여기서 ^는 시작의 의미를 나타냄
		// *:0~여러번 반복
		// ?
		// [0-9] == \d
		// [^0-9] == \D :[]안에있는 꺽쇠는 부정의 의미
		
		boolean isFirst = false;
		do {
			if (isFirst) {
				System.out.print("[다시] ");
			} // if
			System.out.printf("> %s 점수 입력 ? ", subject);
			strScore = sc.next();
			isFirst = true;
		} while (!strScore.matches(regex));

		score = Byte.parseByte(strScore);
		return score;

	}

	private static String getName(Scanner sc) {
		
		System.out.print("이름 입력: ");
		String name = sc.next();
		return name;
	}


} // class
