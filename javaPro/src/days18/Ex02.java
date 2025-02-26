package days18;

public class Ex02 {
	
	public static void main(String[] args) {
		
		/*
		Ex00 obj = new Ex00();
		obj.aaa();
		obj.bbb();
		obj.ccc();
		*/  
		
		/*
		//인터페이스에 업캐스팅
		IC obj = new Ex00();
		obj.aaa();
		obj.bbb();
		obj.ccc();
		*/
		
		/*
		// 부모 인터페이스에도 업캐스팅이 가능하다.
		IA obj = new Ex00();
		obj.aaa();
		// obj.bbb();
		// obj.ccc();
		*/
	} // main

} // class

interface IA{
	void aaa();
}
interface IB{
	void bbb();
}
//인터페이스 끼리 상속할 때 사용하는 키워드 : extends
interface IC extends IA, IB{
	//void aaa();
	//void bbb();
	void ccc();
}

class Ex00 implements IC{

	@Override
	public void aaa() {
		// 
		
	}

	@Override
	public void bbb() {
		// 
		
	}

	@Override
	public void ccc() {
		// 
		
	}
	
}