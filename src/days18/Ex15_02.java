package days18;
 
/**
 * @author 조지훈
 * @date 2026. 6. 5. 오후 4:31:04
 * @subject 
 * @content 
 * 
 */
public class Ex15_02 {

	public static void main(String[] args) {
		/*
		 * [ 제네릭의 제한 ]
		 * 1. 객체별로 다른 타입으로 지정해서 동작하도록 만든 기술(기능)이기 때문에
		 *    static 필드는 선언할 수 없다. static = 프로그램 시작과 동시에 Method Area 영역에 올라간다.
		 * 
		 * 2. static 메서드의 매개변수 타입도 T를 사용할 수 없다. (1번과 동일한 이유)
		 * 
		 * 3. T 타입의 [] 은 선언할 수 있다.
		 * 
		 * 
		 * */

	} // main

} // class

class Box2<T>{
	
	T [] itemArr;
	
	
	
}



