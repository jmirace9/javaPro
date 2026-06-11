package days09;

import java.util.Scanner;
import java.util.stream.IntStream;

import days08.Ex05_02;

/**
 * @author 조지훈
 * @date 2026. 5. 21. 오후 4:11:33
 * @subject 
 * @content 
 * 
 */
public class Ex08 {

	public static void main(String[] args) {

		String [][] names = new String [3][30]; 

		// 1차원 배열
		// int [] kors = new int[3*10*30];
		// int [][][] kors = new int[3][10][30];      
		// kors[1][0][0] ~kors[1][0][29]  

		// 행:반 , 열: 번호
		// 열 : 0국, 1영, 2수, 3총, 4등, 5전등
		// 행 : 학생번호
		// 면 : 반 번호

		int [][][] infos = new int [3][30][6];

		//                           행: 반, 열: 번호
		double [][] avgs = new double[3][30];

		// indexes[0] : 1반학생 입력받은 학생수 == 입력할 위치
		// indexes[1] : 2반학생 입력받은 학생수 == 입력할 위치
		// indexes[2] : 3반학생 입력받은 학생수 == 입력할 위치
		int [] indexes = new int[3];
		char con = 'y';

		//1. 입력
		
		Scanner scanner = new Scanner(System.in);

		String name; //
		int kor,eng,mat,tot;		//
		double  avg;  //
		int rank, wrank;
		int classNo; // 1,2,3 반 저장할 변수.
		
		do {
			// 1) 반 입력 - 1 or 2 or 3
			System.out.print("> 1. 반 입력: ");
			classNo = scanner.nextInt();
			// 2) 반 번 이름 국어 영어 수학 입력
			System.out.printf("> 2. %d반 [%d번] 학생 이름, 국어, 영어, 수학 입력: "
					, classNo, indexes[classNo-1]+1); //?
			
			name =Ex05_02.generateRandomName();
			kor = Ex05_02.generateRandomScore();
			eng = Ex05_02.generateRandomScore();
			mat = Ex05_02.generateRandomScore();
			tot = kor + eng + mat;
			avg = (double)tot/3;
			
			names[classNo-1][indexes[classNo-1]]= name; // [반] [번호]
			infos[classNo-1][indexes[classNo-1]][0] = kor;
			infos[classNo-1][indexes[classNo-1]][1] = eng;
			infos[classNo-1][indexes[classNo-1]][2] = mat;
			infos[classNo-1][indexes[classNo-1]][3] = tot;
			avgs[classNo-1][indexes[classNo-1]]= avg;
			
			indexes[classNo-1]++; //?
			scanner.nextLine(); // 입력값이후 남아있는것 전부제거
			System.out.println("\t 입력 계속?"); // 입력 계속 여부 체크할 곳
			con = scanner.next().charAt(0); 
			} while ( Character.toUpperCase(con)=='Y');

		//2. 등수, 전교등수 처리

		//3. 출력

		int totalCount = IntStream.of(indexes).sum(); //==int totalCount = indexes[0] + indexes[1] + indexes[2];
		System.out.printf("[전체 학생 수 : %d명]\n", totalCount);
		for (int i = 0; i < indexes.length; i++) {
			System.out.printf("[%d]반 학생수: %d명\n", i+1, indexes[i]);
			// indexes[i] 학생수만큼 정보 출력...
			for (int j = 0; j < indexes[i]; j++) {
				System.out.printf(
			               "> %d번 이름: %s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f, 등수:%d\n"
			               , j+1, names[i][j], infos[i][j][0], infos[i][j][1], infos[i][j][2], infos[i][j][3], avgs[i][j], infos[i][j][4]);
			} // for j
			
		} // for i
		
		
	} // main

} // class
