package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_02 {

	public static void main(String[] args) throws IOException {
		
		
		
		 /* [복습문제]
				 * 1. 입력형식
				   이름을 입력하세요: 홍길동
				   나이를 입력하세요: 25
				   이메일을 입력하세요: test@example.com
				   휴대폰 번호를 입력하세요: 010-1234-5678
				   주소를 입력하세요: 서울특별시 강남구
				   성별을 입력하세요 (true=남성, false=여성): true

				 * 2. 출력형식
				   ===== 입력한 개인정보 =====
				   이름: "홍길동"
				   나이: 25
				   이메일: test@example.com
				   휴대폰 번호: 010-1234-5678
				   주소: 서울특별시 강남구
				   성별: true
				 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name, email, pn, ad;
		int age = 0;
		boolean M;
		
		System.out.print("> 이름 입력: ");
		name = br.readLine();
		
		System.out.print("> 나이 입력: ");
		age = Integer.parseInt(br.readLine());

		System.out.print("> 이메일 입력: ");
		email = br.readLine();

		System.out.print("> 휴대폰 번호 입력: ");
		pn = br.readLine();

		System.out.print("> 주소 입력: ");
		ad = br.readLine();
		
		// The left-hand side of an assignment must be a variable
//		System.out.print("> 성별 입력: ");
//		boolean sex = Boolean.parseBoolean(br.readLine());
		System.out.print("> 성별 입력 (M/F): ");
		String input = br.readLine();
		boolean sex = input.equalsIgnoreCase("M");
		
		System.out.printf("이름: %s\n 나이: %d\n 이메일: %s\n 휴대폰 번호: %s\n 주소: %s\n 성별: %b\n ", name, age, email, pn, ad, sex);
		
		

	}

}
