package days07;

import java.util.Random;

/**
 * @author kenik
 * @date 2026. 5. 19. 오후 5:21:29
 * @subject 
 * @content 
 * 
 */
public class Ex07_02 {

	public static void main(String[] args) {
		
		// 0~3 랜덤한 index 발생.
		// 0 <= (int)( Math.random() * 4 ) < 4
		
		Random rnd = new Random();
		int index = rnd.nextInt(4);  // 0 <=   정수    < bound
		int lottoNumber = rnd.nextInt(45)+1; // 1 <=   <= 45
		int kor = rnd.nextInt(101);
		
		// rnd.nextBoolean();

	} // main

} // class




