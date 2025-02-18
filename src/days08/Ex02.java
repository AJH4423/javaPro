package days08;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [정처기 실기] 피보나치수열 
		// 1+1+2+3+5+8+.....
		// 10개항의 합 구하기
		 
//		int index = 2;
//
//		int[] m = new int[10];
//		m[0] = 1;
//		m[1] = 1;
//		int sum = 2;
//		System.out.printf("%d+%d", m[0], m[1]);
//		
//		while (index < 10) {
//			m[index] = m[index - 1] + m[index - 2];
//			sum += m[index];
//			System.out.printf("+%d", m[index]);
//			index++;
//		}
//		
//		System.out.printf("=%d", sum);
		
		int firstTerm = 1, secondTerm = 1, thirdTerm;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+", firstTerm,secondTerm);
		int termLength = 2;
		
		while (termLength<10) {
			thirdTerm = firstTerm + secondTerm;
			System.out.printf("%d+",thirdTerm);
			sum+=thirdTerm;
			
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
			termLength++;
		}
		System.out.printf("\b=%d", sum);
	}

}
