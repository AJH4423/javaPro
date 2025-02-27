package days19;

import java.util.StringTokenizer;

public class Ex05_04 {
	
	public static void main(String[] args) {
		
		// StringTokenizer 클래스, StringJoiner 클래스		
		String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
		//		    [Token] [Token] [Token] [Token] [Token]
		//[1]권장
		// String [] teamArr = team1.split("\\s*,\\s*");
		
		//[2]
		StringTokenizer st = new StringTokenizer(team1, ", ");
		// System.out.println(st.countTokens());
		// true/false st.hasMoreTokens() -> boolean형
		// st.nextToken();
		while (st.hasMoreTokens()) { // false
			String name = st.nextToken();
			System.out.println(name);
		}
		
	} // main

}
