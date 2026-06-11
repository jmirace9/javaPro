package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 조지훈
 * @date 2026. 5. 14. 오전 11:10:21
 * @subject 
 * @content 
 * 
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {
		
		String s1 = "홍길동";
		String s2; // 키보드로부터 입력받아서 대입
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> s2 입력: ");
		s2 = br.readLine(); // 홍길동
		System.out.printf("[%s]\n", s2);
		System.out.println(s1 == s2 ? "같다" : "다르다" );
		System.out.println(s1.equals(s2) ? "같다" : "다르다" );
		
		
		
	} // main

} // class
