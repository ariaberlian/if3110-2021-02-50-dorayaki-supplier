package com.jayen.limiter;

import java.sql.*;

public class DBHandler {
	private Connection conn;
	private static String DBURL = "jdbc:mysql://localhost:3306/dorayaki_factory";
	private static String DBUsername = "root";
	private static String DBPassword = "";
	private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	public DBHandler() {
		try {
			System.out.println("Connecting to MYSQL");
			Class.forName(JDBC_DRIVER);
			this.conn = DriverManager.getConnection(DBURL, DBUsername, DBPassword);
			System.out.println("Connected!");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Error connecting to database");
		}
	}
	
	public Connection getConnection() {
		return this.conn;
	}
	
}
