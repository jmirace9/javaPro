package days13;

/**
 * @author 조지훈
 * @date 2026. 5. 28. 오후 4:36:37
 * @subject 상속
 * @content is-a 관계
 * 			오버로딩(==중복함수)
 * 			오버라이딩( Override ) ***
 * 
 * 						도형(Shape)
 * 							|
 * 			원( Circle ) 		삼각형 ( Triangle ) 
 * 
 */
public class Ex09 {

	public static void main(String[] args) {
		
		Shape s = new Shape();
		// s.( ) 9개메서드 보이는 이유
		
		
		
	} // main

} // class

class Shape { // extends Object 코딩 안해도 컴파일할때 기본적으로 object 메소드를 물려 받고있음.
	
	
}

class Circle extends Shape{
	
}

class Triangle extends Shape{
	
}


