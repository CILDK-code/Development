package text_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * ��������
 */
public class jdbc_study_06 {
	public static void main(String[] args) {
		Connection conn =null;
		PreparedStatement ps1 =null;
		PreparedStatement ps2 =null;
			try {
				//����������
				Class.forName("com.mysql.jdbc.Driver");
				//��������
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project01","root","pjwqwzh7887");
				conn.setAutoCommit(false);//jdbc��Ĭ����trueĬ���Զ��ύ
				String sql="insert into user (sname,stduent_number) values (?,?)";//?��ռλ��
				ps1 = conn.prepareStatement(sql);
				ps1.setObject(1, "zb");
				ps1.setObject(2, 1803050135);
				ps1.execute();
				
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				String sql2="insert into user (sname,stduent_number) values (?)";//?��ռλ��
				ps2 = conn.prepareStatement(sql2);
				ps2.setObject(1, "zb");
				ps2.setObject(2, 1803050135);
				ps2.execute();
				conn.commit();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
						try {
							if (ps1!=null) {
								ps1.close();
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
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
		

