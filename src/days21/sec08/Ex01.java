package days21.sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.ToIntFunction;

/**
 * @author 조지훈
 * @date 2026. 6. 10. 오전 11:28:38
 * @subject 중간처리, 최종처리
 * 			스트림 파이프라인
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("조지훈", 90));
		list.add(new Student("문규리", 87));
		list.add(new Student("오수빈", 95));
		list.add(new Student("신창만", 65));
		list.add(new Student("양인석", 45));
		*/
		
		List<Student> list = Arrays.asList( 
				new Student("조지훈", 90),
				new Student("문규리", 87),
				new Student("오수빈", 95),
				new Student("신창만", 65),
				new Student("양인석", 45) );
//	  Stream<Student> IntStream(.mapToInt)
//		list.stream().mapToInt(new ToIntFunction<Student>() {
//			@Override
//			public int applyAsInt(Student s) {
//				return s.getScore();
//			}
//		});
		
//		  Stream<Student> IntStream(.mapToInt)		OptionalDouble
		double avg = list.stream()
				.mapToInt( s -> s.getScore() )
				.average()
				.getAsDouble();
		System.out.println(avg);
		
//		System.out.println(avg); // OptionalDouble[76.4]
//		System.out.println(avg.getAsDouble()); // 76.4 double 자료형 
		
	} // main

} // class












