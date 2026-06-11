package days22.sec02;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author 조지훈
 * @date 2026. 6. 11. 오전 9:26:04
 * @subject 
 * @content 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		// 배열 -> IntStream 변환
		int [] m = {1,2,3,4,5};
		
		IntStream is = Arrays.stream(m);
		// IntStream -> DoubleStream 변환
		is.asDoubleStream()
		  .forEach(System.out::println);
		
		is = Arrays.stream(m);
		// IntStream -> Stream<Integer>
		is.boxed()
		  .forEach( obj -> System.out.println( obj.intValue() ) );
		
//		Integer o = 200;		//   boxing
//		int i = o.intValue();	// unboxing
		

	} // main

} // class
