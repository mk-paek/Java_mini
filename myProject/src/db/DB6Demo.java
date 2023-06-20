package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB6Demo {
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost/contacts?serverTimezone=Asia/Seoul";

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("데이터베이스 연결중 ...");
			con = DriverManager.getConnection(url, "root", "1234");
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾지 못했습니다...");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			System.out.println(e.getMessage());
		}
		return con;
	}

	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
		Statement stmt = con.createStatement();
		
		String sql = "DELETE from person where name= '이재용'";
		if (stmt.executeUpdate(sql) == 1)
			System.out.println("레코드 삭제 성공");
		else
			System.out.println("레코드 삭제 실패");

		con.close();
		stmt.close();

	}
}