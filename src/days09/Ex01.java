package days09;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 21. 오전 8:13:50
 * @subject 
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		// [복습문제] 
		// 1. 30 전체 학생수를 저장할 상수 STUDENT_COUNT 선언
		final int STUDENT_COUNT = 30;
		// 2. 30명 학생들의 이름을 저장할 names 배열 선언
		String [] names  = new String [STUDENT_COUNT];
		// 3. 3명 학생들의 총점,평균,등수를 저장할 tots, avgs, ranks 배열 선언
		int [] tots = new int [STUDENT_COUNT];
		int [] ranks = new int [STUDENT_COUNT];
		double [] avgs = new double [STUDENT_COUNT];
		// 4. 각 배열의 입력값을 채울 용도 + 입력받은 학생 수 : index
		int index = 0;


		// 6. 반복적으로  이름, 총점(0~300) 입력받아서  평균 계산 : inputStudentInfo
		index = inputStudentInfo( names,tots,avgs); // index를 매개변수로 안넣고 앞에 붙여서시작해도됨. 한명만 받는거로시작한다는가정
		// 7. 등수 처리 : processStudentRank
		processStudentRank(tots,ranks,index);
		// 8. 모든 학생들 출력. : printStudentInfo
		printStudentInfo(names, tots, avgs, ranks, index);
		
		
	} // main

	private static void processStudentRank(int[] tots, int[] ranks, int index) {
		for (int i = 0; i < index; i++) {
			ranks[i]= 1;
			for (int j = 0; j < index; j++) {
				if (tots[i] < tots[j]) ranks[i]++; // tots[j]는 다른사람 총점 , 이구문 이해!!
			} // for j
			
		} // for i
		
	}

	private static void printStudentInfo(String[] names, int[] tots, double[] avgs, int[] ranks, int index) {
		System.out.printf("\n총 입력 받은 학생 수: %d명\n", index );
		for (int i = 0; i < index; i++) {
			System.out.printf("[%d]번 이름:%s 총점:%d 평균:%.2f 등수:%d \n",
					i+1, names[i], tots[i], avgs[i], ranks[i]); // i가 0에서 시작!!
			
		}
		
	}

	private static int inputStudentInfo(String[] names, int[] tots, double[] avgs) {
		// 5. 계속 입력 여부를 저장할 con 문자 변수 선언 // 메인이 아니라 지역변수로, 실제 쓰이는곳에서만
		char con = 'y';
		int index = 0; //
		Scanner scanner = new Scanner(System.in);

		String name; //
		int tot;		//
		double  avg;  //
		
		do {
			System.out.printf("> [%d]번 학생 이름, 총점 입력: ", index + 1); // 반복인곳 시작
			name = scanner.next();
			tot = getRandomTot();
			avg = (double)tot/3;
			
			names[index] = name;
			tots[index] = tot;
			avgs[index] = avg;
			
			index++; // 반복인곳 끝
			
			scanner.nextLine(); // 입력값이후 남아있는것 전부제거
			
			// 입력 계속 여부 체크할 곳
			System.out.println("\t 입력 계속?"); //5-1
			con = scanner.next().charAt(0); 
			} while ( Character.toUpperCase(con)=='Y'); //5-3 조건식완성 con == 'y' || con == 'Y'

		return index;
	}

	private static int getRandomTot() {
		Random rnd = new Random();
		int tot = rnd.nextInt(0,301);
		return tot;
	}

} // class
