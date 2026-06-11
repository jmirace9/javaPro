package days19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.Writer;

/**
 * @author 조지훈
 * @date 2026. 6. 8. 오후 4:50:42
 * @subject .exe 아무거나 찾아서 실행파일 복사 작업.
 * 			필요 = 문자스트림 X, 바이트스트림 (이진스트림) O
 * @content 
 * 
 */
public class Ex05 {

	public static void main(String[] args) {

		String source = "C:\\Program Files\\Windows Photo Viewer\\ImagingDevices.exe";
		String target = ".\\ImagingDevices.exe";

		fileCopy(source, target);

		System.out.println("  END  ");

	} // main

	private static void fileCopy(String source, String target) {
		long start = System.nanoTime();
		long end = System.nanoTime();

		try (
				// 바이트 스트림(읽기)
				FileInputStream reader = new FileInputStream(source);
				// 바이트 스트림(쓰기)
				FileOutputStream writer = new FileOutputStream(target);
				
				){

			int code;
			while ( ( code = reader.read() ) != -1 ) {
//				System.out.println( code );
				writer.write(code);
			} // while
			writer.flush();


		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.printf("> 파일 복사 처리 시간: %d ns\n " ,(end-start));

	}

} // class
