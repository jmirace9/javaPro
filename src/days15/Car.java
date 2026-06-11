package days15;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Car {

	//필드
	private String name;
	private String gearType;
	private int door;

	// engine = interface
	
	private Engine engine = null;


	public Car(Engine engine) {
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



