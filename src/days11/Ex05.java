package days11;

/**
 * @author 조지훈
 * @date 2026. 5. 26. 오후 12:36:05
 * @subject 
 * @content 
 * 
 */
public class Ex05 {

	public static void main(String[] args) {
		
		if(args.length !=3) {
			System.out.println("3명의 이름을 입력하세요.");
			return;
		}
		

		for (int i = 0; i < args.length; i++) {
			System.out.printf("args[%d]=%s\n", i, args[i]);
		}
		
		System.out.println( " END ");
		
		
		

	} // main

} // class
