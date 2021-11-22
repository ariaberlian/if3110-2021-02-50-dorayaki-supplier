package com.jayen.limiter;
import java.sql.*;


public class RateLimiter {
	
	public static boolean rate_limit(String ip, String endpoint) throws SQLException {

		DBHandler db = new DBHandler();
		Connection conn = db.getConnection();
		Statement statement = conn.createStatement();
		
		String query = "SELECT COUNT(id_log) as x FROM log_request WHERE ip='"+ip+"' AND endpoint='"+endpoint+"' and timestamp>(NOW() - INTERVAL 1 minute);";
		ResultSet rs = statement.executeQuery(query);
		int i=0;
		if(rs.next()) {
			i = rs.getInt("x");
		}

		if(i>10) {
			System.out.println("Drop Request");
			return true; //drop request
		}else {
			query = "INSERT INTO log_request (ip, endpoint, timestamp) VALUES ('"+ip+"', '"+endpoint+"', NOW()"+");";
			statement.executeUpdate(query);
			System.out.println("Insert log berhasilll");
			return false;
		}
	}
}
