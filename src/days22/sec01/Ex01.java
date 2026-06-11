package days22.sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author 조지훈
 * @date 2026. 6. 11. 오전 9:04:14
 * @subject 챕터 17.5 요소 걸러내기 : distinct(), filter()
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("양인석");
		list.add("안정빈");
		list.add("신창만");
		  list.add("이지훈");
		list.add("장미성");
		list.add("안정빈");
		  list.add("이시연");
		  list.add("이지훈");
		
		// 성이 "이"씨인 학생명단만 출력...
		// Stream<String> 
//		list.stream().filter(new Predicate<String>() { // filter 중간단계 , Predicate 는 boolean 형
//			@Override
//			public boolean test(String n) {
//				return n.startsWith("이");
//			}
//		}).distinct().forEach(System.out::println);
		
		list.stream()
		    .filter( (String n) -> n.startsWith("이") )
		    .distinct()
		    .forEach(System.out::println);
		

	} // main

} // class









