package days12;

import java.util.Date;

/**
 * @author 조지훈
 * @date 2026. 5. 27. 오후 3:28:38
 * @subject 
 * @content 
 * 
 */
public class Ex06 {

	public static void main(String[] args) {
		
			Date d = new Date();
			// 2026. 5. 27. 오후 3:30:14
			System.out.println( d.toLocaleString() );
			
			// 개강일 날짜 객체 생성
			Date open = new Date(2026-1900, 5-1, 11, 9, 0, 0);
			System.out.println( open.toLocaleString() );

	} // main

} // class
