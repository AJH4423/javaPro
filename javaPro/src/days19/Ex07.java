package days19;

public class Ex07 {
	
	public static void main(String[] args) {
		
		// [Wrapper 클래스]
		// (참고) 제네릭은 기본형 타입을 쓰지않고 Wrapper클래스를 이용한다. 
		
		//[Auto Boxing] [Auto UnBoxing] 용어 이해
		int i = 100;
		Integer j = i; 
		// j는 객체이다 -> 객체 = 일반값 : Auto Boxing(기본형이 래퍼 클래스로 변환)
		
		int k = j; // Auto UnBoxing(래퍼클래스 -> 기본형 변환)
		
		disp(i); // int -> Integer -> Object 가능 : Auto Boxing
				 // 매개변수에 Object이면은 모든 타입이 와도된다.
		
		
		// Integer j = new Integer(100);
		// int k = j.intValue();
		// Integer j = new Integer(100);
		// Integer j = Integer.valueOf("100");
		
	} // main
	
	public static void disp(Object obj) {
		System.out.println(obj);
	}

} // class
