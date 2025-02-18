package days04;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		// if문
		
		int n;
		
		System.out.printf("입력: ");
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		
		// ( )안의 condition은 참/거짓 조건식이다.
		if ( n > 0 ) {
			System.out.println("출력 0");
		} // if
		else  {
			System.out.println("end");
		}
		
	} // main
	
}// class
