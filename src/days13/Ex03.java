package days13;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 28. 오후 12:09:04
 * @subject 
 * @content 
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		 /*
	      Ex03 obj = new Ex03();
	      obj.disp();
	      */
	      
	      // Ex03.disp();
	      
	      disp();
	      
	      Math.max(2,3);
	      System.out.println();      
	      
	      //ctrl shift O
	      Random rnd = new Random();
	      Scanner scanner = new Scanner(System.in);

	   } // main
	   
	   public static void disp() { // static없으면== 인스턴스 매서드 객체가 만들어져야 생성
	      System.out.println("> disp() 호출됨.");
	  } 

} // class






