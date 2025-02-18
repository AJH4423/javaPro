package days07;

public class Ex05 {
	
	public static void main(String[] args) {
		
		 // 자바 교재 pg.136
		
			라벨: for (int i = 1; i <= 9; i++) {
				for (int d = 2; d <= 9; d++) {
					if(d%5==0) break 라벨;
					System.out.printf("%d*%d=%2d ", d, i, d * i);
				}
				System.out.println();
			}
		
	} // main

} // class
