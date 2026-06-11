package days03;

/**
 * @author 조지훈
 * @date 2026. 5. 13. 오후 12:38:44
 * @subject 
 * @content 
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		
		
		
		double money = 1234567.9077;
		// 소수점 2자리까지 출력 원함 , 3자리는 자동반올림
		// > money=1,234,567.91 -> %,
		//	System.out.printf("> money=%,.2f\n", money);
		
		String strMoney = String.format("%,.2f", money);
		System.out.println( strMoney);
		

	} // main

} // class
