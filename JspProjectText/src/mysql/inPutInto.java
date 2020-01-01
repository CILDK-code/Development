package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class inPutInto {
	public  inPutInto() {
		Conn connection =new Conn();
	}
	public void inPut(String table,String value) throws Exception {
		Connection conn =null;
		//加载驱动类
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//建立连接
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/debug?characterEncoding=gbk","root","pjwqwzh7887");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String sql="insert into ? values (?)";
		PreparedStatement ps1 =null;
		try {
			ps1=conn.prepareStatement(sql);
			if (value!=null) {
				ps1.setString(1, table);
				ps1.setString(2, value);
				ps1.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(ps1!=null) {
				ps1.close();
			}
			if (conn!=null) {
				conn.close();
			}
		}
	}

}
