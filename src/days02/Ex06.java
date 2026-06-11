package days02;

/**
 * @author 조지훈
 * @date 2026. 5. 12. 오후 2:02:04
 * @subject 
 * @content 
 * 
 */
public class Ex06 {

	public static void main(String[] args) {
		String lastName = "조";
		String firstName = "지훈";
		System.out.println(lastName + " " + firstName);
		System.out.println("이름은 \""+lastName+" "+firstName+ "\"입니다.");
		
		// s.o.println()
		// s.o.print()
		// s.o.printf(String "출력형식",출력할값...) 메서드	- 3가지
		//          ㄴformat 형식
		System.out.printf("이름은 \"%s %s\"입니다.", lastName, firstName);
		// 문자열을 출력할때는 %s를 사용(String)		
		// 성, 이름 저장하는 변수 선언
	      // 값 할당
	      // 출력형식:     이 창익
	      // 출력형식:     이름은 "이 창익"입니다.
		
	} // main

} // class
