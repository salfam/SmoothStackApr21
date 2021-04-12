package dayFive;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/* There are no errors, idk how im supposed to run this
 * its 'fixed'? as best as i know with the instructions given
 */
public class SampleSingleton {
	private static Connection conn = null;
	private static SampleSingleton instance = null;
	public static SampleSingleton getInstance() {return instance;}


	public static void databaseQuery(BigDecimal input) throws SQLException {
		conn = DriverManager.getConnection("url of database");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id from table");
		@SuppressWarnings("unused")
		BigDecimal x = new BigDecimal(1);
		while(rs.next()) {
			x = BigDecimal.valueOf(rs.getInt(1)).multiply(input);
		}
	}
}