package days18;

import days15.MyPoint;

public class Ex10 {

	public static void main(String[] args) {

		// [Object 클래스]
		// 모든 클래스의 최상위 부모 클래스
		/*[1] hashcode()
		Value v1 = new Value(10);
		int hashCode = v1.hashCode(); // 객체 자신의 해시코드값
		System.out.println(hashCode);

		Value v2 = new Value(10);
		hashCode = v2.hashCode(); // 객체 자신의 해시코드값
		System.out.println(hashCode);

		Value v3 = v1;
		hashCode = v3.hashCode(); // 객체 자신의 해시코드값
		System.out.println(hashCode);
		 */

		/*[2] getClass()
		Value v1 = new Value(10);
		Class cls = v1.getClass(); // 객체의 클래스 정보를 [C]lass 반환하는 메서드
		String fullname = cls.getName();
		System.out.println(fullname); //days18.Value -> 패키지명+클래스명
		// 메서드, 생성자, 필드 중 모든 클래스 정보를 얻어올 때 사용하는 메서드

		[3] toString()
		// days18.Value@3ac3fd8b -> fullName + @16진수 hashcode --> toString()
		System.out.println(v1.toString());// 객체 자신의 정보를 문자열으로 반환하는 메서드
		System.out.println(v1); // toString() 생략해도 된다.

		System.out.printf("%s@%x", cls.getName(),v1.hashCode());
		 */

		//[4] equals()
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		// v1  v2객체 같은가?
		System.out.println(v1 == v2); //false

		Value v3 = v1; // 객체 복사(copy)
		System.out.println(v1 == v3); //true

		// [1] Object.equals() 메서드를 오버라이딩하지 않으면 == 연산자 동일한 기능이다
		// [2] 오버라이딩 -> int value필드 필드값이 같으면 같은 객체이다..true
		System.out.println(v1.equals(v2)); // false
		System.out.println(v1.equals(v3)); // true

		MyPoint p1 = new MyPoint(1,2);
		Value v4 = null;
		System.out.println(v1.equals(v4)); // false

		System.out.println(v1.toString()); // [value=10]
		System.out.println(v1); // [value=10]


	} // main

} // class

class Value extends Object{

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Value && obj != null) {
			Value v = (Value)obj; //다운캐스팅
			return v.value == this.value;
		} // if
		return false;
	}

	@Override
	public String toString() {
		return String.format("[value=%d]", this.value);
	}

	// 필드
	int value;

	// 생성자
	public Value(int value) {
		this.value = value;
	}

	// 메서드 x
}
