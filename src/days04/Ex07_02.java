package days04;

import java.util.Scanner;

public class Ex07_02 {
	
	public static void main(String[] args) {
		
		  int kor = -1 ;       
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 국어 점수 입력 ? ");  // 0<=   <=100
	      
	      
	      if (!scanner.hasNextInt()) {
	         System.out.println("[알림] 국어 점수 0~100 !!!");
	         return ;
	      } // if
	    
	      kor = scanner.nextInt();  // 1a , 99.87
	      int score = kor/10;
	      char grade = '수'; 
	      
	      if(score>=0 && score<=9) {      
	      switch (score) {
		case 9:
			grade = '수'; 
			break;
		case 8:
			grade = '우'; 
			break;
		case 7:
			grade = '미'; 
			break;
		case 6:
			grade = '양'; 
			break;
		default:
			grade = '가';
			break;
		}// switch
	      }
	      else if(kor==100) {
	    	  grade = '수';
	      }
	      else {
	    	  System.out.println("범위에 맞게 점수를 입력하세요");
	    	  return;
	      }
	      
	      System.out.printf("성적: %c\n", grade);
	      System.out.println("end");
	} // main

}
