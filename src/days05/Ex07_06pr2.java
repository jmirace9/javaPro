package days05;

import java.util.Iterator;

/**
 * @author 조지훈
 * @date 2026. 5. 18. 오전 8:30:44
 * @subject 로또 연습2
 * @content 
 * 
 */
public class Ex07_06pr2 {

	public static void main(String[] args) {
		
		int [] lottoNumbers = new int[6];
		int lottoNumber;
		int index = 0;
		boolean isFlag = false;
		
		while (index < lottoNumbers.length) {
			isFlag = false;
			lottoNumber = (int)(Math.random()*45)+1;
			System.out.println("> 중복 검사 전 숫자:" + lottoNumber);
			
			for (int i = 0; i < index; i++) {
				if (lottoNumbers[i] == lottoNumber) {
					isFlag = true;
					break;
				} // if
				
				
			} // for
			
			if (!isFlag) {lottoNumbers[index++] = lottoNumber;
			
			} // if2
			
		} // while
		
		for (int i = 0; i < lottoNumbers.length; i++) {
			System.out.printf("[%d]" , lottoNumbers[i]);
		}
		
	} // main

} // class
