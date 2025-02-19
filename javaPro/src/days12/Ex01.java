package days12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		// 한반에 30명 학생의 성적관리 (이름, 국어, 영어, 수학, 총점, 평균, 등수)
		// 1. 입력정보: 이름, 국어, 영어, 수학
		// 2. 총점, 평균, 등수 계산 처리
		// 3. 모든 학생 정보 출력...

		String name;
		int kor,eng,mat,tot,rank;
		double avg;

		final int STUDENT_COUNT = 5;

		String [] names = new String[STUDENT_COUNT];
		int [] kors = new int [STUDENT_COUNT]; 
		int [] engs = new int [STUDENT_COUNT]; 
		int [] mats = new int [STUDENT_COUNT]; 
		int [] tots = new int [STUDENT_COUNT]; 
		int [] ranks = new int [STUDENT_COUNT];
		double [] avgs = new double [STUDENT_COUNT];

		int cnt = 0; // 입력받은 학생 수 저장할 변수
		char con = 'y'; // 입력여부를 물어볼 변수

		Scanner sc = new Scanner(System.in);


		do {
			// 배열의 크기 증가 작업
			if (names.length == cnt) {
				names = Arrays.copyOf(names, names.length +3);
				kors = Arrays.copyOf(kors, kors.length +3);
				engs = Arrays.copyOf(engs, engs.length +3);
				mats = Arrays.copyOf(mats, mats.length +3);
				tots = Arrays.copyOf(tots, tots.length +3);
				ranks = Arrays.copyOf(ranks, ranks.length +3);
				avgs = Arrays.copyOf(avgs, avgs.length +3);
			} // if
			
			//한 학생의 정보를 입력
			System.out.printf("[%d번] 학생 이름, 국어,영어,수학 입력: ", cnt+1);
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank=1;

			//각배열 요소로 추가
			names[cnt] = name;
			kors[cnt] = kor;
			engs[cnt] = eng;
			mats[cnt] = mat;
			tots[cnt] = tot;
			avgs[cnt] = avg;
			ranks[cnt] = rank;

			//입력받은 학생수 1증가
			cnt++;
			// 입력게속 할건지 여부 체크
			System.out.print("학생 입력계속: ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');

		//등수처리

		for (int i = 0; i <cnt; i++) { // 등수를 매길 학생
			for (int j = 0; j <cnt; j++) { // 비교할 반 전체 학생
				if (tots[i]<tots[j]) {
					ranks[i]++;
				} // if

			}

		} 

		//학생정보출력
		System.out.printf("입력받은 학생수: %d명\n",cnt );
		for (int i = 0; i < cnt; i++) {

			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
					, i+1
					, names[i]
							, kors[i], engs[i], mats[i], tots[i]
									, avgs[i], ranks[i]);		
		}

	} // main

	public static String getName() {
		// '가' ~ '힣'
		// 44032 ~ 55203

		// 5 ~ 13
		// 0 ~ 8                -5
		// 5 <=  (int)(Math.random()*9)+5 <= 13


		//char one = (char)(rnd.nextInt('힣'-'가'+1)+'가');

		char [] nameArr = new char[3];
		Random rnd = new Random();
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		}

		// char[] -> String 변환
		String name = new String(nameArr);
		return name;
	}

	public static int getScore() {
		return  (int)( Math.random()*101 ) ;
	}

} // class
