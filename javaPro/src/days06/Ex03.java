package days06;

public class Ex03 {

	public static void main(String[] args) {

		// for문 1~10=55 

//		int sum = 0;
//		for (int i = 0; i <= 10; i++) {
//			if(i % 2 != 0) {
//			System.out.printf("%d +", i);
//			sum += i;
//			} // 홀수의 합 
//		}
//		System.out.printf("\b=%d\n", sum);
		//---------------------------------------------
		
		// [continue문 설명]
//		int sum = 0;
//		for (int i = 0; i <= 10; i++) {
//			if(i % 2 == 0) {
//				continue;
//			} //-> for문에서 continue를 만나면 for문의 i++로 간뒤에 진행이된다
//			System.out.printf("%d +", i);
//			sum += i;
//		}
//		System.out.printf("\b=%d\n", sum);
		//----------------------------------------------
		
		// [while] 1~10, 홀수의 합 continue이용
		int sum =0;
		int i=1;
		while(i<=10) {			
//			if(i%2 ==1 ) {
//			System.out.printf("%d+",i);
//			sum+=i;
//			}
//			i++;
			if(i%2==0) {
				i++;
				continue;
			}
			System.out.printf("%d+",i);
			sum+=i;
			i++;
		}
		System.out.printf("\b=%d", sum);

	} // main

}
