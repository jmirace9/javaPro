package days22.sec06;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 조지훈
 * @date 2026. 6. 11. 오후 12:12:53
 * @subject Collectors.groupingBy() 메소드는 
 * 			그룹핑 후 매핑 및 
 * 				집계(평균, 카운팅, 연결, 최대, 최소, 합계)를 수행할 수 있도록 
 * 				두 번째 매개값인 Collector 를 가질 수 있음.

 * @content 
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 92, "남"));
		list.add(new Student("김수영", 87, "여"));
		list.add(new Student("감자바", 95, "남"));
		list.add(new Student("오해영", 93, "여"));
		
		// 남 점수평균 출력 , 여 점수평균 출력...
		
		Map<String, Double> gaMap = list.stream().collect( 
				Collectors.groupingBy( 
						s -> s.getGender() // 그룹핑
						, Collectors.averagingDouble( s -> s.getScore() ) ) // 집계
				);
		double 남평균 = gaMap.get("남");
		double 여평균 = gaMap.get("여");
		
		System.out.println(gaMap);
		System.out.println(남평균);
		System.out.println(여평균);

	} // main

} // class
