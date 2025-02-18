package days03;

public class Ex06_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = Integer.MAX_VALUE;
		int j = 200;
		long k = i+(long)j; //값을 넣어주는곳을 더 큰 자료형으로 고쳐줘야 하고 
		                    //담는곳도 그에 맞는 자료형으로 고쳐줘야함 
		
		System.out.printf("%d + %d = %d",i ,j, k);
		// int형의 크기보다 넘치는 값이 되어버림 = 산술 오버플로워 발생...
		
	}// main

}// class
