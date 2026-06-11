package days18;

import java.util.ArrayList;

/**
 * @author 조지훈
 * @date 2026. 6. 5. 오후 4:35:49
 * @subject [ 제네릭 클래스의 객체 생성과 사용 ]
 * 			Fruit 
 * 			 ㄴ Apple
 * 			 ㄴ Grape
 * 			제네릭 클래스 선언	사용
 * @content 
 * 
 */
public class Ex15_03 {

	public static void main(String[] args) {
/*
		Box03<Fruit> fruitBox = new Box03();
		Box03<Apple> AppleBox = new Box03();
		Box03<Grape> GrapeBox = new Box03();
		Box03<Toy>     ToyBox = new Box03();

		// 과일담는 상자객체에 과일,사과,포도 객체 add
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
//		System.out.println(fruitBox.size()); // 3
		
//		The method add(Fruit) in the type Box03<Fruit> 
//		is not applicable for the arguments (Toy)
//		fruitBox.add(new Toy());
		
//		Type mismatch: cannot convert from Box03<Grape> to Box03<Apple>
//		Box03<Apple> AppleBox2 = new Box03<Grape>();
		
		*/
		
		
	} // main

} // class
/*
// 제네릭 클래스 선언
class Box03<T>{
	   
	   ArrayList<T> list = new ArrayList<T>();
	   
	   void add(T item) {
	      this.list.add(item);
	   }
	   
	   T get(int index){
	      return this.list.get(index);
	   }
	   
	   int size() {
	      return this.list.size();
	   }
	   
	   @Override
	   public String toString() {
	      return this.list.toString();
	   }
	}


class Toy{
	@Override // 생략되어있음
	public String toString() {
		return "Toy";
	}
}

class Fruit{
	@Override // 생략되어있음
	public String toString() {
		return "Fruit";
	}
} // Fruit class

class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}
}
*/












