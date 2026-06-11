package days22.sec04;

import java.util.Arrays;

/**
 * @author 조지훈
 * @date 2026. 6. 11. 오전 10:41:28
 * @subject 매칭
 * 			요소들이 특정 조건에 만족하는지 여부를 조사하는 최종 처리 기능
			메소드는 allMatch(), anyMatch()-하나라도 만족 하는지, noneMatch()- 모든요소가 만족하지 않는지 
					ㄴ 모든 요소가 만족하는지
 * @content 
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		int [] m = {1,2,3,4,5};
		
		// [1] m 배열의 모든 정수값이 짝수인지를 체크해서 맞으면 그다음 작업할 예정.
		boolean result = Arrays.stream(m)
			  .allMatch( n -> n%2 == 0 );
		if (result) {
			System.out.println("모두 짝수이다.");
		} else {
			System.out.println("모두 짝수는 아니다.");
		}
		
		result = Arrays.stream(m)
				  .anyMatch( n -> n%2 == 0 );
		if (result) {
			System.out.println("최소 한개의 짝수는 있다.");
		} else {
			System.out.println("모두 홀수이다.");
		}

		// 모두가 짝수가 아닌 경우에만 true 값을 반환한다.
		result = Arrays.stream(m)
				  .noneMatch( n -> n%2 == 0 );
		if (result) {
			System.out.println("모두 홀수이다.");
		} else {
			System.out.println("모두 짝수이다."); // ?
		}
	} // main

} // class
