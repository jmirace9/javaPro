package days15;


import java.io.IOException;
import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 6. 1. 오후 2:28:03
 * @subject 예외 처리하는 두번째 방법: throws 문 사용
   								throw 문 : 강제로 예외를 발생시키는문
 * 예외 처리하는 첫번째 방법:try ~ catch 	
 * @content 
 * 
 */
public class Ex08 {

	public static void main(String[] args) {
	      // 강제로 예외를 발생시킬 때 throw 문을 사용.
	      // throw new ArithmeticException();

		int kor = 0;
		try {
			kor = getScore();
		} catch (IOException e) {
			
		}
		
	   } // main
	   
	   
	   private static int getScore() throws IOException {
	      
	      Scanner scanner = new Scanner(System.in);
	      int score = 0;      
	      System.out.print("> 점수 입력 ? ");
	      String input = scanner.next();      
	      String regex = "^(\\d|[1-9]\\d|100)$"; // 0<= <=100      
	      if (input.matches(regex)) {
	         score = Integer.parseInt(input);
	      } else {
	         // 강제로 예외 발생시키겠다. 
	         throw new IOException("> 점수 범위 0<= <=100   !!!");         
	      }
	      
	      return score;
	   }
} // class
