package days16;

public class Ex03_03 {
	
	public static void main(String[] args) {
		
		
		System.out.printf("%s %d %.2f %b\n", "홍길동", 20, 186.78, true);
		
		String [] names = {
				"홍길동",
				"안준호",
				"양재원",
				"정진섭"	
		};
		
		System.out.println(joinNames("-", names));
		System.out.println(joinNames("/", names));
		System.out.println(joinNames(":","홍길동","안준호","양재원"));
	} // main
	
	public static String joinNames(String delimeter, String...args) {
		return String.join(delimeter, args);
	}

} // class
