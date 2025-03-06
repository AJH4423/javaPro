package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {

		int [] a = {1,2,3,4,5};
		int [] b = {4,5,6,7,8};

		// [문제1] a,b의 합집합 구하기

		/*[1]
		// int [] c = new int[a.length + b.length];
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i ; 
		for ( i = 0; i < a.length; i++) {
			//c[i] = a[i];
			al.add(a[i]);
		} // for i
		// System.out.println( i ); // 5
		for (int j = 0; j < b.length; j++) { 
			//  b[j];
			//if( Arrays.binarySearch(a, b[j]) < 0 )  c[i++] = b[j];
			if( Arrays.binarySearch(a, b[j]) < 0 )  al.add( b[j] );
		} // for i

		// System.out.println( Arrays.toString( c ) );
		System.out.println( al );
		 */

		//[2]
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			al.add(a[i]);
		} // for i

		ArrayList<Integer> bl = new ArrayList<Integer>();
		for (int i = 0; i < b.length; i++) {
			bl.add(b[i]);
		} // for i

		System.out.println(al);
		System.out.println(bl);

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.addAll(al);
		hs.addAll(bl);
		System.out.println(hs);
		
		// [문제2 a,b의 차집합]
		// [문제3 a,b의 교집합]
		 

	} // main

} // class
