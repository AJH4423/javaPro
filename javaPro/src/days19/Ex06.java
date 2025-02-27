package days19;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Ex06 {
	
	public static void main(String[] args) {
		
		/* [1]
		// Math클래스
		// System.out.println(Math.PI);
		out.println(PI);
		out.println(Math.PI);
		
		out.println(random());
		out.println(max(1,2));
		out.println(min(1,2));
		
		out.println(pow(2,3));
		out.println(abs(-2));
		out.println(sqrt(4));
		*/
		
		//[2]
		// 문제) 소수점 3자리에서 반올림한 결과를 출력
		double d = 3.141592;
		/*[1]
		// Math.round() -> 무조건 소수점 1번째 자리에서 반올림
		d = (double)round(d*100)/100; // 314.159
		System.out.println(d);
		*/
		//[2]
		d = Double.parseDouble(String.format("%.2f", d));
		System.out.println(d);
					
	} // main

} // class
