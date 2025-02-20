package days14;

public class Ex01_02 {

	public static void main(String[] args) throws InterruptedException {

		int [][] m = new int[5][5];

		magicSquare(m); // 마방진 문제

		dispM(m);

	} // main

	private static void magicSquare(int[][] m) throws InterruptedException {

		// 강사님 코드
				// 1 숫자의 위치
				int v = 1;
				int row, col;
				int nextRow, nextCol;
				row = 0; // 첫 번째 행
				col = m[0].length/2; // 가운 데 열
				m[row][col] = v++;   


				while (v<=m.length*m[0].length) {
					
					Thread.sleep(1000);
					dispM(m);

					// 1. 열 증가 , 행 감소
					nextCol = col + 1;
					nextRow = row - 1;
					// 2. 행 벗어난 경우  row=0   감소  row=-1
					if( nextRow == -1 ) nextRow = m.length-1; // 4
					// 3. 열 벗어난 경우
					if( nextCol == m[0].length   ) nextCol = 0; 
					// 4. 그 다음 위치에 값이 있는 경우
					if( m[nextRow][nextCol] != 0) {
						nextRow = row + 1;
						nextCol = col;
					}
					
					row = nextRow;
					col = nextCol;
					m[row][col] = v++;

				} // while

		
		
		/* 내가 짠 코드 나중에 완성시키기 
		 * -> 열이 벗어난 조건을 훑어야하는데 
		 * 행 조건도 빠져나갔기에 값을 넣지 못하고 충돌이 일어남
		int row=0,col=0; // 행,열
		int v=1;
		int startCol = (col + m[row].length-1)/2; // 처음 시작값 행열위치
		int n = m.length*m[0].length; // 수행횟수

		m[row][startCol]=v; // 첫번째값 대입

		for (int i = 0; i < n; i++) {
			startCol++;
			row--;
			v++;
			if(v==n+1) break;

			if (row<0) { // 행 벗어날때 조건
				row = m.length-1;
				m[row][startCol]=v;
			} // if
			if (startCol>m[0].length-1) { // 열 벗어날때 조건
				startCol=0;
				m[row][startCol]=v;
			} // if	
			else if (m[row][startCol]!=v&&m[row][startCol]!=0) { 옮긴 위치에 값이 있을때 조건
				startCol--;
				row++;
				row++;
				m[row][startCol]=v;
			} // if
			else m[row][startCol]=v;
		} // for i
		 */

		


	}

	private static void dispM(int[][] m) {
		System.out.println("     0열 1열 2열 3열 4열");

		for (int i = 0; i < m.length; i++) {           // 행크기
			System.out.printf("%d행 " , i);
			for (int j = 0; j < m[i].length; j++) {    // 열크기
				System.out.printf("[%2d]", m[i][j]);
			} // for j
			System.out.println(); // 개행
		} // for i
	}

}
