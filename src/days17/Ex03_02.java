package days17;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author 조지훈
 * @date 2026. 6. 4. 오전 9:30:31
 * @subject 
 * @content 
 * 
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// 오늘 수업을 시작하고 현재 얼마의 시간이 흘렀는지 체크
		LocalTime st = LocalTime.of(9, 0, 0);
		LocalTime nt = LocalTime.now();
		
		Duration d = Duration.between(st, nt); //
//		d.getHour() X 메서드가 없음
		int d_ns = d.getNano();
//		System.out.println(d_ns); // 845162600
		long d_s = d.getSeconds(); // 리턴타입 long 형 주의!
		System.out.println(d_s); // 2064
		
//		d.getSeconds()/(60*60); 흐른 시간
		
		long m = d.getSeconds()/60;
		long s = d.getSeconds()%60;
		System.out.println(m+ "분"+s+"초가 흘렀다.");
		
//		d.get(ChronoUnit.MINUTES); XXX
		// Unsupported unit get함수가 지원안하는함수 second , nanos 만 가능
//		System.out.println(d.get(ChronoUnit.MINUTES));
		
	} // main

} // class
