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
public class Ex06_04 {

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
			} catch (ArrayIndexOutOfBoundsException | ArithmeticException e ) { // 같은 예외방식 실행
				// 멀티 catch 블럭
				e.printStackTrace();
				
			} catch (Exception e) { // 다중 catch 문	
				
			}
			
		} // for


	} // main

} // class
