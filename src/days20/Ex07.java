package days20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author 조지훈
 * @date 2026. 6. 9. 오후 2:32:03
 * @subject 
 * @content 
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
		// javaPro 폴더 및 그 모든 하위 폴더의 .java 파일을 찾아서 출력...
		// 모든 하위폴더 찾아서 (재호출) 재귀함수
		String pathname = "."; // javaPro 나타냄 / 현재 디렉토리
		File parent = new File(pathname );
		//		File [] jf = parent.listFiles(f-> f.getName().endsWith("java"));
		String keyword = "parent";

		quickSearch(parent,keyword);

	} // main

	private static void quickSearch(File parent, String keyword) {

		File [] list = parent.listFiles();
		int lineNumber = 0;
		File f = null;
		String line = null;

		for (int i = 0; i < list.length; i++) {
			f = list[i];

			if (f.isDirectory()) { // 하위 디렉토리인지?
				quickSearch(f, keyword);
			}else {
				lineNumber = 1;
				String fileName = f.getName();
				try (
						FileReader in = new FileReader(f);
						BufferedReader br = new BufferedReader(in);
						){

					while ( ( line = br.readLine() ) != null) {
						if ( line.contains(keyword) ) {

							//							line = line.replaceAll( keyword, "["+ keyword+"]");
							line = line.replaceAll( keyword, "<span style='color:red'>"+ keyword+"</span>");

							System.out.printf( "%s: %d: %s\n"
									, fileName, lineNumber, line );
						} // 
						lineNumber++;
					} // while

				} catch (Exception e) {
					e.printStackTrace();
				}

			} // else



		} // for i


	} // quickSearch 닫기





} // class
