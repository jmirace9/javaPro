package days10;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2026. 5. 22. 오후 3:04:27
 * @subject 1차원 -> 2차원 배열 이동
 * @content 2차원 -> 1차원 배열 이동.
 * 
 */
public class Ex09 {

	public static void main(String[] args) {
		
		int [] m = { 1,2,3,4,5,6,7,8 };
		int [][] n = new int[2][4];
		/*
		 * 0 -> 00
		 * 1 -> 01
		 * 2 -> 02
		 * 3 -> 03
		 * 
		 * 4 -> 10
		 * 5 -> 11
		 * 6 -> 12
		 * 7 -> 13
		 * */
		for (int i = 0; i < m.length; i++) {
			n[i/n[0].length][i%n[0].length] = m[i];
		}
		
		System.out.println( Arrays.toString(n[0])  );
		System.out.println( Arrays.toString(n[1])  );

	} // main

} // class






