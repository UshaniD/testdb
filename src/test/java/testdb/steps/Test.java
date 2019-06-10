package testdb.steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import cucumber.api.java.en.Given;

public class Test {
	String username = "am_user";
	String password = "1qaz2WSX@";

	@Given("^I change DB \"([^\"]*)\" config table \"([^\"]*)\"$")
	public void I_change_DB_config_table(String database, String table) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://18.206.74.47/" + database;

		for (int i = 0; i < 700000; i++) {
			DateFormat dateFormat = new SimpleDateFormat("MMddHHmmss");
			Date date = new Date();
			String timestamp = dateFormat.format(date);

			String query = "insert into " + table + " values(NULL,'tel3A+60" + timestamp
					+ "',2,'admin:payment:v1','admin','2018-12-18 06:59:18','2018-12-18 06:59:57'),(NULL,'tel3A+61"
					+ timestamp
					+ "',2,'admin:payment:v1','admin','2018-12-18 06:59:18','2018-12-18 06:59:57'),(NULL,'tel3A+62"
					+ timestamp
					+ "',2,'admin:payment:v1','admin','2018-12-18 06:59:18','2018-12-18 06:59:57'),(NULL,'tel3A+63"
					+ timestamp
					+ "',2,'admin:payment:v1','admin','2018-12-18 06:59:18','2018-12-18 06:59:57'),(NULL,'tel3A+64"
					+ timestamp
					+ "',2,'admin:payment:v1','admin','2018-12-18 06:59:18','2018-12-18 06:59:57'),(NULL,'tel3A+65"
					+ timestamp + "',2,'admin:payment:v1','admin','2018-12-18 06:59:18','2018-12-18 06:59:57');";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(dbUrl, username, password);
			Statement st = con.createStatement();
			st.executeUpdate(query);
			con.close();
		}
	}

}
