package days16;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오후 12:11:28
 * @subject 
 * @content 
 * 
 */
public class Ex06 {

	public static void main(String[] args) {
		// java.util 패키지 안에는 자주 사용되는 유용한 클래스들 있는 패키지.
		// ㄴ Arrays 클래스
//		   ㄴ Arrays.toString(배열)
//		   ㄴ Arrays.binarySearch(null, 0);
//	   	   ㄴ Arrays.sort(null);
//		   ㄴ Arrays.fill(null, false); 배열 다 채우는 역할
		//  :
		
		// Random 클래스
		Random rnd = new Random();
		System.out.println( rnd.nextBoolean() ); // true, false 값 랜덤 출력
		System.out.println( rnd.nextInt() ); // -21~21 정수
		System.out.println( rnd.nextDouble() ); // 
		System.out.println( rnd.nextInt(1, 10) ); // 1<= 정수 <10 
		
		

	} // main

} // class
