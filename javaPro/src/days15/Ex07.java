package days15;

public class Ex07 {

	public static void main(String[] args) {

		// [static 키워드]
		/*
		 * 기업은행: 이자율이 동일한 보통에금(적금)
		 * 저축 관련된 클래스 선언 : Save 클래스 선언
		 * 
		 * */ 
		
		// 필드,메서드 접근방법: 객체명.변수/메서드() 
		// 클래스명 접근방법: 클래스명.클래스변수
		// The field Save.rate is not visible
		// -> getter, setter로 접근
		//Save.rate = 0.08;
		
		/*[1]
		// 이자율은 모두 동일
		Save s1 = new Save("권태정",10000,0.04);
		Save s2 = new Save("김가은",20000,0.04);
		Save s3 = new Save("김도훈",30000,0.04);
		Save s4 = new Save("김민선",40000,0.04);
		Save s5 = new Save("김승효",50000,0.04);

		s1.printSave();
		s2.printSave();
		s3.printSave();
		s4.printSave();
		s5.printSave();
		 */

		/*[2]
		// 클래스 배열 
		Save [] sArr = new Save[5];
		sArr[0]=new Save("권태정",10000,0.04);
		sArr[1]=new Save("김가은",20000,0.04);
		sArr[2]=new Save("김도훈",30000,0.04);
		sArr[3]=new Save("김민선",40000,0.04);
		sArr[4]=new Save("김승효",50000,0.04);

		for (int i = 0; i < sArr.length; i++) {
			sArr[i].printSave();
		} // for i
		 */

		
		//[3] 클래스 배열 초기화
		Save [] sArr = {
				new Save("권태정",10000,0.04),
				new Save("김가은",20000,0.04),
				new Save("김도훈",30000,0.04),
				new Save("김민선",40000,0.04),
				new Save("김승효",50000,0.04)
		};
		//Save.setRate(0.08);
		sArr[0].setRate(0.06);
		System.out.println(Save.getRate());

		for (Save s : sArr) {
			s.printSave();
		}
		
		
		
		
		
	} // main

}
