package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conn {
PreparedStatement ps1 =null;
	public Conn() {
		Connection conn =null;
		PreparedStatement ps1 =null;
		PreparedStatement ps2 =null;
		ResultSet set =null;
			
		//����������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		//��������
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/debug?characterEncoding=gbk","root","pjwqwzh7887");
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
