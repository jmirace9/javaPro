package days18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author 조지훈
 * @date 2026. 6. 5. 오전 10:14:20
 * @subject 빙고 게임
 * @content 
 * 
 */
public class Ex04 {

	public static void main(String[] args) {

		int [][] bingo = new int[5][5];

		// 2차원 배열에 1~25 정수를 랜덤하게 채워넣는 코딩.
		
//		HashSet의 객체만들어서 bingo[i][j]담고 bingo[i][j]는 Random rnd = new Random(); 반복으로 숫자담기
		// 내생각
		
		/* [1]풀이 숫자 순서대로 채우고 위치 섞기
	      for(int i=0;i<5;i++) {
	          for(int j=0;j<5;j++) {
	             bingo[i][j] = i*5+j+1;
	          }
	       }

	       for (int i = 0; i < 25; i++) {
	          int x = (int) (Math.random() * 25); // 0~24
	          int y = (int) (Math.random() * 25);
	          int tmp = bingo[x / 5][x % 5];
	          bingo[x / 5][x % 5] = bingo[y / 5][y % 5];
	          bingo[y / 5][y % 5] = tmp;
	       }
		 */
		
		// [3] 주머니에 1~25까지 숫자공 넣어두었다.
		ArrayList<Integer> al = new ArrayList<Integer>();
		//	      for (int i = 1; i <= 25; i++) {
		//	         al.add(i);
		//	      } // for i
		IntStream.rangeClosed(1, 25).forEach(al::add); // for i 문과 같은 맥락
		//	      System.out.println(al);
		Collections.shuffle(al);
		
		for (int i = 0, index = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++, index++) {
				bingo[i][j] = al.get(index);
			}
			
		}
		
		
		/* [2]
		// 주머니에서 1개씩 랜덤하게 꺼내와서 배열에 순차적으로 채워넣을 생각
		Random rnd = new Random();
		
		for (int i = 0 , index = -1, n= -1; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				index = rnd.nextInt(al.size()); // 0 <= nextInt   <25; al.size() 만큼
				n = al.remove(index); // 숫자 제거후 return 하는 메서드 == remove
				bingo[i][j]= n;
			} // for j
			
		} // for i
		*/
		
		// 출력.
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				System.out.printf("[%02d]", bingo[i][j] );
			}
			System.out.println();
		}
		 

	} // main

} // class
