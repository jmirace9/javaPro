package days15;

import java.util.Random;

/**
 * @author 조지훈
 * @date 2026. 6. 1. 오후 12:15:26
 * @subject 
 * @content 
 * 
 */
public class Ex06_02 {

	public static void main(String[] args) {

		int number = 100;
		int result = 0;

		Random rnd = new Random();
		int n = -1;
		for (int i = 0; i < 10 ; i++) {
//			n = rnd.nextInt(4)+1; // 0+1 <= n <4+1 바꾸기 가능
			n = rnd.nextInt(5); // 0 <= n <5
			
			if(n == 0) { // 예외처리라고 부르지않음. for문에서 0 아닌 숫자도 10번 체크
				i--;
				continue;
			}
			
			result = number / n ; // n = 0 일때 오류

			System.out.println(result );
		} // for


	} // main

} // class
