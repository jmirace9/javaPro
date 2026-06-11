package days05;

import java.util.stream.IntStream;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오전 10:26:15
 * @subject 
 * @content 
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		// 1~10 에서 홀수의 합 : while문
		// 1+3+5+7+9=25
		
		int sum = IntStream  // .foreach
				.rangeClosed(1, 10)
				.filter(i-> i%2==1)
				.sum();
		System.out.println(sum);









		/* 홀수만 더하는 가장 간편한식 내가한거랑 비슷
		int sum = 0;
		for (int i = 1; i <= 10; i+=2) {
			System.out.printf("%d+", i);
			sum += i;
		}
			System.out.printf("=%d", sum);



		/*
		// continue 문
		int sum= 0;
		for (int i = 1; i <= 10; i++) {
			if( i%2 == 0) continue;
			System.out.printf("%d+", i);
			sum += i;

		} // for
		System.out.printf("=%d\n", sum);
		 */


		/*
		int sum = 0;
		for (int i = 1; i <= 10; i++ ) {
			if( i%2 == 1) {
			System.out.printf("%d+", i);

			sum+= i;
			}
		}
		System.out.printf("=%d", sum);


		/*       실행해보기!!!
		int sum = 0;
		for (int i = 1; i < 10; ) {
			System.out.printf("%d+", i+2);

			sum+= i;
		}
		System.out.println("%d", sum);
		 */

	} // main

} // class
