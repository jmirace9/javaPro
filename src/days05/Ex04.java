package days05;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오전 10:44:57
 * @subject 
 * @content 
 * 
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// 두 정수 (n,m)을 입력받아서 두정수 사이의 합 출력
		//		  2  5
		//       2+3+4+5=14
		
		int n, m;
		
	      Scanner scanner = new Scanner(System.in);

	      System.out.print("> 정수(n) 정수(m) 입력: "); // 2 5
	      n = scanner.nextInt();
	      m = scanner.nextInt();
	      
	      int sum = 0;
	      
	      // [3]번풀이 -- 이걸로 시험문제 풀이사용
	      int min = n>m ? m: n;
	      int max = Math.max(n, m);
	      for (int i = min; i <= max; i++) {  
	             System.out.printf("%d+", i );
	             sum += i ;
	      
	      
	      /* [2]번풀이
	      if (n > m) {
	    	  int temp = n;
	    	  n = m;
	    	  m= temp;
	      }
	          for (int i = n; i <= m; i++) {  
	             System.out.printf("%d+", i );
	             sum += i ; 
	          } // for
	          System.out.printf("=%d", sum);
	      
	      
	      /* [1]번풀이 큰수부터 썼을때
	      if (n > m) {
	          for (int i = m; i <= n; i++) {  
	             System.out.printf("%d+", i );
	             sum += i ; 
	          } // for
	       } else {
	          for (int i = n; i <= m; i++) {  
	             System.out.printf("%d+", i );
	             sum += i ; 
	          } // for
	       }
	      
	      /*
	      int sum = 0;
			for (int i = n; i <= m; i++) {
				System.out.printf("%d+", i);
				sum += i;
			}
				System.out.printf("=%d", sum);
	      
	      /* 내가했던것.
		int sum = 0;
		for (; n <= m; n++) {
			System.out.printf("%d+", n);
			sum += n;
		}
			System.out.printf("=%d", sum);
		*/
		
	} // main

	
	}
} // class
