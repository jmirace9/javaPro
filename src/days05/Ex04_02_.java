package days05;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오전 10:44:57
 * @subject 
 * @content 
 * 
 */
public class Ex04_02_ {

	public static void main(String[] args) {
		
		// 1~n 까지의 합
		
		int n;
	      Scanner scanner = new Scanner(System.in);

	      System.out.print("> 정수(n) 입력: ");
	      n = scanner.nextInt();
		
		int sum = 0;
		for (int i = 1; i < n; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
			System.out.printf("=%d", sum);
		
		
	} // main

	
} // class
