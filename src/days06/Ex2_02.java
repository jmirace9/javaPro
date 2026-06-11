package days06;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 18. 오전 10:47:54
 * @subject 제어문 + 배열
 * @content  ㄴ switch 문 사용
 *			 ㄴ 국어 점수 입력	0~100	101 엔터 + 유효성검사 ->점은 오류인 부분 표시 (재입력) // 실수,글자 오류제거
 *			 ㄴ 수/우/미/양/가
 */
public class Ex2_02 {

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
		switch (kor / 10) {
	    case 10, 9 -> System.out.println("수");
	    case 8 -> System.out.println("우");
	    case 7 -> System.out.println("미");
	    case 6 -> System.out.println("가");
	    default -> System.out.println("가");
	}
//		switch ( kor / 10 ) {
//	      case 10:	         
//	      case 9: // 90~99
//	         System.out.println("수");
//	         break;
//	      case 8:
//	         System.out.println("우");
//	         break;
//	      case 7:
//	         System.out.println("미");
//	         break;
//	      case 6:
//	         System.out.println("양");
//	         break;
//	      default:
//	         System.out.println("가");
//	      }
		
	} // main

} // class
