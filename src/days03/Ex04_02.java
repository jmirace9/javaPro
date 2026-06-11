package days03;

/**
 * @author 조지훈
 * @date 2026. 5. 13. 오후 2:09:37
 * @subject 대문자 ㅡ> 소문자 변환해서 출력하는 작업.
 * @content 
 * 
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		char upperCase = 'X';
		// Type mismatch: cannot convert from int to char
		char lowerCase = (char) (upperCase + 32);
		
		System.out.printf("%c -> %c\n", upperCase, lowerCase);
		
		
	} // main

} // class
