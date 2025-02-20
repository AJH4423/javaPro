package days14;

public class Ex07 {
	
	public static void main(String[] args) {
		
		// 클래스 복사(copy)
		// 클래스 복제(clone) - 얕은 복제/ 깊은 복제
		
		/*
		 *   인스턴스 											객체
		 *  [color][power][channel][][][]                 [0x100참조]
		 *   0x100                 	                        t1
		 *   
		 *   											  [0x100참조]
		 *   												t3
		 *   
		 *   인스턴스											객체
		 *   [color][power][channel][][][]                 [0x200참조]
		 *   0x200                                           t2
		 *   						
		 *   					
		 *   						
		 *   						
		 *   						
		 *   					[power()][channelUp()][channelDown()]
		 * 
		 * */
		
		Tv t1 = new Tv();
		
		// 클래스(객체) 복제(clone)
		Tv t2 = new Tv();
		t2.channel = t1.channel;
		t2.power = t1.power;
		t2.color = t1.color;
		
		// 클래스(객체) 복사(copy), 인스턴스는 생성이 안됨
		Tv t3 = t1; // 같은 주소를 참조하게됨
		
		t1.color = "red";
		System.out.println(t1.color); // red
		System.out.println(t3.color); // red
		
		objectCopy(t1);
		System.out.println(t1.color); // blue
		
	} // main

	//                 			 Tv t = t1; 클래스 복사
	private static void objectCopy(Tv t) {
		t.color = "blue";	
	}

} // class
