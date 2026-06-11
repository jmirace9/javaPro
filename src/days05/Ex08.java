package days05;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오후 5:08:20
 * @subject 가위(1)/바위(2)/보(3) 게임 구현
 * @content 
 * 
 */
public class Ex08 {

	public static void main(String[] args) {
		int com, user;
		Scanner scanner = new Scanner(System.in);

		com = (int)(Math.random()*3)+1; //
		System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
		user = scanner.nextInt();

		System.out.printf("> com=%d, user=%d\n", com, user);

		// 컴/사용자 중 승자 판단 -- 코딩 case문 묶어서 처리 가능
		switch ( com-user ) {
		case 0     -> System.out.println("무승부");
		case -1, 2 -> System.out.println("사용자 승리");
		case 1, -2 -> System.out.println("컴퓨터 승리");

		} // switch





		/*
		switch ( com-user ) {
		case 0:
			System.out.println("무승부");
			break;
		case -1 :
			System.out.println("컴퓨터");
			break;
		case  2 :
			System.out.println("컴퓨터");
			break;
		case  1 :
			System.out.println("사용자");
			break;
		case  -2 :
			System.out.println("사용자");
			break;

		}
		 */
	}

}
