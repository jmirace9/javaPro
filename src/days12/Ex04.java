package days12;

/**
 * @author 조지훈
 * @date 2026. 5. 27. 오전 11:28:03
 * @subject [ 생성자 (constructor) ]
 * @content 위치를 나타낼 때 x좌표, y좌표가 필요하다.
 * 			-> 위치를 나타내는 속성+메서드를 구현한 클래스를 선언 : Point
 * 			1) 일종의 메소드이다.
 *          2) 리턴자료형 X,  생성자명 == 클래스명
 *          3) 매개변수가 없는 생성자 : 디폴트(Default) 생성자
 *          4) 생성자는 인위적으로 호출 할 수 없다. 언제호출되냐? 객체 생성할 때 자동으로 호출된다. (인스턴스화)
 * 														ㄴ new Point();
 * 			5) 생성자의 역할: 필드를 초기화
 * 			6) 생성자 오버로딩 가능.
 * 			7) 생성자 상속되지 않는다.
 * 			8) 생성자가 하나도 존재하지 않을 경우 
 * 			   디폴트 생성자는 컴파일러가 컴파일할 때 추가.
 * 
 */
public class Ex04 {

	// 필드 선언 형식
	// [접근지정자] [기타제어자] 자료형 필드명[=자료형초기값]; (인스턴스 변수)
	public int age = 20;
	
	public static void main(String[] args) {
		// 1. Point 객체 선언: p1
//		Point p1 = null; 객체 선언만.
		Point p1 = new Point(); //객체선언 -> 인스턴스화
		
//		p1.x = 1;
//		p1.y = 2;
		
		p1.dispPoint();
		
		// Point p2 선언하고 초기화
		Point p2 = new Point(3,4);
//		p2.x = 3;
//		p2.y = 4;
		
		//객체명.메서드(); 호출한 객체의 메서드호출
		p2.dispPoint();
		
//		The constructor Point(int) is undefined
//		Point p3 = new Point(100);



	} // main

} // class
