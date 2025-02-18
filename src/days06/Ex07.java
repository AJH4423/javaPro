package days06;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 과제) 순서도 1~100 홍수의 함 for/while문에 대해 작성
		
		// ascii + for문 출력
		// 256가지 문자
		// 0~31 제어문자
		// 31~127 일반문자(대65~, 소97~, 숫48~)
		// 128~
		
		for (int i = 0; i < 256; i++) {
			System.out.printf("[%d(%c)]\n", i, (char)i);
			
		}

	}

}
