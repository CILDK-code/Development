package com.qili.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qili.javabean.CheckDao;
import com.qili.javabean.Express;
import com.qili.javabean.Shopping;
import com.qili.javabean.User;
import com.qili.javabean.LoginDao;

public class Webservlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int result=0;
		
		//设置字符集及获取页面传入参数
		request.setCharacterEncoding("UTF-8");
		//向User对象中添加数据
		String uname = request.getParameter("uname");
		String sex = request.getParameter("sex");
		String StudentId = request.getParameter("schnum");
		String grade = request.getParameter("grade");
		User user = new User(uname, grade, sex, StudentId);
		//向Shopping对象中添加数据
		String haveBought = request.getParameter("havebought");
		String reason = request.getParameter("reason");
		String webset = request.getParameter("webset");
		String goods = request.getParameter("goods");
		String chooseReason = request.getParameter("choireason");
		String buyFreq = request.getParameter("buyfreq");
		String lessCost = request.getParameter("lesscost");
		String salePromotion = request.getParameter("salepromotion");
		String payMeth = request.getParameter("paymeth");
		Shopping shopping = new Shopping(haveBought, reason, webset, goods, chooseReason, buyFreq, lessCost, salePromotion, payMeth);
		//向Express对象中添加数据
		String attitude = request.getParameter("attitude");
		String delivery = request.getParameter("delivery");
		String mindTime = request.getParameter("mindtime");
		String worry = request.getParameter("worry");
		Express express = new Express(delivery, mindTime, worry, attitude);
		//调用模型层中的方法
		result = LoginDao.login(user,shopping,express);
		if (result==1) {
			response.sendRedirect("zhuanpan.html");
		}else if (result!=1) {
			response.sendRedirect("zhendejaohe.html");
		}
		CheckDao.check();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
