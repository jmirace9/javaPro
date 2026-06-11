package days03;

/**
 * @author 조지훈
 * @date 2026. 5. 13. 오후 2:32:13
 * @subject 
 * @content 
 * 
 */
public class Ex06 {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		System.out.printf("> 전: x=%d, y=%d\n", x, y);

		{
			int temp = x;
			x = y;
			y = temp;
		}

		// 

		System.out.printf("> 후: x=%d, y=%d\n", x, y);   

	} // main

} // class
