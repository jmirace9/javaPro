package days14;

/**
 * @author 조지훈
 * @date 2026. 5. 29. 오후 4:12:18
 * @subject [ 인터페이스 사용 장점 ]
 * 			1. 개발 시간을 단축.
 * 			2. 표준화 가능.
 * 			3. 서로 관련 없는 클래스들에게 관계를 맺어 줄 수 있다.
 * 			4. 독립적인 프로그래밍이 가능.
 * 
 * @content 
 * 
 */
public class Ex09 {

	public static void main(String[] args) {
		  // 작업완료전에 미리 준비할수있음
		int [] lottoArr = new int[ILotto.LENGTH];
		
		ILotto lottoGame = null;
//		ILotto lottoGame = new Lotto();
//		ILotto lottoGame = new 시연Lotto제품();
		
		lottoGame.fillLotto(lottoArr);
		lottoGame.dispLotto(lottoArr);
		
		System.out.println("END");
		
	} // main

} // class
