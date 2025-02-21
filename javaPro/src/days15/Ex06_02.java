package days15;

public class Ex06_02 {
	
	public static void main(String[] args) {
		
		// this의 용도 세번째
		// 단독으로 사용될때의 this용도 - 매개변수
		// new Calc().btnExec.btnExec_click();
		
		// 위와 동일한 코드
		Calc calc = new Calc();
		calc.btnExec.btnExec_click();
		
	} // main

} // class

// 계산기class
class Calc {
	
	// Button [] btns = null;
	Button btnExec = null;
	
	// 디폴트 생성자
	public Calc() {
		init(); // 계산기 초기화하는 메서드를 호출
	}

	private void init() {
		// this의 첫번째 용도
		//                  **this의 세번째 용도**
		this.btnExec = new Button("[=]", this); 
		//"[=]"을 누르면 버튼 클래스 객체에 Calc 객체를 넘겨준다 
		
	}
	
	public void execDisp(String result) {
		System.out.printf("[화면결과 출력] %s\n", result);
	}
	
} // Calc class

// 버튼class
class Button {
	
	String text; //버튼위에 나타내주는 문자들('=','+'...)
	Calc calc;
	
	public Button() {
		
	}
	
	public Button(String text) {
		this.text = text;
	}
	
	public Button(String text, Calc calc) {
		this(text);
		this.calc = calc; // 지역변수 calc이기때문에 위에서 전역으로 선언해준다
	}

	// 계산버튼을 클릭 -> 클릭 이벤트 발생 -> btnExec_click() 호출
	public void btnExec_click() {
		// 계산기에 접근할 수 있어야 된다
		// 3+5
		// 
		String result = "3+5=8";
		this.calc.execDisp(result);
	}
	
}