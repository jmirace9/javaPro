package days07;

/**
 * @author kenik
 * @date 2026. 5. 19. 오후 3:43:16
 * @subject  1이상의 정수라면 유효한 값이고 
 * @content  그외는 유효하지 않는 값이라고 체크.
 *           (정규표현식 사용)
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		String year = "10a";
		
		if( year.matches("^[1-9][0-9]*$") ) {
			System.out.println("유효한 값 O");
		}else {
			System.out.println("유효한 값 X");
		}
		
		
		/* [1] 풀이
		// 알파벳 대문자 체크 정규표현식    'A' <= ch  && ch <= 'Z'
		String one = "A";
		// [ABCDEF...XYZ]
		// if( one.matches("[A-Z]") ) {
		// if( one.matches("[a-z]") ) {
		// if( one.matches("\\d") ) {      // [0-9]
		if( one.matches("[A-Za-z0-9]") ) {
			System.out.println("대문자 O");
		}else {
			System.out.println("대문자 X");
		}
		*/
	} // main

} // class









