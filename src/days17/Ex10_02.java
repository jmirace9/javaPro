package days17;

import java.util.LinkedList;

/**
 * @author 조지훈
 * @date 2026. 6. 4. 오후 3:34:32
 * @subject ArrayList - 읽기 빠르다.
 * 						순차적으로 추가 / 삭제 빠르다
 * 			LinkedList - 중간 추가(삽입)/삭제 빠르다. 
 * @content C -> L 		순서 유지 , 중복 허용 O 
 * 
 */
public class Ex10_02 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		System.out.println(list.size()); // 0
		list.add("양인석");
		list.add("안정빈");
		list.add("신창만");
		list.add("이지훈");
		System.out.println(list);
		
		list.add(1, "장미성");
		System.out.println(list);
		
		// 이지훈 씨가 있다면 앞에 조지훈 삽입
		int index = list.indexOf("이지훈");
		if (index == -1) {
			System.out.println("이지훈씨는 없습니다.");
		} else {
			list.add(index, "조지훈"); // 찾은 index 값 앞에 추가
		}
		System.out.println( list );
		
		list.remove(1);
		list.remove("조지훈");
		System.out.println( list );
		
		
	} // main

} // class
