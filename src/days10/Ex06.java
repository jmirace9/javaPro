package days10;

/**
 * @author kenik
 * @date 2026. 5. 22. 오후 12:05:21
 * @subject 
 * @content 
 * 
 */
public class Ex06 {

	public static void main(String[] args) throws InterruptedException{
		
		int [][] m = new int[5][5];

		// fillM(m);
		// fillM2(m);
		
		// __*
		// _***
		// *****
		
		// __*
		// _***
		// *****
		// _***
		// __*

		magicSquare(m); // 홀수 마방진
		
		dispM(m);
	} // main


	/* 1. 1의 위치는 0행의 가운데 열이다.
    3. 만약 5의 배수일 경우 행 증가
    2. 열 증가 행 감소
    4. 열증가 행감소 했을때 열이 벗어나면 열이 가장 작은 곳으로
                        행이 벗어나면 행이 가장 큰 곳으로
   */ 
	private static void magicSquare(int[][] m) throws InterruptedException{
		
		int v = 1;		
		int row = 0, col = m[0].length/2; // 행, 열
		m[row][col] = v;
		
		while (v < m.length * m[0].length) {
			
			if ( v % 5 == 0 ) {
				row++;
			} else {
                col++; row--;
                if (row == -1)  row = m.length-1;
                if (col == m[0].length) col = 0; 
			}
			
			dispM(m); // 
			Thread.sleep(1000); // 1초 후에 실행
			
			m[row][col] = ++v;
			
		} // while
		
				
	}


	private static void fillM2(int[][] m) {
		// [1] 풀이
		// ij    ji
		// 00 -> 00
		// 01 -> 10
		// 02 -> 20
		/*
		for (int i = 0, v = 1; i < m.length; i++) {         
			for (int j = 0; j < m[i].length; j++, v++) {  
				m[j][i] = v;
			} // for j			 
		} // i	
		*/
//        0   1   2   3  4		
//	0	[01][06][11][16][21]
//	1	[02][07][12][17][22]
//	2	[03][08][13][18][23]
//	3	[04][09][14][19][24]
//	4	[05][10][15][20][25]		
		for (int i = 0; i < m.length; i++) {         
			for (int j = 0; j < m[i].length; j++) {  
				m[i][j] = i+1 + j * m[i].length ;
			} 		 
		} // i
		
	}

	private static void fillM(int[][] m) {
		for (int i = 0, v = 1; i < m.length; i++) {         
			for (int j = 0; j < m[i].length; j++, v++) {  
				m[i][j] = v;
			} // for j
			 
		} // i		
	}

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {        // 5 행
			for (int j = 0; j < m[i].length; j++) { // 5 열
				System.out.printf("[%02d]", m[i][j]);
			} // for j
			System.out.println(); // 개행
		} // i
		System.out.println();
	}

} // class









