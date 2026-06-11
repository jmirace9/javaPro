package days18;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author 조지훈
 * @date 2026. 6. 5. 오후 2:24:02
 * @subject 
 * @content 
 * 
 */
public class Ex11 {

	public static void main(String[] args) {
		String group = "1조:양인석/안정빈/신창만/이지훈/장미성";
		// 1ì¡°=ìì¸ì/ìì ë¹/ì ì°½ë§/ì´ì§í/ì¥ë¯¸ì±
		String [] groupArr = group.split(":");
		

		// 1. Properties 컬렉션
		// 팀명 key 팀원 value 값으로
		
		// 2. group1.properties 파일에 1조원들 저장하는 코딩을 하자. store 메서드로

	
		String fileName = ".\\src\\days18\\group1.properties";

		Properties p = new Properties();
		//		p.put(className, p); map 용 쓰지말고
		p.setProperty(groupArr[0], groupArr[1]);


		try (
				FileWriter writer = new FileWriter(fileName);
				
				){
			p.store(writer, "comment");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(" END ");

		
	}

}
