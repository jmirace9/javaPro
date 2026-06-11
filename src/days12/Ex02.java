package days12;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 27. 오전 10:14:00
 * @subject Student 클래스 : 한 학생 정보 (데이터)
 * @subject StudentManager 클래스 : 학생들의 리스트 관리 클래스
 * 			: 필요하다면 다른 클래스도 만들고
 * 			: Ex02.main()
 * @content 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		  StudentManager manager = new StudentManager();
	      
		  manager.inputStudents();
	      
		  manager.processRank();
	      
		  manager.printStudents();
		  
	   } // main

	} // class