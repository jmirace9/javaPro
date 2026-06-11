package days02;

/**
 * @author 조지훈
 * @date 2026. 5. 12. 오후 3:12:45
 * @subject 
 * @content 
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
		// 이름을 저장할 변수를 선언하고 본인이름 초기화.
		String name = "홍길동";
		// 나이를 저장할 변수를 선언하고 본인 나이로 초기화
		// String age = "33";
		byte age = 20;
		// 학점 : A B C D F
		// String grade = "A";
//		String grade = 'D';
		//Type mismatch: cannot convert from char to String
		char grade = 'D';
		// 성별을 저장하는 변수를 선언
		// String gender = "남자"; // "여자"
		// char gender = 'M'; // 'F'
		boolean gender = true; // false
		
		// 출력형식: 이름은 "이창익"이고, 나이는 '20'살이고, 학점은 'D'학점이고, 성별은 true입니다.
		System.out.printf("이름은 \"%s\"이고, 나이는 '%d'살이고, 학점은 '%c'학점이고, 성별은 %b입니다.", name, age, grade, gender);
		
		
	}

}
