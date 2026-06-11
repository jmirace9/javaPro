package days11;

import java.util.Random;

/**
 * @author 조지훈
 * @date 2026. 5. 26. 오후 4:48:21
 * @subject 한 반에 30명 학생의 이름,국,영,수,총점,평균,등수 처리 //Student.java 클래스 선언 + 필드/메서드선언, 입력작업 컨버팅
 * @content days08.Ex05.java 참조 days08.Ex05_02 java 참조
 * 
 */
public class Ex09 {

	public static void main(String[] args) {
		
		Student [] students = new Student[30];
		
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}
		
		for (int i = 0; i < students.length; i++) {
			
			students[i].name = generateRandomName();
			students[i].kor = generateRandomScore();
			students[i].eng = generateRandomScore();
			students[i].mat = generateRandomScore();
			students[i].tot = students[i].kor + students[i].eng + students[i].mat;
			students[i].avg = students[i].tot / 3.0;
		}
		for (int i = 0; i < students.length; i++) {
			students[i].rank= 1;
			
			for (int j = 0; j < students.length; j++) {
				if (students[i].tot < students[j].tot) {
					students[i].rank++;
				} // if
			} // for j
		} // for i
		
		for (int i = 0; i < students.length; i++) {
			System.out.printf("이름=%s\n국어:%d\n영어:%d\n수학:%d\n총점:%d\n평균:%.2f\n등수:%d\n"
					,students[i].name,students[i].kor,students[i].eng,students[i].mat,students[i].tot, students[i].avg,students[i].rank );
		}
		
		
	} // main

	private static String generateRandomName() {
		char [] nameArr = new char[3];
		Random rnd = new Random();
		char nameChar;
		for (int i = 0; i < nameArr.length; i++) {
			nameChar = (char)rnd.nextInt('가','힣'+1);
			nameArr[i] = nameChar;
		}
		String name = String.valueOf(nameArr);
		return name;
	}

	private static int generateRandomScore() {
		Random rnd = new Random();
		int score = rnd.nextInt(0,101);
		return score;
	}

} // class
