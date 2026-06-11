package days18;

import java.util.ArrayList;

/**
 * @author 조지훈
 * @date 2026. 6. 5. 오후 4:04:47
 * @subject Chapter13 제네릭(Generic)
 * 				ㄴ jdk 1.5 추가된 개념
 * 				ㄴ jdk 1.8 에 람다식 개념 추가
 * 				ㄴ 정의?
 * 					결정되지 않은 타입을 파라미터로 처리하고 
 * 					실제 사용할 때 
 * 					그 파라미터를 구체적인 타입으로 대체시키는 기능(기술)
				ㄴ 장점 ? 타입의 안전성을 제공, 코드를 재사용
				ㄴ 적용 : 메서드, 클래스, 인터페이스
 * @content 
 * 
 */
public class Ex15 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("aa");
		
		/*
		 * Box box1 = new Box(); 
		 * box1.setItem(100); 
		 * System.out.println(box1.getItem());
		 */
		/*
		BoxDouble box1 = new BoxDouble(); 
		box1.setItem(100.00); 
		System.out.println(box1.getItem());
		 */

		Box<Integer> box1 = new Box();
		box1.setItem(100);
		int n = box1.getItem();
		System.out.println(n);
		
		Box<Student> box2 = new Box();
		box2.setItem(new Student());
		Student s = box2.getItem();

	} // main

} // class

// 제네릭 클래스로 선언
// ㄴ 클래스 명 뒤에 <T>을 붙이면 된다.
// ㄴ T를 타입변수 또는 타입 매개변수
// ㄴ Box    원시타입
// ㄴ Box<T> 제네릭 클래스. T의 Box or T Box 클래스

class Box<T>{
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}


// int 읽기 / 쓰기
/*
class BoxDouble{

	private double item;

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}
}

class BoxChar{

	private char item;

	public char getItem() {
		return item;
	}

	public void setItem(char item) {
		this.item = item;
	}
}
 */



