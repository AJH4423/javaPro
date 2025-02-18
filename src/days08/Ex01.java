package days08;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) throws IOException {
		// [정보처리기사 실기]
		// 1+2+4+7+11+16+22+29+......
		// 조건반복문은 for문보다는 while문 이용하는게 좋음
		
		
		int term=1;
		int inc=1;
		int sum=0;

		// 1: 1, 2: 첫항값(n)+첫항번호(i), 3(i): 두번째항값(n) + 두번째항(term)
		while (term<=10) {
			sum+=term;
			System.out.printf("%d+",term);
			term+=inc++;
		}
		System.out.printf("\b=%d",sum);
		
		
	} // main

}
