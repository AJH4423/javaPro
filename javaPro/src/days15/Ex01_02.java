package days15;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import days14.Student;

public class Ex01_02 {

	public static void main(String[] args) throws IOException {

		// 3반의 30명 학생 성적관리

		String name;
		int kor,eng,mat,tot,rank,wrank;
		double avg;

		final int CLASS = 3;
		final int STUDENT_COUNT = 30;

		// 클래스 배열 2차원으로 선언
		Student [][] st = new Student[CLASS][STUDENT_COUNT];

		int [] cnts = new int[CLASS];

		char con = 'y'; // 입력여부를 물어볼 변수

		Scanner sc = new Scanner(System.in);

		int ban;
		/*
		for (int i = 0; i < st.length; i++) {
			for (int j = 0; j < st[i].length; j++) {
				st[i][j] = new Student();
			} // for j
		} // for i
		 */
		do {

			System.out.print("1.반 입력: ");
			ban = sc.nextInt(); // 1,2,3 중에 몇반인지 입력

			System.out.printf("2. %d반 [%d번] 학생 이름, 국어,영어,수학 입력: ", ban, cnts[ban-1]+1);
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat;
			avg = (double)tot/3;

			rank =1;
			wrank=1;

			//각배열 요소로 추가
			st[ban-1][cnts[ban-1]]=new Student(); // 입력받는값에 대한 객체에만 인스턴스화하기
			st[ban-1][cnts[ban-1]].no = cnts[ban-1]+1;
			st[ban-1][cnts[ban-1]].name = name;
			st[ban-1][cnts[ban-1]].kor = kor;
			st[ban-1][cnts[ban-1]].eng = eng;
			st[ban-1][cnts[ban-1]].mat = mat;
			st[ban-1][cnts[ban-1]].tot = tot;
			st[ban-1][cnts[ban-1]].avg = avg;
			st[ban-1][cnts[ban-1]].rank = rank;
			st[ban-1][cnts[ban-1]].wrank = wrank;

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
				st[i][j].wrank=st[i][j].rank = 1;            
				for (int i2 = 0; i2 < cnts.length; i2++) {
					for (int j2 = 0; j2 < cnts[i2]; j2++) {                  
						//  tots[i2][j2] 비교할 학생의 총점
						if(st[i][j].tot<st[i2][j2].tot) {
							st[i][j].wrank++;
							if (i == i2) {
								st[i][j].rank++;
							} // if
						} // 
					} // for j
				} // for i

			} // for j
		} // for i 

		// 학생 정보 출력
		int totalCnt = IntStream.of(cnts).sum();
		System.out.printf("[전체 학생 수 : %d명]\n", totalCnt);
		for (int i = 0; i < cnts.length; i++) {
			System.out.printf("[%d]반의 학생수 : %d명\n", i+1,cnts[i]);
			// 해당반 학생 정보 출력
			for (int j = 0; j < cnts[i]; j++) {
				System.out.print(st[i][j].getInfo());
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


