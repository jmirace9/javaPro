package days18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

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
 *				1조 -> ArrayList
 * 				2조 -> ArrayList
 * 5 강의장 -> ArrayList
 */				
public class Ex08 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days18\\1차_조편성.txt";
		String line = null; // 한 라인을 읽어드려 저장하는 변수
		
//		ArrayList<ArrayList<String>> class5 = new ArrayList<>();
		ArrayList< HashMap<String,ArrayList<String>> > class5 = new ArrayList<>();
		
		try (// ()생성== try with resource 문 - try 끝나면 자동으로 닫힘
				FileReader in = new FileReader(fileName);
				BufferedReader br = new BufferedReader(in);
				){
			
			HashMap<String, ArrayList<String>> tmHMap = null; // key + value 저장할 HashMap
			String teamName = null; // 팀 명 Key
			ArrayList<String> tmList = null; // 팀원 리스트 Value
			String regex = "[/:]";
			String [] lineArr = null;
			while( ( line = br.readLine() ) != null ) {
				tmHMap = new HashMap<String, ArrayList<String>>();
				tmList = new ArrayList<String>();
				
				lineArr = line.split(regex); // (1조):(양인석)/(안정빈)/(신창만)/(이지훈)/(장미성)
				teamName = lineArr[0]; // 팀명 키값
				for (int i = 1; i < lineArr.length; i++) { // int = 1인 이유는 1조 는 필요없기 때문
					String name = lineArr[i];
					tmList.add(name);
				} // for
				
				tmHMap.put(teamName, tmList); // 밸류값
				class5.add(tmHMap);
			} // while
			
			// 5 강의장의 각 조원들을 출력하는 메서드 호출
			dispClass5(class5);
			
			System.out.println(" END ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

	private static void dispClass5(ArrayList<HashMap<String, ArrayList<String>>> class5) {
	      /*
	       * [5강의장]
	       * 1조
	       *   ㄴ 1번 홍길동         이름 오름차순 정렬 팀원 출력
	       *   :
	       * 2조
	       *   ㄴ 1번 김길동
	       *   :  
	       * 
	       * */ 
	      System.out.println("[5 강의장]");
	      Iterator<HashMap<String, ArrayList<String>>> ir = class5.iterator();
	       
	      while (ir.hasNext()) {      
	         HashMap<String, ArrayList<String>> tmHMap = (HashMap<String, ArrayList<String>>) ir.next();
	         Set<Entry<String, ArrayList<String>>> eSet= tmHMap.entrySet();         
	         Iterator<Entry<String, ArrayList<String>>> ir2 = eSet.iterator();
	         while (ir2.hasNext()) {
	            Entry<String, ArrayList<String>> entry = (Entry<String, ArrayList<String>>) ir2.next();
	            
	            String teamName = entry.getKey(); // 팀명
	            System.out.printf("%s\n", teamName);
	            ArrayList<String>  tmList =entry.getValue();
	            Collections.sort(tmList); // 각 팀원들 오름차순 정렬
	            Iterator<String> ir3 = tmList.iterator();
	            
	            while (ir3.hasNext()) {
	               String name = (String) ir3.next();
	               System.out.printf("  ㄴ %s\n", name);
	            } // while ir3
	            
	         } // while ir2
	         
	      } // while ir
	      
	   } // 

	} // class




