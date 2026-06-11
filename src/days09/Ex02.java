package days09;

import java.util.Arrays;

/**
 * @author 조지훈
 * @date 2026. 5. 21. 오전 10:38:55
* @subject  10 -> 00001010   제어문 연습 + 배열 + String 메서드 
 * @content 이해!! 8진수, 16진수 연습까지해보기!!
 * 
 */
public class Ex02 {
   
   public static void main(String[] args) {      
//      System.out.println( Integer.toBinaryString(10) );
      
      int n  = 10;
      String s = binaryConvert(n);
      System.out.println( s );
      
   } // main

   private static String binaryConvert(int n) {
      int [] m = new int[8];
      
      int index = m.length - 1;
      int share = n, rest;
      
      while (share != 0 ) {
         rest = share % 2;
         share = share / 2;
         // System.out.println( rest );
         m[index--] = rest;
      }      
      
      return Arrays.toString( m );
   }

} // class
