package days17;

import java.util.HashSet;

/**
 * @author 조지훈
 * @date 2026. 6. 4. 오후 3:49:42
 * @subject 
 * @content 로또 게임
 * 			1) int [] lotto 로또 한 게임 / ex?
 * 			2) int [][] lottos 로또 여러게임 / ex?
 * 
 */
public class Ex11_02 {

	public static void main(String[] args) {
		// 1. 배열 선언
		HashSet lottoSet = new HashSet(6);
		
		createLottoNumbers(lottoSet);
		displayLottoNumbers(lottoSet);

	} // main

	// HashSet 에 로또를 채우는 함수, 로또 번호 한 게임 발생..
	public static void createLottoNumbers( HashSet lottoSet ) {
		int lottoNumber; 
		while (lottoSet.size() <6 ) {
			lottoNumber = (int)(Math.random() * 45) + 1;
//			System.out.print(lottoNumber+",");
			lottoSet.add(lottoNumber);
		} // while
	}

	// 한 게임 출력하는 메소드
	public static void displayLottoNumbers( HashSet lottoSet ) {
		   System.out.println(lottoSet);
	}

} // class
