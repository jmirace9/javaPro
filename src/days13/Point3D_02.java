package days13;

/**
 * @author 조지훈
 * @date 2026. 5. 28. 오후 3:28:57
 * @subject 1. 상속 받지 않고 x, y, z 3좌표를 다루는 클래스 선언.
 * @content 
 * 
 */

public class Point3D_02 {
	
	// 필드
	private int x;
	private int y;
	private int z;
	
	// 생성자
	public Point3D_02() {
		System.out.println("> Point3D 디폴트 생성자 호출됨..");
	}
	
	public Point3D_02(int v) {
		this.x = v;
		this.y = v;
		this.z = v;
		System.out.println("> Point3D 생성자 1 호출됨..");
	}
	
	public Point3D_02(int x,int y,int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("> Point3D 생성자 1 호출됨..");
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

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	// 메서드
	public void dispPoint3D() {
		System.out.printf("> x=%d, y=%d, z=%d\n"
				, this.x, this.y, this.z);
	}
	
	public Point3D_02 plusPoint3D(Point3D_02 p) { // this 안써도됨
		this.x += p.x;
		this.y += p.y;
		this.z += p.z;
		return this;
	}

} // class
