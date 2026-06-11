package days13;

import java.util.Arrays;

/**
 * @author 조지훈
 * @date 2026. 5. 28. 오후 4:51:15
 * @subject 
 * @content 
 * 
 */
public class Ex10Test {

	public static void main(String[] args) {
		
		
//      10. 아래 두 문자열의 대소문자 구분 없이, 순서 상관 없이 같은 문자여부를 체크하는 코딩을 하세요. 
      String n = "keNik";    //  [][][][][]
      String m = "kKnie";     //  [][][][][]

      n.toLowerCase(); // String은 불변. 이 함수도 return값을 주는것 뿐이니 저장도 해줘야함.
      n = n.toUpperCase();
      m = m.toUpperCase();
      
      char [] nArr = n.toCharArray();
      char [] mArr = m.toCharArray();
  
      Arrays.sort(nArr); // 오름차순 정렬 . 스트링은 sort매개변수불가.
      Arrays.sort(mArr);
      
      
      
      boolean result = Arrays.equals(nArr, mArr);
      System.out.println(result);
      
      System.out.println(Arrays.toString(nArr));
      System.out.println(Arrays.toString(mArr));
      System.out.println(nArr);
	} // main

} // class
