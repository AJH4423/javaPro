package days08;

public class Ex11_02 {

	public static void main(String[] args) {
		
		// 1~10까지의 합 재귀함수를 이용해서 구하기
		int result;
		result = reculsiveSum(10);
		
		System.out.printf("result: %d", result);
	}// main

	private static int reculsiveSum(int i) {
		if (i==1) {
			return 1;
		} else {
			return i + reculsiveSum(i-1);
		}
	}

}// class
