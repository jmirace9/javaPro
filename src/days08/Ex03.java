package days08;

/**
 * @author 조지훈
 * @date 2026. 5. 20. 오전 9:45:05
 * @subject 재귀 함수
 * @content  ㄴ 함수 안에서 자기 자신을 다시 호출하는 함수.
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		
		// 호출 부분 - 마우스대고 에러문으로 호출
		disp();

	} // main

		// 재귀 함수
	private static void disp() {
		System.out.println("> 실행문...");
		System.out.println("> 실행문...");
		System.out.println("> 실행문...");
		disp(); // 함수호출부분
	
		
	}

} // class
