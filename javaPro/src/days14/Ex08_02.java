package days14;

public class Ex08_02 {
	
	public static void main(String[] args) {
		
		// [**클래스 배열 선언**]
		// [배열 선언 형식]
		// 자료형 [] 배열명 = new 자료형[배열크기]
		
		Person [] pArr = new Person[5]; // 객체 생성한것이 아닌 배열만 생성한것임
		// 인스턴스를 선언해주지 않았기때문에 객체 주소만 참조하려는 배열의 5칸만 만들어져있고 배열값에는
		// 클래스 기본값인 null이 들어가있음
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i] = new Person();
		} // for i 배열에 객체를 생성해주는 코드를 추가
		
		// 5명의 사람(Person)이 필요
		pArr[0].name = "권태정";	
		pArr[1].name = "김가은";		
		pArr[2].name = "김도훈";		
		pArr[3].name = "김민선";		
		pArr[4].name = "김승호";
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].work();
		} // for i
				
	} // main

}
