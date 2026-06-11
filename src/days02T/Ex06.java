package days02T;

/**
 * @author kenik
 * @date 2026. 5. 12. 오후 2:01:41
 * @subject 
 * @content 
 * 
 */
public class Ex06 {

	public static void main(String[] args) {
		// 성, 이름 저장하는 변수 선언
		// 값 할당
		// 출력형식:     이 창익
		// 출력형식:     이름은 "이 창익"입니다.
		// - 변수? 하나의 값을 저장하는 메모리(저장공간)의 이름
		// - 변수 선언? 타입 변수명[=초기값];
		String lastName = "홍";
		String firstName = "길동";		
		System.out.println(lastName+" "+firstName);
		System.out.println("이름은 \"" + lastName + " " + firstName + "\"입니다.");
		
		// s.o.println()
		// s.o.print()
		// s.o.printf(String "출력형식",출력할값...) 메서드     - 3가지
		//          format 형식
		System.out.printf("이름은 \"%s %s\"입니다.", lastName, firstName);
		
		
		/*
		// - 변수: 변하는 수
		// - 상수: 고정된 수
		String name = "홍길동";
		name = "서영학";
		*/

	} // main

} // class




