package days10;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2026. 5. 22. 오후 3:12:28
 * @subject 
 * @content 
 * 
 */
public class Ex09_02 {

	public static void main(String[] args) {
		
		int [][] m = {
				{1,2,3,4},
				{5,6,7,8}
		};
		
		int [] n = new int[8];
		
		// 2차원 배열 -> 1차원 배열 이동
		// i*4+j
		// 00 -> 0
		// 01 -> 1
		// 02 -> 2
		// 03 -> 3
		// 10 -> 4
		// 11 -> 5
		// 12 -> 6
		// 13 -> 7
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[i*4+j] = m[i][j];
			} // for j
		} // for i
		
		
		System.out.println( Arrays.toString(n) );
		

		// [문제]
		// [2][6]  -> [3][4]
		int [][] x = {
							{1,2,3,4,5,6},
							{7,8,9,10,11,12}
					};
		int [][] y = new int[3][4];
	} // main

} // class








