package days16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오후 2:08:06
 * @subject [ 정규표현식 ([Reg]ular [Ex]pression) ] regex , regexp 
 * 				ㄴ 문자열 속에 원하는 패턴(pattern)과 일치하는 문자열을 찾기위해서 사용하는 식 
 * @content 	ㄴ 미리 정의된 기호와 식. \\s 	[A-Z]	 * 	+ 	? 등등
 * 				ㄴ 자바 java.util.regex 패키지 (단 2개의 클래스)
 * 						ㄴ pattern 클래스 - 정규식을 정의하는 클래스
 * 						ㄴ Matcher 클래스 - 데이터와 정규식(pattern 객체)을 비교하는 클래스
 * 
 */
public class Ex09 {

	public static void main(String[] args) {

		String[] data = { "bat", "baby", "bonus", "cA", "ca"
				, "co", "c.", "c0", "car", "combat", "count", "date",
				"disc", "fx" , "c"};

		// String regex = "c[a-z]*"; // c 로 시작하고 어떤 소문자든 0개이상 따라오는것
		// String regex = "c[a-z]"; // c로 시작하고 뒤에 소문자 1개가 반드시 와야함. 문자열길이가 2인 단어.
		// String regex = "c[a-zA-Z0-9]"; // c로 시작하고 대문자든 소문자든 숫자든 들어간 것 cA ca co c0
		// String regex = "c\\w"; // 		\w == [a-zA-Z0-9] 		\W == [^a-zA-Z0-9] 대괄호안의 꺽새는 부정 !
		// String regex = ".*";		// . == 뭐든 1문자 , .* == 모든 문자
		// String regex = "c.";		// c로 시작하고 아무문자 1개 인것 = 2글자
		// String regex = "c\\.";	// c로 시작하고 . 인것
		// String regex = "c[0-9]";
//		 String regex = "c.*t";	// c로 시작하고 가운데는 몇글자든 t로 끝나는것
		// String regex = "[b|c]";
		// String regex = "[bc]";
		// String regex = "[b-c].*";
		// String regex = "[^bc].*";
		// String regex = ".*a.*";
		// String regex = "[^bcd].*";

		// String regex = "[a-zA-Z].*";
		// String regex = "[ae-zA-Z].*";
//		 String regex = "[a-zA-Z&&[^b-d]].*"; // 알파벳 중에 b-d사이(b,c,d)를 제외한것으로 1문자가 시작하고 뒤에는 아무문자 0개이상
		
      String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*_])[A-Za-z\\d!@#$%^&*_]{8,15}";
		// 설명 내일아침에 카톡으로 보내기
		// Pattern에 손올려서 안에내용 파악하기


		Pattern pattern = Pattern.compile(regex);

		for (int i = 0; i < data.length; i++) {
			Matcher matcher = pattern.matcher( data[i] );
			if (matcher.matches()) {
				System.out.println(data[i]);
			}

		}

		/* [ String.matches(String regex) ] String 클래스의 메서드
		for (int i = 0; i < data.length; i++) {
			if(data[i].matches(regex)) {		
				System.out.println(data[i]);
			}
		}
		 */



	} // main

} // class
