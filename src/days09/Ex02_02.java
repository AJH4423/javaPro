package days09;

public class Ex02_02 {
	
	public static void main(String[] args) {
		
		// 재귀함수 : 거듭제곱
		// 2^3 -> 2:밑수(base), 3:지수(exponent,ppower)
		
		// double result = power(2,-3);
		double result = reculsivePower(2,-3);
		System.out.printf("%.3f",result);
		
	} // main

	private static double reculsivePower(int b, int e) {
		
		if(e<0) return 1/reculsivePower(b,-e);		
		else if(e==1) return b;
		else return b*reculsivePower(b,e-1);
		
	}

	private static double power(int b, int e) {
		
		double result = 1;
		int e2 = Math.abs(e);
		for (int i = 1; i<=e2; i++) {			
			result *=b;
		}
	
		return e<0?(double)1/result:result;
	}

} // class
