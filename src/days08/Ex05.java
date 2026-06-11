package days08;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 20. 오전 11:48:40
 * @subject 배열 + 제어문
 * 			ㄴ 한 학생의 [이름, 국, 영, 수] 총, 평 출력.
 * 			ㄴ 한  반에 30명의 학생들의 + 등수 입력, 출력.
 * 
 * 국영수 30명배열필요 , 출력도 이름옆에 국영수 필요 -> 총점 int배열, 평균 double배열
 * 
 * 안보고 하도록 이해하고 암기!!
 * @content 
 * 
 */
public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //2
		
		final int STUDENT_COUNT = 30;
		
		char con = 'y'; //5
		int index = 0; //3 (첫번째 방)names[0]부터 입력
		
		String [] names = new String[STUDENT_COUNT]; //1
		String name; // 4-1
		
		int [] kors = new int[STUDENT_COUNT];
		int [] engs = new int[STUDENT_COUNT];
		int [] mats = new int[STUDENT_COUNT];
		int kor, eng, mat, tot;
		int [] tots = new int[STUDENT_COUNT];
		
		double [] avgs = new double[STUDENT_COUNT];
		double avg;
		
		
		do { System.out.printf(">%d번 이름 국어 영어 수학 입력: ", index + 1 ); //6-2 index (출력되는 번호에 1더해서 0번으로 출력되는값수정)
		name = scanner.next(); //4
		names[index] = name; // 4-2
		
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		mat = scanner.nextInt();
		kors[index] = kor;
		engs[index] = eng;
		mats[index] = mat;
		
		tot = kor + eng + mat;
		tots[index] = tot;
		avg = (double)tot / 3; // 실수 표기를 위해 double값으로 변환
		avgs[index] = avg;
		
		
		index++; // 4-3 // 5 (do while 안에집어넣기)
		
		System.out.println("\t 입력 계속? "); //5-1
		con = scanner.next().charAt(0); // 5-2
			
		} while ( Character.toUpperCase(con)=='Y'); //5-3 조건식완성 con == 'y' || con == 'Y'
		
		// index : 입력받은 학생수
		System.out.printf("\n 입력받은 학생수: %d명", index);
		for (int i = 0; i < index; i++) { // 6 for문 
			System.out.printf(">%d번 이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %.2f\n"
					, i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i]); // 6-3
		}
		
		
		


		 

	} // main

} // class




