package days13;

/**
 * @author 조지훈
 * @date 2026. 5. 28. 오전 10:36:29
 * @subject 정적 멤버 = 정적 필드 + 정적 메서드
 * @content			  static   static
 * 			
 * 			static{ // static 블럭
 * 			} 
 * 
 * 			저축 관련 기능있는 클래스 선언
 */
public class Ex02 {

	public static void main(String[] args) {

		//클래스명.필드 or .메서드명();
		// The field Save.rate is not visible
//		Save.rate = 0.04;
//		Save.setRate(0.04);
		
		System.out.println(Save.getRate());

		Save s1 = new Save("양인석", 10000, 0.04);
		Save s2 = new Save("안정빈", 1500000, 0.04);
		Save s3 = new Save("신창만", 56000, 0.04);
		
		// 객체명.static변수 
		s1.setRate(0.77);
		
		System.out.println(s1.getRate());
		System.out.println(s2.getRate());
		System.out.println(s3.getRate());

		/*
		 * stack							heap
		 * [0x100번지]						name   money  rate [10000][10000][0.04]
		 * s1												ㄴ현재 rate가 모두 같은 값이라 인스턴스별로 사용할필요가 없음.
		 * 													ㄴ클래스당 1개만 메모리 == method area로 == static붙이기
		 * 
		 * Method Area
		 * 
		 * getter setter method
		 * []		[]		[]
		 * */

		// 인스턴스 변수 name, money 는 반드시 객체를 생성해야지 사용할 있다
		//      Save s1 = null;
		// 객체명.필드명  , 객체명.메서드명()
		//      s1.setName("홍길동");

		// 클래스명.필드명
		// 클래스명.메서드명()


	} // main

} // class

// 저축 관련 기능있는 클래스
class Save{

	// 필드 중에 인스턴스 변수
	private String name; 	// 예금주
	private int money; 		// 예금액
	// 클래스 변수, static(정적) 변수, 공유변수
	private static double rate = 0.01; 		// 이자율
	// ㄴ 선언시 초기화
	
	static { // static 초기화 블럭
		rate = 0.04;
	}
	
	// 디폴트 생성자
	public Save() {}

	public Save(String name, int money, double rate) {
		//      super();
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	public void printSave() {
		System.out.printf("> 예금주:%s, 예금액:%d, 이자율:%.2f\n"
				, this.name, this.money, this.rate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// static (정적) 메서드
	// private로 선언된 필드에 접근하기위해서
	public static double getRate() { 
		return rate;
	}

	public static void setRate(double rate) {
		Save.rate = rate;
	}

	


}
