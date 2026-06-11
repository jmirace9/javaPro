package days06;

/**
 * @author 조지훈
 * @date 2026. 5. 18. 오후 5:44:08
 * @subject 구구단 연습
 * @content 
 * 
 */
public class Ex08pr {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			
			for (int dan1 = 2; dan1 <=9; dan1++) {
				System.out.printf("%d*%d=%02d ", dan1, i, dan1*i);
			}
			System.out.println();
			
		}
		
		
		/* 세로 2~9단
		for (int dan = 2 ; dan <= 9; dan++) {
			System.out.printf("[%d]단\n", dan);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d*%d=%02d\n", dan, i, dan * i);
			}
		}
		
		
		
		
		/* 2단만
		int dan = 2;
		System.out.printf("[%d]단\n", dan);
		  for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n" , dan, i, dan * i);
			*/
		}
	}


