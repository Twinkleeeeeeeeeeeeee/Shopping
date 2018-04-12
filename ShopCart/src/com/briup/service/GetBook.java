package com.briup.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.dao.MyBatisSqlSessionFactory;
import com.briup.mapper.BooksMapper;
import com.briup.pojo.Book;
import com.briup.pojo.RegisterUser;

public class GetBook {
	public List<Book> books(){
		SqlSession session = new MyBatisSqlSessionFactory().openSession();
		BooksMapper mapper = session.getMapper(BooksMapper.class);
		List<Book> findAllBook = mapper.findAllBook();
		return findAllBook;
	}
}
