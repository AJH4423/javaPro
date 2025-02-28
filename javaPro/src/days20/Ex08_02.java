package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex08_02 {

	public static void main(String[] args) {

		// Calendar today = Calendar.getInstance();
		Calendar today = new GregorianCalendar(2025,2-1,28,0,0,0);
		// 비교를 시간까지해버리니 같은 년월일이어도 다른값이라고 나옴
		// -> today의 시간분초를 0으로 설정해줘야함

		System.out.println(Ex07.getCalendar(today)); //2025.02.28(오늘)
		Calendar startDate = new GregorianCalendar(2025,2-1,28);
		System.out.println(Ex07.getCalendar(startDate)); 

		System.out.println(today.after(startDate)); // today가 startDate는 이후의 날이냐?
		System.out.println(today.before(startDate)); // today가 startDate는 이전의 날이냐?
		System.out.println(today.equals(startDate)); // today가 startDate는 같은 날이냐?


		System.out.println(today.compareTo(startDate));

	} // main

} // class
