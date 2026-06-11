package days10;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author kenik
 * @date 2026. 5. 22. 오후 2:25:48
 * @subject 
 * @content 
 * 
 */
public class Ex08 {

	public static void main(String[] args) {
		int [] m = IntStream.rangeClosed(1, 10).toArray();
		System.out.println( Arrays.toString(m));
		
		shuffle2(m); // 배열을 무작위로 섞기
		 
		System.out.println( Arrays.toString(m));
	} // main
	
	// 람다와 스트림을 사용...( 기억 X )
	private static void shuffle2(int [] m) {
		for (int i = 0, temp ; i < 10; i++) {			
		   int [] indexes = new Random().ints(0,10).distinct().limit(2).toArray();
		   int index1 = indexes[0];
		   int index2 = indexes[1];
		   //  [2, 4]
		   temp = m[index1];
		   m[index1] = m[index2];
		   m[index2] = temp;
		} // for i
	}

	// 기억( O )
	private static void shuffle(int[] m) {
		
		int index1, index2;
		Random rnd = new Random();
		
		for (int i = 0, temp; i < 10; i++) {
			index1 = 0; // rnd.nextInt(0, 10);
			index2 = rnd.nextInt(0, 10); 			
			if( index1 == index2 ) i--;
			else {
				
				temp = m[index1];
				m[index1] = m[index2];
				m[index2] = temp;
				
				System.out.printf(" %d : %d ", index1, index2);
				System.out.println( Arrays.toString(m));
			}
		} // 
		
	}

} // class






