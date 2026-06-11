package days18;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 조지훈
 * @date 2026. 6. 5. 오후 3:12:02
 * @subject 배열 기능 구현된 클래스 : Arrays 클래스
 * @content 컬렉션 클래스 기능 구현된 클래스 : Collections 클래스
 * Collections
 */
public class Ex13 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Collections.addAll(list, 1,2,3,4,5);
		
		System.out.println(list);
		
		// 오른쪽으로 2칸씩 회전(이동)
//		Collections.rotate(list, 2);
//		System.out.println(list);
		
		// 0번째 2번째 바꾸기
		Collections.swap(list, 0, 2);
		System.out.println(list);
		
		// 무작위로 섞기
		Collections.shuffle(list);
		System.out.println(list);
		
//		// 오름차순 정렬
//		Collections.sort(list);
//		System.out.println(list);
//		
//		// 내림차순 정렬
//		Collections.reverse(list);
//		System.out.println(list);
		
		// 바로 내림차순
//		Collections.sort(list, (o1, o2)-> o2-o1);
		Collections.sort(list, Collections.reverseOrder());
		
		// 모든 요소의 값을 0으로 초기화 (0으로 채우기 ==배열에도 있음)
		Collections.fill(list, 0);
		System.out.println(list);
		
		int index = Collections.binarySearch(list, 100);
		System.out.println(index); // -6 음수는 false
		
		Collections.replaceAll(list, 0, 100);
		index = Collections.binarySearch(list, 100);
		System.out.println(index); // 2 
		System.out.println(list);
		
	} // main

} // class








