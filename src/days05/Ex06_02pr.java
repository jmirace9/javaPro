package days05;

import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 15. 오후 12:41:41
 * @subject 작업 순서 정하고 코딩
 * @content name이라는 변수설정 -> Scanner sc로 입력값 -> name변수에 sc입력설정 -> 계속할건지에 대한 여부-> 계속할거면 루프생성
 * 
 */
public class Ex06_02pr {

	public static void main(String[] args) {

		int no = 1, maxCount = 3;
		char con = 'y';
		String name;
		Scanner sc = new Scanner(System.in);



		do {
			System.out.printf("[%d]이름을 입력하시오.", no);
			name = sc.next();
			System.out.printf("> 이름: %s \n", name);

			if (no==maxCount) {

				System.out.printf(" 최대 %d번까지만 가능합니다.", maxCount);
				break; 
			} // if
			
			System.out.printf("이름을 추가하시겠습니까?\n");
			con = sc.next().charAt(0);

			
			no++;

		} while (con == 'y' || con == 'Y');



		System.out.println(" END ");
	} // main

} // class
