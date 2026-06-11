package days22.sec06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 조지훈
 * @date 2026. 6. 11. 오전 11:34:43
 * 			필터링한 요소 수집
 * @subject Stream의 collect(Collector<T,A,R> collector) 메소드는 필터링 또는 매핑된 요소들을 새로운 컬렉션에 수집하고, 이 컬렉션을 리턴
			매개값인 Collector는 어떤 요소를 어떤 컬렉션에 수집할 것인지를 결정
			타입 파라미터의 T는 요소, A는 누적기 accumulator, 그리고 R은 요소가 저장될 컬렉션 // 암기 !!! 암기

			collect(T,A,R)

			toList()
			toSet()
			toMap()
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 92, "남"));
		list.add(new Student("김수영", 87, "여"));
		list.add(new Student("감자바", 95, "남"));
		list.add(new Student("오해영", 93, "여"));

		// 필터링해서 요소 수집 : 남자 학생들만 수집해서 List 생성
//		 List<Student> mlist = list.stream() // Stream<Student>
//			.filter( s -> s.getGender().equals("남") )
//			.collect( Collectors.toList() );
		
//		 List<Student> mlist = list.stream() // Stream<Student>
//				 .filter( s -> s.getGender().equals("남") )
//				 .toList();
//		 
//		 mlist.stream().forEach(System.out::println);
		
		// List<Student> list -> Map 생성
		//						Entry ( key, value )
		
//		[2]
		Map<String,Integer> map = list.stream()
									  .collect( Collectors.toMap( s -> s.getName(), s -> s.getScore() ) );
		
		
//		[1]
//		Map<String, String> map = new HashMap<String, String>();
//		Iterator<Student> ir = list.iterator();
//		while (ir.hasNext()) {
//			Student s = ir.next();
//			String key = s.getName();
//			String value = s.getScore()+""; Int값이라서
//			map.put(key, value);
//			}

	} // main

} // class









