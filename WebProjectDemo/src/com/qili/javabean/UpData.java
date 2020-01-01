package com.qili.javabean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpData {
	public static void updata() {
		Connection conn =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/debug?useUnicode=true&characterEncoding=UTF-8","root","pjwqwzh7887");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
