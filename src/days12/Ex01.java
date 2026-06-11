package days12;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 27. 오전 9:01:09
 * @content  ㄴ Student 클래스 선언해서 코딩 수정
* 
*   Student 클래스 설계 과정
*   1) 물건==객체==Object : 속성 + 동작 파악 -> 목록 작성
*   2) 객체 구성요소 = 필드 + 메서드 파악 -> 목록 작성
*   4) 클래스 선언 
*   5) 테스트 : 유지 보수 
*   6) 상용화 : 유지 보수
*   7) 버젼 관리
*   
*  클래스 설계
*  1) Student : 한 학생의 정보만을 처리하는 멤버
*             필드+메서드 
*  2) StudentManager: 전체 학생들의 리스틀 관리하는 클래스
*             리스트 관리 필드 + 메서드
*             학생 CRUD   
*  3) 등수처리 클래스                    
*/
public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int STUDENT_COUNT = 30;
		
		// 클래스 배열 선언...
		Student [] students = new Student[STUDENT_COUNT];
		
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		char con = 'y';
		int index = 0;
		int no;
		
		do { System.out.printf(">%d번 이름 국어 영어 수학 입력: ", index + 1 ); //6-2 index (출력되는 번호에 1더해서 0번으로 출력되는값수정)
		students[index] = new Student();
		no = index + 1;
		name = scanner.next(); //4
		students[index].name = name; // 4-2
		students[index].no = no;
		
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		mat = scanner.nextInt();
		students[index].kor = kor;
		students[index].eng = eng;
		students[index].mat = mat;
		
		tot = kor + eng + mat;
		students[index].tot = tot;
		avg = (double)tot / 3;
		students[index].avg = avg;
		
		
		index++; // 4-3 // 5 (do while 안에집어넣기)
		
		System.out.println("\t 입력 계속? ");
		con = scanner.next().charAt(0);
			
		} while ( Character.toUpperCase(con)=='Y');
		
		// index : 입력받은 학생수
		System.out.printf("\n 입력받은 학생수: %d명\n ", index);
		for (int i = 0; i < index; i++) {
			System.out.print( students[i].getInfo() ); 
		}
		
	} // main

} // class
