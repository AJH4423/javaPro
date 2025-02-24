package days16;

// 자동차 클래스
public class Car {
	
	//필드
	String name;
	String gearType;
	int door;
	// has-a 관계 : Car + Engine
	//                      결합력이 높은코딩 : 좋은 코딩이 아님 -> 부분 수정이 불가
	// private Engine engine = new Engine(); // 명시적 초기화 X
	private Engine engine = null;
	
	// getter, setter
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	//생성자
	Car() {
		
	}

	Car(Engine engine) {
		this.engine = engine;
	}
	
	//메서드
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	
	void stop() {
		this.engine.stop();
	}
}
