package days17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 6. 4. 오후 4:16:40
 * @subject days10.Ex03.java
 * @content 게임 회수를 입력받아서 회수만큼 로또번호를 발생시켜 출력하는 코딩
 * 
 */
public class Ex11_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		final int LOTTO_PRICE = 1000; // 로또 1게임 1000 
		int gameCount; // 게임횟수

		System.out.print("> 게임 횟수 입력: "); 
		gameCount = scanner.nextInt();

		HashSet lottoSet = new HashSet(6);
		
		ArrayList lottoList = new ArrayList();
		
		// 로또번호 생성 메소드 호출 부분
		createLottoNumbers(lottoSet);

		// 호출 부분 
		displayLottoNumbers(lottoSet);
		
		

	} // main
	
	
	// 1차원배열 로또를 채우는 함수, 로또 번호 한 게임 발생..
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
