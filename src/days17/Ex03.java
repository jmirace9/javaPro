package days17;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author 조지훈
 * @date 2026. 6. 4. 오전 9:19:43
 * @subject 날짜 - 날짜 사이의 간격 : Period 클래스   new 연산자 사용불가
 * 			시간 - 시간 사이의 간격 : Duration 클래스
 * @content 
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		
		// [개강일]로 부터 오늘까지 몇일째 인지 몇일이 지났는지 일수 파악 
		LocalDate od = LocalDate.of(2026, 5, 11);
		LocalDate td = LocalDate.now();
		System.out.println(od); // 2026-05-11
		System.out.println(td); // 2026-06-04
		
		// between() 메서드를 통해서 날짜 간의 간격차를 Period 객체로 얻어온다.
		//						 od <=  Period.between  <td
		Period p = Period.between(od, td); // 뒤에 날짜는 당일이 포함안되서  +1해야함
//		System.out.println(p.getYears()); // 0 년지남
		System.out.println(p.get(ChronoUnit.YEARS)); // 0
		
		
//		System.out.println(p.getMonths()); // 0 월지남
		System.out.println(p.get(ChronoUnit.MONTHS)); // 0
		
//		System.out.println(p.getDays()); // 24일 지남
		System.out.println(p.get(ChronoUnit.DAYS)); // 24
		
		
		
	} // main

} // class
