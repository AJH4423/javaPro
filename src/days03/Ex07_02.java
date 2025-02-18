package days03;

public class Ex07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 10, j= 3;
		
		System.out.println(i + j); //13
		System.out.println(i - j); //7
		System.out.println(i * j); //30
		System.out.println(i / j); //3 , 몫 연산자
		System.out.println(i % j); //1 , 나머지 연산자
//		System.out.println((double)i / j); //3.3333
		
		// 주의할 점) / % 0
//		System.out.println(10 / 0); //by zero ArithmeticException
//		System.out.println(10 % 0); //by zero ArithmeticException
		
		System.out.println(10.0 / 0); // infinity 무한대
		System.out.println(10.0 % 0); // NaN   Not a Number

	}

}
