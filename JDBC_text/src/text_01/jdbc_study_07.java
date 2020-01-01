package text_01;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;



/*
 * 测试CLOB大文本对象的使用
 */
public class jdbc_study_07 {
	public static void main(String[] args) {
		Connection conn =null;
		PreparedStatement ps1 =null;
		PreparedStatement ps2 =null;
		ResultSet set =null;
			try {
				//加载驱动类
				Class.forName("com.mysql.jdbc.Driver");
				//建立连接
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project01","root","pjwqwzh7887");
				
				String sql="insert into user (sname,stduent_number) values (?,?)";//?是占位符
				ps1=conn.prepareStatement(sql);
				ps1.setInt(2, 1803050136);
				/*try {
					ps1.setClob(1, new FileReader(new File("F:\\eclipse\\JDBC_text\\abc_copy.txt")));//将文本直接输入到数据库中
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}*/
				
				//ps1.setClob(1, new BufferedReader(new InputStreamReader(new ByteArrayInputStream("jzn".getBytes()))));//将程序中的字符串输入到数据库的CLOB字段中
				String sql1 ="select * from user where stduent_number>?";
				ps1=conn.prepareStatement(sql1);
				ps1.setInt(1, 1803050120);
				set=ps1.executeQuery();
				while (set.next()) {
					Clob clob = set.getClob("stduent_number");
					Reader reader =clob.getCharacterStream();
					int temp=0;
					try {
						while ((temp=reader.read())!=-1) {
							System.out.print((char)temp);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
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
