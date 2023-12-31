package com.example.demo.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex04_Insert {
	public static void main(String[] args) {
		int custId = 7;
		String name = "류현진", addr = "캐나다 토론토", phone = "010-3456-7890";
		
		try {
			Connection conn = DriverManager.getConnection(
					// 커넥션을 만듬 ?? 왜 이번에는 안에서 선언, 초기화
					"jdbc:oracle:thin:@localhost:1521:xe", "hmuser", "hmpass");
			String sql = "insert into customer values (?,?,?,?)";
			
			// 파라미터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custId);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			pstmt.setString(4, phone);
			
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
