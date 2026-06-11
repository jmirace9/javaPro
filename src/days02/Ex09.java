package days02;

/**
 * @author 조지훈
 * @date 2026. 5. 12. 오후 4:22:53
 * @subject 기본형 > 숫자형 > 정수형 설명
 * @content 
 * 		byte(1)
 * 		short(2)
 * 		int(4)
 * 		long(8)
 * 		 +
 * 		문자타입: char(유니코드2)
 * 
 */
public class Ex09 {

	public static void main(String[] args) {
		// 1비트 []

		
		
		  // 이름 변수
	      // 국어,영어,수학 변수
	      // 총점
	      // 평균
	      // 출력형식:  홍길동 국:89, 영:87, 수:56, 총점:???, 평균:???
		
		/*
		String name = "홍길동";
		byte point1 = 89;
		byte point2 = 87;
		byte point3 = 56;
		int result = point1+point2+point3;
		long result2 =  result1/3;
		
		System.out.printf(name+" "+ "국:"+point1 +" "+ "영:"+point2 + " "+"수:"+point3+ " "+"총점:"+result+ " "+"평균:" );
		*/
		
		
		String name = "\"홍길동\"";
		byte kor = 89, eng = 87, mat = 56;
		int tot = kor + eng + mat;
		double avg = tot / 3.0;
		// 홍길동 국:89, 영:87, 수:56, 총점:232, 평균:77.000000 (77.33333...)
		System.out.printf("%s 국:%d, 영:%d, 수:%d, 총점:%d, 평균:%.2f", name, kor, eng, mat, tot, avg);
		
	} // main

} // 
