package days08;

/**
 * @author 조지훈
 * @date 2026. 5. 20. 오전 10:47:22
 * @subject 거듭제곱 연습문제
 * @content 
 * 
 */
public class Ex03_03 {

	public static void main(String[] args) {
		/*
		 * [문제] 거듭제곱 == 멱
		 * 		2^3 = 2*2*2 = 8
		 * 
		 * 		2: 밑수
		 * 		3: 지수
		 * 		ㄴ 밑수를 지수만큼 반복해서 곱하는 수.
		 * 
		 * 		결과값 power(base, exponent)
		 * 		결과값 recursivePower(base, exponent)
		 * */
		System.out.println( power(2, -3) );
	} // main
	
		// 거듭제곱 표현 . 지수음수일땐 오류인 상태.
	public static int power(int base, int exponent) {
		int result = 1;
		for (int i = 1; i <= exponent ; i++) {
			result *= base;
		}
		return result;
	}

} // class
