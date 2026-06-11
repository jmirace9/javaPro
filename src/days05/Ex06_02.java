package days05;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오전 11:50:25
 * @subject 
 * @content 
 * 
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		int no = 1, maxCount = 3;											//9
		char con = 'y';														//6
		
		String name;														//1
		Scanner scanner = new Scanner(System.in);							//2
		
		do {																//7
							
			System.out.printf("> [%d] 이름 입력: ", no);						//3
			name = scanner.next();											//4
			System.out.printf("이름: %s\n", name);							//5
			 
			// 최대 3번까지묻고 종료시키는 코딩.
			// 내생각 if로 3보다크면 거짓이되면서 "END"출력되게
			if ( no == maxCount ) {											//10
				System.out.println("\n 최대 3번만 입력 가능합니다. ");
				break; 
				
			} // if
				
			System.out.print("\n> 이름 입력 계속하시겠습니까?: ");					//8
			con = scanner.next().charAt(0);
			
			no++;
			
		} while ( con == 'y' || con == 'Y' );
		
		System.out.println(" END ");
		
		
		
		
		
	} // main

} //class
