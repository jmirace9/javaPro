package days17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 조지훈
 * @date 2026. 6. 4. 오후 2:32:43
 * @subject String [] -> ArrayList 변환
 * @content ArrayList -> String [] 변환
 * 
 */
public class Ex08 {

	public static void main(String[] args) {
		
		String [] names = {"박예진", "양희동", "박정현", "김대원", "주정호", "이찬희"};
		
		
		// [2] T == Type == 자료형
//		List<T> = Arrays.asList(T...a)
		List list = Arrays.asList(names);
		System.out.println(list);
		
		// Collection c <== List list
		ArrayList alist = new ArrayList(list); // 굳이 ArrayList로 담지않고 List 로 씀
		System.out.println(list);
		
		
		/*
		[1]
		 
		ArrayList list = new ArrayList();
		for (int i = 0; i < names.length; i++) {
			list.add(names[i]);
		}
		System.out.println(list);
		*/
		
		
	} // main

} // class








