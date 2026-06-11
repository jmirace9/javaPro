package days16;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오후 3:35:01
 * @subject 숫자,날짜,문자열 -> 원하는 형식으로 출력,표현 클래스
 * @content 형식화 클래스
 * 			1) DecimalFormat 숫자(Decimal)
 * 			2) SimpleDateFormat 날짜
 * 			3) ChoiceFormat X (수업에서 안다룰 예정)
 * 			4) MessageForamt X (수업에서 안다룰 예정)
 */
public class Ex12 {

	public static void main(String[] args) {
		// [2] 원상복구
		String strMoney = "₩3,257,600.00";
		
//		System.out.println( (int) Double.parseDouble(strMoney.substring(1).replaceAll(",", "") ) );
		
		String pattern = "\u00A4#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		
		try {
			Number n = df.parse(strMoney); // parse 는 checked, 예외 Runtime 아님
			int money = n.intValue();
			System.out.println( money );
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		/* [1]
		  int money = 3257600;
		//      통화기호3,257,600
		String pattern = "\u00A4#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		String strMoney = df.format(money);
		System.out.println(strMoney);
		*/

	} // main

} // class




