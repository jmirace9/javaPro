package days14;

/**
 * @author 조지훈
 * @date 2026. 5. 29. 오후 4:38:05
 * @subject 
 * @content 
 * 
 */
public class Ex10 {

	public static void main(String[] args) {

		// JDBCDriver 인터페이스
		// MySQLDriver 클래스 implements JDBCDriver 인터페이스
		// OracleDriver 클래스 implements JDBCDriver 인터페이스
		// MSSQLDriver 클래스 implements JDBCDriver 인터페이스
		
		JDBCDriver con = new MySQLDriver();
		con.open();
		
		con.select(); // return 값이 있을것임.
		con.insert();
		con.insert();
		con.insert();
		con.delete();
		con.update();
		
		con.close();
		
	} // main

} // class
