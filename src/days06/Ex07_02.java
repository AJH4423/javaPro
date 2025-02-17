package days06;

import java.util.Scanner;

public class Ex07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [문제] 한라인에 10개의 ASCII 문자를 출력
		// 윈도우 개행: Carriage Return(CR) + LineFeed(FD) : 라인을바뀌고 커서를 다음 라인으로 옮김
		//             ㄴ ASCII 13번('\r')          ㄴ ASCII 10번('\n')
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0, lineNumber=1; i < 256; i++) {
			if (i % 10 == 0) {
//				System.out.printf("%d:", i/10 + 1); // 라인변환마다 몇번째 줄인지 index붙여주기
				System.out.printf("%d:", lineNumber);
			}
			System.out.printf("[%c]", i, (char) i);
			if (i % 10 == 9) {
				System.out.println();
				if(lineNumber % 5 == 0) {
					System.out.println("\t 계속하려면 엔터치세요");
					sc.nextLine();
				}
				lineNumber++;
			}
		}

	}// main

}// class
