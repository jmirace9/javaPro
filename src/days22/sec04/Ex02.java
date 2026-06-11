package days22.sec04;

import java.util.Arrays;

/**
 * @author 조지훈
 * @date 2026. 6. 11. 오전 10:31:10
 * @subject 루핑
 * 			ㄴ 스트림에서 요소를 하나씩 반복해서 가져와 처리하는 것
			ㄴ forEach(), peek()
				xxxConsumer.accept()
 * @content 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		int [] m = {1,2,3,4,5};
		// 배열 -> 스트림 변환
//		Arrays.stream(m) // IntStream
//			  .peek(System.out::println) // peek 중간처리하는 메서드 => 이것만으로는 동작 안함 // 검증용
//			  .filter( n -> n%2 == 0) 	 // 중간 처리하는 메서드  // 2, 4
//			  .forEach(System.out::println); // forEach => 최종처리하는 메서드 // 메서드 참조 , 생성자 참조 ex. (Student :: new)
		
		int total = Arrays.stream(m)
//						  .peek(System.out::println) // 전체 숫자 확인
						  .filter( n -> n%2 == 0 )
						  .peek(System.out::println) // 위 필터된것 확인용 // 2, 4
						  .sum();
		System.out.println("총 짝수 합 : " + total); 

	} // main

}
