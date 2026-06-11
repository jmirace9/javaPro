package days15;

import java.util.Objects;

/**
 * @author 조지훈
 * @date 2026. 6. 1. 오후 4:14:52
 * @subject Object 클래스
 * @content 	ㄴ 모든 클래스의 최상위 부모 클래스
 * 
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		 * Data v1 = new Data(10); 
		 * // 객체 자신의 고유한 코드값 
		 * int hashCode = v1.hashCode();
		 * System.out.println(hashCode); // 1421795058
		 * 
		 * Data v2 = new Data(10); 
		 * hashCode = v2.hashCode();
		 * System.out.println(hashCode); // 1555009629
		 * 
		 * Data v3 = v2 ; // 클래스 복사 copy 
		 * hashCode = v3.hashCode();
		 * System.out.println(hashCode); // 1555009629
		 * 
		 * // 제네릭 <> 
		 * // v1 객체의 클래스 정보를 반환하는 메서드 : getClass() 
		 * Class classinfo = v1.getClass();
		 * 
		 * // days15.Data 
		 * // 패키지명.클래스명 : fullName 
		 * // 풀 네임을 반환해주는 메서드 : getName()
		 * System.out.println(classinfo.getName());
		 * 
		 * // 객체의 정보를 출력하는 메서드 : toString() 
		 * // days15.Data @ 54bedef2 
		 * // fullName + @ + 1421795058 (hash 코드값의 16진수값) 
		 * System.out.println( v1.toString() );
		 */

		Data v1 = new Data(10);
		Data v2 = new Data(10);
		
		System.out.println( v1 == v2 ); 		// 참조 주소값 비교 (아래와 같은 기능)
		// equals() 메서드 Object로부터 상속받아서 오버라이딩.(재정의)
		//				value 속성값이 같으면 true 반환하도록 재정의
		System.out.println( v1.equals(v2) );	// 참조 주소값 비교
		System.out.println(v1.toString());
		// [value:10] (오버라이딩 이후)
		// Data [value=10] (기본 toString 오버라이딩)

		
		// Object.clone() 복제 메서드
		
	} // main

} // class

class Data { // extends Object 자동 컴파일

	// 필드
	int value;

	// 생성자 매개변수 1개용
	public Data(int value) {
		this.value = value;
	}
	
	// v1.equals(v2)
	@Override
	public boolean equals(Object obj) {
		
		if ( obj instanceof Data d) {
//			Data d = (Data) obj; --> 위 Data d 와 같은 코딩 instanceof로 체크 후 맞으면 d생성
			return this.value == d.value;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Data [value=" + value + "]";
	}

//	@Override
//	public String toString() {
//		return String.format("[value:%s]", this.value);
//	}
	

} // class