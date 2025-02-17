package days09;

public class Ex04_06 {

	public static void main(String[] args) {

		String rrn = "980410-1182511";

		int sum = 0;
		String nohypen = "";

		for (String tmp : rrn.split("-")) {
			nohypen += tmp;
		}
		System.out.println(nohypen);

		for (int i = 0; i <= 11; i++) {
			char a = nohypen.charAt(i);
			int k = Integer.parseInt(a + "");
			sum += k * (2 + i % 8);
		}

		int result = (11 - (sum % 11)) % 10;

		if (Integer.parseInt(nohypen.charAt(12) + "") == result)
			System.out.println("유효");

	} // main

}
