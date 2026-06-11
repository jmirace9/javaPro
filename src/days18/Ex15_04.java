package days18;

import java.util.ArrayList;

/**
 * @author 조지훈
 * @date 2026. 6. 5. 오후 4:49:59
 * @subject [ 제한된 제네릭 클래스 ]
 * @content ㄴ T 라는 타입 매개변수에 지정할 수 있는 타입의 종류를 제한한 제네릭 클래스
 * 
 */
public class Ex15_04 {
	/*
	public static void main(String[] args) {
		// Box04 제네릭클래스 모든 타입 <T> 담는 상자
		
		Box04<Fruit> fruitBox = new Box04();
		Box04<Apple> AppleBox = new Box04();
		Box04<Grape> GrapeBox = new Box04();
		Box04<Toy>     ToyBox = new Box04();
		
		// 제한된 제네릭 클래스 선언
		FruitBox<Grape> gFruitBox = new FruitBox();
//		FruitBox<Toy> tFruitBox = new FruitBox();
		
		EatBox<Bread> bBox = new EatBox();
		
	} // main
*/
} // class
/*
// 앞으로 클래스를 선언할 때 이 인터페이스를 구현(implement)하면 먹을 수 있다.
interface Eatable {

}

class Toy {
	@Override // 생략되어있음
	public String toString() {
		return "Toy";
	}
}

class Fruit implements Eatable {
	@Override // 생략되어있음
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}

// <T> 모든 타입(T,F,A,G)을 담을 수 있는 상자 클래스
class Box04<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {this.list.add(item);}
	T get(int index) {return this.list.get(index);}
	int size() {return this.list.size();}
	@Override
	public String toString() {return this.list.toString();}
}

// 먹을 수 있는 타입(F,A,G)만 담을 수 있는 상자 클래스
//	<T> 제한된 제네릭 클래스 선언
class FruitBox<T extends Fruit>{
	// 
}

class Bread implements Eatable{}

class EatBox<T extends Eatable>{}

// T 은 Eatable 인터페이스를 구현한 Fruit 클래스의 자식클래스만 타입으로 제한한다.
class EatFruitBox<T extends Fruit & Eatable>{
	
}
*/









