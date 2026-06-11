package days16;

import java.util.Arrays;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오전 8:33:20
 * @subject 문자열을 다루는 클래스 5가지
 * @content 1. String 클래스 *****   
 * 			ㄴ 변경 불가능한 클래스 이다. (암기!!!) 정규표현식 체크
 * 			2. StringBuffer 클래스 3. StringBuilder 클래스 
 * 			4.StringTokenizer 클래스 == String.split() 
 * 			5. StringJoiner 클래스 X == String.join() 쓰면됨
 */
public class Ex01 {

	public static void main(String[] args) {

		String a ="abc";
		String b ="AbC";
		
		System.out.println( a.equals(b) );
		System.out.println( a.equalsIgnoreCase(b) ); // 대소문자 구분없이 비교하는 메서드
		
		
		
		 /*
	      int i = 10;
//	      String name = new String("홍길동");
	      //  [0x100]               [홍길동]
	      //  name                  0x100
	      
	      String name = "홍길동";
	      // ["홍길동"] X
	      // name
	      */
				
//		String s = " public statIc void main(String[] args) {   ";
//		
//		String [] sArr = s.trim().split("\\s"); // 한글자씩 자르기
//		System.out.println( Arrays.toString(sArr) );
//		
//		System.out.println("<b>"+ String.join("</b><b>", sArr) + "</b>"); // String.join 첫번째 매개변수로 배열 연결
		
		// var 키워드 질문 = 지역변수에서 사용가능 , 필드 사용 x
		// 자료형을 추론하여 컴파일러가 자료형을 알아서 집어넣는 타입 , 굳이 사용안함
		
//		String name = "홍길동";
//		int age = 20;
//		double avg = 98.77;
		
//		var name = "홍길동"; 
//		var age = 20; 
//		var avg = 98.77;
		
		/*
		// 검색어 :  keyword, searchWord;
		String keyword = "main";
		// 찾는 문자열의 위치값 확인 - 못찾으면 -1 돌림
		int index = -1;
//		if( (index = s.indexOf(keyword))  != -1) {		// 앞에서부터 찾는다. main 문자열이 앞에도 있으면 앞에값 찾음
		if( (index = s.lastIndexOf(keyword))  != -1) { // 뒤에서부터 찾는다. main 문자열이 뒤에도 있으면 뒤에값 찾음
			System.out.println("찾는 문자열이 "+ index + " 위치에 있다.");
			
			// main -> 메인 수정
			System.out.println(s.substring(0, index));
			
			System.out.println(s.replace(keyword, "메인"));
			
			// ic Ic ==> 아이시
			System.out.println(s.replaceAll("ic|Ic", "아이시")); 
			System.out.println(s.replaceAll("(ic|Ic)", "아이시")); 
			System.out.println(s.replaceAll("(i|I)c", "아이시")); // 중복c는 제외하는 코딩 
			System.out.println(s.replaceAll("[i|I]c", "아이시")); //  
			System.out.println(s.replaceAll("(?i)ic", "아이시")); // (?i) 대소문자 구분없다 ic   
			System.out.println(s.replaceFirst("(?i)ic", "아이시")); // 첫번째 발견되는것만 replace   
			
//		}else { s.replaceFirst(keyword, keyword) 
		}else {
	         System.out.println("찾는 문자열이 없다.");
		}
		*/
		
//		검색어의 유무 확인 (boolean 형)
//		if( s.contains(keyword) ) {
//			System.out.println("찾는 문자열이 있다.");
//		} else {
//			System.out.println("찾는 문자열이 없다.");
//		}
//			
		
		
		
//		System.out.println("["+s+"]");
//		// 문자열 앞뒤 공백 제거
//		s = s.trim();
//		System.out.println("["+s+"]");
//		
//		
//		// String -> char []
//		char [] cArr = s.toCharArray();
//		// char [] -> String
//		String t = String.valueOf(cArr);
		
		/*
		 * int length = s.length(); System.out.println("1. 문자열 길이: " + length);
		 * 
		 * char third = s.charAt(2); // 2= 위치값 index 0 , 1 , '2'
		 * System.out.println("2. 세번째 한문자: " + third);
		 * 
		 * String su = s.toUpperCase(); 
		 * //s.toUpperCase();만으로는 출력값똑같음 == s는 불변이라 바뀌지않음 = 바뀐값저장 따로해야함 
		 * System.out.println(su); 
		 * String sl = s.toLowerCase();
		 * System.out.println(sl);
		 * 
		 * String regex ="[\\s()]"; // 정규식 
		 * String [] sArr = s.split(regex, 3); //
		 * 뒤에숫자만큼만 자른다. 1, 2, 3(나머지 전부) 
		 * System.out.println( Arrays.toString(sArr));
		 */
		
		
	} // main

} // class










