package days03;

public class Ex07_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//[논리연산자]
		
		/*
		 * 1. 일반 논리 연산자
		 * 		1) !  : 부정연산자 또는 Not연산자
		 * 		2) && : 일반논리 AND연산자 (논리곱)
		 * 				true && true >> true
		 * 				false && true >> false
		 * 				true && false >> false
		 * 				false && false >> false
		 * 
		 * 		3) || : 일반논리 OR연산자 (논리합)
		 * 				true || true >> true
		 * 				false || true >> true
		 * 				true || false >> true
		 * 				false || false >> false
		 * 
		 * 연산자 우선순위 : !  > && > ||
		 * 
		 * 2. 비트 논리 연산자
		 * 		1) ~ : 비트 부정 연산자 또는 틸트 연산자
		 * 		2) & : 비트 논리 AND연산자
		 * 		3) | : 비트 논리 OR연산자
		 * 		4) ^ : e[X]clusive(배타적인) OR 연산자, XOR연산자
		 * 
		 * 논리 연산자 우선순위 : ~ > & > ^ > | > && > ||
		 * */
		
		System.out.println(10); //10
		System.out.println(~10); //-11 (1111 0101)
		// ㄴ 0000 1010 -> 1111 0101 (1111 0100 > 0000 1011 > 11 > -11)
		
		System.out.println(10 & 3); // 2
		//   0000 1010
		// & 0000 0011
		//   0000 0010 >> 두 수가 1인 경우에만 1이 되는 연산 
		
		System.out.println(10 | 3); // 11
		//   0000 1010
		// | 0000 0011
		//   0000 1011 >> 두 수중 하나만 1인 경우에도 1이 되는 연산
		
		System.out.println(10 ^ 3); // 9 
		//   0000 1010
		// & 0000 0011
		//   0000 1001 >> 서로 다를때 경우에만 1이 되는 연산
		                    
		
		//연산자 우선 순위 파악 : !가 >< 보다 더 우선임
		// 자바에서 부정연산자는 무조건  boolean형 앞에서만 사용될 수 있다.
//		System.out.println(!5 > 3); //false
		
		
//		System.out.println(!true); // false
//		System.out.println(!false); // true
//		
//		System.out.println(3>5 && 5<7); // false, 효율적연산(short circuit evaluation)
//										//			ㄴ 앞에것이 false이면 뒤에것은 확인안해도 이미false임
//		
//		System.out.println(3>5 || 5<7); // 앞에가 이미 true 즉, true(뒤 확인안함) 

	}

}
