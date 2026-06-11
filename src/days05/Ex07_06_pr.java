package days05;

/**
 * @author 조지훈
 * @date 2026. 5. 18. 오전 8:12:00
 * @subject 로또 연습1
 * @content 
 * 
 */
public class Ex07_06_pr {

	public static void main(String[] args) {
		
		int[] lottoNumbers = new int[6];
		int lottoNumber;
		boolean isFlag = false;
		int index = 0;
		
		while (index < lottoNumbers.length) {
			isFlag = false;
			lottoNumber = (int)(Math.random()*45)+1;
			System.out.println(">중복 검사 전 숫자: "+lottoNumber);
			
			for (int i = 0; i < index; i++) {
				if (lottoNumbers[i]==lottoNumber) {
					isFlag = true;
					break;
				} // if
				
			} // for
			
			if (!isFlag)lottoNumbers[index++] = lottoNumber;
				
			
		} // while
		for (int i = 0; i < lottoNumbers.length; i++) {
			System.out.printf("[%d]" , lottoNumbers[i]);
		}
		
	} // main

} // class
