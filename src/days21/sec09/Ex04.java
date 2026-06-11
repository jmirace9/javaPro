package days21.sec09;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author 조지훈
 * @date 2026. 6. 10. 오후 12:30:40
 * @subject Text 파일 -> Files.lines( Path, Charset ) -> Stream 변환
 * @content 
 * 
 */
public class Ex04 {

	public static void main(String[] args) throws IOException, URISyntaxException {
		// data.txt -> Path 객체로 만드는 작업해야함
		
		Path path = Paths.get(Ex04.class.getResource("data.txt").toURI());
		//			Paths.get(URI); URI -> Path 객체 반환 // 메서드로 얻어옴
		//						    data.txt -> URI // Ex04.class.getResource("data.txt").toURI()
		//					Ex04 클래스와 같은 패키지 안에 있는 data.txt 파일을 찾아서 
		//					toURI() 메서드로 URI를 만들겠다.
		
		Stream<String> stream = Files.lines(path, Charset.defaultCharset()); // Charset.defaultCharset() UTF-8 인코딩 준것과 같음
		
		stream.forEach( line -> System.out.println(line) );
		
		
	} // main

} // class






