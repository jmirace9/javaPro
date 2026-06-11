package days05;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오후 5:08:20
 * @subject 가위(1)/바위(2)/보(3) 게임 구현
 * @content 돈 먼저 넣기 (잔고 계속보이기) -> 한 게임 100원 (승200,패-100,무0) -> 게임 더 할래? 'y','n' -> 진행 or 잔고없으면 종료.
 * 
 */
public class Ex08pr {

	public static void main(String[] args) {
		
		int last;
		Scanner scanner = new Scanner(System.in);
		last = scanner.nextInt();
		System.out.printf(">게임비 투입: %d원\n", last);
		
		int com, user;
		Scanner scanner1 = new Scanner(System.in);
		
		
		com = (int)(Math.random()*3)+1; //
		System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
		user = scanner1.nextInt();
		

		System.out.printf("> com=%d, user=%d\n", com, user);

		// 컴/사용자 중 승자 판단 -- 코딩 case문 묶어서 처리 가능
		switch ( com-user ) {
		case 0     -> System.out.println("무승부");
		case -1, 2 -> System.out.println("사용자 승리");
		case 1, -2 -> System.out.println("컴퓨터 승리");

		} // switch
		
		// 3가지 케이스중 무승부제외하고 다른 100원추가이거나 100원차감

	} // main

} // class
