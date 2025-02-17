package days04;

import java.util.Scanner;

public class Ex06_04 {
	
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
	      
	      
	      if (!scanner.hasNextInt()) {
	         System.out.println("[알림] 국어 점수 0~100 !!!");
	         return ;
	      } // if
	    
	      kor = scanner.nextInt();  // 1a , 99.87
	      char grade = '수'; 
	      if ( 0 <= kor && kor <= 100 ) {
	         if ( 90 <= kor ) {   
	            // System.out.println("수");
	            grade = '수';
	         }else if ( 80 <= kor ) {
	            //System.out.println("우");
	            grade = '우';
	         }else if ( 70 <= kor  ) {
	            //System.out.println("미");
	            grade = '미';
	         }else if ( 60 <= kor) {
	            //System.out.println("양");
	            grade = '양';
	         }else {
	            //System.out.println("가");
	            grade = '가';
	         } // if
	         
	         System.out.printf("%d => %c\n", kor, grade);
	      } else {
	         System.out.println("[알림] 국어 점수 0~100 !!!");
	      } // if

	      	      
	      
	      System.out.println(" end ");

		
	} // main

}
