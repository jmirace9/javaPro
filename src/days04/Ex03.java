package days04;

/**
 * @author 조지훈
 * @date 2026. 5. 14. 오전 10:25:20
 * @subject 	조건(삼항)연산자
 * @content 	
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		/* [1]
		int result = 30 > 5 ? 100 : 200;
		
		System.out.println( result );
		
		[2]
		
		
		*/
		int x = 30, y;
		//     조건식			값 또는 수식
		y = ( x > 5 ? (x < 10 ? 1 : 2) : 200); 
		System.out.println(y);

	} // main

} // class
