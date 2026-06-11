package days08;

/**
 * @author 조지훈
 * @date 2026. 5. 20. 오전 11:05:23
 * @subject String
 * 			ㄴ charAt(), length(), split(), join(), repeat(), substring(), indexOf()
 * @content 
 * 
 */
public class Ex04 {

	public static void main(String[] args) {
		// 주민등록번호 Resident Registration Number
		String rrn = "830412-1700001";


		// 1)	830412-*******
		String result = toMaskedRRN(rrn);
		System.out.println(result);



		// 2)	830412-1******
		result = toMaskedRRNWithGender(rrn);
		System.out.println(result);





	} // main

	// [2] 풀이

	private static String toMaskedRRNWithGender(String rrn) {

		int index = rrn.indexOf('-'); // 주민등록번호는 숫자와 - 위치가 확실하니 index로 찾을필요없음.
		// System.out.println("> 찾은 위치: "+ index);
		
		
		
		return String.format("%s*******", rrn.substring(0, index +2) );
		
	}

	private static String toMaskedRRN(String rrn) {
		// '-'
		// rrn.indexOf(0) 찾으면 찾은 위치값 (0부터 세는거 주의) , 없으면 -1 출력
		
		int index = rrn.indexOf('-');
		// System.out.println("> 찾은 위치: "+ index);
		
		
		
		return String.format("%s*******", rrn.substring(0, index +1) );
		
	}

		/* [1] 풀이
	private static String toMaskedRRNWithGender(String rrn) {

		String [] rrnArr = rrn.split("-");
		String rrnFront = rrnArr[0] ;
		String rrnBack = rrnArr[1] ;
		char gender = rrnBack.charAt(0);

		// char g = rrn.split("-")[1].charAt(0);

		return String.format("%s-%s******", rrnFront, gender );
	}

	private static String toMaskedRRN(String rrn) {

		return String.format("%s-*******", rrn.split("-")[0]);
		// System.out.println(rrn.split("-")[1]); (뒷자리만 나오는데 이걸 활용할수있을까)
	}
		 */ 

	} // class
