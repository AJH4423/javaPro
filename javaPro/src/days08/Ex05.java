package days08;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		// 오버로딩(==중복함수)
		// drawLine()
		// drawLine(int)
		// drawLine(int, String) 
		
		int x,y,result;
		Scanner sc = new Scanner(System.in);
		System.out.print("x,y input: ");
		x=sc.nextInt();
		y=sc.nextInt();
		
//		result = x+y; -> 두 정수의 합을 반환하는 sum() 메소드를 선언, 호출
		result = sum(x,y);
		
		System.out.printf("%d+%d=%d\n",x,y,result);
		
	}

	// 메소드 선언부분
	private static int sum(int x, int y) {
		// TODO Auto-generated method stub	
		return x+y; // return 수식; -> 이런식으로 리턴값을 반환해주어도 가능
	} // main
	

}
