package days10;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2026. 5. 22. 오전 11:11:21
 * @subject 검색( Search ) 
 * @content   ㄴ 항목의 집합 중에 특정 항목을 찾아내는 것.
 *             1) 순차 검색( Sequence Search )
 *             2) 이진 검색( Binary Search )
 *                 필수조건: 정렬
 * 
 */
public class Ex05 {

	public static void main(String[] args) {
		
		// 30개   0~200 정수
		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
		   		 86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
				 169, 172, 181, 184, 185, 191, 198 };
		
		// Arrays.binarySearch(m, 9)
		
		int n = 300
				; // 찾을 정수
		
		int index = binarySearch(m, n);
		
		System.out.println(index);
		

	} // main

	private static int binarySearch(int[] m, int n) {
		 
		int bottom = 0, top = m.length-1, middle; 
		int count = 0;
		while ( bottom <= top) {
			System.out.println(++count);
			middle = (bottom + top )/2;
			if (m[middle]==n) {
				return middle;
			} else if( m[middle] > n ){
				top = middle -1;
			} else {
				bottom = middle + 1;
			} 
		}  
		
		return -1;
	}

} // class






