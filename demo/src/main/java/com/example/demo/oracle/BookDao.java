package com.example.demo.oracle;

import java.sql.Connection;
import java.sql.DriverManager;

public class BookDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private int port;
	
	public BookDao() {
		// 아래 코드는 임시용
		this.host = "localhost";
		this.user = "hmuser";
		this.password = "hmpass";
		this.database = "xe";
		this.port = 1521;
		// 접속과 관련한 정보를 파일에 저장해서 보관하고, 이곳에서 읽어서 세팅한다.
	}
	
	Connection myConnection() {
		Connection conn = null;
		try {
			String connStr = "jdbc:oracle:thin:@" + host + ":"+ port + ":" + database;
			conn = DriverManager.getConnection(connStr, "hmuser", "hmpass");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public Book getBook(int bookId) {
		Connection conn = myConnection();
		String sql = "select"
		return null;
	}
}
