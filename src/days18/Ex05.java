package days18;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author 조지훈
 * @date 2026. 6. 5. 오전 10:45:25
 * @subject 
 * @content 
 * 
 */
public class Ex05 {

	public static void main(String[] args) {
		// 순서유지 X 중복허용 X			순서유지 O 중복허용 X
		HashSet<Student> hs = new LinkedHashSet(); // 기본을 set 으로 큰값주고시작하면 나중에 수정하기좋음

		hs.add(new Student("2020001", "홍길동", 25));
		hs.add(new Student("2020002", "서영학", 25));
		hs.add(new Student("2020003", "최승우", 25));
		
		System.out.println(hs);
		// HashSet은 학번이 똑같으면 중복됨으로 저장안되게 코딩.
		System.out.println( hs.add(new Student("2020001", "정창기", 25))); // add 리턴자료형 = boolean
		
		System.out.println(hs);
	} // main

} // class
