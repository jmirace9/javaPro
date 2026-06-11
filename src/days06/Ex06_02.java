package days06;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 18. 오후 3:48:06
 * @subject 암기!!
 * @content 
 * 
 */
public class Ex06_02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0, lineNumber = 1; i < 256; i++) {
			if (i%10==0) {System.out.printf("%d: ",lineNumber);

			}
			System.out.printf("\'%c\'%d",(char)i, i);
			if (i%10==9) {
				System.out.println();
				if (lineNumber%10==0) {
					System.out.println("계속하려면 enter를 치시오...");
					scanner.nextLine();
				}
				lineNumber++;
			}
		}


	} // main

} // class
