package days07;

/**
 * @author kenik
 * @date 2026. 5. 19. 오전 7:26:45
 * @subject 
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("[구구단 가로 출력]");
		for (int i = 2; i <= 9 ; i++) {
			for (int j = 1; j <= 9 ; j++) {
				System.out.printf("%d*%d=%d\t", i, j, i*j);
			} // for j
			System.out.println(); // 개행
		} // for i
		
		System.out.println("[구구단 세로 출력]");
		for (int i = 1; i <= 9 ; i++) {
			for (int j = 2; j <= 9 ; j++) {
				System.out.printf("%d*%d=%d\t", j, i, i*j);
			} // for j
			System.out.println(); // 개행
		} // for i
		

	} // main

} // class

/* 
 * 1. 구구단 2~9단 가로 출력
 * 2. 구구단 2~9단 세로 출력
 * */







