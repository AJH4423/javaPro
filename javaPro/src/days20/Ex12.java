package days20;

import java.text.ChoiceFormat;

public class Ex12 {

	public static void main(String[] args) {

		// [ChoicFormat 클래스]
		// 특정 범위에 속하는 값을 문자열로 반환해 주는 클래스
		// 에) 국어점수 -> 수/우/미/양/가 출력
		int [] kors = { 100, 57,  95, 88, 77, 80, 0 };

		/* [1]
		//				낮은 값부터			
		double [] limits = {0,60,70,80,90};
		String [] formats = {"가","양", "미", "우","수"};

		ChoiceFormat cf = new ChoiceFormat(limits, formats);
		*/
		
		//[2]
		String newPattern = "0#가|60#양|70#미|80#우|90#수";
		ChoiceFormat cf = new ChoiceFormat(newPattern);
		
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d점수 - %s등급\n", kors[i], cf.format(kors[i]));
		} // for i

	} // main

} // class
