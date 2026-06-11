package days14;

import java.util.Arrays;

/**
 * @author 조지훈
 * @date 2026. 5. 29. 오전 9:52:31
 * @subject Ex01 신창만님 풀이
 * @content 
 * 
 */
public class Ex01_02 {

	public static void main(String[] args) {
		/*
		public static void stringToArray(String str, int[] arr) {
		      char x;
		      for(int i=0;i<str.length();i++) {
		         x = str.charAt(i);
		         int a = 'Z'-Character.toUpperCase(x);
		         arr[a]++;
		      }      
		   }
		   
		   public static boolean isEqualArray(int[] arrA, int[] arrB) {
		      for(int i=0;i<arrA.length;i++) {
		         if(arrA[i] != arrB[i]) return false;
		      }
		      return true;
		   }
		*/
		
		// 시간 복잡도
		String n = "publicStaticVoidMainStringArgs";
		
		// countArr[0] = 'A';
		// countArr[25] = 'Z';
		int [] countArr = new int[26];
		
		char[] nArr = n.toUpperCase().toCharArray();
		for (int i = 0; i < nArr.length; i++) {
			int index = nArr[i] - 65;
			countArr[index]++;
		}
		System.out.println(Arrays.toString(nArr));
	}

}
