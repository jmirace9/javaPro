package days17;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author 조지훈
 * @date 2026. 6. 4. 오후 12:41:29
 * @subject 
 * @content 
 * 
 */
public class Ex06 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add(new Person("이지훈", 20));
		list.add(new Person("류호훈", 42));
		list.add(new Person("장미성", 23));
		
		System.out.println( list );
		
//		list.sort(new Comparator() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//				Person p1 = (Person) o1;
//				Person p2 = (Person) o2;
//				return p1.getAge()-p2.getAge();
//			}});
//		System.out.println(list);
		
//		list.sort((p1,p2) -> ((Person) p1).getAge()-((Person) p2).getAge());
//		System.out.println(list);
		
//		list.sort(Comparator.comparingInt(Person::getAge));
//		System.out.println(list);
		
		// 나이순으로 오름차순 정렬 후 출력
		
		// Person 객체의 age 나이로 비교하기위해 Comparator 익명클래스 생성+사용한 예
//		list.sort(new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {	
//				return o1.getAge() - o2.getAge(); // 빼기 후 정수값
//			}
//		});
		
		list.sort(null);
		
		System.out.println(list);
	} // main

} // class



