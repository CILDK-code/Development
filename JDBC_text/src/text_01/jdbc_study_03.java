package text_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 测试PreparedStatement的基本用法
 */
public class jdbc_study_03 {
public static void main(String[] args) {
	Connection conn =null;
	PreparedStatement ps =null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project01","root","pjwqwzh7887");
			String sql="insert into user (sname,stduent_number) values (?,?)";//?是占位符
			ps = conn.prepareStatement(sql);
			ps.setString(1,"ww");
			ps.setInt(2, 1803050133);
			ps.setObject(1, "sq");
			ps.setObject(2, 1803050134);
			ps.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		}
}
}

