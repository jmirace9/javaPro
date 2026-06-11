package days11;

/**
 * @author 조지훈
 * @date 2026. 5. 26. 오후 2:08:57
 * @subject 
 * @content 
 * 
 */
public class Ex06 {

	// 중첩(inner)클래스 선언할 때 : protected, private 접지 사용가능
	protected class InnerEx06{

	}


	public static void main(String[] args) {
		/*
		 * 1. 클래스 앞에 사용하는      접근 지정자
		 * 
		 * 		1) public		활성화
		 * 			ㄴ 패키지 내/외부에서 사용(참조, 상속) 가능. 패키지 외부에선 import구문 들어감.
		 */

		// days11.Sample, dyas11.Ex06 패키지 내부.
		Sample s = new Sample();


		/* 		3) (default)	활성화
		 * 			ㄴ 패키지 내부에서만 사용(참조, 상속) 가능. 패키지 외부에선 X
		 * 
		 * 		중첩(내부 inner)클래스를 선언할 때만 사용할 수 있다.
		 * 		2) protected	비활성화
		 * 		4) private		비활성화
		 * 
		 * 
		 * 2. 멤버( 필드,메서드 ) 앞에 사용하는 접근 지정자
		 * 
		 * 		1) public	: 패키지 내/외부 어디서나 접근(참조) 가능하다.
		 * 		2) protected: default + 상속 일때 접근 가능하다.
		 * 		3) (default): 패키지 내부에서만 접근 가능하다.
		 * 		4) private  : 같은 클래스 내에서만 접근 가능하다.
		 * 
		 * 
		 * 		Time.java
		 * 
		 * */

		// Time 객체를 생성해서 t1 이라고 하자.			Time과 같은 패키지 public or default
		Time t1 = new Time();
		//
		


	} // main

} // class
