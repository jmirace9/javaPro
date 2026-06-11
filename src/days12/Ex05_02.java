package days12;

import java.util.Arrays;

/**
 * @author 조지훈
 * @date 2026. 5. 27. 오후 3:07:21
 * @subject 
 * @content 2. [기본형 리턴자료형]과 [참조형 리턴자료형]
 * 				Point 클래스 사용
 * 
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(3,4);
		
		Point p3 = p1.plusPoint(p2);
		p3.dispPoint();
		// ==
		p1.plusPoint(p2).dispPoint();
		
	}
//		int [] m = {1,2,3};
//		
//	int [] n = doubleM(m);
//	System.out.println(Arrays.toString(n));
//
//	} // main
	
	

	// [기본형 리턴자료형]
	public static int sum(int a, int b) {
		return a+b;
	}
	
	/* [1] [참조형 리턴자료형]
	private static int[] doubleM(int[] m) {
		int [] result = new int[m.length];
		for (int i = 0; i < m.length; i++) {
			result[i] = m[i] * 2;
		}
		return result;
	}
	*/
	
	// [2] 람다와 스트림
	private static int[] doubleM(int[] m) {
		
		int [] result = Arrays.stream(m).map( v-> v*2 ).toArray();
		
		return result;
	}
} // class
