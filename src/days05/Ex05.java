package days05;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오전 11:08:48
 * @subject 
 * @content 
 * 
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		 * 3. 이름(String), 나이(byte), 키(double), 성별(boolean) 입력받아서 출력.
		 *    ( 조건: Scanner 사용하기 ) 
		 *    
		 *    입력형식:
		 *    > 이름 나이 키 성별 입력 ? 홍길동 20 178.89 true
		 *    
		 *    출력형식:
		 *    > 이름:홍길동, 나이:20살, 키:178.89cm, 성별:남자
		 */
		
		String name;
		int age;
		double height;
		boolean gender;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" > 이름 나이 키 성별 입력 ? ");
		name = scanner.next("홍길동"); // String타입에는 next() 또는 nextLine()
		age = scanner.nextInt();
		height = scanner.nextDouble();
		gender = scanner.nextBoolean();
		
		System.out.printf("> 이름:%s, 나이:%d살, 키:%.2fcm, 성별:%s\n", 
				name, age, height, gender?"남자":"여자");
		
		
	} // class

} // main
