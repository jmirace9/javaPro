package days20;

/**
 * @author 조지훈
 * @date 2026. 6. 9. 오후 4:45:31
 * @subject 람다식의 설명
 * @content 
 * 
 */
public class Ex11 {

	public static void main(String[] args) {
		
		/*
		 * 1. 람다식 ( Lamda Expression )
		 * 
		 * 	1) JDK 1.5 : 제네릭
		 * 	   JDK 1.8 : 람다식
		 * 
		 * 	2) 자바는 객체 지향 프로그래밍 언어 + 함수형 언어
		 * 	   함수형 언어 = 독립적인 함수
		 * 
		 * 2. 람다식 ?	 메서드를 하나의 수식으로 표현한 것.
		 * 	  람다식 == 익명 함수 ( Anonymous Function )
		 * 
		 * 3. 메서드보다 코딩이 간결하고 이해가 쉽다. 
		 * 	  OOP 단점 : 메서드를 사용하려면 객체를 먼저 생성한 후에 
		 * 			    객체명.메서드명() 호출
		 * 
		 * 4. 람다식을 사용해서 메서드를 변수처럼 다룰 수 있다.
		 * 
		 * 5. 람다식을 선언 형식
		 *    ㄴ 메서드 이름 제거 + 리턴타입 제거
		 *       매개변수 선언부와 몸체{} 사이에 (-> 연산자) 화살표 연산자 추가
		 *       예) 리턴타입 메서드명(매개변수...){
		 *       	//
		 *       	//
		 *       	return 리턴값;
		 *       }
		 * 
		 * 		 (매개변수...) -> {
		 * 		 }
		 * 
		 * 		 예) int max(int a, int b){
		 * 			return a>b ? a:b;
		 * 	     }
		 * 			
		 * 			(int a, int b)->{
		 * 				return a>b ? a:b;
		 * 		 }
		 * 
		 * 6.
		 * (int a, int b) -> { return a>b ? a:b ; }
		 * 	반환값이 있는 경우 return 문 대식 수식으로 대신할 수 있다.
		 * (int a, int b) -> a>b ? a:b 		세미콜론은 뒤에 붙이지 않는다.
		 * 					수식이 자동으로 반환값이된다.
		 * 					{} 중괄호 생략 가능하다.
		 * 	매개변수의 타입이 추측가능할 때는 자료형 생략가능하다.
		 * 	어느 하나만 타입을 생략할 수 는 없다.
		 * ( a, int b) -> a>b ? a:b 	X 
		 * ( a, b) -> a>b ? a:b 		O
		 * 
		 * 
		 * 만약에 매개변수가 1개인 경우 ()괄호 생략 가능하다.
		 * (int a) -> a*a
		 * (a) -> a*a
		 * a -> a*a
		 * 
		 * int a 						X
		 * 
		 * (String name, int age) -> { // {} 명령라인이 1줄 일 경우에만 생략가능하다. 고로 이경우는 생략불가.
		 * 	System.out.println(name);
		 * 	System.out.println(age);
		 * } 
		 * 
		 * */

	} // main

} // class
