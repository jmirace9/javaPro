package days05;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오후 12:41:41
 * @subject 작업 순서 정하고 코딩
 * @content name이라는 변수설정 -> Scanner sc로 입력값 -> name변수에 sc입력설정 -> 계속할건지에 대한 여부 (dowhile생성)-> 
 * ->계속할거면 루프생성(while조건문설정, 계속할 답변설정{char con 변수설정과 조건은 대소문자까지})->
 * 
 */
public class Ex06_03pr2 {

	public static void main(String[] args) {
		
		int no=1, maxCount=3;
		char con = 'y';
		String name;
		Scanner sc = new Scanner(System.in);
		
		
				
		do {
			System.out.print("이름을 입력하세요.");
			name = sc.next();
			System.out.printf("> 이름: %s", name);
			
			if (no>maxCount) {
				System.out.println("3번을 초과할수없습니다.");
			}
			
		} while (con=='y' || con=='Y');
		
		System.out.println(" END ");
		
	} // main

} // class
