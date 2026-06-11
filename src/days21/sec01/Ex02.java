package days21.sec01;

/**
 * @author kenik
 * @date 2026. 6. 10. 오전 9:35:37
 * @subject 
 * @content 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		
		Person a = new Person();
		a.action( () -> {
			// 실행문 2개 이상~ : {} 중괄호 필요하다. 
			System.out.println("청소");
			System.out.println("빨래");
		} );
		
		
		
		Person b = new Person();
		// 실행문 1개 인 경우에는  {} 중괄호 생략 가능.
		//          세미콜론 X
		b.action( () -> System.out.println("공부") );

	}

}
