package days13;

public class Car {

	//필드
	String name;
	String gearType;
	int door;

	//	클래스타입 객체명;
//	private Engine engine = new Engine(); 결합력 높은 코딩 == 좋은 코딩 X
	private Engine engine = null;


	public Car(Engine engine) {
		this.engine = engine;
	}
	// getter
	public Engine getEngine() {
		return engine;
	}
	// setter
	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	//생성자
	
	
	
	
	//메서드
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	
	void stop() {
		this.engine.stop();
	}



}



