package days02;

/**
 * @author 조지훈
 * @date 2026. 5. 12. 오후 5:19:34
 * @subject 타입변환 == 형 변환
 * @content 
 * 
 */
public class Ex09_03 {

	public static void main(String[] args) {

		String name = "홍길동";
		byte kor =89, eng= 87, mat = 56;
		int tot = kor + eng + mat;
		double avg = tot / 3.0;
		
		System.out.printf("%s 국:%d 영:%d 수:%d 총점:%d 평균:%.2f", name, kor, eng, mat, tot, avg);

	}

}
