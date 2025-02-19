package days13;

public class Ex03 {

	public static void main(String[] args) {

		// 가변배열 -> 행마다 열이 다른 배열
		// 3반 학생 성적 처리
		// 1반 25명, 2반 28명, 3반 20명
		int [][] m = new int[3][];
		m[0] = new int[25];
		m[1] = new int[28];
		m[2] = new int[20];

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
