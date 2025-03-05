package days22;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex07_05 {
	// 객체 생성없이 바로 이용가능
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // 명령어 최대 5개만 저장

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

		while (true) { // 무한루프
			System.out.println(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim(); 

				if ("".equals(input)) { // 빈문자열일때(입력을 안받을때) 다시 입력받기
					continue;
				} // if

				if (input.equalsIgnoreCase("q")) {
					// 프로그램 종료 : 다른 프로세스에게 0 정수값을 전달...
					System.out.println("프로그램 종료됨");
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")){
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
				} else if(input.equalsIgnoreCase("history")) {
					int i = 0;
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();

					while (it.hasNext()) {
						System.out.println(++i+"."+it.next());
					}
					save(input);
				} else {
					save(input);
					System.out.println(input);
				}
			} catch (Exception e) {
				System.out.println("입력오류입니다.");
			}			
		}

	}

	private static void save(String input) {
		// 빈문자열일때는 위에서 continue로 처리하기때문에 딱히 필요없는 조건문이다.
		if (!"".equals(input)) { 
			q.offer(input);
		} // if
		if (q.size()>MAX_SIZE) {
			q.remove();
		} // if

	} // main



} // class
