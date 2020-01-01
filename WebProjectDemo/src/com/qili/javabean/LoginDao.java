package com.qili.javabean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDao {
	public static int login(User user,Shopping shopping,Express express) {
		int a,b,c;
		int result;
		a=b=c=0;
		result=0;
		Connection conn =null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		PreparedStatement ps3 = null;
		try {
			//连接数据库
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/debug?useUnicode=true&characterEncoding=UTF-8","root","pjwqwzh7887");
			String sql1="insert into user (name,schnum,sex,grade) values (?,?,?,?)";
			String sql2="insert into shopping (havebought,reason,webset,goods,choireason,buyfreq,lesscost,salepromotion,paymeth) values (?,?,?,?,?,?,?,?,?)";
			String sql3="insert into express (delivery,mindtime,worry,attitude) values (?,?,?,?)";
			ps1 =conn.prepareStatement(sql1);
			ps2 =conn.prepareStatement(sql2);
			ps3 =conn.prepareStatement(sql3);
			ps1.setString(1, user.getUname());
			ps1.setString(2, user.getStudentId());
			if (user.getUname()==""||user.getStudentId()=="") {
				return 0;
			}
			ps1.setString(3, user.getSex());
			ps1.setString(4, user.getGrade());
			a=ps1.executeUpdate();
			ps2.setString(1, shopping.getHaveBought());
			ps2.setString(2, shopping.getReason());
			ps2.setString(3, shopping.getWebset());
			ps2.setString(4, shopping.getGoods());
			ps2.setString(5, shopping.getChooseReason());
			ps2.setString(6, shopping.getBuyFreq());
			ps2.setString(7, shopping.getLessCost());
			ps2.setString(8, shopping.getSalePromotion());
			ps2.setString(9, shopping.getPayMeth());
			b=ps2.executeUpdate();
			ps3.setString(1, express.getDelivery());
			ps3.setString(2, express.getMindTime());
			ps3.setString(3, express.getWorry());
			ps3.setString(4, express.getAttitude());
			c=ps3.executeUpdate();
			if(a==b==c>0) {
				return 1;
			}else {
				return 0;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return -1;
		}catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}catch (Exception e) {
			e.printStackTrace();
			return -1;
		}finally {
			//对资源进行关闭
			if(ps3!=null){
				try {
					ps3.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(ps2!=null){
				try {
					ps2.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(ps1!=null){
				try {
					ps1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}
	}
}
