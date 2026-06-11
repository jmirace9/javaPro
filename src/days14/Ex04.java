package days14;

/**
 * @author 조지훈
 * @date 2026. 5. 29. 오후 12:03:40
 * @subject 
 * @content 
 * 
 */
public class Ex04 {
	
	// 필드
	//	ㄴ 인스턴스 변수
	
	public static final double PI ; // static 있을때도 명시적 초기화도 가능
//			ㄴ 클래스변수, static 변수, 공유변수
	
	static {
		PI = 3.141592;
	}
	
//	{   초기화 블럭 초기화
//		PI = 3.141592;
//	}
	
//	public Ex04() {
//		PI = 3.141592;
//	}
	
	public static void test(final int n) {
		
//		n = 100;
		
	}

	public static void main(String[] args) {
		/*
		 *  [ final 키워드 설명 ]
		 *	1. final + 변수 앞에 : 상수 선언 (변수명 대문자로) 
		 * 				ㄴ 지역 변수
		 * 				ㄴ 인스턴스 변수
		 * 				ㄴ 클래스 변수
		 * 
		 * 2. final + 클래스 앞에 : 상속 불가
		 * 
		 * 3. final + 메서드 앞에 : 수정 불가
		 * 				
		 * 
		 * 
		 * */
		
		test(100);
		
		
//		final double PI = 3.141592; 명시적 초기화
		
//		PI = 3.14; 오류뜸
		
	} // main

	
	
} // class

// final class Parent
class Parent{
	
	public void test1() {
		System.out.println("> P.test1()...");
	}
	
//	public final void test2() {  자식이 재정의 할 수 없는 최종 메서드
	public void test2() {
		System.out.println("> P.test2()...");
	}
	
}

class Child extends Parent{
	
	@Override
	public void test1() {
		System.out.println("> C.test1()...");
	}
	
	@Override
//	void test2() {
	public void test2() {
		System.out.println("> C.test2()...");
	}
	
}



