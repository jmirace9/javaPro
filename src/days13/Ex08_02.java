package days13;

import java.util.Date;

/**
 * @author 조지훈
 * @date 2026. 5. 28. 오후 4:28:33
 * @subject 
 * @content 
 * 
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
		MyDate d = new MyDate();
		System.out.println( d.toLocaleString() );
		
		d.printDate();

	} // main

} // class

class MyDate extends Date{
	// 필드
	// 생성자
	// 메서드
	public void printDate() {
		System.out.println( this );
	}
}






