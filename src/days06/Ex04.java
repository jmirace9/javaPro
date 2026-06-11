package days06;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 18. 오후 2:01:44
 * @subject 제어문 연습
 * @content 세 정수(x,y,z)를 선언 후 스캐너로 값을 입력받아서
 * 			가장 큰 값, 가장 작은 값을 찾아서 출력.
 * 
 */
public class Ex04 {

	public static void main(String[] args) {

		int x,y,z;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();

		System.out.printf("> x=%d, y=%d, z=%d\n", x,y,z);

		if ( x > y) { // 참: x
			if ( x > z) {
				System.out.printf("> 가장 큰 값: %d", x);
			} else {
				System.out.printf("> 가장 큰 값: %d", z);
			}

		} else { // y
			if ( y > z) {
				System.out.printf("> 가장 큰 값: %d", y);
			} else {
				System.out.printf("> 가장 큰 값: %d\n ", z);
			}

		}
		
		// 가장 작은값
		if ( x < y ) { // 참: y가크다
			if ( x < z ) {
				System.out.printf("\n> 가장 작은 값: %d", x);
			} else {
				System.out.printf("> 가장 작은 값: %d", z);
			}
		} else {
			if ( y < z ) {
				System.out.printf("> 가장 작은 값: %d", y);
			} else {
				System.out.printf("> 가장 작은 값: %d", z);
			}
		}
		
	} // main

} // class
