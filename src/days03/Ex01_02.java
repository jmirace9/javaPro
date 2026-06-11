package days03;

import java.util.Calendar;

/**
 * @author 조지훈
 * @date 2026. 5. 13. 오전 9:38:09
 * @subject 
 * @content 
 * 
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
		/*
	       * %[argument_index$][flags][width][.precision]conversion
	       * %conversion
	       * %d
	       * %c
	       * %s
	       * %f
	       * %c
	       * %b
	       * */   
		
//		Calendar c = Calendar.getInstance();
//		String s = String.format("Duke's Birthday: %1$tm %1$te,%1$tY", c);
//		System.out.println(s);
		
		  
		// 화면에 -반복통해서 줄긋는 출력
		System.out.println( "-".repeat(100) );
		
		String name = "이창익";
		short tot = 253;
		double avg = 84.333333;
		
		// 출력형식: 이창익_이창익_이창익
		//System.out.printf("%s_%s_%s", name,name,name);
		//System.out.printf("%1$s_%1\$s_%1$s", name);
		
		//System.out.printf("총점: [%10d]\n", tot);
		//System.out.printf("총점: [%-10d]", tot);
		
		
		// 						% f = conversion
		//System.out.printf("평균: [%10.2f]\n", avg);
		
		// 앞자리채운 0을 플래그라고함
//		int no = 10;
//		System.out.printf("방번호: [%04d]\n", no);
		
		// 정수 %d 10진수 출력
		// 정수 %o 8진수 출력
		// 정수 %x 16진수 출력
		// 정수 %X 16진수 출력
		// 플래그 o,x,X,#
		
//      2진법: 0 1 
//      8진법: 0 1 2 3 4 5 6 7
//      10진법: 0 1 2 3 4 5 6 7 8 9
//      16진법: 0 1 2 3 4 5 6 7 8 9 a(10) b(11) c(12) d(13) e(14) f(15)
		int no = 10;
		System.out.printf("방번호: [%d]\n", no); //10
		System.out.printf("방번호: [%#o]\n", no); //12
		System.out.printf("방번호: [%#x]\n", no); // a
		System.out.printf("방번호: [%#X]\n", no); // A
		
		// ( == 음수일때는 괄호를 붙이고 양수일땐 안붙이겠다. 플래그종류임
		int n = -123;
		System.out.printf("n=%(d\n", n);
		
		// 10 
		
	} // main

} // class
