package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 조지훈
 * @date 2026. 5. 13. 오후 3:23:31
 * @subject 이름, 국,영,수 키보드로 부터 입력 -> 각각의 변수에 저장한 후
 * 			총점, 평균까지 구하고 출력.
 * @content ! 내일 테스트 ! 암기하고 해보기
 * 
 */
public class Ex07_02TEST {

	public static void main(String[] args) throws IOException {
		// 1. br 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;      
		int kor = 0 , eng = 0 , mat = 0;
		int tot = 0;  
		double avg = 0;

		// 이름 입력받는 부분
		System.out.print("> 이름 입력: ");
		name = br.readLine();
		// 국어
		System.out.print("> 국어 입력: ");
		// Type mismatch: cannot convert from String to int
		kor = Integer.parseInt(br.readLine()); // "90" String -> 90 int 형변환
		// 영어
		System.out.print("> 영어 입력: ");
		eng = Integer.parseInt(br.readLine());
		//수학
		System.out.print("> 수학 입력: ");
		mat = Integer.parseInt(br.readLine());

		//총점
		tot = kor + eng + mat;

		//평균
		avg = tot/ 3.0;

		System.out.printf("이름: %s\n국어:%d\n영어:%d\n수학:%d\n총점:%d\n평균:%.2f\n"
				, name, kor, eng, mat, tot, avg);
	} // main

} // class
