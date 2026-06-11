package days20;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.function.Consumer;

/**
 * @author kenik
 * @date 2026. 6. 9. 오전 11:29:38
 * @subject 
 * @content 
 * 
 */
public class Ex04_03 {

	public static void main(String[] args) {
		String userDir = System.getProperty("user.dir"); 		
		File parent = new File(userDir);
		
		// javaPro 디렉토리 안에 있는    .dat 파일만 출력
		// [3]
		
		// [2]
//		File [] list = parent.listFiles( new FileFilter() {			
//											@Override
//											public boolean accept(File f) { 
//												return f.getName().endsWith("dat");
//											}
//										} );
//		for (File f : list) {
//			System.out.println(f.getName());
//		}
		
		// 람다식 수정
//		File [] list = parent.listFiles( f -> f.getName().endsWith("dat") );
//		// 배열, 컬렉션 -> 스트림  Stream<File>
////		Arrays.stream(list).forEach(new Consumer<File>() { 
////			@Override
////			public void accept(File f) {
////				System.out.println(f.getName());
////			}
////		});
//
////		Arrays.stream(list).forEach( f -> System.out.println(f.getName()) ); 
////		Arrays.stream(list).forEach( f -> System.out.println(f) ); 
//		Arrays.stream(list).forEach( System.out::println ); // 메소드 참조 
		 

		
		// [1]
//		File [] list = parent.listFiles();
//		for (int i = 0; i < list.length; i++) {
//			File f =  list[i];
//			if (f.isFile()) {
//				String fileName = f.getName();
//				String ext = fileName.substring( fileName.indexOf(".") );
//				if( ext.equals(".dat")) {
//					System.out.println( fileName );
//				}// if
//			} // if
//		} // for

	} // main

} // class




