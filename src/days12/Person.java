package days12;

import javax.management.RuntimeErrorException;

/**
 * @author 조지훈
 * @date 2026. 5. 27. 오후 3:36:32
 * @subject 
 * @content 
 * 
 */
public class Person {

	// 필드
	private String name;
	private int age;
	private boolean gender;
	
	// setter // 만 있으면 쓰기전용
	public void setAge(int a) {
		if ( a >= 0 && a <= 120) {
			age = a;
		}else {
			// 강제로 실행에러 메시지를 발생시키자.
			throw new RuntimeException("[오류] 나이는 0~120 가능..");
		}
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	// getter //만 있으면 읽기전용
	public int getAge() {
		return age;
	}
	
	// 생성자
	public Person() {
		
	}
	public Person(String n, int a, boolean g) {
		name = n;
		age = a;
		gender = g;
	}
	
	// 메서드 - 사람의 정보를 출력하는
	public void dispPerson() {
		System.out.printf("> 이름:%s, 나이:%d살, 성별:%s\n"
							,name,age,gender?"남자":"여자");
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
} // class
