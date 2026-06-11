package days07;

/**
 * @author kenik
 * @date 2026. 5. 19. 오전 10:09:40
 * @subject 
 * @content 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// 홍길동 98 78 77     엔터
		// String name = scanner.next();
		// int kor = scanner.nextInt();
		// int eng = scanner.nextInt();
		// int mat = scanner.nextInt();
		
		String inputValue = "홍길동      ,   98 ,  78,77";
		
		// inputValue.trim()
		// inputValue = inputValue.replace(" ", "");
		// String 불변하다.
		System.out.println( inputValue );
		
		String name;
		int kor, eng, mat; 
		
		// 1. inputValue 문자열을 구분자( 콤마 )로 잘라내기 -> 문자열 4개
		//  메서드의 매개변수로	String regex 선언
		//  regex == Regual Expression == 정규 표현식   \s 공백   * 0 이상
		String [] dataArr = inputValue.split("\\s*,\\s*");
		System.out.println( dataArr.length);
		// 2. 국,영,수 -> int 변환시켜서 각 변수에 대입.
		name = dataArr[0];
//		kor = Integer.parseInt(dataArr[1].trim());  // "98"
//		eng = Integer.parseInt(dataArr[2].trim());  // "98"
//		mat = Integer.parseInt(dataArr[3].trim());  // "98"
		
		kor = Integer.parseInt(dataArr[1]);  // "98"
		eng = Integer.parseInt(dataArr[2]);  // "98"
		mat = Integer.parseInt(dataArr[3]);  // "98"
		
		int tot = kor + eng + mat;
		System.out.println( tot );
		
//		System.out
//		   .printf("홍길동")
//		   .printf("서영학")
//		   .printf("이창익");
		

	} // main

} // class

















