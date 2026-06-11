package days18;

/**
 * @author 조지훈
 * @date 2026. 6. 5. 오후 3:29:56
 * @subject 열거형( enum )
 * 			 ㄴ jdk 1.5에 새로 추가된 개념.
 * 			 ㄴ 서로 관련있는 상수들의 집합을 클래스로 선언한 것.
 * 			 ㄴ 정의			대문자
 * 				[접지] enum 열거형이름{
 * 						상수명,
 * 						상수명,
 * 						상수명
 * 				}
 * 				ㄴ 사용방법
 * 					열거형이름.상수명
 * @content 
 * 
 */
public class Ex14 {

	public static void main(String[] args) {
//		Card.CLOVER == 1
		Card card = Card.HEART;
		System.out.println(Card.CLOVER); // CLOVER
		System.out.println(Card.CLOVER.name()); // "CLOVER" 문자열
		System.out.println(Card.CLOVER.ordinal()); // 0 순서 (정수)
		
		switch (card) {
		case Card.CLOVER :
			break;
		case Card.SPADE :
			break;
		case Card.DIAMOND :
			break;
		case Card.HEART :
			break;
		default:
		}
	

	} // main

} // class

/*
class Gender{
	
	public static final boolean 남자 = true;
	public static final boolean 여자 = false;
	
}

class Card{
	
	public static final int CLOVER = 1;
	public static final int HEART = 2;
	public static final int DIAMOND = 3;
	public static final int SPADE = 4;
	
}
*/






