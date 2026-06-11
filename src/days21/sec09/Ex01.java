package days21.sec09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author 조지훈
 * @date 2026. 6. 10. 오전 11:46:36
 * @subject 각종 리소스로부터   -> 메서드	-> 스트림 변환
 * 										BaseStream
 * 			배열							IntStream
 * 			List, Set 컬렉션					:
 * 			파일
 * 			디렉토리
 * 			int 범위
 * 			long 범위
 * 			등등
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		// ArrayList -> Stream 변환
		// ArrayList에 Product 담기
		
//		List<Product> list = List.of(null, null, null, null, null, null, null, null, null, null)
		List<Product> list = new ArrayList<Product>();
		for (int i = 1; i <= 10; i++) {
	         Product product = new Product(i, "상품"+i, "멋진회사", (int)(10000*Math.random()));
	         list.add(product);
		}
		
		// List -> Stream 얻어오기
		Stream<Product> stream = list.stream();
//		list.parallelStream(); 병렬 일뿐 똑같음
		
		stream.forEach(System.out::println); // 메서드 참조
		
	} // main

} // class










