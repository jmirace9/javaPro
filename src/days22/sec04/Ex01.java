package days22.sec04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import days22.sec03.Student;

/**
 * @author 조지훈
 * @date 2026. 6. 11. 오전 10:26:30
 * @subject 
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 30));
		list.add(new Student("문규리", 10));
		list.add(new Student("조지훈", 20));

			
				list.stream()
					.sorted( (o1, o2) -> Integer.compare(o2.getScore(), o1.getScore())) // CompareTo 필요없음 (implement 도)
					.forEach( System.out::println);

	} // main

} // class
