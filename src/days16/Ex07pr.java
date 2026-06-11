package days16;

import java.io.FileReader;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오후 1:28:16
 * @subject 2차원가변배열
 * @content 
 * 
 */
public class Ex07pr {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days16\\Ex01.java";

		// [0] == 'A'
		// [1] == 'B'
		//  :
		// [25] == 'Z' 개수 저장

		int [][] counts = { 
				new int [26],new int [26],new int [10]
		};
		
		try (
				FileReader reader = new FileReader(fileName);
				){
			int code = -1;
			while ( (code = reader.read()) != -1) {
				char ch = (char) code;

				if ( Character.isUpperCase(ch) ) { 
					counts[0][ch-'A']++;
				} else if (Character.isLowerCase(ch)) {
					counts[1][ch-'a']++;
				} else if (Character.isDigit(ch)) {
					counts[2][ch-'0']++;
				}

			} // while

			// 막대그래프로 출력
			System.out.println("[대문자]");
			for (int i = 0, count = 0; i < counts[0].length; i++) {
				count = counts[0][i];
				System.out.printf("%c(%d): %s\n", i+'A', count, "#".repeat(counts[0][i]));
			} // for 대문자
			System.out.println("[소문자]");
			for (int i = 0, count = 0; i < counts[1].length; i++) {
				count = counts[1][i];
				System.out.printf("%c(%d): %s\n", i+'a', count, "#".repeat(counts[1][i]));
			} // for 소문자
			System.out.println("[숫자]");
			for (int i = 0, count = 0; i < counts[2].length; i++) {
				count = counts[2][i];
				System.out.printf("%c(%d): %s\n", i+'0', count, "#".repeat(counts[2][i]));
			} // for 소문자

		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

} // class
