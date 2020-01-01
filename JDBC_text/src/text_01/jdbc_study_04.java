package text_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * ����ResultSet������Ļ����÷�
 */
public class jdbc_study_04 {
public static void main(String[] args) {
	Connection conn =null;
	PreparedStatement ps =null;
	ResultSet set =null;
		try {
			//����������
			Class.forName("com.mysql.jdbc.Driver");
			//��������
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/debug","root","pjwqwzh7887");
			String sql="select * from user ";
			set = ps.executeQuery();
			while (set.next()) {
				System.out.println(set.getObject(1)+"-----"+set.getObject(2));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (set!=null) {
				try {
					set.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (ps!=null) {
					try {
						ps.close();
					} catch (SQLException e) {
						e.printStackTrace();
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
	}
}
