package days09;

import java.util.Arrays;

/**
 * @author 조지훈
 * @date 2026. 5. 21. 오후 2:14:14
 * @subject 
 * @content 
 * 
 */
public class Ex05 {

	public static void main(String[] args) {
		
		int i = 4;      
		int [] m = new int[3];
		// 1. 배열 크기
		System.out.println( m.length );
		// 2. 윗첨자값( UpperBound )
		System.out.println( m.length -1 );
		// 2-2. 모든 요소에 -1로 초기화
		//	      for (int j = 0; j < m.length; j++) {
		//	         m[j] = -1;
		//	      }
		// 2-3. Arrays클래스
		System.out.println( Arrays.toString(m)); // [0, 0, 0]

		Arrays.fill(m, -1);

		// 3. 출력
		for (int j = 0; j < m.length; j++) {
			System.out.printf("m[%d]=%d\n", j, m[j] );

		}
		
	} // main

} // class
