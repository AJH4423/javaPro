package days13;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex01_02 {

	public static void main(String[] args) throws IOException {

		// 각각 3개반의 30명씩 학생의 성적관리 (이름, 국어, 영어, 수학, 총점, 평균, 등수)
		// 1. 입력정보: 이름, 국어, 영어, 수학
		// 2. 총점, 평균, 등수 계산 처리
		// 3. 모든 학생 정보 출력...
		// 3차원배열을 이용해서 코딩수정

		String name;
		int kor,eng,mat,tot,rank,wrank;
		double avg;

		final int CLASS = 3;
		final int STUDENT_COUNT = 30;

		// String [] names = new String[STUDENT_COUNT];
		String [][] names = new String[CLASS][STUDENT_COUNT];
		double [][] avgs = new double [CLASS][STUDENT_COUNT];

		int [][][] infos = new int [CLASS][STUDENT_COUNT][6]; //-> 밑에 과목들점수+총점+등수에대한 정보
		/*
		int [][] kors = new int [CLASS][STUDENT_COUNT]; 
		int [][] engs = new int [CLASS][STUDENT_COUNT]; 
		int [][] mats = new int [CLASS][STUDENT_COUNT]; 
		int [][] tots = new int [CLASS][STUDENT_COUNT]; 
		int [][] ranks = new int [CLASS][STUDENT_COUNT]; //반등수
		int [][] wranks = new int [CLASS][STUDENT_COUNT]; //전교등수
		 */


		//int cnt1 = 0,cnt2 = 0,cnt3 = 0; // 입력받은 학생 수 저장할 변수(1반,2반,3반)
		int [] cnts = new int[3]; //배열은 int 자료형의 기본값 0으로 초기화

		char con = 'y'; // 입력여부를 물어볼 변수

		Scanner sc = new Scanner(System.in);


		int ban;
		do {
			//가변배열 배운후에 각 반별 입력인원 증가 코드 작성예정

			//한 학생의 정보를 입력
			//1. 반 입력하기
			System.out.print("1.반 입력: ");
			ban = sc.nextInt(); // 1,2,3 중에 몇반인지 입력

			System.out.printf("2. %d반 [%d번] 학생 이름, 국어,영어,수학 입력: ", ban, cnts[ban-1]+1);
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat;
			avg = (double)tot/3;
			wrank=rank=1;

			//각배열 요소로 추가
			names[ban-1][cnts[ban-1]] = name;
			avgs[ban-1][cnts[ban-1]] = avg;

			infos[ban-1][cnts[ban-1]][0] = kor;
			infos[ban-1][cnts[ban-1]][1] = eng;
			infos[ban-1][cnts[ban-1]][2] = mat;
			infos[ban-1][cnts[ban-1]][3] = tot;			
			infos[ban-1][cnts[ban-1]][4] = rank;
			infos[ban-1][cnts[ban-1]][5] = wrank;

			//입력받은 학생수 1증가
			cnts[ban-1]++;
			// 입력게속 할건지 여부 체크
			System.out.print("학생 입력계속: ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');

		//등수 처리(반등수 + 전교등수)		
		for (int i = 0; i < cnts.length; i++) {
			for (int j = 0; j < cnts[i]; j++) {
				infos[i][j][5]=infos[i][j][4] = 1;            
				for (int i2 = 0; i2 < cnts.length; i2++) {
					for (int j2 = 0; j2 < cnts[i2]; j2++) {                  
						if(infos[i][j][3]<infos[i2][j2][3]) {
							infos[i][j][5]++;
							if (i == i2) {
								infos[i][j][4]++;
							} // if
						} // 
					} // for j
				} // for i

			} // for j
		} // for i 


		//학생정보출력
		//int totalCnt = cnts[0]+cnts[1]+cnts[2];
		int totalCnt = IntStream.of(cnts).sum();
		System.out.printf("[전체 학생 수 : %d명]\n", totalCnt);
		for (int i = 0; i < cnts.length; i++) {
			System.out.printf("[%d]반의 학생수 : %d명\n", i+1,cnts[i]);
			// 해당반 학생 정보 출력
			for (int j = 0; j < cnts[i]; j++) {
				System.out.printf("  [%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n"
						, j+1
						, names[i][j]
								, infos[i][j][0], infos[i][j][1], infos[i][j][2], infos[i][j][3]
										, avgs[i][j], infos[i][j][4], infos[i][j][5]);
			} // for j
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


}
