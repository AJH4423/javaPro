package days09;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// 재귀함수
		// 팩토리얼(factorial) == n! [자연수에서만 정의된다]
		// 0! = 1로 정의한다
		
		//int result = factorial(5);
		int result = reculsiveFactorial(5);
		System.out.printf("\b=%d",result);
		
	} // main

	private static int reculsiveFactorial(int n) {
		if (n==1 || n==0) {
			return 1;
		} else {
			return n*reculsiveFactorial(n-1);	
		}
	}

	private static int factorial(int n) {
		
		int result =1;
		for (int i = 1; i <=n; i++) {
			System.out.printf("%d*",i);
			result *= i;
		}
		
		return result;
	}

} // class
