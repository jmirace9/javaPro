package days16;

/**
 * @author 조지훈
 * @date 2026. 6. 2. 오후 2:02:59
 * @subject days16.Parent 같은 패키지 내부
 * @content 
 * 
 */
public class Child extends Parent {

	void modifierAccessTest() {
		this.pub = 1;
		this.pro = 1;
		this.def = 1;
	}
	
} // class
