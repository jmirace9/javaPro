package days20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author 조지훈
 * @date 2026. 6. 9. 오후 4:16:33
 * @subject UserInfo u1, u2	         -> 직렬화 	userinfo.ser
 * 			ArrayList<UserInfo> list -> 직렬화
 * 
 * 			userinfo.ser 읽어드려서 -> 역직렬화해서 사용(출력)
 * @content 
 * 
 */
public class Ex10_02 {

	public static void main(String[] args) {
		String name = ".\\src\\days20\\Child.ser";
		
		try (
				FileInputStream in = new FileInputStream(name);
				ObjectInputStream ois = new ObjectInputStream(in);	
					){
			
				// 파일 → 스트림 → 객체 (역직렬화) 읽기
				Child c1 = (Child) ois.readObject();
				System.out.println( c1.name );
				System.out.println( c1.age );
				System.out.println( c1.eamil );
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(" END ");
		

	} // main

} // class
