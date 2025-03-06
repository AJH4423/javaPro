package days23;

import java.util.TreeSet;

public class Ex05_02 {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("abc");      ts.add("alien");    ts.add("bat");
		ts.add("car");      ts.add("Car");      ts.add("disc");
		ts.add("dance");    ts.add("dzzz");     ts.add("dzzzz");
		ts.add("elephant"); ts.add("elevator"); ts.add("fan");
		ts.add("flower");

		System.out.println(ts);
		
		// [abc, alien, bat, car]
		System.out.println(ts.subSet("a", "d")); // a로시작하면서 d로시작하는 단어 직전까지 가져오기
		
		// [car, dance, disc]
		System.out.println(ts.subSet("c", "dzzz")); 
		
	} // main

}
