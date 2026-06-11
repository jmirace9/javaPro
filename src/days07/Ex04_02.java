 package days07;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2026. 5. 19. 오후 12:42:21
 * @subject 메소드(method) 정의, 선언 형식
 * @content drawLine()*3 오버로딩
 *          toUpperCase() 대문자로 변환해서 반환하는 메소드
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		String a = "한aB7cDeFx";
		
//		String u = a.toUpperCase();
		String u = myToUpperCase(a);
		System.out.println( u );
		
		String l = a.toLowerCase();
		System.out.println( l );
		
	} // main
	
	// [2] 풀이
	public static String myToUpperCase(String s) {  
		char [] sArr = s.toCharArray();
//		System.out.println( Arrays.toString(sArr) );
		String upper = "";
		char ch;
		for (int i = 0; i < sArr.length; i++) {
			ch = sArr[i];
			if ( Character.isLowerCase(ch) ) {
				ch = Character.toUpperCase(ch);
			} // if 
			upper += ch;
		}// for i
		
		return upper;
	}
	
	/* [1] 풀이
	// 대문자로 변환해서 반환하는 기능을 하는 메소드 선언
		1. 반환형 먼저 결정. 문자열을 받아서 문자열로 리턴.
		public static String myToUpperCase(String s) { // "한aB7cDe"
		// System.out.println( s.length()  );   7
		
		2. 	결과를 저장할 변수 선언. 문자열은 한글자씩 바꿔야되니까 변환된 글자를 누적해야함.
		String upper = "";
		
		3. 반복문으로 한글자씩 접근. 문자열은 여러 글자 -> 한글자씩 검사해야함.
		for (int i = 0 ; i < s.length(); i++) {
//			System.out.printf("\'%c\'\n", s.charAt(i)  );
			
		4. 문자 추출 . 대소문자비교는 char단위로 해야함.
			char ch = s.charAt(i);
		
		5. 소문자인지 검사. a~z까지 ASCII 코드상 연속되기때문
			if ( 'a' <= ch && ch <= 'z' ) {
	
		6. 대문자로 변환. 모든 영문소문자는 대문자보다 32 더 큼.
				ch = (char) (ch - 32);
//				System.out.println( ch );
			} // if
			
		7. 결과 누적. 변환된 문자든 아닌 문자든 결과문자열에 계속 붙여야함.	
			upper += ch;
		} // for i 
		
		8. 반드시 return . String 반환형 이므로 결과 돌려줘야함.
		return upper;
	}
	*/
	

} // class







