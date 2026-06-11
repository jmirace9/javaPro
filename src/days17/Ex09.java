package days17;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author 조지훈
 * @date 2026. 6. 4. 오후 2:52:52
 * @subject [ Vector 컬렉션 클래스 ]
 * @content Collection -> List -> ArrayList 컬렉션 클래스
 * 								-> Vector 컬렉션 클래스 ( 차이점 : 멀티 스레드에 안전 )
 * 
 */
public class Ex09 {

	public static void main(String[] args) {
		
		Vector v = new Vector(3); // 크기 : 10개
		System.out.println( v.size() ); // 요소의 개수 = 0개
		System.out.println( v.capacity() ); // 초기 용량 = 10
		
		v.addElement("양인석"); // ArrayList 에 없던 것.
		v.add("안정빈");
		v.add("신창만");
		System.out.println( v.size() ); // 요소의 개수 = 3개
		v.add("이지훈");
		System.out.println( v.capacity() ); // 요소의 개수 = 6개
		
		System.out.println(v.get(0));
		System.out.println(v.getFirst());
		System.out.println(v.elementAt(0)); // ArrayList 에 없던 것.
		
		// 모든 요소를 출력. 반복자, 열거자
		Enumeration en = v.elements();
		while (en.hasMoreElements()) { // 요소 더 가지고 있니? true / false
			String name = (String) en.nextElement();
			System.out.println(name);
		}
		
		// 마지막 요소
		int lastIndex = v.size() -1;
		System.out.println(v.get(lastIndex));
		System.out.println(v.lastElement());
		
		v.remove(0);
		v.remove("안정빈");
		
	} // main

} // class





