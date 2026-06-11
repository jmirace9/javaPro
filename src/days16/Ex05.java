package days16;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오후 12:03:23
 * @subject 
 * @content 
 * 
 */
public class Ex05 {

	public static void main(String[] args) {
		// [Wrapper 클래스]
		// 기본형을 사용하기 쉽게 기능을 구현한 클래스
		// [ 오토 박싱 / 오토 언박싱 ] 용어 이해.
		int i = 100;
		Integer j = i; // 오토 박싱 : 기본형이 자동으로 래퍼클래스 객체로 변환
		
		int k = j; // 오토 언박싱 : 래퍼클래스 객체가 자동으로 기본형으로 변환
		
		disp(10); // 기본형 int
		
//								String					Object...args
		System.out.printf("%s %d %.2f %c %b \n", "이름", 20, 3.14, 'A', true);
		
	} // main
	
	static void disp(Object obj) { // 10(int) -> Integer -> Object 업캐스팅
		System.out.println(obj);
	}

} // class
