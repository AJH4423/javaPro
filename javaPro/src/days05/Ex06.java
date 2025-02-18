package days05;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		      
		// [while] 1~10 합
		
		int i =1;
		int sum =0;
		
		while (true) { // 무한루프
			if(i==11) break; //break문
			System.out.printf("%d+", i);
			sum += i;
			i++;
		}
		
		System.out.printf("\b=%d",sum);
		
	}// main

}// class
