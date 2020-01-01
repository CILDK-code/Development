package text_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 测试跟数据库建立连接
 */
public class jdbc_study_01 {
public static void main(String[] args) {
	Connection conn =null;
	try {
		//加载驱动类
		Class.forName("com.mysql.jdbc.Driver");
		//建立连接
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project01","root","pjwqwzh7887");
		System.out.println(conn);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if (conn!=null) {
				conn.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
}
