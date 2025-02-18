package days04;

public class Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 두 문자열을 비교할 때는 String.equals() 메서드 사용(암기)
		String n1 = "홍길동";
		String n2 = "홍길동";
		
		System.out.println(n1==n2); // 왜 입력값으로 받은값이 아니어도 true가 나오나?
		System.out.println(n1.equals(n2));

	}

}
