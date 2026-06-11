package days11;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 조지훈
 * @date 2026. 5. 26. 오전 10:43:05
 * @subject 
 * @content 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {

		int i = 0; // 변수, 지역변수
		int [] m = new int[3]; // 변수, 지역변수, 참조변수, 배열명
		//					ㄴ 힙영역에 할당하라
		//		[][][]							[0x100번지]	
		//		0x100번지								m
		//		배열의 각 요소를 사용하려면: 배열명[첨자값]
		m[0] = 100;
		System.out.println(m[0]);

		Car myCar; // 변수, 지역변수, 참조변수, 객체
		myCar = new Car(); // 객체 생성, 인스턴스화
		//					ㄴ클래스 이름
		//		힙
		//					인스턴스										객체
		//		[name][speed][wheelCount][dispCarInfo주소참조]				[]
		//		0x100번지													myCar

		//		[dispCarInfo()] 코드

		//		필드, 메서드를 사용하려면: 객체명.필드명 or 객체명.메서드명()
		myCar.name = "K9"; // 필드값 변경
		System.out.println(myCar.name); // 필드값 읽기

		myCar.dispCarInfo();

		// 형제
		Car bCar = new Car();
		//		힙
		//		인스턴스										객체
		//[K5][0][0][dispCarInfo주소참조]				    [0x300번지]
		//0x300번지											bCar
		bCar.name = "K5";
		bCar.dispCarInfo();

		
		
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();


		/*
		 * 변수 선언 형식
		 * 클래스자료형 변수명;
		 * 객체: 클래스를 자료형으로 선언된 참조변수
		 * 클래스: 객체의 설계도
		 * 인스턴스: 생성된 객체
		 * 
		 * 
		 * */ 



	} // main

} // class
