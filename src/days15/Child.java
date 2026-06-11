package days15;

import days16.Parent;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오후 2:02:59
 * @subject days16.Parent 패키지 외부
 * @content 
 * 
 */
public class Child extends Parent {

	void modifierAccessTest() {
		this.pub = 1;
		this.pro = 1; // 패키지내부(default) X || 상속관계 O == protected 접근 가능
//		this.def = 1;
	}
	
} // main
