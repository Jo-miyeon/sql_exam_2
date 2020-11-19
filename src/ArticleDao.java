import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ArticleDao {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/t1?serverTimezone=UTC";
	String user = "sbsst";
	String pass = "sbs123414";
	
	public void getConnerction() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, pass); //
	}
	
}
