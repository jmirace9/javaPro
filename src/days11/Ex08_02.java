package days11;

import java.util.Random;

/**
 * @author 조지훈
 * @date 2026. 5. 26. 오후 4:18:22
 * @subject 
 * @content 
 * 
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
	      // java.lang.NullPointerException:
	      // [x][y]               스택   p1[null]
	      // 인스턴스X
//	      Point p1 = new Point();
//	      p1.x = 10;
	      
	      // [0x11][null][null][] .. [null]               pArr배열명[0x100번지]
	      // 0x100번지    
	      // pArr[0] 객체
	      
	      
	      // [x][y]
	      // 0x11
	      // 인스턴스 
	      
	      Point [] pArr = new Point[10];
	      
	      for (int i = 0; i < pArr.length; i++) {
	         pArr[i] = new Point(); // 없으면 NullPointerException 에러 발생. 기본값 Null이 아닌 초기화 필요.
	         pArr[i].x = new Random().nextInt(1, 100);
	         pArr[i].y = new Random().nextInt(1, 100);
	      }
	      
	      for (int i = 0; i < pArr.length; i++) {
	         pArr[i].printPoint();
	      }
		
	} // main

} // class







