package days22;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import days14.Student;

public class Ex03 {
	
	public static void main(String[] args) throws IOException {
		
		// 한 반 30명 학생의 이름/국/영/수/총/평/등 처리 
		// 클래스 배열사용 - days14.Ex12
		// 		ㄴ 배열사용시 단점: 학생수 크기가 달라지면 불편함
		// 단점보안: 클래스 배열 대신에 ArrayList사용
		
		String name;
		int kor,eng,mat,tot,rank;
		double avg;
		
		final int STUDENT_COUNT = 30;
		
		ArrayList list = new ArrayList(STUDENT_COUNT);
		
		int cnt = 0; // 입력받은 학생 수 저장할 변수
		char con = 'y'; // 입력여부를 물어볼 변수

		Scanner sc = new Scanner(System.in);


		do {
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
			Student s = new Student();
			s.name = name;
			s.kor = kor;
			s.eng = eng;
			s.mat = mat;
			s.tot = tot;
			s.avg = avg;
			s.rank = 1;

			list.add(s); 

			// 입력게속 할건지 여부 체크
			System.out.print("학생 입력계속: ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');

		cnt = list.size();
		
		// 등수 처리
		procRank(list);
		
		// 학생정보출력
		dispStudent(list);
		
	} // main
	
	private static void dispStudent(ArrayList list) {
		System.out.printf("입력받은 학생수: %d명\n",list.size());
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);
		}
	}

	private static void procRank(ArrayList list) {
		 for (int i = 0; i < list.size(); i++) {
	         Student s = (Student) list.get(i);
	         s.rank = 1;
	         for (int j = 0; j < list.size(); j++) {
	            Student t = (Student) list.get(j);
	            if (s.tot < t.tot) {
	               s.rank++;
	            } // if
	         } // for j
	      } // for i
	}

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
