package days06;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 18. 오전 11:39:06
 * @subject 
 * @content 
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		/* [1]
		String message = "";

				         System.out.println("3 2 1");
				         System.out.println(message);
		 */

		// ctrl shift o 필요한 패키지 올리기 (스캐너 임포트)
		/* [2]
		Scanner sc = new Scanner(System.in);
		int angle1 = sc.nextInt();
		int angle2 = sc.nextInt();

		int sum_angle = (angle1 + angle2)%360;
		System.out.println(sum_angle);
		
		// System.out.println(sum_angle % 360);
		 */
		
		// [3]
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        
        for(int i=0; i<1; i++){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);


	} // main

} // class
