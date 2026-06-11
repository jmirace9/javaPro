package days05;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오후 2:32:44
 * @subject 
 * @content 
 * 
 */
public class Ex07_02 {

	public static void main(String[] args) {
		// 중복되지 않는 6개의 로또 번호 발생...
		
		int lottoNumber;
		for (int i = 1; i <= 6; i++) {
		lottoNumber =(int)(Math.random() * 45)+1;
				System.out.println(lottoNumber);
				
				
				
		} // for
		
	} // main

} // class
