package days20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author kenik
 * @date 2026. 6. 9. 오전 7:23:50
 * @subject  days19.Ex06.java
 * @content  DataInputStream <-  student.dat
 *                        기본형 읽기위한 메소드 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		String name ;
		int kor, eng, mat;
		int tot;
		double avg;
		boolean gender;
		
		String fileName = ".\\student.dat"; 
		
		try (
				FileInputStream in = new FileInputStream(fileName);	
				DataInputStream dis = new DataInputStream(in);	
					){
				// 스트림(빨대)
				name = dis.readUTF();
				kor = dis.readInt();
				eng = dis.readInt();
				mat = dis.readInt();
				tot = dis.readInt();
				avg = dis.readDouble();
				gender = dis.readBoolean();
				
				System.out.printf("%s,%d,%d,%d,%d,%f,%b\n"
						, name, kor, eng, mat, tot, avg, gender);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(" END ");

	} // main

} // class





