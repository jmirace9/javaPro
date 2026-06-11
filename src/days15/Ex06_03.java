package days15;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 조지훈
 * @date 2026. 6. 1. 오후 12:15:26
 * @subject 
 * @content 
 * 
 */
public class Ex06_03 {

	public static void main(String[] args) {

		int number = 100;
		int result = 0;

		Random rnd = new Random();
		int n = -1;
		
		int [] m = new int[5];
		
		for (int i = 0; i < 10 ; i++) {
			try {
				n = rnd.nextInt(5); // 0 <= n <5
				result = number / n ; // n = 0 일때 오류
				m[i] = result;
				System.out.println(result );	
			} catch (ArrayIndexOutOfBoundsException e) {	// 다중 catch문 , 자식이 맨 위로, 부모가 맨 아래로
				System.out.println("> 배열 m이 다 채워졌다.");
//				break;
				
				m = Arrays.copyOf(m, m.length+5); // Arrays.copyOf( , ); 방5개늘리고 m도 카피
				
// Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception				
			} catch (ArithmeticException e) { // 예외 처리 : 오류 안나면 건너뜀
//				System.out.println(e.toString());
				i--;
			} catch (Exception e) {
				
			}
			
		} // for


	} // main

} // class
