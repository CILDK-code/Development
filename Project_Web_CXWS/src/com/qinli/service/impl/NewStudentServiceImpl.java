package com.qinli.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.qinli.mapper.NewStudentMapper;
import com.qinli.pojo.NewStudent;

import com.qinli.service.NewStudentService;

public class NewStudentServiceImpl implements NewStudentService{
	@Override
	public List<NewStudent> selAll() throws Exception {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		NewStudentMapper mapper = session.getMapper(NewStudentMapper.class);
		List<NewStudent> selAll = mapper.selAll();
		return selAll;
	}

}
