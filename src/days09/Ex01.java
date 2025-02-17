package days09;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int i;								
		System.out.printf("\b=%d",primeSum());


	} // main

	private static int primeSum() {

		int sum=0;

		for (int i = 2; i <=100 ; i++) {
			if (isPrime(i)) {
				System.out.printf("%d+",i);
				sum+=i;
			} 
		}

		return sum;
	}

	private static boolean isPrime(int i) {

		int check=0;
		for (int j = 2; j<i; j++) {
			if(i%j==0) {
				check=1;
				break;
			}
		}
		if (check==0) {
			return true;
		} else {
			return false;
		}		
	}

}// class
