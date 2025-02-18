package days08;

import java.util.Arrays;

public class Ex07 {
	
	public static void main(String[] args) {
		
		// 중복체크가된 로또번호 발생
		// 메소드 선언 종류
		// 1. 로또번호 값 중복체크
		// 2. 로또번호 랜덤 선언
		// 3. 로또번호 6개 값 출력
				
		int [] lotto = new int[6];		
		fillLotto(lotto); //로또번호 6개 채워넣는 메소드
		dispLotto(lotto);
				
	} // main

	
	//로또 번호 랜덤하게 찾고 배열에 저장하는 함수
	private static void fillLotto(int[] lotto) {
		int index = 0, n;
		lotto[index++] = getRandomInteger(1,45);// 두 정수사이 랜덤값 찾아주는 함수
		
	      while ( index <= 5 ) {
		         n = getRandomInteger(1,45); 
		         
		         if( !isDuplicateLotto(lotto,n,index) ) 
		        	 lotto[index++] = n;
		      } // while
		
	}

	// 로또번호 값 중복체크해주는 함수
	private static boolean isDuplicateLotto(int[] lotto, int n, int index) {
		// TODO Auto-generated method stub
        boolean flag = false;
        for (int i = 0; i < index; i++) {
           if( lotto[i] == n ) {
              System.out.println("*");
              flag = true;
              break;
           }
        } // for i   
		return flag;
	}

	// 범위안에 수들 중 랜덤한 값으로 뽑아내는 함수
	public static int getRandomInteger(int min, int max) {
		return (int)( Math.random()*(max-min+1))+min; // 범위안에 수들 중 랜덤한 값 뽑아내는 메소드
	}

	// 로또번호값 출력하는 함수
	private static void dispLotto(int[] lotto) {
		System.out.print("1[게임]: ");
		for (int i = 0; i < lotto.length; i++) {	
			System.out.printf("[%d]",lotto[i]);
		}
		System.out.println();
	}



}
