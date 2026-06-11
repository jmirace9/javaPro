package days22.sec06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 조지훈
 * @date 2026. 6. 11. 오후 12:19:51
 * @subject 
 * @content 
 * 
 */
public class Ex04 {

	public static void main(String[] args) {

		Random random = new Random();
		List<Integer> scores = new ArrayList<>();
		for(int i=0; i<1000000000; i++) { // 1억
			scores.add(random.nextInt(101)); // 0~100 정수
		}

		// 스트림 사용해서 평균 출력
		long start = System.nanoTime();
		double avg = scores.stream() // Stream<Integer>
//			  .mapToInt( i -> i.intValue() ) // IntStream (average 가 있음)
			  .mapToInt( Integer::intValue)
		      .average()
		      .getAsDouble();
		long end = System.nanoTime();
		long time = end - start; 
		// avg: 50.00002434, 일반 스트림 처리 시간: 75253800ns
	      System.out.println("avg: " + avg + ", 일반 스트림 처리 시간: " + time + "ns");
	      
	      // 스트림 사용해서 평균 출력
	       start = System.nanoTime();
	       avg = scores.parallelStream() // Stream<Integer>
//			  .mapToInt( i -> i.intValue() ) // IntStream (average 가 있음)
	    		  .mapToInt( Integer::intValue)
	    		  .average()
	    		  .getAsDouble();
	       end = System.nanoTime();
	       time = end - start; 
	      // avg: 50.00196727, 일반 스트림 처리 시간: 53227900ns
	      System.out.println("avg: " + avg + ", 일반 스트림 처리 시간: " + time + "ns");
		
//	      avg: 50.00196727, 일반 스트림 처리 시간: 79825200ns
//	      avg: 50.00196727, 일반 스트림 처리 시간: 53227900ns


	} // main

} // class
