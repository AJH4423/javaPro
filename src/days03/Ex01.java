package days03;

public class Ex01 {

	public static void main(String[] args) {
		
//		int a,b,c,d;
//		
//		a=b=c=d=10;
		
		double money = 1234569.7089;
		String.format("%,.2f", money);
		System.out.printf("%,.2f\n", money);
		String result = String.format("%,.2f", money);
		System.out.println(result);
		
		char a = 'x';
		char b;
		
		b = (char) (a-32);
		System.out.println( b );
		
	}

}
