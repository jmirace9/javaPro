package days13;

/**
 * @author 조지훈
 * @date 2026. 5. 28. 오전 10:16:07
 * @subject 
 * @content 
 * 3) 단독 (홀로) 사용될 때의 this 용도
 *       - 리턴 값:    return this;   Ex01_03.java 
 * 
 */
public class Ex01_03 {

	public static void main(String[] args) {
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(10,20);
		p1.dispPoint();
		p2.dispPoint();
		
//		p1.plusPoint(p2);
//		p1.dispPoint();
		
		p1.plusPoint(p2).dispPoint(); // return값 만들면서 줄여서 표현가능

	} // main

} // class

class Point{
	// 필드
	private int x;
	private int y;
	// alt + shift + s 통해 자동으로 만들기
	
	// 디폴트 생성자
	public Point() {
//		super();
		System.out.println("> Point 디폴트 생성자 호출됨..");
		
	}

	// 생성자 2 (매개변수 2개인 생성자)
		
	public Point(int x, int y) {
	//	super();
		this.x = x;
		this.y = y;
		System.out.println("> Point 생성자 2 호출됨..");
	}

	// getter, setter
		
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 메서드 : 두 좌표를 더하는 메서드
	// p1.plusPoint(p2);
	// p1이 this.x, this.y
	public Point plusPoint(Point p) { // this 안써도됨
		this.x += p.x;
		this.y += p.y;
		return this;
	}
	
	
	// 메서드 : 좌표 출력하는 메서드
	public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n", this.x, this.y); // this 안써도됨
	}
	
	
	
}







