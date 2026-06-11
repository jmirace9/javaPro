package days16;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오후 4:33:39
 * @subject 
 * @content 
 * 
 */
public class Ex14_02 {

	public static void main(String[] args) {
		// 1. 날짜를 나타내는 클래스 // now() , of()로 객체 생성
		LocalDate d = LocalDate.now();
		System.out.println(d.toString()); // 2026-06-02
		System.out.println(d); // 2026-06-02
		
		// 년
		System.out.println( d.getYear() ); // 2026
		System.out.println( d.get( ChronoField.YEAR) ); // 2026 TemporalField 자리에 업캐스팅
		// 월
		System.out.println( d.get( ChronoField.MONTH_OF_YEAR) ); // 6 month of year = 1월이 1부터 시작
		System.out.println( d.getMonthValue() ); // 6
		
		// 일
		System.out.println( d.get( ChronoField.DAY_OF_MONTH) ); // 2
		System.out.println( d.getDayOfMonth() ); // 2
		
		// 요일 : 월(1) 화(2) ... 일(7)
		System.out.println( d.get( ChronoField.DAY_OF_WEEK) ); // 2 = 화
		System.out.println( d.getDayOfWeek() ); // TUESDAY
		
		// 윤년체크 메서드
		System.out.println( d.isLeapYear() ); // false
		
		
		
	} // main

} // class
