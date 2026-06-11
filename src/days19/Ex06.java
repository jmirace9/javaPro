package days19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author 조지훈
 * @date 2026. 6. 8. 오후 5:14:13
 * @subject 
 * @content 
 * 
 */
public class Ex06 {

	public static void main(String[] args) throws IOException {
		
//		System.in.read();
		
		// 바이트 단위로 읽기용 스트림
//		InputStream is = System.in;
//		System.out.println("> 한 문자 입력 : ");
//		int b = is.read(); // 바이트 값을 돌린다.
//		System.out.println(b);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 키보드로부터 입력 + 엔터 -> System.in (읽어드리는 객체)		-> InputStreamReader	->	BufferedReader[Reader]
		//							ㄴ 바이트 단위로 읽는 스트림		문자 다루는 보조스트림			버퍼기능이 있는 보조스트림(여러 글자)
		// 						InputStream						바이트 -> 한 문자로 변환		[한 글자][한 글자][한 글자][한 글자]
		// 						'한' 은 못읽음 바이트값이 아니라서
		
//		br.readLine(); 바이트 -> 한 문자로 변환 -> 버퍼기능이 있어서 문자열 담을 수 있고 => 한 라인 문자열 전체를 읽을 수 있는 메서드가 됨.
		
//		System.in 을 사용해서 한글 출력
		
		byte [] b = new byte[3];
		
		InputStream is = System.in;
		int totalBytes = is.read(b); // 키보드로부터 읽어와서 바이트 배열 b한테 저장
		
		char one = new String(b).charAt(0);
		
		System.out.println(one);
		
		System.out.println(" END ");
		
		
	} // main

} // class







