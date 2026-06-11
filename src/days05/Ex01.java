package days05;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오전 9:01:36
 * @subject  * 1. 정수(n)을 입력받아서 홀수/짝수 출력하는 코딩.
 *   1) if문 사용해서 풀기
 *   2) switch문 사용해서 풀기
 * @content 
 * 
 */
public class Ex01 {

	
	public static void main(String[] args) {
		/* 1. 정수(n)을 입력받아서 홀수/짝수 출력하는 코딩.
	       *   1) if문 사용해서 풀기
	       *   2) switch문 사용해서 풀기
	       */

	      int n;
	      Scanner scanner = new Scanner(System.in);

	      System.out.print("> 정수(n) 입력: ");
	      n = scanner.nextInt();

	      //System.out.printf("정수(n):%d\n", n);

	      /*
	      if( n % 2 == 0 ) {
	         System.out.println("짝수");
	      } else {
	         System.out.println("홀수");
	      }
	       */

	      String result = "홀수";
	      // 1) if 문 풀이
	      if( n % 2 == 0 )  result = "짝수" ;
	      System.out.println(result);

	      // 2) switch문 풀이
	      /*
	      switch ( n%2 ) {
	      case 0:
	         result = "짝수" ;
	         break; 
	      default: // case 1:
	         result = "홀수";
	         break;
	      }
	       */

	      result = switch (n%2) {
	      case 0 -> "짝수";
	      default -> "홀수";
	      };

	      switch (n%2) {
	      case 0 -> result = "짝수";
	      default -> result= "홀수";
	      }

	      System.out.println(result);
	   } // main

	} // class
