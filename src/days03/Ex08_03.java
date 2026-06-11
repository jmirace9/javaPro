package days03;

/**
 * @author 조지훈
 * @date 2026. 5. 13. 오후 4:32:36
 * @subject 
 * @content 
 * 
 */
public class Ex08_03 {

	public static void main(String[] args) {
		
		int i = 10, j = 3;
		
		System.out.println( i == j); // 주의: = 2개 넣어야한다.
		// The operator ! is undefined for the argument type(s) int
		// System.out.println( i =! j );
		 System.out.println( i != j ); // 주의: 느낌표위치가 =의 앞.
		 
		 System.out.println( i > j ); 
		 System.out.println( i < j ); 
		 
		 System.out.println( i >= j ); // 주의: 종이에 쓰듯이 무조건 부등호 먼저.
		 System.out.println( i <= j ); 
		 
		 
	} // main

} // class
