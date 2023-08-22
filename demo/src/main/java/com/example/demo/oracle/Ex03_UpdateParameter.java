package com.example.demo.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex03_UpdateParameter {
	public static void main(String[] args) {
		int custId = 1;
		String phone = "010-9876-5432";
		try {
			Connection conn = DriverManager.getConnection(
					// 커넥션을 만듬 ?? 왜 이번에는 안에서 선언, 초기화
					"jdbc:oracle:thin:@localhost:1521:xe", "hmuser", "hmpass");
			String sql = "update customer set phone=? where custid=?";
			
			// 파라미터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setInt(2, custId);
			
			// 반환값이 없느 Query 실행
			pstmt.executeUpdate();
//			conn.commit();  자동 커밋이 설정되어 있으면 실행하지말것	
			
			// 리소스반환
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
