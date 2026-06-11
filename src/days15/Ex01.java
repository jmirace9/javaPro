package days15;

/**
 * @author 조지훈
 * @date 2026. 6. 1. 오전 8:52:16
 * @subject 
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		 * [ 인터페이스( interface ) ]
		 * 
		 * 1. 자바의 자료형( Type ) 
		 * 		ㄴ 기본형 8가지
		 * 		ㄴ 참조형 : 배열, 클래스(String), 인터페이스
		 * 
		 * 2. 일종의 추상클래스이다.
		 * 		ㄴ 상수만 선언 가능.
		 * 		ㄴ 100% 추상메서드만 선언 가능.
		 * 		ㄴ jdk 1.8 부터~ : static 메서드, default 메서드 추가.
		 * 
		 * 3. 인터페이스는 그 자체만으로 사용되지 않고,
		 * 	  다른 클래스를 선언하는데 도음을 줄 목적의 클래스
		 * 
		 * 4. 인터페이스 선언 형식
		 *  [접근지정자] interface 인터페이스명{
		 *  	}				ㄴ 대문자로 시작 (클래스명 처럼)
		 * 
		 * 5. 인터페이스 끼리도 상속이 가능하다.
		 * 
		 */	
	
	
	
	} // main

} // class

interface IA {
	
	void test1(); // public abstract 생략되있음.
	void test2();
	
}

interface IB extends IA { // interface 끼리 상속 가능.
	
//	void test1();  
//	void test2();
	void test3();
	
}

interface ID {
	
	void test4(); // public abstract 생략되있음.
	void test5();
	
}

abstract class Test implements IB, ID { // 추상으로 만들던지 test2();도 추가하기 , 클래스는 단일 상속만 가능하지만 interface 는 다중상속가능
	@Override
	// Cannot reduce the visibility of the inherited method from IA
	public void test1() {
		System.out.println("추상 메서드를 오버라이딩...");
	}
	
}












