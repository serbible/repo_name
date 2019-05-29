package org.zerock.persistence;
//JUnit Test
import static org.junit.Assert.fail;
import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;
import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	//static초기화블록::메인메소드가 실행되면, 생성자나 인스턴스초기화블록보다 먼저 수행
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {		
		}
	}
	
	@Test
	public void testConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try(Connection con = DriverManager.getConnection(url, "spring", "spring")){
		log.info(con);	
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}	
}
