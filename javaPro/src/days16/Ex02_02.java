package days16;

import java.util.Arrays;
import java.util.Collections;

public class Ex02_02 {

	public static void main(String[] args) {

		String n = "String";
		/*
		// 1. n문자열을 오름차순으로 문자를 정렬		 
		char [] nArr = n.toCharArray();
		Arrays.sort(nArr);
		n=String.valueOf(nArr);
		System.out.println(n);
		// -> Sginrt
		 */ 

		// 2. 내림차순 정렬 
		/* [1]
		char [] nArr = n.toCharArray();
		Arrays.sort(nArr);

		char [] reversenArr = new char[nArr.length];

		for (int i = nArr.length-1; i >=0 ; i--) {
			// System.out.printf("%c",nArr[i]);
			reversenArr[nArr.length-1-i] = nArr[i];
		} // for i -> trnigS
		n = String.valueOf(reversenArr);
		System.out.println(n);
		 */

		/*
		//[2]
		char [] nArr = n.toCharArray();
		for (int i = 0; i < nArr.length; i++) {
			for (int j = 0; j < nArr.length; j++) {
				if((char)nArr[i] < (char)nArr[j]) {
					char temp ; 
					temp = nArr[i];
					nArr[i] = nArr[j];
					nArr[j] = temp;
					;
				} // if
			} // for j
		} // for i

		System.out.println(Arrays.toString(nArr));
		 */

		/*
		//[3]
		char [] nArr = n.toCharArray();
		Arrays.sort(nArr);
		for (int i = 0; i < nArr.length / 2; i++) {
			char temp = nArr[i];
			nArr[i] = nArr[nArr.length - 1 - i];
			nArr[nArr.length - 1 - i] = temp;
		}
		 */

		//[4] 암기하면 좋을듯(제네릭 이용)
		String [] nArr = n.split(""); //-> String 배열로 만들 수 있음
		System.out.println(Arrays.toString(nArr));
		Arrays.sort(nArr, Collections.reverseOrder()); // -> 제네릭 이용
		System.out.println(Arrays.toString(nArr));
		n = String.join("", nArr);
		System.out.println(n);

	} // main

} // class
