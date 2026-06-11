package days13;

/**
 * @author 조지훈
 * @date 2026. 5. 28. 오후 3:28:57
 * @subject 
 * 1. x, y 두 좌표를 다루는 Point 클래스
 * Point 클래스를 상속받아서 추가적으로 z좌표를 다루는 클래스 선언
 * @content 
 */

public class Point3D extends Point {
	
	// 필드
	
	private int z;
	
	// 생성자
	public Point3D() {
		super(); // 숨겨져있다. 자식객체생성하면 부모객체도 생성되고 부모생성자가 먼저 호출 
		System.out.println("> Point3D 디폴트 생성자 호출됨..");
	}
	
	public Point3D(int v) {
		super(v,v); // 맨위에 와야함
//		this.setX(v);
//		this.setY(v);
		
//		The field Point.x is not visible
//		this.x = v;		this.y = v;
		this.z = v;
		System.out.println("> Point3D 생성자 1 호출됨..");
	}
	
	public Point3D(int x,int y,int z) {
		super(x,y);
		this.z = z;
		System.out.println("> Point3D 생성자 1 호출됨..");
	}

	// getter, setter
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	// 메서드 - plusPoint(), dispPoint()
	public void dispPoint3D() {
		
//		System.out.printf("> x=%d, y=%d, z=%d\n"		// 가능
//				, this.getX(), this.getY(), this.z);
		
		super.dispPoint(); // 부모의 x, y 출력
		System.out.printf("> z=%d\n",this.z);
	}
	
	public Point3D plusPoint3D(Point3D p) { // this 안써도됨
		
		this.setX( this.getX()+ p.getX() );
		this.setY( this.getY()+ p.getY() );
		
		this.z += p.z;
		return this;
	}

} // class
