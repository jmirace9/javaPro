package days21.sec09;

import java.util.stream.IntStream;

/**
 * @author 조지훈
 * @date 2026. 6. 10. 오후 12:17:14
 * @subject 숫자 범위 -> 스트림 
 * @content IntStream 또는 LongStream의 정적 메소드인 
 * 			range()와 rangeClosed() 메소드로 
 * 			특정 범위의 정수 스트림을 얻을 수 있음

 * 
 */
public class Ex03 {
	
//	static int sum = 0; // 스태틱 필드 멤버

	public static void main(String[] args) {
		
		
		/*
//		IntStream.rangeClosed(1, 10); 1~10까지의 정수 (마지막 숫자 포함됨)
		IntStream stream = IntStream.range(1, 11); // 1~10 까지의 정수 (마지막 숫자 포함안됨)
		stream.forEach(System.out::println);
		
//		Local variable sum defined in an enclosing scope must be final or effectively final
		stream.forEach(n -> sum += n); // 익명개체에 추상메서드가 오버라이딩된 객체
//		Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		System.out.println( "총합 : " + sum );
		*/
		
		IntStream stream = IntStream.range(1, 11);
		int total = stream.sum();
//							ㄴ 최종 처리 메서드. 스트림은 한번 사용 후 종료.
		System.out.println(total);
		
	} // main

} // class
