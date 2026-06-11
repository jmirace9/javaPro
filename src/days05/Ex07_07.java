package days05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오후 4:50:22
 * @subject 간단하게 로또번호 (람다, 스트링)
 * @content 
 * 
 */
public class Ex07_07 {

	public static void main(String[] args) {
		
		int [] lottoNumbers = new Random().ints(1, 46).distinct().limit(6).sorted().toArray();
		
		System.out.println( Arrays.toString( lottoNumbers));
		

	} // main

} // class
