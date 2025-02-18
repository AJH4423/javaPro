package days04;

import java.util.Scanner;

public class Ex06_03 {
	
	public static void main(String[] args) {
		
		//문제) 
		// 국어 점수를 입력받아서
		// 수,우,미,양,가
		// 출력
		// 수: 90~100
		// 우: 80~89
		// 미: 70~79
		// 양: 60~69
		// 가: 0~59
		
		 int kor = -1 ;       
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 국어 점수 입력 ? ");  // 0<=   <=100
	      
	      /*
	      if ( scanner.hasNextInt() ) {
	         // InputMismatchException
	         kor = scanner.nextInt();  // 1a , 99.87 
	      }else {
	         System.out.println("[알림] 국어 점수 0~100 !!!");
	         return ;
	      }
	      */
	      
	      if (!scanner.hasNextInt()) {
	         System.out.println("[알림] 국어 점수 0~100 !!!");
	         return ;
	      } // if
	    
	      kor = scanner.nextInt();  // 1a , 99.87
	      // The local variable kor may not have been initialized
	      if ( 0 <= kor && kor <= 100 ) {
	         // 수/우/미/양/가
	         if ( 90 <= kor && kor <= 100 ) {
	            System.out.println("수");
	         } // if
	         if ( 80 <= kor && kor <= 89 ) {
	            System.out.println("우");
	         } // if
	         if ( 70 <= kor && kor <= 79  ) {
	            System.out.println("미");
	         } // if
	         if ( 60 <= kor && kor <= 69 ) {
	            System.out.println("양");
	         } // if
	         if ( 0 <= kor && kor <= 59 ) {
	            System.out.println("가");
	         } // if
	      } else {
	         System.out.println("[알림] 국어 점수 0~100 !!!");
	      } // if
	      	      
	      
	      System.out.println(" end ");

		
		/*
		if(score>=90 && score<=100) {
			System.out.print("수");
		}
		else if(score>=80 && score<=89) {
			System.out.print("우");
		}
		else if(score>=70 && score<=79) {
			System.out.print("미");
		}
		else if(score>=60 && score<=69) {
			System.out.print("양");
		}
		else if(score>=0 && score<=59) {
			System.out.print("가");
		}
		else {
			System.out.print("0~100에 맞는 수를 입력하세요");
		}
		*/
		
		
	} // main

}
