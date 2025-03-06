package days23;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Ex06 {

	public static void main(String[] args) {

		/* [Map]
		 * 1. 키 - 값(엔트리) 쌍으로 데이터를 저장하는 구조
		 * 2. 키는 중복을 허용하지 않는다
		 * 3. Map인터페이스를 구현한 클래스
		 * 		1) HashMap : 신버전, 대표적인 Map클래스이다           <ArrayList, StringBuilder>
		 *      4) Hashtable : 구번전, 멀티스레드에 안전(동기화처리o)	  <Vector, StringBuffer>	
		 *       Hash - 해싱이라는 기법을 사용해서 데이터를 저장 -> 검색 성능이 뛰어나다
		 *       
		 *       해싱기법 - 해시함수(hash function)을 이용해서
		 *       		 데이터를 해시테이블(hash table)에 저장하고 검색하는 기법
		 *       	   - 해시함수는 데이터가 저장되어 있는 곳을 알려 주기 떄문에
		 *       		 다량의 데이터 중에 원하는 데이터를 빠르게 검색할 수 있다.
		 *       	
		 * 		2) TreeMap : 검색,정렬 성능 좋음
		 * 		3) LinkedHashMap : 순서유지o
		 * */

		// <[K]ey, [V]alue> 
		//    Id    name
		HashMap<String, String> hm = new HashMap<String, String>();
		// LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		hm.put("admin", "관리자");
		hm.put("AJH", "안준호");
		hm.put("AJH", "서주원");
		hm.put("hong", "홍길동");
		// {hong=홍길동, admin=관리자, AJH=안준호}
		// {admin=관리자, AJH=안준호, hong=홍길동} -> LinkedHashMap
		System.out.println(hm);

		//검색, 수정, 삭제 - [key], value
		// "AJH"키
		// System.out.println(hm.containsKey("AJH"));
		// hm.containsValue("안준호");

		// value 바꾸기
		if (hm.containsKey("AJH")) {
			// 엔트리(Entry)를 찾아와야함
			// String value = hm.get("AJH");
			// System.out.println(value);
			hm.put("AJH", "서주원"); //안준호 -> 서주원으로 바뀜
			// hm.replace("AJH", "서주원"); -> put과 동일
		} // if
		// System.out.println(hm);
		// hm.clear();

		hm.put("park", "서주원");
		hm.put(null, null);
		hm.put(null, "널");

		// null 키의 엔트리 삭제
		System.out.println(hm.remove(null)); // 삭제된 엔트리의 Value값을 반환해줌

		System.out.println(hm);

		//String value = hm.get("AJH"); // 서주원
		//String value = hm.get("abc"); // null
		String value = hm.getOrDefault("abc","익명"); // 특정 키의 밸류값을 반환해줌
		System.out.println(value); 

		// merge() 병합 메서드
		Map<String, Integer> map = new HashMap<>();

		// 초기 데이터 추가
		map.put("apple", 1);
		map.put("banana", 2);

		// merge() 메서드 사용 예
		map.merge("apple", 3, (oldValue, newValue) -> oldValue + newValue);  // 기존 값 + 새 값(1+3)
																			 // oldValue와 같은 변수명은 바꿔도 됨
		map.merge("banana", 1, (oldValue, newValue) -> oldValue + newValue); // 기존 값 + 새 값(2+1)
		map.merge("cherry", 5, (oldValue, newValue) -> oldValue + newValue); // cherry는 처음 등장(엔트리추가)

		System.out.println(map);

	} // main

} // class
