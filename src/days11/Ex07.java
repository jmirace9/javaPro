package days11;

/**
 * @author 조지훈
 * @date 2026. 5. 26. 오후 3:05:46
 * @subject 클래스의 복사(copy)
 * 			클래스의 복제(clone) - 얕은 복제/깊은 복제
 * 					차이점.
 * @content 
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
//		객체구성요소 ,클래스 특징, 클래스설계과정, 객체인스턴스 등 설명 내일시험!!!
		
		
		// Tv 객체 선언 및 생성하고
		// 객체명.필드명 or 객체명.메서드명()		.==도트연산자
		Tv t1 = new Tv();
		t1.power(); // false -> true
		System.out.println(t1.channel); // 객체명.필드명
		t1.channelUp();
		t1.channelUp(); // 객체명.메서드명()
		t1.channelUp();
		System.out.println(t1.channel);
		t1.power(); // true -> false;
		
		System.out.println(" END ");
		
		
	} // main

} // class
