package days16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오후 2:34:06
 * @subject source 문자열 속에서 집번호|폰번호 전화번호 추출..
 * @content 
 * 
 */
public class Ex09_02 {

	public static void main(String[] args) {
		
		String source = "안녕하세요. 홍길동입니다."
	            + "폰번호:010-1234-5678, 집번호: 02-436-4948입니다.";
		
		String regex = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})"; // () == 그룹화 !!!
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(source);
		
		while (matcher.find()) {
			System.out.printf("%s: 1. %s 2. %s 3. %s \n", matcher.group() 
														,matcher.group(1)
														,matcher.group(2)
														,matcher.group(3));
		}
		
	} // main

} // class
