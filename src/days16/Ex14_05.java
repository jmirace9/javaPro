package days16;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오후 5:18:03
 * @subject now () 현재 날짜 , of() 내가 원하는대로 수정한 날짜
 * @content with () , withXXX()
 * 			plus (), plusXXX()
 * 			minus (), minusXXX()
 * 
 */
public class Ex14_05 {

	public static void main(String[] args) {
		
		// [2]
		LocalTime t = LocalTime.now();
		System.out.println(t); // 17:24:27.202606600
		// 초단위 밑으로는 절삭..
		t = t.truncatedTo(ChronoUnit.SECONDS);
		System.out.println(t); // 17:24:27
		// 분단위 밑으로 절삭
		t = t.truncatedTo(ChronoUnit.MINUTES);
		System.out.println(t); // 17:24
		
		
		/* [1]
		 * LocalDate now = LocalDate.now();
		 * // 이번 달 마지막 날짜가 몇일까지 있는지 ?
		System.out.println(now); // 2026-06-02
		now = now.withDayOfMonth(1);			// 1일로 수정
		System.out.println(now); // 2026-06-01
		now = now.plusMonths(1);				// 1달 더하기
		System.out.println(now); // 2026-07-01
		now = now.minusDays(1);					// 1일 빼기
		System.out.println(now); // 2026-06-30
		
		System.out.println(now.getDayOfMonth()); // 30
		*/

	} // main

} // class
