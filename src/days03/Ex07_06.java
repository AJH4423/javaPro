package days03;

public class Ex07_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ?:  삼항연산자 또는 조건연산자
		int x =30, y;
//		y = x > 10 ? 1 : 2; // x > 10의 값이 참이면 1(항2)이 나오고 거짓이면 2(항3)가 나옴
		//     ㄴ x>10은 참이기 때문에 항2에 해당하는 값인 1이 나옴
		
		y = (x > 5 ? (x > 10 ? 1 : 2): 200); //삼항 연산자 안에 중첩적으로 삼항 연산자가 올수 있다.
		System.out.println( y );

	}

}
