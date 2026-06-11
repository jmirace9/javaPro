package days18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author 조지훈
 * @date 2026. 6. 5. 오전 9:24:41
 * @subject 게임회수 로또 게임처리
 * @content 	HashSet
 * 				HashSet
 * 				HashSet
 * 
 * 		3게임 ArrayList로 저장
 * 
 * 		5 강의장 -> ArrayList
 *				ㄴ1조 -> ArrayList
 * 				ㄴ2조 -> ArrayList
 */				
public class Ex03 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days18\\1차_조편성.txt";
		String line = null; // 한 라인을 읽어드려 저장하는 변수
		
		ArrayList<ArrayList<String>> class5 = new ArrayList<>();
		
		try (// ()생성== try with resource 문 - try 끝나면 자동으로 닫힘
				FileReader in = new FileReader(fileName);
				BufferedReader br = new BufferedReader(in);
				){
			
			ArrayList<String> tmList = null;
			String regex = "[/:]";
			String [] lineArr = null;
			while( ( line = br.readLine() ) != null ) {
//				System.out.println(line);
				tmList = new ArrayList<String>();
				lineArr = line.split(regex); // (1조):(양인석)/(안정빈)/(신창만)/(이지훈)/(장미성)
				for (int i = 1; i < lineArr.length; i++) { // int = 1인 이뉴는 1조 는 필요없기 때문
					String name = lineArr[i];
					tmList.add(name);
				} // for
				
				class5.add(tmList);
			} // while
			
			// 5 강의장의 각 조원들을 출력하는 메서드 호출
			dispClass5(class5);
			
			System.out.println(" END ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

	private static void dispClass5(ArrayList<ArrayList<String>> class5) {
		
		/*
		 * [5 강의장]
		 * 1조
		 *   ㄴ 1번 홍길동 		이름 오름차순 정렬
		 *   :
		 * 2조
		 *   ㄴ 1번 ㅇㅇㅇ
		 *   :
		 * 
		 * */
		System.out.println("[5 강의장]");
		Iterator<ArrayList<String>> ir = class5.iterator();
		int n = 1;
		while (ir.hasNext()) {
			System.out.printf("%d조\n", n++);
			ArrayList<String> tmList = (ArrayList<String>) ir.next();
			Collections.sort(tmList); // 각 팀원들 오름차순 정렬
			Iterator<String> ir2 = tmList.iterator();
			while (ir2.hasNext()) {
				String name = (String) ir2.next();
				System.out.printf("  ㄴ%s\n", name);
			} // ir2 while
			
		} // while
		
		
	} //

} // class
