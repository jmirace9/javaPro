package days22.sec05;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/**
 * @author 조지훈
 * @date 2026. 6. 11. 오전 10:48:42
 * @subject 집계
 * 			최종 처리 기능으로 요소들을 처리해서 카운팅, 합계, 평균값, 최대값, 최소값 등 하나의 값으로 산출하는 것
			스트림은 카운팅, 최대, 최소, 평균, 합계 등을 처리하는 다음과 같은 최종 처리 메소드를 제공
					count max min	avg	 sum ,findfirst 등등
					long  				 int
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {

		int [] m = {1,2,3,4,5};
		// 짝수의 개수
		long count = Arrays.stream(m).filter(n->n%2 ==0).count();
		System.out.println("2의 배수의 개수 : " + count);
		// 짝수의 총합
		long sum = Arrays.stream(m).filter(n->n%2 ==0).sum();
		System.out.println("2의 배수의 총합 : " + sum);
		// 짝수의 평균
		OptionalDouble avg = Arrays.stream(m).filter(n->n%2 ==0).average();
		System.out.println("2의 배수의 평균 : " + avg);
		// 짝수 최대값
		OptionalInt max = Arrays.stream(m).filter(n->n%2 ==0).max();
		System.out.println("2의 배수의 최대값 : " + max);
		
		// 짝수 중에 첫 번째 요소
		OptionalInt first = Arrays.stream(m).filter(n->n%2 ==0).findFirst();
		System.out.println( first.getAsInt() );
		
		

	} // main

} // class
