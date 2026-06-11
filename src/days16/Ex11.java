package days16;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오후 3:31:47
 * @subject 
 * @content 
 * 
 */
public class Ex11 {

	public static void main(String[] args) {
		// 1. Calendar -> Date 변환 getTime()
		Calendar c = Calendar.getInstance();
		Date d = c.getTime(); // Date 리턴자료형
		
		// 2. Date -> Calendar 변환 setTime
		c.setTime(d);
		
		System.out.println(c);
		System.out.println(d);
	}
	

}
