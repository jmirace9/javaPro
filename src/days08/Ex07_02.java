package days08;

/**
 * @author 조지훈
 * @date 2026. 5. 20. 오후 4:22:36
 * @subject 
 * @content 
 * 
 */
public class Ex07_02 {

	public static void main(String[] args) {

		int money = 125760;
		int unit = 50000;
		boolean sw = false; // 스위치변수 : 한번한번 변화
		int num = 0;
		while (unit >= 1) {
			// System.out.println(unit); 단위확인용 출력
			num = money / unit;
			System.out.printf("%d원: %d개\n", unit, num);
			money %= unit;
			unit /= sw ? 2: 5;
			sw = !sw;
		}
		

	} // main

} // class
