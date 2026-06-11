package days17;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author 조지훈
 * @date 2026. 6. 4. 오전 10:45:08
 * @subject List 구현한 컬렉션 클래스 : ArrayList  가장 많이 사용되는 클래스
 * @content  ㄴ 특징 : 순서 유지 O, 중복 허용 O  
 * 
 */
public class Ex05_02 {

	public static void main(String[] args) {
		// <E> 제네릭 클래스 : Element (==요소)
		ArrayList groupList = new ArrayList(3);
		System.out.println(groupList.isEmpty()); // true 
		System.out.println(groupList.size()); // 0		요소의 개수
		groupList.add("양인석");
		groupList.add("안정빈"); // 문규리로 자리대체
		groupList.add("신창만");
		System.out.println(groupList.size()); // 3		요소의 개수
		System.out.println(groupList.isEmpty()); // false 
		groupList.add("이지훈");
		groupList.add("장미성");
		System.out.println(groupList.size()); // 5		요소의 개수
		
		groupList.trimToSize(); // 나머지 빈 리스트 제거
		
		// 2번째 있는 사람의 이름을 얻어와서 출력...
		String name = (String) groupList.get(1);
		System.out.println("> 두번째 사람의 이름: " + name);
		
		// 있는지 없는지 boolean형
		System.out.println(groupList.contains("안정빈")); // true
		
		// 몇번 list 에 있는지
		int index = groupList.indexOf("안정빈");
		System.out.println(index); // 1
		
		groupList.remove(index);
		
		// 모든 팀원출력
//		for (int i = 0, size = groupList.size() ; i < size; i++) { // 함수반복 말고 변수로 담아서
//			name = (String) groupList.get(i);
//			System.out.println("> 이름: " + name);
//		} // for
		
		System.out.println(groupList); // [양인석, 신창만, 이지훈, 장미성]	toString 생략되어있음
		
		groupList.add(1, "문규리");
		System.out.println(groupList.toString()); // [양인석, 문규리, 신창만, 이지훈, 장미성]
		
		// 1명 팀원으로 더 추가
		groupList.addFirst("이지훈"); // 중복 허용 O
		System.out.println(groupList); // [이지훈, 양인석, 문규리, 신창만, 이지훈, 장미성] 순서 유지 O
		
		// [문제] "이지훈" 찾아서 모두 삭제 -> 출력
		// 앞에서부터 찾고 지워가면 뒤에 명단이 재정렬되며 끝값이 줄어든다
/*
		//		[2] 뒤부터 시작
		for (int i = groupList.size() -1 ; i >= 0; i--) {
			name = (String) groupList.get(i);
			if (name.equals("이지훈")) {
//				System.out.println(i + " : " + name);
				groupList.remove(i);
			}
		} // for
		System.out.println(groupList);
		
//		[1] 앞부터 시작
		for (int i = 0, size = groupList.size(); i < size ; i++) {
			name = (String) groupList.get(i);
			if (name.equals("이지훈")) {
//				System.out.println(i + " : " + name);
				groupList.remove(i);
				i--;
				size--;
			}
			*/
//		} // for
		
		/*
		// [3] 반복자(iterator) 사용해서 출력. + "이지훈" 제거 ***암기!!!
		Iterator ir = groupList.iterator();
//		ㄴ 인터페이스					ㄴ 메서드
		while (ir.hasNext()) {
			name = (String) ir.next();
//			System.out.println("> " + name);
			if(name.equals("이지훈")) {
				ir.remove();
		}
		}
		System.out.println(groupList);
		*/
		
		/*
		// [4] 삭제할 집합 생성
		ArrayList removeList = new ArrayList();
		removeList.add("이지훈");
		removeList.add("신창만");
		
		ㄴ 위 3줄 포함한 코딩
		List removeList = List.of("이지훈", "신창만");
		
		groupList.removeAll(removeList); // 매개변수 다형성, 인터페이스 , 업캐스팅 개념 전부 포함
		
		
		*/
		// [5] groupList.removeIf(Predicate p)
//									ㄴ 삭제할 조건
//							ㄴ 조건에 만족하는 요소를 모두제거
//								 함수형 인터페이스
//		groupList.removeIf( n -> n.equals("이지훈")); // 무명 클래스 days15 ex05

		// 이름순으로 오름차순 정렬
//		groupList.sort(new Comparator<String>() {

//			@Override
//			public int compare(String o1, String o2) {
//				
//				return o1.compareTo(o2)*1; // 0, 양수=오름차순, 음수 = 내림차순 
//				return o2.compareTo(o1); // 0, 양수=오름차순, 음수 = 내림차순 
//			}
//		});
//		groupList.sort( ( o1,  o2) -> ((String)o1).compareTo((String)o2) );
		
		groupList.sort(( o1, o2) -> {
			 String a = (String)o1;
			 String b = (String)o2;
			 return a.compareTo(b)*-1;
		 });


		System.out.println(groupList);
		
		// 모든 요소를 제거
//		groupList.clear();
//		System.out.println(groupList);
		
//		int f = groupList.indexOf("이지훈");
//		System.out.println(f);
//		groupList.remove("이지훈");
//		groupList.remove("이지훈");
//		System.out.println(groupList);

		// 맨 뒤 2명의 이름을 출력...
		int fromIndex = 4;
		int toIndex = groupList.size(); // 	4<=		 < 6
		List endList = groupList.subList(fromIndex, toIndex);
		System.out.println(endList);
		
		
	} // main

} // class





