package days20;

import java.io.File;

/**
 * @author 조지훈
 * @date 2026. 6. 9. 오후 2:15:18
 * @subject 
 * @content 
 * 
 */
public class Ex06 {

	public static void main(String[] args) {
		// [2] temp
//				ㄴ 1조
//				ㄴ 2조
//		[문제] temp 폴더 삭제 // delete() 하위 폴더가 비어있어야함 , 재귀함수로 내부파일 다지워야함 ( 성능떨어져도 )
		
		File f = new File(".\\temp");
//		System.out.println(f.exists());
//		if (f.exists()) {
//			System.out.println(f.delete());
//			
//		}
		
		directoryDelete(f);
				
		System.out.println(" END ");
		
		
		/* [1] 삭제 테스트
		// javaPro 폴더에 sample 폴더 생성
		// sample 폴더 삭제
//		1. 폴더 생성
		File f = new File(".\\sample");
//		f.mkdir();
		
		System.out.println(f.delete()); // f.delete() boolean 형
		
//		2. 폴더 삭제
*/
	} // main

	private static void directoryDelete(File f) { // !f.delete() 하위폴더가 있다는 뜻 
		while ( !f.delete() ) { 
			File [] list = f.listFiles(); // listFiles 확인!!!
			for (int i = 0; i < list.length; i++) {
				if( list[i].delete() ) { // if , else 확인!!!
					System.out.printf("%s 삭제 완료!!\n", list[i]); // 삭제한 파일 이름 출력
				}else {
					directoryDelete(list[i]);
				}
				
			} // for
			
		} // while
		
	}

} // class
