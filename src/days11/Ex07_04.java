package days11;

/**
 * @author 조지훈
 * @date 2026. 5. 26. 오후 3:41:24
 * @subject 클래스 복제(clone)
 * @content 
 * 
 */
public class Ex07_04 {

	public static void main(String[] args) {

		 Point p1 = new Point();
	      p1.x = 1;
	      p1.y = 2;
	      
	      // [1][2]                   p1[0x100번지]
	      // 0x100번지
	      
	      Point p2 = new Point();
	      p2.x = p1.x;
	      p2.y = p1.y;
	      
	      // [1][2]                   p2[0x200번지]
	      // 0x200번지
	      // 다른객체에 다른 주소가되고 기존객체의 필드값들은 동일하게 복사

		
		
	} // main

} // class
