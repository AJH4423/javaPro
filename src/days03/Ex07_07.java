package days03;

public class Ex07_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// [증감 연산자 ++ --]
		// 문제) 어떤 기억공간의 값을 1 증감 시키는 코딩을 하세요
		
		int x = 10;
		// x=11;
		// 1) x = x + 1;     x = x -1;
		// 2) x += 1;        x -= 1;
		// 3) x++;           x--;  --> 다른 변수에 대입할때는 결론이 달라질것
		// 4) ++x;           --x;  --> 다른 변수에 대입할때는 결론이 달라질것
		// ++x,--x: 전위형
		// x++,x--: 후위형
        // int y = ++x; >> x = 11, y = 11 
		// int y = x++; >> 다른연산자가 먼저처리되기에 대입이 먼저이루어지고 1증가된다.
		//                      ㄴ x = 11, y = 10 
		System.out.println(x);
		
		
	}// main

}// class
