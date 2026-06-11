package days14;

/**
 * @author 조지훈
 * @date 2026. 5. 29. 오전 10:09:23
 * @subject 사원이라면 공통적으로 가지고 있는 멤버들을 구현한 클래스
 * @content 
 * 
 */
public abstract class Employee extends Object {

	// 필드
	private String name;		// 사원명
	private String addr;		// 주소
	private String tel;			// 연락처
	private String hiredate;	// 입사일자

	// getter, setter

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	// 디폴트 생성자 

	public Employee() {
		super();
		System.out.println("> Employee 디폴트 생성자 호출됨.");
	}

	// 4개 매개변수 생성자

	public Employee(String name, String addr, String tel, String hiredate) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("> Employee 4 생성자 호출됨.");
	}

	// 메서드
	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s\n"
				, this.name, this.addr, this.tel, this.hiredate);
	}
	/*
	public int getPay() {
		return 0; // 오버라이딩해라.
	}
	*/
	// 추상 메서드: 몸체(body){}가 구현이 안된 불완전한 메서드
	//			물려받는 자식클래스에서 오버라이딩(재정의함수)하라는 의미이다.
	public abstract int getPay();




} // class
