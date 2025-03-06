package days23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex06_02 {

	public static void main(String[] args) {

		// [Map]

		// <[K]ey, [V]alue> 
		//    Id    name
		Map<String, String> hm = new HashMap<>();
		
		hm.put("admin", "관리자");
		hm.put("AJH", "안준호");
		hm.put("hong", "홍길동");

		System.out.println(hm);

		// 1. 모든 key 출력
		Set<String> ks = hm.keySet(); // 모든 key값을 갖고있는 집합
		Iterator<String> ir = ks.iterator();
		while (ir.hasNext()) {
			String key = (String) ir.next();
			String value = hm.get(key); 
			System.out.printf("%s-%s\n",key,value); // 모든 키값 출력
		}
		
		System.out.println("-".repeat(50));
		
		// 2. 모든 value값만 출력
		Collection<String> vs= hm.values(); // valur값은 중복이 가능하기때문에 Set이아닌 Collection을 사용
		ir = vs.iterator();
		while (ir.hasNext()) {
			String value = (String) ir.next();
			System.out.println(value);
		}
		
		// 3. 모든 엔트리(key-value 쌍) 출력
		Set<Entry<String, String>> es = hm.entrySet();
		Iterator<Entry<String, String>> eir = es.iterator();
		while (eir.hasNext()) {
			Entry<String,String> entry = eir.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.printf("%s-%s\n",key,value);
		}
		
	} // main

} // class
