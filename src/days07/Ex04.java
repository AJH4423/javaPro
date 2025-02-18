package days07;

public class Ex04 {
	
	public static void main(String[] args) {
		
		// 구구단 출력 - 가로로 출력
		
		for (int d = 2; d <= 9; d++) {
			for (int i = 1; i <=9; i++) {
				System.out.printf("%d*%d=%2d ",d,i,d*i);
			}
			System.out.println();
		}
		
	} // main

}
