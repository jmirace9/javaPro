package days05;


/**
 * @author 조지훈
 * @date 2026. 5. 15. 오후 3:36:42
 * @subject 
 * @content 
 * 
 */
public class Ex07_03 {

	public static void main(String[] args) {
		// 로또 번호를 저장할 배열 선언
		
		
		
		
		
		
		
		//1
		int lottoNumber1;
		lottoNumber1 =(int)(Math.random() * 45)+1;
		//2
		int lottoNumber2;
		do {
			lottoNumber2 =(int)(Math.random() * 45)+1;
		} while (lottoNumber1==lottoNumber2);
		//3
		int lottoNumber3;
		do {
			lottoNumber3 = (int)(Math.random() * 45) + 1;
		} while (lottoNumber1 == lottoNumber3 || lottoNumber2 == lottoNumber3);
		// 4
		int lottoNumber4;
		do {
			lottoNumber4 = (int)(Math.random() * 45) + 1;
		} while (lottoNumber1 == lottoNumber4 || lottoNumber2 == lottoNumber4 || lottoNumber3 == lottoNumber4);
		//5
		int lottoNumber5;
		do {
			lottoNumber5 = (int)(Math.random() * 45) + 1;
		} while (lottoNumber1 == lottoNumber5 || lottoNumber2 == lottoNumber5 || lottoNumber3 == lottoNumber5|| lottoNumber4 == lottoNumber5);
		//6
		int lottoNumber6;
		do {
			lottoNumber6 = (int)(Math.random() * 45) + 1;
		} while (lottoNumber1 == lottoNumber6 || lottoNumber2 == lottoNumber6 || lottoNumber3 == lottoNumber6|| lottoNumber4 == lottoNumber6|| lottoNumber5 == lottoNumber6);

		System.out.println(lottoNumber1);
		System.out.println(lottoNumber2);
		System.out.println(lottoNumber3);
		System.out.println(lottoNumber4);
		System.out.println(lottoNumber5);
		System.out.println(lottoNumber6);



	}

}
