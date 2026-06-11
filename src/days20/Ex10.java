package days20;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author 조지훈
 * @date 2026. 6. 9. 오후 4:25:58
 * @subject 상속관계가 있을때의 (상속관계 객체) 직렬화와 역직렬화 개념 이해!!!
 * @content 
 * 
 */
public class Ex10 {

	public static void main(String[] args) {
		//[1] 테스트
		// Parent 부모클래스가 직렬화가 가능한 클래스라면
		// Child 자식클래스도 자동으로 직렬화가 가능한 클래스가 된다.

		//[2] 테스트
		// Parent 부모클래스가 직렬화가 구현안된 클래스라면
		// Child 자식클래스는 직렬화 가능한 클래스인 경우
		// 부모의 멤버는 직렬화 대상이 되지 않는다.
		// 그래서 name 은 직렬화되어서 저장되지 않았다. null 출력
		// 	[해결]
		// 직접 Child 자식클래스에서 부모 멤버를 직렬화하는 코딩을 추가해 준다.
		
		Child c1 = new Child();
		c1.name = "홍길동";
		c1.age = 20;
		c1.eamil = "hong@naver.com";
		
		String name = ".\\src\\days20\\Child.ser"; // (ser = serialize 줄여서)
		try (
				FileOutputStream out = new FileOutputStream(name);
				ObjectOutputStream oos = new ObjectOutputStream(out);	
				){

			oos.writeObject(c1);
			// 객체 → 스트림 → 파일 (직렬화 저장)

			oos.flush(); // 저장하는 작업
			System.out.println("c1 객체를 직렬화해서 파일로 저장했다...");

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(" END ");

	} // main

} // class

// [2] 테스트
class Parent {
	String name;
}

class Child extends Parent implements Serializable{
	
	int age;
	// transient 뜻 : 임시의, 단기간의 ;
	transient String eamil; // transient 직렬화 대상에서 제외시키라는 예약어.
	
	// 직접 부모 멤버를 직렬화 대상으로 추가... 코딩.
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.writeUTF(name);
		out.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		name = in.readUTF();
		in.defaultReadObject();
	}
}

/* [1] 테스트
class Parent implements Serializable{

	String name;
}

class Child extends Parent {
	int age;
}
*/






