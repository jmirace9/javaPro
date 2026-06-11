package days09;

/**
 * @author 조지훈
 * @date 2026. 5. 21. 오후 2:02:23
 * @subject 
 * @content 
 * 
 */
public class Ex04 {

	public static void main(String[] args) {
		int [] m = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		for (int i = 0; i <= 12; i++) {
			if(i==6) continue;
			System.out.printf("sum +=(rrn.charAt(%d)-'0')*%d;\n"
					,i , m[i]);
		}

	} // main

} // class
