package days22.sec02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 조지훈
 * @date 2026. 6. 11. 오전 9:16:04
 * @subject 매핑 => 스트림의 요소를 다른 요소로 변환하는 중간 처리 기능
			[1,2,3] -> 각 요소*2 -> [2,4,6]
			Student[name,score] -> IntStream score 변환 (특정값만 가져와서 작업) 
			
			매핑 메소드: mapXxx(), asDoubleStream(), asLongStream(), boxed(), flatMapXxx() 등
																	래퍼클래스-기본형을 객체로
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 85));
		list.add(new Student("홍길동", 92));
		list.add(new Student("홍길동", 87));
		
		// Student(T) 요소 -> score IntStream 변환
		// Stream<Student> IntStream
		list.stream().mapToInt( s -> s.getScore() )
		    .forEach(System.out::println);

	} // main

} // class
