package days19;

import java.io.File;
import java.io.FileReader;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author 조지훈
 * @date 2026. 6. 8. 오후 4:32:20
 * @subject 
 * @content 
 * 
 */
public class Ex04 {

	public static void main(String[] args) {

		String parent =".\\src\\days19";
		String child = "Ex02.java";
		//		파일, 디렉토리(폴더) 다루는 기능이 구현된 클래스 : File
		File file = new File(parent, child);

		System.out.println(file.isDirectory()); // false
		System.out.println(file.isFile()); // true

		System.out.println(file.length()+"bytes");
		System.out.println(file.lastModified()); 
		// ㄴ 파일 만들어진 날짜(1970.1.1일부터의 값) Long 형 1780899797077

		//		[1]
		//		Date d = new Date(file.lastModified());
		//		System.out.println(d.toLocaleString());

		//		[2]
		long time = file.lastModified();
		LocalDateTime dt = toLocalDateTime(time);
		String pattern = "yyyy-MM-dd HH:mm:ss";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		System.out.println(dt.format(dtf)); 

		//		LocalDateTime d = LocalDateTime.now();
		//		System.out.println(d); 



		try (
				// 문자 스트림(읽기)
				FileReader reader = new	FileReader(file)
				){

			int code;
			while ( ( code = reader.read() ) != -1 ) {
				System.out.println( (char)code );
			} // while


		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main 

	public static LocalDateTime toLocalDateTime(long time) {
		return LocalDateTime.ofInstant(
				Instant.ofEpochMilli(time),
				ZoneId.systemDefault()
				);
	}

} // class
