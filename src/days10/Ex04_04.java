package days10;

import java.util.Arrays;

public class Ex04_04 {
	
	public static void main(String[] args) {
		
		// 배열 -> 더 큰 배열 복사
		
		
		int [] m = {1,2,3};
//		int [] temp = new int[m.length+3];
		
		/* [1] 반복문을 이용해서 복사
		for (int i = 0; i < m.length; i++) {
			temp[i] = m[i];
		}
		*/
		
		// [2] System.arraycopy()
//		System.arraycopy(m, 0, temp, 2, m.length-1); 
		
		//[3] Arrays.copyOf()
		int [] temp = Arrays.copyOf(m, m.length+3); // m.length+3크기의 배열을 m배열을 복제해서 생성
		
		int [] mClone = m.clone(); // 복제
		
		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.toString(temp));
		
		
		 
		
	} // main 

} // class
