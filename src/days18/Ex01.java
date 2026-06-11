package days18;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 조지훈
 * @date 2026. 6. 5. 오전 8:37:45
 * @subject Queue 인터페이스 		Deque 더블큐 컬렉션클래스 양방향 Queue
 * @content 	ㄴ FIFO 구조
 * 				ㄴ offer()	poll()/peek()	isEmpty()
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		// <E> Elements 요소
		Queue q = new LinkedList(); // 
		q.offer("안정빈");
		q.offer("조지훈");
		System.out.println(q.offer("문규리")); // offer 들어갔는지 true,false 값 
		
		while (!q.isEmpty()) {
			System.out.println(q.poll()); // FIFO 출력 넣은순서대로 출력
		}
		
		

	} // main

} // class
