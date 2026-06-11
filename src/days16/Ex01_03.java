package days16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오전 10:19:28
 * @subject 
 * @content 
 * 
 */
public class Ex01_03 {

	public static void main(String[] args) {
		
		// 학생명단.txt 읽어서 학생이름만 출력하는 작업
		// . 현재 디렉토리		javaPro 폴더까지 (상대경로 = 기준값을 주고 찾게함)
		// .. 상위 디렉토리
		
		String fileName = ".\\src\\days16\\학생명단.txt"; // 자바에선 \가 경로표시 
		String saveFileName = ".\\src\\days16\\학생명단.html"; 
		
		
		try (
			FileReader in = new FileReader(fileName);
			BufferedReader br = new BufferedReader(in);
				FileWriter out = new FileWriter(saveFileName);
				){
			String name = null;
			System.out.println("<ol>");
			out.write("<ol>");
			while ( (name = br.readLine()) != null ) {
				System.out.printf("<li>%s</li>\n", name);
				out.write("<li>"+name+ "</li>\n");
			} // while
			System.out.println("</ol>");
			out.write("</ol>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(" END ");

	} // main

} // class
