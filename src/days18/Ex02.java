package days18;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SequencedSet;

/**
 * @author 조지훈
 * @date 2026. 6. 5. 오전 9:14:30
 * @subject LinkedHashSet 컬렉션 클래스
 * @content extends HashSet(순서유지X)    implements SequencedSet<E>
 * 					ㄴ 중복허용X		        +	 	 순서유지 O
 */
public class Ex02 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> s = new LinkedHashSet<>(); // 클래스타입인 Integer로 제네릭에 들어가야함 int X
		s.add(20); // 오토박싱 int 20 -> Integer (20)
		s.add(new Integer(10));
		s.add(20);
		s.add(15);
		// [20, 10, 15] 중복허용 X , 순서유지 O

		System.out.println(s);
	} // main

} // class
