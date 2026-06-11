package days20;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author 조지훈
 * @date 2026. 6. 9. 오후 3:45:17
 * @subject 직렬화 ( Serialization ) : 객체를 파일 또는 네트워크에 입출력하기 위해서 만든 스트림으로 만드는 것.
 * 			역직렬화 ( Deserialization )
 * 			ObjectInputStream 역직렬화			스트림 -> 객체 복원 
 * 			ObjectOutputStream 질렬화 		객체 -> 스트림
 * 
 * 			UserInfo 클래스 객체를 생성해서 직렬화시켜 파일로 쓰기/읽기 
 * @content 
 * 
 */
public class Ex09 {

	public static void main(String[] args) {
		
		UserInfo u1 = new UserInfo("홍길동", "1234", 25);
		UserInfo u2 = new UserInfo("권태정", "3412", 28);
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		list.add(u1);
		list.add(u2);
		
		String name = ".\\src\\days20\\UserInfo.ser"; // (ser = serialize 줄여서)
		try (
			FileOutputStream out = new FileOutputStream(name);
			ObjectOutputStream oos = new ObjectOutputStream(out);	
				){
			
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			
			oos.flush(); // 저장하는 작업
			System.out.println("u1, u2 객체를 직렬화해서 파일로 저장했다...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(" END ");
		
	} // main

} // class
