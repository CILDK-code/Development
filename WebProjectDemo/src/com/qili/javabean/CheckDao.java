package com.qili.javabean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.mysql.jdbc.Field;

public class CheckDao {
	public static <T> void check() {
		Connection conn =null;
		PreparedStatement ps =null;
		ResultSet set =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/debug?useUnicode=true&characterEncoding=UTF-8","root","pjwqwzh7887");
			String sql1 = "select sex form user";
			set = ps.executeQuery();
			while (set.next()) {
				set.getObject(0);
			}
			System.out.println(set.getObject(0));
			 ResultSetMetaData rsmd = set.getMetaData();// 得到记录集，元素对象。
	         
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
