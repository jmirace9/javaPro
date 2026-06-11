
package days11;

/**
 * @author 조지훈
 * @date 2026. 5. 26. 오전 10:36:19
 * @subject 신형 자동차 클래스 선언
 * @content 클래스 설계하는 과정
	 *  	1) 객체의 구성요소( 속성, 동작) 파악 -> 목록 작성.
	 *  		스포츠카 : 운전석/조수석 문 2짝 , 엔진, 차체 등등
	 *  	2) 객체 모델링 - 필드, 메서드 작성. (멤버 파악)
	 *  
	 *  클래스 만들자마자 두가지 작업 끝
 * 
 */

// 클래스 라이브러리 (실행 못하지만 다른클래스에서 이용하는 클래스)
public class Car {
	
	// 멤버 == 클래스(객체)의 구성요소
	// ㄴ 멤버 변수 (필드, Field) 속성(특징)
	String name; 	// 차 이름
	int speed;		// 속도
	int wheelCount; // 바퀴 수
	
	// ㄴ 멤버 함수 (메서드, Method) 동작(기능,일)
	public void dispCarInfo() { // {} 블록
		// int speed; 클래스블록아니여서 필드x , 지역변수
		System.out.printf("> 차이름:%s, 속도:%d\n", name, speed);
	}
	
	
} // class
