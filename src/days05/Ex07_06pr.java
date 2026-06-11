package days05;

import java.util.Iterator;

/**
 * @author 조지훈
 * @date 2026. 5. 18. 오전 8:30:44
 * @subject 로또 연습2
 * @content 
 * 
 */
public class Ex07_06pr {

	public static void main(String[] args) {
		int [] lottoNumbers = new int [6];
		int lottoNumber;
		int index = 0;
		boolean isFlag = false;
		// 배열 지정, 중복검사전숫자 지정, 방번호값 지정, 중복여부검사 변수 지정
		while (index < lottoNumbers.length) {
			isFlag = false;
			lottoNumber = (int)(Math.random()*45)+1;
			
			System.out.println(">중복 체크 전 숫자:"+lottoNumber);
			// while문 지정 (조건 = 방번호를 배열(원하는 로또숫자 갯수)보다 적게
			// 중복여부검사 재지정 (반복중에 또 같은수가 나올수도있기에)
			// 중복검사전 숫자의범위 지정
			for (int i = 0; i < index; i++) {
				if (lottoNumbers[i] == lottoNumber) {
					isFlag=true;
					break;
			// for반복문(방개수 index보다 적을때까지 반복) 지정과 if문의 조건 적고자하는 로또배열숫자와  
			// 중복검사전 숫자가같으면 isFlag(중복검사결과값이 true)가되고 break; 이는 중복검사에서 중복이 떴으니 다시 숫자를 뽑자는 지정.
				} // if
				
			} // for
			
			if (!isFlag) {lottoNumbers[index++] = lottoNumber;
				// while문과 for반복문 사이에 새로운 if = 참이아닌 (!isFlag)상황에서는 새로운방에 저장하는 코딩
				// index++로 방번호숫자를 한칸씩올려가며
			} // if 2
			
		}// while
		
		for (int i = 0; i < lottoNumbers.length; i++) {
			System.out.printf("[%d]", lottoNumbers[i]);
			//  while문은 종료되고 반복하며 배열을 일렬로 숫자출력
		} // for 2
		
		
	} // main

}
