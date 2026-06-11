package days22.sec02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author 조지훈
 * @date 2026. 6. 11. 오전 9:31:23
 * @subject [ 요소를 복수 개의 요소로 변환 ]
			flatMapXxx() 메소드: (변환할때, 요소가 바뀔때는 항상 map이 들어간다.)
				ㄴ 하나의 요소를 복수 개의 요소들로 변환한 새로운 스트림을 리턴

 * @content 
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		List<String> list = new ArrayList<String>();
	    list.add("this is java");
	    list.add("i am a best developer");
	    
	    list.stream() // Stream<String>
//	    	.flatMap( s -> Arrays.stream(s.split(" ")) )
	    	.flatMap( s -> Arrays.stream(s.split("")) )	
	    	.forEach(System.out::println);;
	    
//	    String str = "this is java";
//	    String [] strArr = str.split(" ");
//	    System.out.println( Arrays.toString(strArr) );

		 */
		
		// "10" 스트림 생성 -> 변환 -> 10 스트림 변환 -> 최종처리.
		List<String> list2 = Arrays.asList("10, 20, 30" , "40, 50");
		
//		String e = "10, 20, 30";
//		String [] eArr = e.split(",");
//		반복문 10,20,30
		
		list2.stream()	// Stream<String> -> IntStream 변환 // 식 확인 해보자!!! 할만하다
			 .flatMapToInt( data -> {
				 String [] strArr = data.split(",\\s*");
				 int [] intArr = new int[strArr.length];
				 for (int i = 0; i < strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i]);
				}
				 return Arrays.stream(intArr);
			 }).forEach(System.out::println);
		

	} // main

} // class
