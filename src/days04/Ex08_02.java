package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author 조지훈
 * @date 2026. 5. 14. 오후 2:12:05
 * @subject [if 조건문 연습 예제]
 * @content 
 * 
 */
public class Ex08_02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//정수하나 입력받을 변수 n
		// 자료형 변수명 [=초기값];
		
		int n;
		
		// 키보드로부터 입력받기
		
		BufferedReader br = new BufferedReader(InputStreamReader(System.in));
		
		System.out.print(">n 정수 입력: ");
		n =Integer.parseInt(br.readLine());
		
		System.out.printf("> n=%d\n", n);
		
		System.out.println(" END ");
		
		
		
		
		
		
		
		

	} // main

	private static Reader InputStreamReader(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

} // class
