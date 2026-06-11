package days12;

/**
 * @author 조지훈
 * @date 2026. 5. 27. 오전 11:37:36
 * @subject 
 * @content 
 * 
 */
public class Point {

	// 필드
	public int x;
	public int y;
	
	// 디폴트 생성자
		public Point() {
//		ㄴ접근지정자 4종다가능 , 생성자 이름은 클래스명과 동일하게 생성
			x = y = 100;
			System.out.println("> Point 디폴트 생성자 호출됨...");
		}
		
	// 생성자 2
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("> Point 2 생성자 호출됨...");
	}
	
	public Point(int v) {
		this(v, v);
//		this.x = v;
//		this.y = v;
		System.out.println("> Point 1 생성자 호출됨...");
	}

	// 메서드
	// [1] 현재 위치 (x,y)를 출력하는 메소드
	public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n", x, y);
	}
	
	public void offsetPoint(int value) { // int value 기본형 매개변수
		x += value;
		y += value;
	}
	
	// p1.plusPoint()
	   // p2.plusPoint()
	   public void plusPoint(Point a, Point b) {  // 참조형 매개변수
	      x = a.x + b.x;
	      y = a.y + b.y;
	   }
	   
	   // p1.plusPoint(p2);
//	   public void plusPoint( Point p) {  // 참조형 매개변수
//	      x = x + p.x;
//	      y = y + p.y;
//	   }
	   
	   public Point plusPoint( Point p) {  // 참조형 매개변수
		   return new Point(x + p.x, y + p.y );
		   
	   }
	   
	   
	
	
} // class
