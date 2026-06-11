package days17;

import java.util.HashSet;

/**
 * @author 조지훈
 * @date 2026. 6. 4. 오후 3:43:12
 * @subject C -> List : ArrayList, Vector, LinkedList
 * 			C -> Set  : HashSet 컬렉션 클래스 
 * @content 	  ㄴ 순서유지 X, 중복허용 X
 * 
 */
public class Ex11 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet(); // 초기 용량 16 , 증가치 0.75		
		hs.add(9);
		hs.add(1);
		hs.add(15);
		System.out.println(hs); // [1, 9, 15] 순서 유지되지 않았음. (자동 오름차순 정렬)

		hs.add(1);
		System.out.println(hs); // [1, 9, 15] 중복 허용되지 않았음.
		
		hs.add(null);
		hs.add(null);
		System.out.println(hs); // null 중복 안되고 한번은 들어가짐.
		
		hs.remove(1); // 객체값
		
		
	} // main

} // class





