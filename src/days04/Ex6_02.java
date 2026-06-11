package days04;

/**
 * @author 조지훈
 * @date 2026. 5. 14. 오전 11:21:53
 * @subject 증감연산자 ++   --
 * @content 암기!! n을 1감소시키는 방법은 총4개 , (후위형,전위형)연산자 이름도 외우기!!
 * 
 */
public class Ex6_02 {

	public static void main(String[] args) {
		
		int n = 10;
		
		System.out.println( n );
		
		// n 1 감소 -> 출력
		n = n-1;
		n -= 1;
		n--;
		--n;
		
		System.out.println( n );
		
	} // main

} // class
