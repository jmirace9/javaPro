package days05;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오전 9:26:39
 * @subject 
 * @content 
 * 
 */
public class Ex01_02 {

	public static void main(String[] args) {
		/* 2. 1+2+3+...+9+10=55
		 *    1에서 10까지의 합을 출력하는 코딩.
		 *    1) for문 사용해서 풀기
		 *    2) while문 사용해서 풀기
		 */


		int sum= 0;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d+", i);
			sum += i;

		} // for
		System.out.printf("=%d\n", sum);

		sum =0;
		int i =1;
		while (i<=10) {
			System.out.printf("%d+", i);
			sum += i;
			i++;
		}
		System.out.printf("=%d\n", sum);
	}

}
