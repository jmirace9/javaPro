package days15;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author 조지훈
 * @date 2026. 6. 1. 오전 11:14:43
 * @subject 익명(무명, anonymous) 클래스 예제
 * @content 
 * 
 */

public class Ex05 {
	
	public static void main(String [] args) {
		
		String [] s = { "kbs", "sbs", "mbc", "jtbc" };
		
		System.out.println(Arrays.toString(s));
		
		// 오름차순 정렬
		Arrays.sort(s); // 매개변수에는 String [] 없음. Object [] 있음 == 다형성
		
		// 내림차순 정렬
//		Arrays.sort(s, 비교자객체 comparator);
//		Arrays.sort(s, new StringComaparator() );
		
//		익명(무명) 클래스 사용 예제
		
		/*
		 * Arrays.sort(s, new Comparator<String>() {
		 * 
		 * @Override 
		 * public int compare(String o1, String o2) { return
		 * o1.compareTo(o2)*-1; } } );
		 *  
		 */ 
//		Arrays.sort(s, (o1,o2) -> o1.compareTo(o2)*-1); 위와 같은 코딩
		
		// 배열 사용하기 쉽도록 기능이 구현된 클래스 : Arrays
		// 컬렉션 사용하기 쉽도록 기능이 구현된 클래스 : Collections
		Arrays.sort(s, Collections.reverseOrder());
			  
			  System.out.println(Arrays.toString(s));
			  
	} // main

} // class
/*
 * // 문자열을 비교하는 비교자(comparator) 선언. : 클래스 선언 class StringComaparator implements
 * Comparator{ // <String> 타입비교 T
 * 
 * @Override public int compare(Object o1, Object o2) {
 * 
 * String s1 = (String) o1; String s2 = (String) o2; return s1.compareTo(s2)
 * *-1; // s1 s2 음수 s2 s1 양수 s1 == s2 0 }
 * 
 * }
 */



