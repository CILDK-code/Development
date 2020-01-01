package text_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * ����������Ļ����÷�
 * 
 */
public class jdbc_study_05 {
	public static void main(String[] args) {
		Connection conn =null;
		Statement ps =null;
		ResultSet set =null;
			try {
				//����������
				Class.forName("com.mysql.jdbc.Driver");
				//��������
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project01","root","pjwqwzh7887");
				conn.setAutoCommit(false);
				ps =conn.createStatement();
				for (int i = 0; i < 20000; i++) {
					ps.addBatch("insert into user (sname,stduent_number) values ('wu"+i+"',666666)");
					ps.executeBatch();
				}
				conn.commit();
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
