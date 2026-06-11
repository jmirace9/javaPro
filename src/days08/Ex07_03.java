package days08;

import java.util.Iterator;

/**
 * @author 조지훈
 * @date 2026. 5. 20. 오후 4:44:14
 * @subject 
 * @content 
 * 
 */
public class Ex07_03 {

	public static void main(String[] args) {
		
		// 1-2+3-4+5-6+7-8+9-10+=-5
		// 홀수:  sum += i           1-
		// 짝수:  sum -= i           2+
		int sum = 0;
		boolean sw = false;
		for (int i = 1; i <= 10; i++) {         
			if ( sw ) {
				System.out.printf("%d+", i);
				sum -= i;             
			} else {
				System.out.printf("%d-", i);
				sum += i;             
			}

			sw = !sw;
		} // for i
		/* [1] 풀이
	      for (int i = 1; i <= 10; i++) {         
	         if ( i%2==0 ) {
	            System.out.printf("%d+", i);
	            sum -= i;
	         } else {
	            System.out.printf("%d-", i);
	            sum += i;
	         }
	      } // for i
		 */
		System.out.printf("=%d\n", sum);


	} // main

} // class




