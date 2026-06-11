package days15;

/**
 * @author 조지훈
 * @date 2026. 6. 1. 오전 10:08:41
 * @subject 집합관계 (has-a) : Car, Engine 각 클래스
 * 				ㄴ 결합력이 높은 코딩은 좋은 코딩이 아니다.
 * 				ㄴ 생성자를 통해서 DI (의존성 주입)
 * 				ㄴ setter DI
 * @content 
 * 
 */
public class Ex03 {

	public static void main(String[] args) {

		// 2026 상반기
		
		Car k1 = new Car( new H_Engine()); // DI
		
		// 2026 하반기
		
		Car k2 = new Car( new K_Engine());
		
		// k1의 엔진 고장
		k1.setEngine(new K_Engine()); // Setter DI
		
		// 시간지나 2036 식으로 교환
		k1.setEngine(new K_Engine2036());
		
	} // main

} // class
