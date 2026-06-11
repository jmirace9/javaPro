package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		/*
		 * 1. 입력형식
		   이름을 입력하세요: 홍길동
		   나이를 입력하세요: 25
		   이메일을 입력하세요: test@example.com
		   휴대폰 번호를 입력하세요: 010-1234-5678
		   주소를 입력하세요: 서울특별시 강남구
		   성별을 입력하세요 (true=남성, false=여성): true

//출력형식 콘솔창에 복붙 후 변경
		 * 2. 출력형식
		   ===== 입력한 개인정보 =====
		   이름: "홍길동"
		   나이: 25
		   이메일: test@example.com
		   휴대폰 번호: 010-1234-5678
		   주소: 서울특별시 강남구
		   성별: true
		 */
		/*
		등급을 입력하세요 (A, B, C, D, F): A 
		등급: 'A'
		 */   

		// br 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 변수 선언
		String name, email, pn, ad;
		int age;
		//boolean M;
		boolean gender;
		char grade;

		System.out.print("이름을 입력하세요: ");
		name = br.readLine();
		System.out.print("나이를 입력하세요: ");
		age = Integer.parseInt(br.readLine());
		System.out.print("이메일을 입력하세요: ");
		email = br.readLine();
		System.out.print("휴대폰번호를 입력하세요: ");
		pn = br.readLine();
		System.out.print("주소를 입력하세요: ");
		ad = br.readLine();
		System.out.print("성별을 입력하세요: ");
		//		String input = br.readLine();
		//		boolean gender = input.equalsIgnoreCase("M");
		gender = Boolean.parseBoolean(br.readLine());

		System.out.print("등급을 입력하세요 (A, B, C, D, F): ");
		grade = br.readLine().charAt(0);
		//
		//System.out.print("등급을 입력하세요 (A, B, C, D, F): ");
		// grade = br.readLine(); 내가했던것. String -> char 형변환 필요. 그러나 형변환x 문자열에서 원하는위치에 한 문자 꺼내오는작업.
		//  A   변수 인식
	    // 'A'  한 문자
	    // "A"  문자열   =  'A' + 'null'
		
		/*  System.out.printf("===== 입력한 개인정보 =====\r\n"
        + "   이름: \"%s\"\r\n"
        + "   나이: %d\r\n"
        + "   이메일: %s\r\n"
        + "   휴대폰 번호: %s\r\n"
        + "   주소: %s\r\n"
        + "   성별: %b"
        , name, age, email, phone, address, gender);
		 */

		System.out.printf("===== 입력한 개인정보 =====\n \"%s\n\" %d\n %s\n %s\n %s\n %b\n ", name, age, email, pn, ad, gender );
System.out.printf("===== 입력한 개인정보 =====\r\n"
		+ "		   이름: \"%s\"\r\n"
		+ "		   나이: %d\r\n"
		+ "		   이메일: %s\r\n"
		+ "		   휴대폰 번호: %s\r\n"
		+ "		   주소: %s\r\n"
		+ "		   성별: %b\r\n"
		+ "		   등급: '%c'",name, age, email, pn, ad, gender, grade);
	}

}
