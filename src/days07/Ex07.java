package days07;

/**
 * @author kenik
 * @date 2026. 5. 19. 오후 5:10:09
 * @subject 랜덤하게 카드 4자리를 ****로 변환해서 출력.
 * @content 
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
 
		String card ="7655-8988-9234-5677";		
		String [] cardArr = card.split("-");
		
		int index = (int)(Math.random()*4);
		cardArr[index] = "****";
		
		// System.out.println( cardArr[0]+cardArr[1]+cardArr[2]+cardArr[3] );
		
		String dispCard = String.join("-", cardArr);
		System.out.println( dispCard );
 
	} // main

} // class












