package days19;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {

		FruitBox<Fruit> fruitBox = new FruitBox();
		Juice juice = Juicer.makeJuice(fruitBox);
		System.out.println(juice); // days19.Juice@8efb846
		
		FruitBox<Apple> appleBox = new FruitBox();
		FruitBox<Grape> grapeBox = new FruitBox();
		// :
		
//		The method makeJuice(FruitBox<Fruit>) in the type Juicer 
//		is not applicable for the arguments (FruitBox<Apple>)
		juice = Juicer.makeJuice(appleBox);
		System.out.println(juice); // days19.Juice@8efb846
		

	} // main

} // class

class Fruit{   public String toString() { return "Fruit";   }}
class Apple extends Fruit{   public String toString() {return "Apple";   }}
class Grape extends Fruit{   public String toString() {return "Grape";   }}

class Box<T>{
	ArrayList<T>  list = new ArrayList<T>();
	void add(T item) {    this.list.add(item);  }
	T get(int i) {  return  this.list.get(i); }
	int size() {  return this.list.size();  }
	public String toString(){  return this.list.toString(); }
}

// 제한된 제네릭 클래스
class FruitBox<T extends Fruit> extends Box<T>{
	
}

// 과일 갈아서 -> 쥬스
class Juice{
	// 구현되어있다 가정...
}

// 과일 상자 -> 쥬스를 생산하는 기기
class Juicer{
	// [3]  	[2] 메서드를 똑같은 기능의 제네릭 메서드 선언
	
	static <T extends Fruit> Juice makeJuice( FruitBox<T> box ) {
		// 가공 작업
		//
		return new Juice();
	}
	
	// [2]
	/*
	static Juice makeJuice( FruitBox<? extends Fruit> box ) {
		// 가공 작업
		//
		return new Juice();
	}
	*/
	
	/* 오버로딩 안되는 상태 X
	static Juice makeJuice( FruitBox<Fruit> box ) {
		// 가공 작업
		//
		return new Juice();
	}
	
	static Juice makeJuice( FruitBox<Apple> box ) {
		// 가공 작업
		//
		return new Juice();
	}
	*/
	
	// 예)
	/*
	static void printAll( ArrayList<? extends Fruit> list
	         , ArrayList<? extends Fruit> list2 ) {
	      // 구현 코딩
	      // 구현 코딩
	      // 구현 코딩
	   }
	   */
	// 예) 위 예를 제너릴 메서드로
	static <T extends Fruit> void printAll( ArrayList<T> list
	         , ArrayList<T> list2 ) {
	      // 구현 코딩
	      // 구현 코딩
	      // 구현 코딩
	   }

}






