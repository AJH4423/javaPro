package days22;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex07_04 {
	
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("Usage : java ExpValidCheck\"EXPRESSION\"");
			System.out.println("Example : java ExpValidCheck\"((2+3)*1)+3\"");
			System.exit(0);
		} // if
		
		Stack st = new Stack(); // LIFO -> 마지막들어간걸 처음에 끄집어내겠다
		String expression = args[0]; // ((2+3)*1)+3
		
		System.out.println("expression: " + expression);
		
		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if (ch=='(') {
					st.push(ch+""); // '('을 "("인 문자열로 저장하기위함
				} else if(ch==')'){
					st.pop();
				}
				
			}
			if (st.isEmpty()) {
				System.out.println("괄호 일치 o");
			} else {
				System.out.println("괄호 일치 x");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호 일치 x");
		}
		
	} // main

} // class
