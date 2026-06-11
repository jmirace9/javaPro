package days11;

/**
 * @author 조지훈
 * @date 2026. 5. 26. 오전 11:37:51
 * @subject 
 * @content 
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		Car myCar = null;
		
		// 필드 변경
		// The local variable myCar may not have been initialized
		myCar = new Car();
//		myCar.name = "K9";
		
		testInstance(myCar);
		
		
		
	} // main

	private static void testInstance(Car myCar) {
		myCar.name = "K3";
//		 java.lang.NullPointerException
		myCar.dispCarInfo();
	}

} // class
