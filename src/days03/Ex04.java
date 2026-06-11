package days03;

/**
 * @author 조지훈
 * @date 2026. 5. 13. 오후 2:00:28
 * @subject 대문자 <ㅡ> 소문자
 * @content 'A' <-> 'a'
 * 			문자 ㅡ> 문자코드표 ㅡ> 1:1 정수 매핑 ㅡ> 2진수로 변환되어 메모리에 표현됨.
 * 			'A' 65 정수코드값
 * 			'a' 97 정수코드값
 * 			'0' 48 정수코드값
 * 
 * 
 */
public class Ex04 {

	public static void main(String[] args) {

		System.out.printf("\'%c\'(%d)\n", 'A', (int)'A');
		System.out.printf("\'%c\'(%d)\n", 'Z', (int)'Z');
		System.out.printf("\'%c\'(%d)\n", 'a', (int)'a');
		System.out.printf("\'%c\'(%d)\n", 'z', (int)'z');
		System.out.printf("\'%c\'(%d)\n", '0', (int)'0');
		System.out.printf("\'%c\'(%d)\n", '9', (int)'9');

		// 대문자 + 32정수 = 소문자로 변환
		// 소문자 - 32정수 = 대문자로 변환
		System.out.println('A' - 'a');
		System.out.println('a' - 'A');

	} // main

} // class

/*
'A'(65)
'Z'(90)
'a'(97)
'z'(122)
'0'(48)
'9'(57)
 */

