package days03;

/**
 * @author 조지훈
 * @date 2026. 5. 13. 오전 11:08:29
 * @subject 문자 타입: char(2byte) 유니코드 2바이트 처리.
 * @content 
 * 
 */
public class Ex01_03 {

	public static void main(String[] args) {
		
		 //         b
	      /*        여기 강제형변환 바이트 쇼츠로 바꾸고 이해해보자
	      byte b;
	      b = (byte) 130;      
	      System.out.println( b );
	      */ 
	      
	      // [][][][][1][0][1][0]  정수   -128~127
	      byte b = 10;
	      
	      // [][][][][1][0][1][0] [][][][][1][0][1][0]
	      //                   c
	      // 'A' -> 10진수 값 1:1 매칭 문자셋 -> 0 1
	      //                 65            -> 0000 0000 0100 0001 
	      char c = 'A';
	      char d = 65;

	} // main

} // class








