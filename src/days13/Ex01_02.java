package days13;

/**
 * @author 조지훈
 * @date 2026. 5. 28. 오전 9:32:48
 * @subject 
 * @content 
 * 		3) 단독 (홀로) 사용될 때의 this 용도
 *       - 매개변수:    dispPoint(this)   Ex01_02.java 
 */
public class Ex01_02 {

	public static void main(String[] args) {

		Calc myCalc = new Calc();
		myCalc.btnExec.btnExec_click();
		// myCalc.btnPlus.btnExec_click(); // +

	} // main

} // class

// 계산기 클래스 선언
class Calc{

	//	Button [] btnArr = new Button[24]; //일반계산기 24칸
	//	Button btnExec = new Button(); 결합력 높은 코딩이다. X
	Button btnExec = null;

	// 디폴트 생성자
	public Calc() {
		init();
	}

	// 생성자에서 필드를 초기화하는 메서드
	private void init() {
		this.btnExec = new Button("[ = ]", this);		
		//	ㄴclass Calc
	}

	// 계산기 화면에 출력을 담당하는 메서드
	public void execDisp(String result) {
		System.out.printf("[화면결과 출력] %s\n", result);
	}

}

// 많은 숫자 및 연산버튼 중 하나만 만들어보자
class Button{ // 버튼 만드는 설계도

	String text; //
	Calc calc;

	// 디폴트 생성자
	public Button() {}
	public Button(String text) {
		this.text = text; // this 1번째 용도 String text; //
	}

	public Button(String text, Calc calc) {
		//   ㄴ 지역변수라 {}안에서만 사용가능 맨밑에 reuslt값에 바로 대입 불가 = this로 담아와야함 = Calc calc;준이유
		this(text); // this 2번째 용도
		this.calc = calc;
	}
	// 버튼을 클릭할 때 동작을 처리하는 메서드(==동작)
	public void btnExec_click() {
		String result = "3 + 5 = 8";
		// Calc 객체 얻어오는 방법
		this.calc.execDisp(result);
	}


}





