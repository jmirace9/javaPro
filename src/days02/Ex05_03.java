package days02;

/**
 * @author 조지훈
 * @date 2026. 5. 12. 오후 12:32:21
 * @subject 
 * @content 
 * 				println()	이름출력 + 줄바꿈(개행)
 * 				print()		이름출력 + 줄바꿈(개행) X
 * Alt + Shift + A = 세로선택
 */
public class Ex05_03 {

	public static void main(String[] args) {
		
		
		// Alt + Shift + A
		
//		System.out.print("조지훈");
//		System.out.print("문규리");
//		System.out.print("이창익");
		
		// 숫자(정수) + 정수: 덧셈 연산자
	      System.out.println(10 + 20); // 30
	      // 문자열 + 문자열: 문자열 연결 연산자
	      System.out.println("10" + "20"); // "1020"
	      
	      System.out.println("10" + 20); // "1020" 
		
		String lastName = "조", firstName = "지훈";
			System.out.println(lastName + " " + firstName + "입니다.");
	} //main

} // class
