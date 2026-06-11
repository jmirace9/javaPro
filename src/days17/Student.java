package days17;

/**
 * @author 조지훈
 * @date 2026. 5. 27. 오전 9:08:57
 * @subject 
 * @content 
 * 
 */
public class Student {

	// 필드
	public int no; // 학번
	public String name;
	public int kor,eng,mat,tot,rank,wrank;
	public double avg;

	// 메소드
	public String getInfo() {
		return String.format("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d"
				, no
				, name 
				, kor , eng , mat, tot 
				, avg , rank, wrank);
	}
	/*
	+----------------+
	|   Student      |
	+----------------+
	| name           |
	| kor            |
	| eng            |
	| math           |
	| total          |
	| avg            |
	| rank           |
	+----------------+
	| calcTotal()    |
	| calcAvg()      |
	+----------------+
	        ▲
        	|
        	|

	+--------------------+
	|  StudentManager    |
	+--------------------+
	| List<Student>      | Student [] students; 배열
	+--------------------+
	| addStudent()       | 학생 정보 입력 ()
	| printStudents()    | 학생 정보 출력 ()
	| processRank()      | 등수 처리 ()
	+--------------------+
	 */

} // class
