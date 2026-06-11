package days03;

/**
 * @author 조지훈
 * @date 2026. 5. 13. 오후 12:20:53
 * @subject 지역변수(local variable) 설명
 * @content 
 * 
 */
public class Ex02 {

	String address;  // 인스턴스 변수
	static double pi; // 클래스 변수
	
	public static void main(String[] args) {
		// ctrl + A 전체 선택
		// ctrl + I 들여 쓰기
		String name = "이창익";

		// {} 영역(범위) 연산자
		{
			
			int age = 20;

			
		}
		
		// The local variable name may not have been initialized
		// age cannot be resolved to a variable
		//			System.out.printf("> name:%s, age:%d\n", name, age);
		
	} // main

} // class
