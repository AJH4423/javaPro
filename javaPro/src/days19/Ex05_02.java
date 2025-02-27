package days19;

public class Ex05_02 {
	
	public static void main(String[] args) {
		
		/* [1]
		// long start = System.currentTimeMillis();
		long start = System.nanoTime();
		int sum = 0;
		for (int i = 0; i < 100000000; i++) {
			sum += i;
		} // for i
		// long end = System.currentTimeMillis();
		long end = System.nanoTime();
		// System.out.println("처리시간 : " + (end-start) + "ms");
		System.out.println("처리시간 : " + (end-start) + "ns");
		*/
		
		// [2]
		//testString();
		
		testStringBuffer();
		
	} // main

	// StringBuffer()이용 -> 처리속도가 훨씬 빠르다
	private static void testStringBuffer() {
		
		long start = System.nanoTime();
		// String s = "a";
		StringBuffer s = new StringBuffer("a");
		for (int i = 0; i < 2000000; i++) {
			s.append("a");
		} // for i
		long end = System.nanoTime();
		System.out.println("처리시간 : " + (end-start) + "ns");
		
	}

	// 문자열 변경 작업이 필요할때는 String클래스가 아닌 StringBuffer 또는 StringBuilder를 이용해야한다
	// String클래스는 변경 불가능하기 때문에 시간이 너무 오래걸린다
	private static void testString() {
		
		long start = System.nanoTime();
		String s = "a";
		for (int i = 0; i < 2000000; i++) {
			s += "a";
		} // for i
		long end = System.nanoTime();
		System.out.println("처리시간 : " + (end-start) + "ns");
	}

} // class
