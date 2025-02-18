package days04;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String input = "1 fish 2 fish red fish blue fish";
//	     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		 Scanner s = new Scanner(input);
		 s.useDelimiter("\\s*fish\\s*"); // 정규표현식(String regex) -> 구분하는 기준
		 //    \s : space : 공백
		 //    * : 반복횟수 : 0~여러번
		 
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();
	}

}
