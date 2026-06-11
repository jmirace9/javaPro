package days09;

import java.util.Date;

/**
 * @author 조지훈
 * @date 2026. 5. 21. 오전 11:34:32
 * @subject 주민등록번호로 부터 나이를 계산 -> 출력
 * @content  한국나이(세는나이)
 * 				ㄴ올해년도 - 생일년도 +1 	
 * 			 만나이
 * 				ㄴ올해년도 - 생일년도 -> 생일 지나지않은경우에만 1살을 더 뺀다.
 * 			나이계산!!
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		String rrn ="830412-2700001";
		int age = getCountingAge(rrn); // 세는나이 == 한국나이
		System.out.println( age );
		age = getAmericanAge(rrn); // 만 나이
		System.out.println( age );

	} // main

	private static int getAmericanAge(String rrn) {
		// 올해년도 - 생일년도 == 한국나이(올해년도 - 생일년도 +1) -1  -> 생일 지나지않은경우에만 1살을 더 뺀다.
		int americanAge = getCountingAge(rrn)-1;
				
		Date d = new Date();
		int cMonth = d.getMonth()+1;
		int cDay = d.getDate();
		int bMonth = Integer.parseInt(rrn.substring(2, 4)); // 04 스트링에서 charAT 역할!! end index앞까지 == <end index
		int bDay = Integer.parseInt(rrn.substring(4, 6));; // 12 스트링에서 charAT 역할!! end index앞까지 == <end index
		
		if (cMonth < bMonth || (cMonth == bMonth && cDay < bDay) ) americanAge--; // 생일이 지나지않은경우 
		return americanAge;
	}

	private static int getCountingAge(String rrn) {
		Date d = new Date();
		int currentYear = d.getYear()+1900;
		System.out.println(currentYear);
		
		String birthday = Ex03.getBirthday(rrn);
		int birthYear = Integer.parseInt(birthday.substring(0, 4) ); 
		return currentYear - birthYear +1;
	}

} // class
