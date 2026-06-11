package days18;

import java.io.FileReader;
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
public class Ex10_02 {

	public static void main(String[] args) {
	      // database.properties 파일을 읽어와서 Properties 객체  p로 만들고
	      // p 로 부터 DB 연결 문자열 정보를 얻어와서 출력.
	      
	      String fileName = ".\\src\\days18\\database.properties";
	      
	      
	      // DB 연결 문자열( ConnectionString )
	      String className = null;  // JDBC드라이버            
	      String url = null;                  
	      String user = null;                                                                   
	      String password = null;
	      
	      Properties p = new Properties();
	      
	      try ( 
	             FileReader reader = new FileReader(fileName);
	            ){
	         // p 객체      -> 파일로 저장할 때는      :   store()
	         // 파일 읽어와서 -> p 객체 생성할 때는      :    load()
	         p.load(reader);
	         
	         className = p.getProperty("className");
	         url = p.getProperty("url");
	         user = p.getProperty("user");
	         password = p.getProperty("password");
	         System.out.println( className );
	         System.out.println( url );
	         System.out.println( user );
	         System.out.println( password );
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      System.out.println( " END " );
	      

	   } // main

} // class


// p 객체	setProperties()  -> p.store() -> FileWriter -> ???.properties 파일로 저장
// ???.properties 파일로 읽어와서 FileReader -> p.load() 생성 -> p.getProperties("user") 와서 사용~





