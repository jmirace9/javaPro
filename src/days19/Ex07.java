package days19;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @author 조지훈
 * @date 2026. 6. 8. 오후 5:33:16
 * @subject Data[InputStream]/Data[OutputStream]
 * @content		  바이트 스트림
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
		// 한 학생의 성적 정보
		
		String name = "홍길동";
		int kor = 90, eng = 80, mat = 99;
		int tot = kor + eng + mat;
		double avg = (double) tot / 3;
		boolean gender = true;

		String fileName = ".\\student02.dat"; // .\\ javaPro에 저장한다는 의미
		
		try (
				FileOutputStream out = new FileOutputStream(fileName);
				DataOutputStream dos = new DataOutputStream(out); // 보조스트림
				
				){
			// 스트림(빨대)에 적은것임.
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			// 파일로 저장될려면 (입으로 들어가려면)
			dos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(" END ");
		
	} // main

} // class










