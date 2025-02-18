package days08;

public class Ex04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("--------------------"); // 50줄 코딩이라 가정
		drawLine(50, "*");
		System.out.println(" 부서명 : 사원명" );
		//System.out.println("--------------------"); // 50줄 코딩이라 가정
		drawLine(10);
		System.out.println(" 부서명 : 사원명" );
		System.out.println(" 부서명 : 사원명" );
		System.out.println(" 부서명 : 사원명" );
		System.out.println(" 부서명 : 사원명" );
		drawLine(); // 메소드 호출부
		//System.out.println("--------------------"); // 50줄 코딩이라 가정

	}// main
	
	// [메소드 선언부]
	// 1) 어떤기능을 하는가?(일): 라인(선)을 긋는 메소드 : darawLine(함수명)
	// 2) 매개변수 없음
	// 3) 리턴값 없음 : void
	public static void drawLine() {
		System.out.println("--------------------"); // 50줄 코딩이라 가정
	}
	
	// 메소드 오버로드[method Overload] : 동일한 메소드 명으로 중복 선언
	public static void drawLine(int length) {
		for (int i = 0; i <= length; i++) {
			System.out.print("=");
		}
		System.out.println();
	}

	public static void drawLine(int length,String style) {
		for (int i = 0; i <= length; i++) {
			System.out.print(style);			
		}
		System.out.println();
	}
	
//	public static int drawLine() {
//		System.out.println("--------------------"); // 50줄 코딩이라 가정
//		return 0;
//	}
	
	// 패키지명 + 클래스명 = 풀(full)네임
	// com.util.Graphic2D.java


}// class
