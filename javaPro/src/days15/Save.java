package days15;

// 저축과 관련된 클래스
public class Save {

	// 필드
	// 인스턴스 변수(필드) -> 인스턴스가 만들어질때마다 생성되는 기억공간에 할당됨
	private String name; // 예금주
	private int money; // 예금액
	
	// 클래스(static) 변수(필드), 공유변수(shared), 정적(static) 변수
	// 인스턴스가 만들어지지 않더라도 클래스가 만들어질때 이미 만들어져있는 변수, 모든 인스턴스마다 공유해서 사용함
	private static double rate = 0.04; // 이자율


	// 생성자 Alt + Shift + S
	// 디폴트 생성자
	public Save() {

	}

	// 3개 생성자
	public Save(String name, int money, double rate) {
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	// 메서드
	// 인스턴스 메서드: 객체가 생성되어야지 사용가능한 메서드
	public void printSave() {
		System.out.printf("> 예금주:%s, 예금액:%d, 이자율:%.2f\n"
				, this.name, this.money, this.rate);
	}

	// getter, setter (단축키로 자동으로 만듬)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 클래스(static,정적) 메서드
	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		// Cannot use this in a static context
		// this는 객체이기에 static안에서는 못씀
		//this.rate = rate;
		Save.rate = rate;
	}
	
}
