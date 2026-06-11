package days17;

import java.util.Stack;

/**
 * @author 조지훈
 * @date 2026. 6. 4. 오후 5:17:44
 * @subject C -> L : ArrayList, Vector, LinkedList
 * 			C -> S : HashSet, LinkedHashSet (순서유지,중복허용X)
 * 
 * 			[ Stack 컬렉션 클래스 ]
 * 				ㄴLIFO 자료 구조 Last In First Out
 * 
 * 			Stack -> Vector -> List
 * 						ㄴ 멀티스레드에 안전 (동기화 처리)
 * 						ㄴ ArrayList 와 동일 (멀티스레드 안쓴다면)
 * @content 
 * 
 */
public class Ex12 {

	public static void main(String[] args) {
		
		Stack s = new Stack();
//		s.add(s);				쓰면 안된다. LIFO 구조 사용안한다는 뜻. 부모 Vector, List 따르는것
//		s.addElement(s);
//		s.addFirst(s);
		s.push("양인석");
		s.push("안정빈");
		s.push("신창만");
		s.push("이지훈");
		
		System.out.println(s.size());
		// s.get(2); X
		System.out.println(s.peek()); // 읽어만 옴 (개수값은 그대로)
//		System.out.println(s.pop()); // 꺼내서 읽음 (제거)
		System.out.println(s.size());
		
		System.out.println(s.search("서주원")); // -1
		System.out.println(s.search("안정빈")); // 3
		System.out.println(s.isEmpty()); // false
		
		// push() , pop()/peek() , isEmpty(), search()
		
		while (!s.isEmpty()) { // 빌때까지 다 꺼내서 읽기
			System.out.println(s.pop());
		}
		
		
		
	} // main

} // class







