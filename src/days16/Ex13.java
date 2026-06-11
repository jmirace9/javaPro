package days16;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오후 4:05:05
 * @subject 날짜를 형식화 하는 클래스 : SimpleDateFormat
 * 			메서드	format()
 * 					parse()
 * @content 
 * 
 */
public class Ex13 {

	public static void main(String[] args) {
		// [2]
		// 출력형식)  2026/06/02 오후 04:15:18.296 화요일
		Calendar c = Calendar.getInstance();
		String pattern = "yyyy/MM/dd a hh:mm:ss.SSS E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		Date d = c.getTime();
		String strDate = sdf.format(c.getTime() );
		System.out.println(strDate);
		
		/* [1]
		Date d = new Date();
		// 				2026. 6. 2. 오후 4:06:19
		System.out.println(d.toLocaleString());
		//				2 Jun 2026 07:10:11 GMT
		System.out.println( d.toGMTString() );
		
		// 출력형식)  2026/06/02 오후 04:15:18.296 화요일
		String pattern = "yyyy/MM/dd a hh:mm:ss.SSS E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String strDate = sdf.format(d);
		System.out.println(strDate);
		*/
		
	} // main

} // class
