package days09;

/**
 * @author 조지훈
 * @date 2026. 5. 21. 오후 3:11:57
 * @subject 2차원배열 행/열 각 요소를 구분
 * @content 
 * 
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 2행 4열 2차원배열 m 
		//                   행 열
		int [][] m = new int[2][4];
//		m[0][0] = 1; m[0][1] =2; m[0][2]=3; m[0][3]= 4;
//		m[1][0] = 5; m[1][1] =6; m[1][2]=7; m[1][3]= 8;
		
		
				
				
//	    System.out.println( m[0][0] );
		System.out.println( m.length ); // 2차원배열  배열명.length == 행갯수
		System.out.println( m[0].length ); // 2차원배열  
		System.out.println( m[1].length ); // 2차원배열  


		// 2차원 배열 출력 
		 dispM(m);

	} // main

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {       // 행갯수   
			for (int j = 0; j < m[i].length; j++) {  // 열갯수
				System.out.printf("m[%d][%d]=%d ", i, j, m[i][j]);
			} 
			System.out.println();         
		}

	}

} // class

