package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DBconnection {

	/**
	 * @author Hyojin
	 *
	 */
	Connection conn;
	Statement stmt;
	public DBconnection() {
		
				

	String driver = "oracle.jdbc.driver.OracleDriver";
	String user = "scott";
	String pass = "tiger";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		try {
			Class.forName(driver);
			System.out.println("[INFO] oracle driver connect");

			this.conn = DriverManager.getConnection(url, user, pass);
			System.out.println("[INFO] Complate Connection");
			stmt = conn.createStatement();

		} catch (Exception e) {
			System.out.println("Fail to Oracle Driver Connect!");
			System.exit(0);
			
		}

	}

	/*
	 * @return ResultSet
	 */

	public ResultSet selectQuery(String query) {

		ResultSet rs = null;

		try {
			rs = this.stmt.executeQuery(query);
//				while(rs.next()) {
//					System.out.println(rs.getString("empno"));
//				}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rs;

	}

}
