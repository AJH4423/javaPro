package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex07 {
	
	public static void main(String[] args) {
		
		// [Period, Duration 클래스]
		
		// [문제] 개강일로부터 오늘까지 날짜 간격...
		LocalDate o = LocalDate.of(2025, 2, 3);
		LocalDate t = LocalDate.now();
		
		// Perid.between() 메소드를 통해서 날짜간의 간격(차)를 
		// Period 객체로 얻어올 수 있다.
		// 일자를 계산할때 개강일자 o는 포함이 되고 t는 포함이 안됨
		Period p = Period.between(o, t);
		System.out.println(p.getYears()); // 0
		System.out.println(p.getMonths()); // 1
		System.out.println(p.getDays()); // 1
		System.out.println("-".repeat(50));
		
		System.out.println(p.get(ChronoUnit.YEARS));
		System.out.println(p.get(ChronoUnit.MONTHS));
		System.out.println(p.get(ChronoUnit.DAYS));
		System.out.println("-".repeat(50));
		
		// 시간 시간의 간격 : Duration 클래스
		// [문제] 오늘 수업 시작 시간이 얼마나 지났는지 확인
		LocalTime s = LocalTime.of(9, 0, 0);
		LocalTime n = LocalTime.now();
		
		Duration d = Duration.between(s, n);
		
		// 오류가 남 : System.out.println(d.get(ChronoUnit.HOURS));
		
		System.out.println(d.getSeconds() / (60*60)); // 시간
		System.out.println(d.getSeconds() % 60); // 분
		System.out.println(d.toHours()); // 시
		System.out.println(d.toMinutes()); // 전체 분 
		int minute = (int)(d.toMinutes() % 60);
		System.out.println(minute); // 분
		System.out.println(d.getSeconds()); // 초
		System.out.println(d.getNano());
		
		// between()과 until() 차이점
		// between()은 스태틱이라서 객체생성 없이 사용가능하지만
		// until()은 객체를 생성해서 이용해야한다.
		
	} // main

} // class
