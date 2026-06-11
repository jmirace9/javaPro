package days18;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author 조지훈
 * @date 2026. 6. 5. 오후 2:07:57
 * @subject C -> List  : ArrayList, Vector, Stack, LinkedList
 * 			C -> Set   : HashSet , LinkedHashSet, TreeSet
 * @content 	 Map   : HashMap(신) == HashTable (구)
 *							동기화 x         동기화 o
 *
 *						 Properties 컬렉션 클래스 (암기!!!)
 *							ㄴ Key = String, Value = String
 *							ㄴ 주로 설정 파일을 읽기/쓰기
 *							ㄴ ???.properties 확장자명
 *							ㄴ HashTable의 자식 클래스
 *
 * 
 */
public class Ex10 {

	public static void main(String[] args) {

		String fileName =".\\src\\days18\\database.properties";
		String fileName2 =".\\src\\days18\\database.xml";

		// DB 연결 문자열 ( ConnectionString )
		String className = "oracle.jdbc.driver.OracleDriver";  // JDBC드라이버            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";

		Properties p = new Properties();
		//		p.put(className, p); map 용 쓰지말고
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
		p.setProperty("className", className);

		try (
				FileWriter writer = new FileWriter(fileName);
				FileOutputStream os = new FileOutputStream(fileName2);
				){
			p.store(writer, "comment");
			p.storeToXML(os, "comment");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(" END ");



	} // main

} // class









