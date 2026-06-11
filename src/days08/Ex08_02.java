package days08;

/**
 * @author 조지훈
 * @date 2026. 5. 20. 오후 5:25:21
 * @subject 
 * @content 
 * 
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
		
		
		String rrn = "830412-2700001";
		
		// 성별(gender)
		boolean gender = getRRNGENDER(rrn);
		
		System.out.println(gender ? "남자" : "여자" );
		
		

	} // main

	//여자 : false , 남자 : true;
	private static boolean getRRNGENDER(String rrn) {
		
		return rrn.charAt(7) % 2 == 0 ? false : true;
	}

} // class
