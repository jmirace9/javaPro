package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 14. 오후 2:12:05
 * @subject [if 조건문 연습 예제]
 * @content 
 * 
 */
public class Ex08_3__ {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//정수하나 입력받을 변수 n
		// 자료형 변수명 [=초기값];

		int n;

		Scanner sc = new Scanner(System.in);
		// F6
		System.out.print("> n 정수 입력: ");  // 중단점  (breakpoint)
		n = sc.nextInt(); 
		// 11
		if ( n % 2 == 0 ) {  // 짝수 조건식
			System.out.printf("> n=%d (짝수) \n", n);
		} // if 

		if ( n % 2 == 1 ) {  // 홀수 조건식
			System.out.printf("> n=%d (홀수) \n", n);
		} // if 


		System.out.println(" END ");


	} // main

	private static Reader InputStreamReader(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

} // class
