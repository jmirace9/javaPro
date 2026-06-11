package days18;

import java.util.Enumeration;
import java.util.Properties;

/**
 * @author 조지훈
 * @date 2026. 6. 5. 오후 2:49:06
 * @subject 
 * @content 
 * 
 */
public class Ex12 {

	public static void main(String[] args) {
		// C:\Class\JavaClass\javaPro
		String userDir = System.getProperty("user.dir");
		System.out.println(userDir);
		//String key, String value
		//  속성명

		Properties p = System.getProperties();

		// 열거자		<?> 와일드카드
		Enumeration<String> en = (Enumeration<String>) p.propertyNames(); // 속성명
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String value = p.getProperty(key);
			System.out.printf("%s: %s\n", key, value);
		}

	} // main

} // class
