package days12;

/**
 * @author 조지훈
 * @date 2026. 5. 27. 오후 3:33:50
 * @subject getter, setter 설명
 * @content Person 클래스
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.name = "홍길동";
		
//		The field Person.age is not visible
//		if(입력할 나이값 >= 0)
//		p1.age = -20;
		p1.setAge(20);
		
		System.out.println(p1.getAge());
		
//		p1.dispPerson();
		
		
		
	} // main

} // class
