package days22.sec03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 조지훈
 * @date 2026. 6. 11. 오전 10:05:06
 * @subject 17.7 정렬
					ㄴ 요소를 오름차순 또는 내림차순으로 정렬하는 중간 처리 기능
					ㄴ sorted()
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 30));
		list.add(new Student("문규리", 10));
		list.add(new Student("조지훈", 20));

		// 점수로 오름차순 정렬을 해서 출력...
		list.stream()	// Stream<Student>
		.sorted()	// compareTo 오버라이딩해야함 implements Comparable<Student> 구현한 기본 정렬방식으로
		.forEach( System.out::println );

		// 점수로 내림차순 정렬해서 출력
		list.stream()
		// 			[1]
		//			.sorted(new Comparator<Student>() {
		//				@Override
		//				public int compare(Student o1, Student o2) { 
		//					return Integer.compare(o2.getScore(), o1.getScore());
		//				}
		//			})
		// 			[2]
		//			.sorted( (o1, o2) -> Integer.compare(o2.getScore(), o1.getScore()))
			.sorted(Collections.reverseOrder())
			.forEach( System.out::println);

	} // main

} // class
