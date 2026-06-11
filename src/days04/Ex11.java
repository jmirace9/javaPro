package days04;

/**
 * @author 조지훈
 * @date 2026. 5. 14. 오후 4:48:03
 * @subject [조건반복문: while]
 * @content 1+2+3+4+5+6+7+8+9+10=55
 * 
 */
public class Ex11 {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		while ( i <= 10 ) {
			System.out.printf("%d+", i);
			sum += i;	//sum = sum + i;
			i++;
		}
		
		
		System.out.printf("=%d\n", sum);
		
		System.out.println("END");
		
		// 260515 금요일 테스트예정.
		// if 홀/짝
		// switch 홀/짝
		// for 1~10합
		// while 1~10합
		
		
		}
		
		
		
		
		
		
		
		
		
		/*
		int i = 1;
		int sum = 0;
		while ( i <= 10 ) {
			System.out.printf("%d+", i);
			i++;
			sum += i; //sum = sum+i;
		} // while
		
		System.out.printf("=%d\n", sum);
		
		System.out.println(" END ");
		*/
		
	} // main

 // class
