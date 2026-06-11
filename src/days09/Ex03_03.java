package days09;

/**
 * @author 조지훈
 * @date 2026. 5. 21. 오후 12:26:20
 * @subject 
 * @content 
 * 
 */
public class Ex03_03 {

	public static void main(String[] args) {
		String rrn ="940104-1162229";

		boolean check = isValidRRN(rrn);

		if (check) {
			System.out.println("올바른 주민등록번호 입니다.");
		} else {
			System.out.println("잘못된 주민등록번호 입니다.");
		}

	} // main

	private static boolean isValidRRN(String rrn) {

		int sum = 0;
	      sum +=(rrn.charAt(0)-'0')*2;
	      sum +=(rrn.charAt(1)-'0')*3;
	      sum +=(rrn.charAt(2)-'0')*4;
	      sum +=(rrn.charAt(3)-'0')*5;
	      sum +=(rrn.charAt(4)-'0')*6;
	      sum +=(rrn.charAt(5)-'0')*7;
	      // 6   '-'
	      sum +=(rrn.charAt(7)-'0')*8;
	      sum +=(rrn.charAt(8)-'0')*9;
	      sum +=(rrn.charAt(9)-'0')*2;
	      sum +=(rrn.charAt(10)-'0')*3;
	      sum +=(rrn.charAt(11)-'0')*4;
	      sum +=(rrn.charAt(12)-'0')*5;
	      
	      int ㅍ = 11 - sum % 11;
	      if( ㅍ == 10 ) ㅍ = 0;
	      else if ( ㅍ == 11 ) ㅍ = 1;
	      
//	      System.out.println( ㅍ ); //올바른 마지막 자리.
	      
	      int last = (rrn.charAt(13)-'0');
				return ㅍ==last ? true : false;
	}

	/*
    ‘ㅍ’은 주민등록번호에 오류가 없는지 확인하는 검증번호로, 아래와 같은 특수한 규칙으로 만든다.
    ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) % 11}
                                           ㅍ
    830412-270000                          1
    xx
    234567 892345
    11 - [(16+ 9+?+?+?+) % 11] 
      ??  10-> 0, 11->1
    즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. (단, 10은 0, 11은 1로 표기한다.)
	 */

} // class
