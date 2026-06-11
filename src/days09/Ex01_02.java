package days09;

/**
 * @author 조지훈
 * @date 2026. 5. 21. 오전 9:38:02
 * @subject 입력받은 총점이 0 <= ~ <= 300 체크하는 정규 표현식 연습.
 * @content 
 * 
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
		int [] m = { 0, 5, 99, 120, 299, 300, 301, -1, 003, 999};
		
		for (int i = 0; i < m.length; i++) {
			
			int tot;
			String sTot = m[i]+""; // 숫자배열을 스트링으로 확인하기위해
			// String regex = "^[0-9][0-9][0-9]$";
			// String regex = "^[0-9]{3}$";
			// String regex = "^\\d{3}$";
			// ^(300|[1-9]?\\d|[12]\\d{2})$
			String regex = "^(300|[1-9]?\\d|[12]\\d{2})$"; // 300, 백자리는 1,2 가능 , 001의 앞에 0은필요없다.
			// 개념이해!!
			
			if( sTot.matches(regex) ) {
				tot = Integer.parseInt(sTot);
				System.out.println(tot);
			}else {
				System.out.println("잘못된 총점!!!");
			}
		} // for
		


	} // main

} //class
