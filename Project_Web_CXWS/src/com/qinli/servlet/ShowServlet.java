package com.qinli.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qinli.pojo.NewStudent;
import com.qinli.service.NewStudentService;
import com.qinli.service.impl.NewStudentServiceImpl;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
@WebServlet("/show")
public class ShowServlet extends HttpServlet{
	private NewStudentService newStudentService = new NewStudentServiceImpl() ;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<NewStudent> selAll = new ArrayList<NewStudent>();
		try {
			selAll = newStudentService.selAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(selAll.size());
		for (NewStudent newStudent : selAll) {
			System.out.println(newStudent);
		}
		resp.setContentType("text/javascript;charset=utf-8");
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		JSONArray json = JSONArray.fromObject(selAll, jsonConfig); 
		PrintWriter out = resp.getWriter();
		out.print(json);		
	}
}
