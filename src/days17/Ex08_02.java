package days17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 조지훈
 * @date 2026. 6. 4. 오후 2:39:35
 * @subject 
 * @content 
 * 
 */
public class Ex08_02 {

	public static void main(String[] args) {
	// ArrayList -> String [] 변환
		
		ArrayList list = new ArrayList();
		list.add("박예진");
		list.add("양희동");
		list.add("박정현");
		System.out.println(list);

		/* [1]
		String [] names = new String[list.size()];
		
		for (int i = 0; i < names.length; i++) {
			names[i] = (String) list.get(i);
		}
		System.out.println(Arrays.toString(names));
		*/
		
		// [2] String [] = Object []
//		String [] names = list.toArray(new String[0]);
//		String [] names = list.toArray(String[]::new);
		
//		String [] names = (String[]) list.toArray( new String[0] );
		String [] names = (String[]) list.toArray( String[]::new );
		
//		IntFunction 타입 String[]::new        == new String[0]
//							ㄴ 생성자 참조
//							ㄴ 배열 생성자 참조
		
	} // main

} // class





