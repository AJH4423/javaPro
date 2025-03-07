package days24;

public class Ex09_03 {
	
	public static void main(String[] args) {
		
		// Card 열거형
		// 열거형 상수에 특정값을 부여하여 사용하는 경우가 더 많다
		// 부여 방법 : 상수(값,값...)
		
		Direction [] dirArr = Direction.values();
		for (Direction d : dirArr) {
			System.out.printf("name:%s, value=%d, symbol=%s \n"
					, d.name(), d.getValue(), d.getSymbol());
		}
		
		
	} // main

} // class
