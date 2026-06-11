package days05;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오후 2:43:36
 * @subject 
 * @content 
 * 
 */
public class Ex07_05 {
	// 로또번호를 저장할 배열 선언
	// 자료형 [] 배열명 = new 자료형[배열크기];
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		int [] lottoNumbers = new int[6];
		
		//1
		
		lottoNumbers[0] =(int)(Math.random() * 45)+1;
		//2
		
		do {
			lottoNumbers[1] =(int)(Math.random() * 45)+1;
		} while (lottoNumbers[0]==lottoNumbers[1]);
		//3
		
		do {
			lottoNumbers[2] = (int)(Math.random() * 45) + 1;
		} while (lottoNumbers[0] == lottoNumbers[1] || lottoNumbers[0] == lottoNumbers[2]);
		// 4
		
		do {
			lottoNumbers[3] = (int)(Math.random() * 45) + 1;
		} while (lottoNumbers[0] == lottoNumbers[3] || lottoNumbers[1] == lottoNumbers[3] || lottoNumbers[2] == lottoNumbers[3]);
		//5
		
		do {
			lottoNumbers[4] = (int)(Math.random() * 45) + 1;
		} while (lottoNumbers[0] == lottoNumbers[4] || lottoNumbers[1] == lottoNumbers[4] || lottoNumbers[2] == lottoNumbers[4]|| lottoNumbers[3] == lottoNumbers[4]);
		//6
		
		do {
			lottoNumbers[5] = (int)(Math.random() * 45) + 1;
		} while (lottoNumbers[0] == lottoNumbers[5] || lottoNumbers[1] == lottoNumbers[5] || lottoNumbers[2] == lottoNumbers[5]|| lottoNumbers[3] == lottoNumbers[5]|| lottoNumbers[4] == lottoNumbers[5]);

		for (int i = 0; i < lottoNumbers.length; i++) {
			System.out.println(lottoNumbers[i]);
			
		} // main


	} // class

}
