package days05;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오후 3:46:10
 * @subject 로또 번호를 중복되지않께 꺼내는 코딩.
 * @content 
 * 
 */
public class Ex07_06 {

	public static void main(String[] args) {
		// 1. 배열 선언
		int [] lottoNumbers = new int[6];
		int lottoNumber; // 4-1
		boolean isFlag = false; // 4-3 for문의 if 조건을 위한 boolean형
		
		// 3. 로또 번호 6개를 발생시켜 각 0,1,2,3,4,5 요소에 저장
		int index = 0; // 첫번째방이 0번째 방임
		
		while (index < lottoNumbers.length ) {
			isFlag = false;
			lottoNumber = (int)(Math.random() * 45) + 1;
			System.out.println("> 중복체크 전 로또번호: "+ lottoNumber);
			
			
			// 4. 중복 체크
			// 반복문 for문 4-2
			for (int i = 0; i < index; i++) {
				if (lottoNumbers[i]==lottoNumber) {
					isFlag = true;
					break; //4-4
				} // if
			} // for
			
				
			
			
			if(!isFlag)lottoNumbers[index++] = lottoNumber;
			// ㄴ 4-5
			
			// index++;
			
		} // while
		
		// 2. 배열 출력
		for (int i = 0; i < lottoNumbers.length; i++) {
			System.out.printf("[%d]", lottoNumbers[i]);
			
		} 
		System.out.println( ); // 개행
		
	}// main
	
} // class
