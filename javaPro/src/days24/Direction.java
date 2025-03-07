package days24;

public enum Direction {
	// The constructor Direction(int, String) is undefined
	EAST(100, "→"), SOUTH(200, "↓"), WEST(300, "←"), NORTH(400,"↑");
	
	//필드
	private final int value;
	private final String symbol;
	
	
	public int getValue() {
		return value;
	}


	public String getSymbol() {
		return symbol;
	}


	// 매개변수 2개짜리 생성자선언
	Direction(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}
	
	// 원하는 메서드/추상메서드 선언가능

}
