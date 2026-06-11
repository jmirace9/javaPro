package days10;

import java.util.Arrays;
import java.util.Random;

/**
 * @author kenik
 * @date 2026. 5. 22. 오전 9:39:13
 * @subject 
 * @content 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		
		int [] m = new Random().ints(1, 100).limit(5).toArray();
		System.out.println( m.length );
		System.out.println( Arrays.toString(m) );
		
		int index = m.length;  // 5
		
		// [71, 63, 85, 79, 40]                [0x100번지]m
		// 0x100번지
		
		// [][][][][][][][]                    [0x200번지]temp
		// 0x200번지
		
		if ( index >= m.length ) {
			int [] temp = new int[m.length+3];
			/* [배열 m -> temp 배열에 복사]
			for (int i = 0; i < m.length; i++) {
				temp[i]= m[i];
			}
			*/
			System.arraycopy(m, 0, temp, 0, m.length);
			// System.arraycopy(m, 1, temp, 2, 3);
			// Arrays.copyOf() ***
			m = temp;
        }
		
		// m[index] = 100;
		
		System.out.println( Arrays.toString(m) );

	} // main

} // class






