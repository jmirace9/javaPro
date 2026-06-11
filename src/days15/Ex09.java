package days15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 6. 1. 오후 3:12:33
 * @subject
 * @content
 * 
 */
public class Ex09 {

	public static void main(String[] args) {

		/*
		 * The value of the local variable scanner is not used 
		 * Resource leak: 'scanner' is never closed
		 * 
		 * Scanner scanner = new Scanner(System.in); 
		 * String message = scanner.next();
		 * scanner.close();
		 */

		/*
		 * [ try~with~resources ] 문 자동으로 사용하던 자원 닫기.
		 * 
		 * try (Scanner scanner = new Scanner(System.in);) { // try 이후 자동적으로 close 됨.
		 * 
		 * String message = scanner.next();
		 * 
		 * } catch (Exception e) {
		 * 
		 * }
		 */

		// 어떤 파일을 읽어와서 출력.
		// [ try~with~resources ] 문 자동으로 사용하던 자원 닫기.
		//		FileReader : 파일 읽기
		//	    FileWriter : 파일 쓰기

		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days15\\Car.java";
//1.		FileReader reader = null; // main {} 블럭안에서 사용할 지역변수

		try (FileReader reader = new FileReader(fileName);) {
//	2.		reader = new FileReader(fileName);
			int one = -1;
			while ((one = reader.read()) != -1) { // 파일끝만나면 -1
				System.out.printf("%c", (char)one);
			} // while
		

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // int one
			e.printStackTrace();
		} finally {
//	3.		if (reader != null) {
//				try {
//					reader.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
		}

	} // main

} // class
