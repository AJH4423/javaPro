package days03;

public class Ex06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [형 변환]
		 * 1. 자동 형변환
		 * 		1)
		 * 		2)
		 * 2. 강제 형변환
		 * 
		 * 
		 * */
		//[자동 형변환]
		int i = 100;
		long J = i; // 작은 크기의 값이 더 큰 크기의 자료형에 대입이 되는건 자동으로 형변환이 됨
		            // 반대의 경우는 자동 형변환이 안됨 이때는 강제 형변환을 해줘야함
		
		//[자동 형변환]
		// int + double = double (크기가 더 큰 double로 나옴)
		
		// 강제 형변환 : () - CAST연산자
		int i2 = (int)0L; 

	}

}
