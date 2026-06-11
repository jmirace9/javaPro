package days16;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오전 10:14:55
 * @subject 
 * @content 
 * 
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
//		String url = "https://www.naver.com";
//		String url = "http://www.naver.com";
		String url = "www.naver.com";
		
		String prefix = "https://";
//				ㄴ접두어
		System.out.println(  url.startsWith(prefix)  ); 
		
		String suffix = ".com";
//				ㄴ 접미어
		System.out.println( url.endsWith(suffix)  );
		
		
		
	} // main

} // class
