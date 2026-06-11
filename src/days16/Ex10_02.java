package days16;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오후 3:16:19
 * @subject Calendar 추상클래스
 * @content 
 * 
 */
public class Ex10_02 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
//		Calendar c = new GregorianCalendar(); // GregorianCalendar는 Calendar 의 자식클래스
		
		System.out.println(c.get(1)); // 2026
		System.out.println(c.get(Calendar.YEAR)); // 2026
		System.out.println(c.get(Calendar.MONTH)+1); // 0이 1월달
		System.out.println(c.get(Calendar.DATE)); // 2
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); // 2 - 1달중에 오늘까지 카운트 = D+2
		System.out.println(c.get(Calendar.DAY_OF_YEAR)); // 153 - 1년356일중에 오늘까지 카운트 = D+153
		// 시간 분 초
		System.out.println(c.get(Calendar.HOUR)); // 3 (am,pm 표기없이 구분없이)
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); // 15 (24시간 중)
		System.out.println(c.get(Calendar.MINUTE)); // 23 
		System.out.println(c.get(Calendar.SECOND)); // 초 
		System.out.println(c.get(Calendar.MILLISECOND)); // 밀리초 (1/1000초) 
		
														       //Date 	   일요일(0) 월(1) ~ 토(6)  헷갈리지않기!!!
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); // 3    Calendar  일요일(1) 월(2) ~ 토(7)  암기, 중요 !!!
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 1    월요일(0) 화요일(1)
		
		// c 객체의 그 달의 마지막 날짜가 몇 일까지?
		int lastDate = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate); // 30 이번달 마지막날은 30일
		
		
	} // main

} // class
