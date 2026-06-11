package days17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 27. 오전 10:15:56
 * @subject 
 * @content 
 * 
 */
public class StudentManager {

	final int STUDENT_COUNT = 30;

	public ArrayList studentList = null;

	//	   결합력이 높은 코딩은 좋은 코딩이 아니다.
	//	   public Student [] students = new Student[STUDENT_COUNT];

	char con = 'y';
	int index = 0; // 입력 받은 학생 수



	public StudentManager() {
		this.studentList = new ArrayList(STUDENT_COUNT);
	}

	public StudentManager(int length) {
		this.studentList = new ArrayList(length);
	}

	// 1. 클래스 배열에 학생 입력 후 저장..
	private void addStudent(Student student) {
		this.studentList.add(student);
	}

	// 2. 입력받은 모든 학생들 등수 처리..
	public void processRank() {
		this.index = this.studentList.size();

		for (int i = 0; i < index; i++) {
			//students[i].rank = 1;
			int rank = 1;
			Student 성적처리학생 = (Student) studentList.get(i);
			for (int j = 0; j < index; j++) {
				Student 성적비교할학생 = (Student) studentList.get(j);
				if ( 성적처리학생.tot < 성적비교할학생.tot  ) {
					//students[i].rank++;
					rank++;
				} // if
			}

			성적처리학생.rank = rank;
		} // for i 

	}

	// 3. 모든 학생들 정보 출력..
	public void printStudents() {
		this.index = this.studentList.size();

		System.out.printf("> 입력받은 학생수 : %d명\n", index);
		for (int i = 0; i < index; i++) {
			Student s = (Student) studentList.get(i);
			System.out.println( s.getInfo() );
		} // for i
	}

	public void inputStudents() {
		// 한 명 씩 학생 정보입력받아서 Student student 객체를 생성하고
		// manager.addStudent(  student 객체 )  메서드 호출해서
		// students 클래스 배열에 추가...시키겠습니다.   

		String name;
		int kor, eng, mat, tot;
		double avg;
		int no;

		Scanner scanner = new Scanner(System.in);

		do {
			no = index + 1;

			System.out.printf("%d번 이름 국어 영어 수학 입력: ", no );
			name = scanner.next();   
			kor = scanner.nextInt();
			eng = scanner.nextInt();
			mat = scanner.nextInt();

			tot = kor + eng + mat;
			avg = (double)tot/3;

			Student student = new Student();

			student.no = no;
			student.name = name; 
			student.kor = kor;
			student.eng = eng;
			student.mat = mat;
			student.tot = tot;
			student.avg = avg;

			addStudent(student);      

			System.out.print("\t 입력 계속? ");
			con = scanner.next().charAt(0);
		} while ( Character.toUpperCase(con) == 'Y' ); 

	}

} // class

