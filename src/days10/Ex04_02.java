package days10;

import java.io.IOException;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

import days08.Ex07;

public class Ex04_02 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int [] korArr = new int[3];
		int index = 0;

		String regex = "^(100|[1-9]?[0-9])$";
		int score;
		char con = 'y';
		do {

			System.out.printf("%d번 학생 점수 입력: ", index+1);
//			score = sc.nextInt();
			score = Ex07.getRandomInteger(0,100);
			// korArr의 크기보다 더 많이 입력하기위해 korArr크기 늘리는 코드
			if (index == korArr.length) {
				int [] temp = new int[korArr.length+2];
				for (int i = 0; i < korArr.length; i++) {
					temp[i] = korArr[i];					
				}
				korArr = temp;
			} // if -> 이 if문을 빠져나오면 temp주소를 현재 korArr이 참조하고 있기때문에 temp는 가비지가 된다.
			korArr[index++]=score;

			System.out.printf("점수 계속 입력?:");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
			
			//		} while (con=='y'||con=='Y');
		} while (Character.toUpperCase(con)=='Y');

		dispScore(korArr,index);
		//최고점수,최저점수,평균점수 구하기
		
		IntStream stream = IntStream.of(korArr);
        OptionalInt oMax= stream.limit(index).max();
        int maxScore = oMax.getAsInt();        
        int minScore = IntStream.of(korArr).limit(index).min().getAsInt();
        double avgScore= IntStream.of(korArr).limit(index).average().getAsDouble();
        System.out.printf("최고점:%d, 최저점:%d, 평균:%.2f\n"
              ,maxScore, minScore, avgScore );
        
	} // main



	private static void dispScore(int[] korArr, int index) {

		System.out.printf("입력한 수 : %d\n", index);
		for (int i = 0; i < index; i++) {
			System.out.printf("[%d]번 학생의 점수: %d점\n", i+1,korArr[i]);		
		}
	}

} // class
