package days16;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오전 10:36:24
 * @subject 2. StringBuffer 클래스		- 멀티 스레드에 안전하다(== 동기화 처리가 되어져있다.)
 * 			3. StringBuilder 클래스 		- 스레드가 아니면 StringBuffer와 똑같은 코딩
 * @content 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// 수정, 삭제, 삽입 이 String 타입에선 어려움, 메소드도 없음- 불변자료형이기 때문
		String s = "TODO Auto-generated method stub";
//      int index = s.indexOf("generated");
//      
//      System.out.println( s.substring(0, index + "generated".length()) 
//						+ " 삽입 " 
//						+ s.substring(index + "generated".length()) );
//		testStringAppend();
		
//		testStringBuilderAppend();
		
		
	      StringBuilder sb = new StringBuilder("public static void main(String[] args) {");
	      
	      sb.append("끝에 문자열 연결");
	      sb.delete(1, 5); // p[ubli]c 삭제 ==      1<=  <5 사이 삭제
	      sb.replace(0, 2, "바꿈");
	      sb.insert(1, "삽입");
	      sb.reverse(); // 문자열 반전
	      
	      System.out.println(sb.toString());

	      System.out.println(" END ");
		
	} // main
	
	public static void testStringBuilderAppend() {  // Append 제일 끝에 추가된다는 의미
	      // 처리시간 11297300ns
	      long start = System.nanoTime();
	      
	      StringBuilder sb = new StringBuilder("a");
	      for (int i = 0; i < 2000000; i++) {
	         sb.append("a");
	      }
	      
	      long end = System.nanoTime();
	      System.out.println(">> 처리 시간 :  " + (end-start)+"ns");
	   }

		/*
		 * public static void testStringAppend() { // Append 제일 끝에 추가된다는 의미 // 처리시간 약 5분
		 * long start = System.nanoTime();
		 * 
		 * String s = "a"; for (int i = 0; i < 2000000; i++) { s += "a"; // "a"를 append
		 * }
		 * 
		 * long end = System.nanoTime(); System.out.println(">> 처리 시간 :  " +
		 * (end-start)+"ns"); }
		 */
	
	
} // class














