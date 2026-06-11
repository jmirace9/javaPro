package days21.sec07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author 조지훈
 * @date 2026. 6. 10. 오전 11:06:24
 * @subject parallelStream 병렬 + 스트림 처리하겠다
 * @content 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>(); // 부모인 List 융통성 , 다형성
		list.add("홍길동");
		list.add("조지훈");
		list.add("문규리");
		list.add("양인석");
		list.add("장미성");
		list.add("오수빈");
		
		// 요소들을 반복적으로 처리 : 반복자 Iterator, Stream
		// list.stream();
		
		Stream<String> stream = list.parallelStream();
		stream.forEach(name -> {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " : " + name);
		});
	
		
		
	} // main

} // class








