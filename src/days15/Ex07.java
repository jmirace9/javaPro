package days15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 조지훈
 * @date 2026. 6. 1. 오후 2:15:25
 * @subject 
 * @content 
 * 
 */
public class Ex07 {

	public static void main(String[] args) {

		// [ 체크(checked) 예외 , 언체크(unchecked) 예외 ]
		// 컴파일러가 예외처리 했는지 유무를 체크(확인)
		//	ㄴ RuntimeException 및 그 자식 예외 클래스들은 컴파일러가 예외처리 유무를 확인하지 않는다. : Unchecked 예외
		//	ㄴ 그 외 모든 Exception 클래스들은 컴파일러가 예외 처리를 했는지 유무를 확인한다. : checked 예외
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = null;
		System.out.print("> 이름 입력: ");
		
//		Unhandled exception type IOException
//		IOException 예외처리를 하지 않았다...
		
		try {
			name = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("> 이름=" + name);

	} // main

} // class
