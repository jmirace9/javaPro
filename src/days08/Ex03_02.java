package days08;

import java.util.Iterator;

/**
 * @author 조지훈
 * @date 2026. 5. 20. 오전 10:15:10
 * @subject 
 * @content 
 * 
 */
public class Ex03_02 {

	public static void main(String[] args) {

		// [1] 1~n 합을 반환하는 메서드:sum
		System.out.println( sum(10) );
		System.out.println( recursivesum(10) );

		// [2] 팩토리얼 메서드 :
		//		factorial == 계승
		//		n! = n 자연수
		//		5! = 5*4*3*2*1
		//		0! == 1
		System.out.println( factorial(0) );
		System.out.println( recursiveFactorial(0) );



	} // main
	
	
	
	private static int recursiveFactorial(int n) {
		if ( n==1 || n==0 ) return 1;	// n==0도 되지만 한번더 호출하지않게 or사용
		else        return n * recursiveFactorial(n-1);
	} // recursiveFactorial



	private static int factorial(int n) {
		
		int result = 1;
		for (int i = n; i >= 1; i--) {
			result *= i;
		} // for

		return result;
	} // factorial



	// 재귀 함수 선언
	// return 10~1까지 더함
	public static int recursivesum(int n) {
		if ( n == 1) return 1;
		else         return n + recursivesum(n-1);
	} // recursiveSum

	//
	public static int sum(int n) { // 10
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		return result;

	} // sum

} // class







