package days16;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오후 4:44:12
 * @subject 
 * @content 
 * 
 */
public class Ex14_03 {

	public static void main(String[] args) {
		// 시간 정보를 출력
//		LocalTime t = LocalTime.of(0, 0) 내가 입력한 시간
		LocalTime t = LocalTime.now();
		
		// 16:45:45.180697400  소수점 아래 9자리인 ns까지 출력 , 3자리면 ms
		System.out.println(t);
		
		// 시간
		System.out.println( t.get(ChronoField.HOUR_OF_AMPM) ); // 4
		System.out.println( t.get(ChronoField.HOUR_OF_DAY) ); // 16
		System.out.println( t.get(ChronoField.CLOCK_HOUR_OF_AMPM) ); // 4
		System.out.println( t.get(ChronoField.CLOCK_HOUR_OF_DAY) ); // 16
		System.out.println( t.getHour() ); // 16
		// 분
		System.out.println( t.get(ChronoField.MINUTE_OF_DAY)); // 1009
		System.out.println( t.get(ChronoField.MINUTE_OF_HOUR)); // 49
		System.out.println( t.getMinute()); // 49
		// 초
		System.out.println( t.getSecond()); // 52
		System.out.println( t.get(ChronoField.SECOND_OF_DAY) ); // 60832
		System.out.println( t.get(ChronoField.SECOND_OF_MINUTE) ); // 52
		// 밀리초
		System.out.println( t.getLong(ChronoField.MILLI_OF_SECOND)); // 398
		System.out.println( t.getLong(ChronoField.MILLI_OF_DAY)); // 60832398
		// 나노초
		System.out.println( t.getNano() ); // 398055400
		System.out.println( t.getLong(ChronoField.NANO_OF_DAY) ); // 60832398055400
		System.out.println( t.get(ChronoField.NANO_OF_SECOND) ); // 398055400
	}

}
