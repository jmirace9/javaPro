package days21.sec07;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author 조지훈
 * @date 2026. 6. 10. 오전 11:06:24
 * @subject Stream
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 컬렉션, 배열에서 저장된 요소를 반복적으로 처리하기 위해서
		 * 	Iterator,for 문을 이용했다.
		 * 일괄적으로 (표준화) 배열, 컬렉션 전부 반복적으로 요소를 처리하는 방법으로
		 * jdk 1.8 스트림 ...
		 * 
		 * 2. 스트림 : 흐르는 물,
		 * 			요소들이 하나씩 흘러가면서 처리된다.
		 * */
		
		Set<String> set = new HashSet<String>(); // 부모인 Set 융통성 , 다형성
		set.add("홍길동");
		set.add("조지훈");
		set.add("문규리");
		
		// [1] Stream 안쓴다면 Iterator
//		Iterator<String> ir = set.iterator();
//		while (ir.hasNext()) {
//			String name = ir.next(); // 제네릭 사용하므로 형변환 필요없음
//			System.out.println(name);
//		}
		
		// [2] 스트림을 사용해서 반복적으로 처리...
		Stream<String> stream = set.stream();
		// [1]
//		stream.forEach( new Consumer<String>() { //ㄴConsumer 인터페이스 = 매개변수 1개, 리턴값없음
//			@Override
//			public void accept(String name) {
//				System.out.println(name);
//				
//			}
//		});		
		
		// [2]
//		stream.forEach( (name) -> System.out.println(name) );
//		stream.forEach( name -> System.out.println(name) );
		
		// [3] 메서드 참조 형태
		// 클래스명 :: 메서드명  인스턴스메서드
		// 객체명 :: 메서드명 	
			
//		stream.forEach( System.out::println );
		stream.forEach(name -> {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " : " + name);
		});
							
		
	} // main

} // class








