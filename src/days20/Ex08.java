package days20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author 조지훈
 * @date 2026. 6. 9. 오후 3:04:08
 * @subject 시간표.pdf 450kb
 * 			 ㄴ 50kb 단위로 자른다.
 * 			 ㄴ 여러개의 파일로 분할 하겠다.
 * 			 ㄴ 시간표-1.pdf
 * 			 ㄴ 시간표(2).pdf
 * 					번호(index)
 * 			 이름 + 확장자  	자르기
 * 			 ㄴ 이후 분할파일을 합치겠다.
 * 
 * @content 
 * 
 */
public class Ex08 {

	public static void main(String[] args) {
		String parent = ".\\src\\days20";
		String child = "시간표.pdf";
		// parent 계속 사용하려고 잘라서 사용
		File f = new File(parent, child);
		
//		System.out.println(f.length()+"(bytes)"); 460800(bytes)
		final int VOLUME = 1024 * 50; // 50kb
		
		String fileName = f.getName();
		int index = fileName.indexOf(".");		
		String baseName = fileName.substring(0, index); // 시간표 (파일이름)
		
		String ext =  fileName.substring(index) ; 		// .pdf (파일확장자)
		
		// 바이트 스트림으로 쓰기(분할해서 저장작업)
		FileOutputStream fos = null; // 만들었다 정하고 반복해야함
		BufferedOutputStream bos = null; // 버퍼기능 보조 스트림
		
		int code = 0; // 읽어온 바이트값을 int 로 저장할 변수
		int i = 0; // 50kb가 되었는지 확인하는 목적 // VOLUME의 배수인지?
		index = 0; // 시간표(3).pdf 의 ()값 // 위의 중복은 끝났으니 그저 초기화만하고 준비
		
		try ( FileInputStream in = new FileInputStream(f); // 시간표 읽어드리는 파일 객체
			BufferedInputStream bis = new BufferedInputStream(in);
				){
			
			while ( ( code = bis.read() ) != -1 ) {
				if( i%VOLUME == 0) { // 50kb 씩 다 찼다
					if (i!=0) bos.close(); // 파일 실제저장...

					// 시간표-1.pdf 바꾸는 포맷
					child = String.format("%s-%d%s", baseName, ++index, ext); 
					File temp = new File(parent,child);
					fos = new FileOutputStream(temp); // 쓰기작업하는 객체 새로 생성
					bos = new BufferedOutputStream(fos);
				}
				
				bos.write(code); // String 객체에 쓰고
				i++;
				
			} // while
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(" END ");
		
		
	} // main

} // class









