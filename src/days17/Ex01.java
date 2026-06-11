package days17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author 조지훈
 * @date 2026. 6. 4. 오전 8:50:07
 * @subject 날짜+시간 다루는 클래스 
 * @content Date, Calendar + 형식화 클래스
 * 			jdk 1.8 java.time 핵심클래스
 * 			LocalDate			now(), of()		new로 생성하지 않음
 * 			LocalTime			now(), of()		new로 생성하지 않음
 * 			LocalDateTime 클래스 	now(), of()		new로 생성하지 않음
 * 			ㄴ LocalDate + LocalTime
 */
public class Ex01 {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt); // 2026-06-04T09:03:49.525209100
		
		// dt 시간 정보를 절삭
		dt = dt.truncatedTo(ChronoUnit.DAYS); // 2026-06-04T00:00     Day 일자 밑으로 절삭 == Day 까지 표기
		System.out.println(dt);
		
		LocalDate d = dt.toLocalDate();
		System.out.println(d); // 2026-06-04

		LocalTime t = dt.toLocalTime();
		System.out.println(t); // 09:06:11.762317
		

	} // main

} // class
