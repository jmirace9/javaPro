package days20;

import java.io.File;
import java.io.IOException;

/**
 * @author kenik
 * @date 2026. 6. 9. 오전 10:30:16
 * @subject [ File 클래스 ]
 * @content  ㄴ 파일, 디렉토리(폴더)를 관리할 수 있는 기능이 구현된 클래스
 * 
 */
public class Ex04 {

	public static void main(String[] args) throws IOException {
		
//		String pathname = ".\\src\\days25";
//		String pathname = ".\\src\\days20";
		String pathname = ".\\src\\days20\\Ex01.java";
		File f = new File(pathname);
		
		System.out.println( f.exists() ); // true
		System.out.println( f.isFile() ); // true
		System.out.println( f.isDirectory() ); // false
		
		System.out.println( File.pathSeparator ); //  ;
		System.out.println( File.separator );     //  \
		
		// 파일명: Ex01.java
		String fileName = f.getName();
		System.out.println( fileName ); // Ex01.java
		// 순수파일명: Ex01
		int index = fileName.indexOf(".");
		String baseFileName =  fileName.substring(0, index) ;
		System.out.println( baseFileName);
		// 확장자:    java
		String ext =  fileName.substring(index) ;
		System.out.println( ext );
		
		System.out.println("=".repeat(50));
		
		//                 .\src\days20\Ex01.java
		System.out.println( f.getPath() );  // 경로
		// C:\E\Class\SS25Class\JavaClass\javaPro\.\src\days20\Ex01.java
		System.out.println( f.getAbsolutePath() ); // 절대 경로
		// C:\E\Class\SS25Class\JavaClass\javaPro\src\days20\Ex01.java
		System.out.println( f.getCanonicalPath() ); // 정규 경로
		
		System.out.println("=".repeat(50));
		System.out.println( f.getParent() ); // String
		File pf = f.getParentFile();         // File
		System.out.println( pf );
	} // main

} // class





