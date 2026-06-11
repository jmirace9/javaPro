package days05;

import java.util.stream.IntStream;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오전 9:44:02
 * @subject 
 * @content 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		// Lamda 와 Stream
		
		int sum = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sum);
		
		/*
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d+", i);
			sum+= i;
		} // for
		
			System.out.printf("=%d\n", sum);
		*/
		
		/* while 10에서 9까지 거꾸로 더하기
		int i = 10;
		int sum = 0;
		while (i>=1) {
			System.out.printf("%d+", i);
			sum += i;
			i--;
		}
			System.out.printf("=%d", sum);
		*/
				
		/*
		int sum = 0;
		int i = 1;
		
		for (        ;          ;       ) {
			if( i > 10)
				break; // 제어문 빠져나올때 사용. *함수 빠져나올땐 리턴문.
			System.out.printf("%d+", i);
			sum += i;
			i++;
		} // for
			System.out.printf("=%d", sum);
			*/

	} // main

} // class
