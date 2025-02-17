package days10;

public class Ex02_02 {

	public static void main(String[] args) {

		//[정처기 실기문제]

		int money = 125760;
		int unit = 50000;
		boolean sw = false;
		int num =0;

		while (unit>=1) {
			num = money/unit;
			System.out.printf("%d원 : %d 개\n",unit,num);
			money %= unit;
			unit = unit/( sw ? 2 : 5 );
			sw = !sw;
		}

	} // main

}
