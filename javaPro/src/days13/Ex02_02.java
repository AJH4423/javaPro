package days13;

public class Ex02_02 {
	
	public static void main(String[] args) {
		
		// 2차원 배열의 초기화
		// 배열의 배열이다(의미 이해하기)
		/*
		int [][] m = new int[2][4]; //2행4열 int 2차원 배열
		m[0][0]=1;m[0][1]=2;m[0][2]=3;m[0][3]=4;
		m[1][0]=5;m[1][1]=6;m[1][2]=7;m[1][3]=8;
		*/
		
		/*
		int [][] m = new int[][] {
			{1,2,3,4}, //0행
			{5,6,7,8}, //1행
		};
		*/
		
		int [][] m = {
			{1,2,3,4}, //0행
			{5,6,7,8}, //1행
		};
		
		
		dispM(m);
		
	} // main

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) { //행크기
			for (int j = 0; j < m[i].length; j++) { //열크기
				System.out.printf("m[%d][%d]=%d ",i,j,m[i][j]);
			} // for j
			System.out.println();
		} // for i
		
	}

} // class
