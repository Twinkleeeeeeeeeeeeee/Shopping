package com.briup.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.dao.MyBatisSqlSessionFactory;
import com.briup.exception.CustomerServiceException;
import com.briup.mapper.RegisterMapper;
import com.briup.pojo.RegisterUser;

public class JSPTest {
	SqlSession session = null;
	RegisterMapper mapper=null;
	@Test
	public List<RegisterUser> users() {
		session = new MyBatisSqlSessionFactory().openSession();
		mapper = session.getMapper(RegisterMapper.class);
		List<RegisterUser> users = new ArrayList<RegisterUser>();
		
			
		session.commit();
		
		return users;
	}
}
