package days02;


public class Ex09_02 {

	public static void main(String[] args) {
		
		String name = "홍길동";
		byte kor = 89, eng = 87, mat = 56;  // 21억 int X, 0~100 byte
		// Type mismatch: cannot convert from int to short
		short tot = (short) (kor + eng + mat);			// 0 ~ 300
		double avg = tot / 3;
		
		// 홍길동 국:89, 영:87, 수:56, 총점:232, 평균:77.000000 (77.33333...)
		System.out.printf("%s 국:%d, 영:%d, 수:%d, 총점:%d, 평균:%f", name, kor, eng, mat, tot, avg);
		
	} // main

} // 
