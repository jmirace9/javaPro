package days04;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 14. 오후 3:20:32
 * @subject 분기문 : switch문
 * @content 
 * 
 */
public class Ex_09 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in); 
		System.out.print("> 정수(n) 입력: ");
		n = sc.nextInt();

		// [4] JDK 14 이상에 추가된 새로운 구문.
		String result = switch ( n % 2 ) {
		case 0 -> "짝수";	
		default -> "홀수";
		};
		System.out.println(result);
		
		
		
		
		// [3] JDK 14 이상에 추가된 새로운 구문.
		/*
		switch ( n % 2 ) {
		case 0 ->
			System.out.println("짝수");

		default ->
			System.out.println("홀수");
		throw new IllegalArgumentException("Unexpected value: " + key);
		}




		/*
		[2] default도 없앨수있음
		String result ;
		switch ( n % 2 ) {
		case 0:
			result = "짝수";
			break;

		default: // case 1
			result = "홀수";
			break;
		} // switch
		 */




		/* [1]
		switch ( n % 2 ) {
		case 0:
			System.out.println("짝수");
			break;

		default: // case 1
			System.out.println("홀수");
			break;
		} // switch
		 */


		System.out.println(" END ");

	} // main

} // class
