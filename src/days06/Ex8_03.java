package days06;

/**
 * @author 조지훈
 * @date 2026. 5. 18. 오후 4:52:54
 * @subject 구구단 가로로출력.
 * @content 
 * 
 */
public class Ex8_03 {

	public static void main(String[] args) {
		
	      for (int i = 1; i <= 9 ; i++) {         
	    	  	  
	         for (int dan = 2; dan <= 9; dan++) {
	            System.out.printf("%d*%d=%02d ", dan, i, dan * i);
	         }
	         System.out.println();
	      }

	} // main

} // class
