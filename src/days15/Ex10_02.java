package days15;

/**
 * @author 조지훈
 * @date 2026. 6. 1. 오후 4:47:32
 * @subject 
 * @content 
 * 
 */
public class Ex10_02 {

	public static void main(String[] args) {

		Point p1 = new Point(1, 2);
		
		try {
			// 복제
//			Unhandled exception type CloneNotSupportedException
			Point p1Clone = (Point) p1.clone();
			System.out.println( p1Clone );
		} catch (CloneNotSupportedException e) {
			System.out.println( e.toString() );
		}
		
		System.out.println(" END ");

	} // main

} // class

class Point extends Object implements Cloneable{ // 복제가능한지 구분하기 위한 implements (메서드가 하나도 없는 marker interface)

	// 필드
	int x;
	int y;

	// 생성자 0
	public Point() {}
	// 생성자 2
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null && obj instanceof Point) {
			Point p = (Point)obj;
			return this.x == p.x && this.y == p.y;
		} // if

		return false;
	}

	@Override
	   public String toString() {
	      return String.format("(x=%d,y=%d)", this.x, this.y);
	   }
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// return super.clone(); 아래3줄과 같은코딩 .기본출력
		Object obj = null;
		obj = super.clone();
		return obj;
	}




} // class