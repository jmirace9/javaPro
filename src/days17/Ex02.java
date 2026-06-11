package days17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * @author 조지훈
 * @date 2026. 6. 4. 오전 9:08:37
 * @subject [Temporal + Adjusters 클래스]
 * @content  시간상의 		  조정자
 *			 ㄴ 자주 사용되는 날짜/시간을 수정하는 기능을 미리 구현해 놓은 클래스			
 *
 * 			날짜 시간 조정 : 수정		plus(), plusXXX(), minus(), minusXXX()
 * 								with(),	whithXXX() 재설정
 */
public class Ex02 {

	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		System.out.println(d); // 2026-06-04

		// [1] 이번 달의 첫 번째 월요일? 6/1(월)
		d = d.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(d); // 2026-06-01
		
		// [2] 이번 달의 마지막 금요일 MT 가는 날짜?
		d = d.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
		System.out.println(d); // 2026-06-26
		
		
		// 

	} // main

} // class
