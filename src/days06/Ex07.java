package days06;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 18. 오후 4:11:22
 * @subject 한 문자를 입력받아서 숫자, 알파벳, 한글, 대문자, 소문자, 특수문자 체크
 * @content 
 * 
 */
public class Ex07 {

	public static void main(String[] args) {

		char ch;
		Scanner scanner = new Scanner(System.in);
		System.out.println("> 한 문자 입력: ");
		ch = scanner.next().charAt(0);

		System.out.printf("> 입력받은 한 문자: \'%c\'\n", ch);
		// 대문자, 소문자, 한글, 숫자, 특수 문자입니다. 라고 출력해보기.
		if ('A' <= ch && ch <= 'Z') {
			System.out.println("알파벳 대문자");
		}else if ('a' <= ch && ch <= 'z') {
			System.out.println("알파벳 소문자");
		}else if ('0' <= ch && ch <= '9') {
			System.out.println("숫자");
		}else if ('가'<= ch && ch <= '힣') {
			System.out.println("한글");
		}else if (ch=='@' || ch=='#' || ch=='$' || ch=='%' || ch=='^' || ch=='&'  || ch=='*' ) { 
			// @#$%^&*
			System.out.println("특수문자");
		}
		else {
			System.out.println("기타...");
		}



	} // main

} // class
