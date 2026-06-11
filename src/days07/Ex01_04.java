package days07;

/**
 * @author kenik
 * @date 2026. 5. 19. 오전 10:02:58
 * @subject break 라벨;
 * @content continue 라벨;
 * 
 */
public class Ex01_04 {

	public static void main(String[] args) {
		// i=1  1<=9
		// d=2,3,4    ,5+개행
		// i=2  2<=9
		// d=2,3,4     5+개행
		OUT:for (int i = 1; i <= 9; i++) {
			for (int d = 2; d <= 9; d++) {  // 단
				if( d==5) break OUT;
				System.out.printf("%d*%d=%2d ", d, i, d*i);
			} // for d
			System.out.println();
		} // for i
		
	} // main

} // class
