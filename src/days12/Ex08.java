package days12;

import days12.Employee;

/**
 * @author 조지훈
 * @date 2026. 5. 27. 오후 4:20:31
 * @subject [ this 키워드(예약어) 설명 ]
 * @content  강의교안 6.9 인스턴스멤버
 * 
 */
public class Ex08 {

	public static void main(String[] args) {
		/*
		 * 1. this 정의
		 * 	ㄴ 현재 객체 자기 자신을 가리키는 참조변수
		 * 
		 * 	int i = 10; //
		 *  int [] m; // 변수, 지역변수, 참조변수, 배열
		 *  Person p; // 변수, 지역변수, 참조변수, 객체
		 *  
		 * 2. this의 용도 3가지
		 * 	ㄴ 멤버를 가르킬 때
		 * */

	
		Employee emp1 = new Employee();
        // stack        		heap
		// [0x100번지]           [null][0x100번지]
		// emp1         		name  this
		//              		0x100번지\
		emp1.dispName();
		
		
		Employee emp2 = new Employee();
        // stack        		heap
		// [0x200번지]           [null][0x200번지]
		// emp2         		name  this
		//              		0x200번지
		// X emp2.name = "홍길동";
		emp2.setName("김길동");
		emp2.dispName();
	}
		
		
	} // main



// 사원 클래스
class Employee{

	private String name;
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void dispName() {
		System.out.println( this.name );
	}

}
