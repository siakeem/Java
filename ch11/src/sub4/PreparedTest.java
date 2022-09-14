package sub4;
/*
 * 날짜 : 2022/09/14
 * 이름 : 김시아
 * 내용 : JDBC PreparedStatement 실습하기
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreparedTest {
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/java1db";
		String user = "root";
		String pass = "1234";
		
		try {
			//전체 개념을 외우기 !!
				
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");	
			
			//2단계 - 데이터베이스 접속
			Connection conn =DriverManager.getConnection(host,user,pass);
			
			//3단계 - SQL 실행객체 생성
			String sql = "INSERT INTO `User1` VALUES (?,?,?,?);";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "a201");
			psmt.setString(2, "홍길동");
			psmt.setString(3, "010-1110-2221");
			psmt.setInt(4, 27);
			
			//4단계 - SQL 실행
			psmt.executeUpdate();
			
			
			//5단계 -
			//6단계 - 자원해제
			psmt.close();
			conn.close();
			
		
			
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		System.out.println("Insert 완료 ... ");
	}

}
