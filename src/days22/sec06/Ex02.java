package days22.sec06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 조지훈
 * @date 2026. 6. 11. 오후 12:02:07
 * @subject 요소 그룹핑
 *				ㄴ Collectors.groupingBy () 메소드에서 얻은 Collector 를 collect() 메소드를 호출할 때 제공
				ㄴ groupingBy()는 Function 을 이용해서 T를 K로 매핑하고, K를 키로 해 List<T>를 값으로 갖는 Map 컬렉션을 생성

 * @content 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
	
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 92, "남"));
		list.add(new Student("김수영", 87, "여"));
		list.add(new Student("감자바", 95, "남"));
		list.add(new Student("오해영", 93, "여"));

		// list -> gender 로 그룹화 :     남   List, 여 List
		//					 Map		key value
		// [2] 
		Map< String, List<Student> > map = list.stream()
			.collect( Collectors.groupingBy( s -> s.getGender() ) );
		System.out.println(map);
		
		List<Student> mlist = map.get("남");
		mlist.stream().forEach(System.out::println);
		
		/* [1]
		Map<String, List<Student>> map = new HashMap<>();
		List<Student> 남list = new ArrayList<Student>();
		List<Student> 여list = new ArrayList<Student>();
		
		Iterator<Student> ir = list.iterator();
		while (ir.hasNext()) {
			Student s = ir.next();
			String key = s.getGender();
			if (key.equals("남")) {
				남list.add(s);
			}else {
				여list.add(s);
			}
			
			} // while
		map.put("남", 남list);
		map.put("여", 여list);
		System.out.println(남list);
		System.out.println(여list);
		*/
		
	} // main

} // class
