package days06;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 18. 오후 2:01:44
 * @subject 제어문 연습
 * @content 세 정수(x,y,z)를 선언 후 스캐너로 값을 입력받아서
 * 			가장 큰 값, 가장 작은 값을 찾아서 출력.
 * 			(삼항 연산자)
 */
public class Ex4_02 {

	public static void main(String[] args) {

		int x,y,z;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();

		System.out.printf("> x=%d, y=%d, z=%d\n", x,y,z);
		
		int max = x > y ? (x > z ? x: z) : ( y > z ? y : z) ;
		System.out.println("\n> 가장 큰값 :" + max);
		
		// 가장 작은값
		
		int min = x > y ? (y > z ? z : y) : (x > z ? z: x) ;
		System.out.println("\n> 가장 작은 값:" + min);
		
		
	} // main

} // class
