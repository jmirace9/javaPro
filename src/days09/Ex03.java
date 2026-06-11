package days09;

/**
 * @author 조지훈
 * @date 2026. 5. 21. 오전 11:04:54
 * @subject 
 * @content 
 * 
 */
public class Ex03 {

	public static void main(String[] args) {

		String rrn ="830412-2700001";
		// 1. 생년월일  "1983년 4월 12일"

		String birthday = getBirthday(rrn);
		System.out.println( birthday );

	} // main

	public static String getBirthday(String rrn) {
		// rrn = "830412-2700001"
		int centry = getCentry(rrn);

		int year = centry + Integer.parseInt(rrn.substring(0, 2));  // 83 스트링에서 charAT 역할!! end index앞까지 == <end index
		int month = Integer.parseInt(rrn.substring(2, 4)); // 04 스트링에서 charAT 역할!! end index앞까지 == <end index
		int day = Integer.parseInt(rrn.substring(4, 6));; // 12 스트링에서 charAT 역할!! end index앞까지 == <end index


		return String.format("%d년 %d월 %d일", year, month ,day); // printf 와 같은기능
	}

	private static int getCentry(String rrn) {
		int centry = switch (rrn.charAt(7)) {
		case '1','2','5','6' -> 1900;
		case '3','4','7','8' -> 2000;
		default -> 1800;
		};


		/* [1]번 풀이
		int centry;
		switch ( rrn.charAt(7) -'0' ) {    // '2' - '0' = 50-48=2 // 다른버젼확인!!
	      case 1: case 2: case 5: case 6:
	         centry = 1900;
	         break;
	      case 3: case 4: case 7: case 8:
	         centry = 2000;
	         break;
	      default:
	         centry = 1800;
	         break;
	      } */
		return centry;


	}



} // class
