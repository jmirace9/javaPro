package days06;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 18. 오전 10:47:54
 * @subject 제어문 + 배열
 * @content  ㄴ if 문 사용
 *			 ㄴ 국어 점수 입력	0~100	101 엔터 + 유효성검사 ->점은 오류인 부분 표시 (재입력) // 실수,글자 오류제거
 *			 ㄴ 수/우/미/양/가
 */
public class Ex02 {

	public static void main(String[] args) {
		
		int kor;
		Scanner scanner = new Scanner(System.in);
		
		boolean isValid = true; // 유효하다(true), 유효하지 않다(false)
		
		do {
			System.out.print("> 국어(kor) 입력: ");
			kor = scanner.nextInt();
			
			if (kor < 0 || kor > 100) {
				System.out.printf("오류 = 0~100 사이의 정수를 입력하셔야합니다.\n 현재입력: %d\n", kor);
				isValid = false;
			}
			
		}while (!isValid);
		
		//} while ( kor < 0 || kor > 100 );{
		//} while ( !(kor >= 0 && kor <= 100) );
		
		
		System.out.println("> 국어: "+kor);
		
		// 0 <= kor <= 100 -> 수~가
		if ( 90 <= kor) {  // 100
	         System.out.println("수");
	      }else if ( 80 <= kor) {
	         System.out.println("우");
	      }else if ( 70 <= kor) {
	         System.out.println("미");
	      }else if ( 60 <= kor) {
	         System.out.println("양");
	      }else{
	         System.out.println("가");
	      }
		
		/*if ( 90 <= kor  && kor <= 100 ) {  // 100
	         System.out.println("수");
	      }else if ( 80 <= kor  && kor <= 89 ) {
	         System.out.println("우");
	      }else if ( 70 <= kor  && kor <= 79 ) {
	         System.out.println("미");
	      }else if ( 60 <= kor  && kor <= 69 ) {
	         System.out.println("양");
	      }else if (  0 <= kor  && kor <= 59 ) {
	         System.out.println("가");
	      }
	      */
		
	} // main

} // class
