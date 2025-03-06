package days23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;


public class Ex07 {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\user\\Desktop\\복습문제\\1차_조편성.txt";
		String line = null;

		// HashMap으로 다시 구현
		// ArrayList<ArrayList<String>> class5 = new ArrayList<>();
		HashMap<String, ArrayList<String>> class5 = new HashMap<>(); // key: 팀명, value: 이름

		String [] lineArr = null;
		ArrayList<String> team = null;

		try (FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);   ){

			while ( (line = br.readLine())!= null) {
				team = new ArrayList<String>(); //  
				lineArr = line.split("[/:]");
				String teamName = lineArr[0];
				for (int i = 1; i < lineArr.length; i++) {
					team.add( lineArr[i] );
				} // for i

				// class5.add(team);
				class5.put(teamName, team);

			} // while

			// 각 팀원 출력형식 출력 
			dispClass(class5);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		System.out.println("end");
	} // main

	// 반복자 사용해서 출력.
	private static void dispClass(HashMap<String, ArrayList<String>> class5) {
		
	      Set<Entry<String, ArrayList<String>>> es = class5.entrySet();
	      Iterator<Entry<String, ArrayList<String>>> ir = es.iterator();
	      while (ir.hasNext()) {
	         Entry<String, ArrayList<String>> entry =  ir.next();
	         String key = entry.getKey();
	         System.out.printf("[%s]\n", key);
	         ArrayList<String> team = entry.getValue();
	         char seq = 'A';
	         Iterator<String> ir2 = team.iterator();
	         while (ir2.hasNext()) {
	            String name = ir2.next();
	            System.out.printf("   %c. %s\n", seq++, name);
	         } // while
	      } // while 
	  	    
		
		/* [1]
		Iterator<ArrayList<String>> ir = class5.iterator();
		int no = 1;
		while (ir.hasNext()) {
			System.out.printf("[%d조]\n", no++ );
			ArrayList<String> team = ir.next();
			char seq = 'A';
			Iterator<String> ir2 = team.iterator();
			while (ir2.hasNext()) {
				String name = ir2.next();
				System.out.printf("   %c. %s\n", seq++, name);
			} // while
			
		} // while
		*/
		
		/* [내가쓴 코드]
		Set<Entry<String, ArrayList<String>>> es = class5.entrySet();
		Iterator<Entry<String, ArrayList<String>>> eir = es.iterator();
		while (eir.hasNext()) {
			Entry<String, ArrayList<String>> entry = eir.next();
			String key = entry.getKey();
			ArrayList<String> value = entry.getValue();
			System.out.printf("%s\n",key);
			for (int i = 0; i < value.size(); i++) {
				System.out.printf("%s\n", value.get(i));
			} // for i
		}
		*/
	} 

} // class
