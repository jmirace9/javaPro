package days16;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오후 5:06:36
 * @subject 
 * @content 
 * 
 */
public class Ex14_04 {

	public static void main(String[] args) {
		
		LocalDate [] ldArr = {
				LocalDate.of(2000, 12, 13)
				, LocalDate.of(2003, 5, 13)
				, LocalDate.of(1998, 6, 2)
		};
		LocalDate today = LocalDate.now();
		
		// 생일이 지났는지 여부 체크해서 결과 출력... 또는 오늘이다.
//		today.isAfter(today);
//		today.isBefore(today);
//		today.isEqual(today);
		
		for (int i = 0; i < ldArr.length; i++) {
			LocalDate birth = ldArr[i]; // 2000, 12, 13
//			ld.withYear(today.getYear()); // 2026, 12, 13
			birth = birth.with(ChronoField.YEAR, today.getYear()); // 날짜 불변 = 객체설정해야함
			System.out.println(birth);
			System.out.println(today.isAfter(birth));
			System.out.println(today.isBefore(birth));
			System.out.println(today.isEqual(birth));
			System.out.println("-".repeat(50));
			
			// 년도 안바꾸고 월일만 가져와서 비교
//			today.getMonthValue() > birth.getMonthValue()		
//            || (today.getMonthValue() == birth.getMonthValue()
//                && today.getDayOfMonth() > birth.getDayOfMonth()
			
		} // for
		
	} // main

} // class
